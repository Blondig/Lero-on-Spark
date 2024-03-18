// use specific database in Spark SQL
spark.sql("use database stats_10_db;")
def md5(s: String): String = {
    org.apache.commons.codec.digest.DigestUtils.md5Hex(s)
}

// set configurations of Spark SQL
val sqlConf = spark.sessionState.conf
import java.io.IOException
import org.json4s._
import org.json4s.JsonDSL._
import org.json4s.jackson.JsonMethods._
import org.apache.hadoop.fs.FileSystem
import java.io.BufferedOutputStream
import org.apache.hadoop.fs.Path

import org.apache.spark.sql.internal.SQLConf.CBO_ENABLED
import org.apache.spark.sql.internal.SQLConf.JOIN_REORDER_ENABLED
import org.apache.spark.sql.internal.SQLConf.PLAN_STATS_ENABLED
import org.apache.spark.sql.internal.SQLConf.VARY_CARD_ENABLED
import org.apache.spark.sql.internal.SQLConf.VARY_CARD_SINGLE_ENABLED
import org.apache.spark.sql.internal.SQLConf.VARY_CARD_LEVEL
import org.apache.spark.sql.internal.SQLConf.VARY_CARD_SWING
import org.apache.spark.sql.internal.SQLConf.ITEM_SIZE_CURRENT_ENABLED
import org.apache.spark.sql.internal.SQLConf.ITEM_SIZE_CURRENT
import org.apache.spark.sql.internal.SQLConf.HISTOGRAM_ENABLED
import scala.collection.mutable.HashMap
import scala.util.matching.Regex
sqlConf.setConf(CBO_ENABLED, true)
sqlConf.setConf(JOIN_REORDER_ENABLED, true)
sqlConf.setConf(PLAN_STATS_ENABLED, true)
sqlConf.setConf(HISTOGRAM_ENABLED, true)
spark.conf.set("spark.sql.cbo.joinReorder.dp.threshold", 100)
spark.conf.set("spark.sql.join.preferSortMergeJoin", false)
val regexL = "#[0-9]*L".r
val regexId = "id=#[0-9]*".r
val regexNum = "#[0-9]+".r
val regexJsonId = "[,]?[\\s]*\"id\":[\\s]*[0-9]*".r
val regexJsonJvmId = "[,]?[\\s]*\"jvmId\":[\\s]*\"[0-9a-z\\-]*\"".r
spark.conf.get("spark.sql.adaptive.enabled")
spark.conf.get("spark.sql.join.preferSortMergeJoin")

// query list
val queryList = List(q1, q2, q3, q4, q5, q6, q7, q8, q9, q10)

val fileName = "stats10Level1007TestOthersQ136"
val prefix = ""
val fs = FileSystem.get(sc.hadoopConfiguration)
val outputDataset = fs.create(new Path(prefix+ "/text/" + fileName + "Dataset"))
val outputCache = fs.create(new Path(prefix + "/cache/" + fileName + "Cache"))
val osDataset = new BufferedOutputStream(outputDataset)
val osCache = new BufferedOutputStream(outputCache)
var queryIndex = 0

spark.sql("show tables;").show()
// visit queries in the list
for(query <- queryList) {
    queryIndex += 1
    print("\n\n\n")
    println(s"Start query${queryIndex}")
    val startString = s"query${queryIndex}"
    osDataset.write(startString.getBytes("UTF-8"))

    sqlConf.setConf(VARY_CARD_ENABLED, false)
    sqlConf.setConf(ITEM_SIZE_CURRENT_ENABLED, true)
    sqlConf.setConf(ITEM_SIZE_CURRENT, 0)

    val startTime = System.nanoTime()
    val planDF = spark.sql(query)
    planDF.show()
    val endTime = System.nanoTime()
    val elapsed = (endTime - startTime) / 1000000000.0f
    val highestLevel = sqlConf.itemSizeCurrent
    sqlConf.setConf(ITEM_SIZE_CURRENT_ENABLED, false)

    val planJson = parse(planDF.queryExecution.sparkPlan.jsonWithStats)
    val planExecutionTimeJson = ("Plan" -> planJson) ~ ("Execution Time" -> JDouble(elapsed))  ~ ("Level" -> JInt(0)) ~ ("Swing" -> JDouble(1.0)) ~ ("Qid" -> JInt(queryIndex)) ~ ("Sql" -> JString(query))
    val outputString = "#####" + "[" + compact(render(planExecutionTimeJson)) + "]"
    osDataset.write(outputString.getBytes("UTF-8"))

    val planStringOriginal: String = planDF.queryExecution.executedPlan.toJSON.trim()
    val newString = regexJsonJvmId.replaceAllIn(regexJsonId.replaceAllIn(planStringOriginal, ""), "")
    val planString = regexNum.replaceAllIn(newString, "")

    val cacheString = s"${md5(planString)}%%%%%${elapsed}"
    osCache.write(cacheString.getBytes("UTF-8"))
    osCache.write("\n".getBytes("UTF-8"))

    var planHashMap: HashMap[String, Tuple3[String, Float, Tuple2[Int, Float]]] = HashMap()
    planHashMap += (md5(planString) -> Tuple3(planString, elapsed, Tuple2(0, 1)))
    println(s"Original Plan: ${planDF.queryExecution.stringWithStats}")
    
    println(s"Current Set is ${planHashMap.keySet}")
    println(s"query${queryIndex} original elapsed time ${elapsed} item size ${sqlConf.itemSizeCurrent}")

    sqlConf.setConf(VARY_CARD_ENABLED, true)
    sqlConf.setConf(VARY_CARD_SINGLE_ENABLED, true)
    // generate candidate plans using swing factors
    val swingList = List(0.01, 0.1, 10.0, 100.0) 
    for (level <- 2 to highestLevel) {
        for (swing <- swingList) {
            try {
                sqlConf.setConf(VARY_CARD_LEVEL, level)
                sqlConf.setConf(VARY_CARD_SWING, swing)

                val planDF = spark.sql(query)
                val planStringOriginal: String = planDF.queryExecution.executedPlan.toJSON.trim()
                val newString = regexJsonJvmId.replaceAllIn(regexJsonId.replaceAllIn(planStringOriginal, ""), "")
                val planString = regexNum.replaceAllIn(newString, "")
                println("\n\n")
                if (planHashMap.contains(md5(planString))) {
                    val existingPlanString = planHashMap(md5(planString))._1
                    if (existingPlanString != planString) {
                        println(s"Collision Happens. Existing Plan: ${existingPlanString} New Plan: ${planString}")
                    }
                    else {
                        println(s"Level ${level} Swing ${swing} Plan Existed")
                    }
                }
                else {
                    val startTime = System.nanoTime()
                    planDF.show()
                    val endTime = System.nanoTime()
                    val elapsed = (endTime - startTime) / 1000000000.0f
                    planHashMap += (md5(planString) -> Tuple3(planString, elapsed.toFloat, Tuple2(level, swing.toFloat)))
                    println(s"query${queryIndex}")
                    println(s"Level ${level} Swing ${swing} Elapsed ${elapsed} Plan Added")

                    val planJson = parse(planDF.queryExecution.sparkPlan.jsonWithStats)
                    val planExecutionTimeJson =  ("Plan" -> planJson) ~ ("Execution Time" -> JDouble(elapsed)) ~ ("Level" -> JInt(level)) ~ ("Swing" -> JDouble(swing)) ~ ("Qid" -> JInt(queryIndex)) ~ ("Sql" -> JString(query))
                    val outputString = "#####" + "[" + compact(render(planExecutionTimeJson)) + "]"
                    osDataset.write(outputString.getBytes("UTF-8"))

                    val cacheString = s"${md5(planString)}%%%%%${elapsed}"
                    osCache.write(cacheString.getBytes("UTF-8"))
                    osCache.write("\n".getBytes("UTF-8"))
                }
                println(s"Now Level ${level} Swing ${swing}")
                println(s"MD5 ${md5(planString)}")
                println(s"Current Set ${planHashMap.keySet}")
            }
            catch {
                case e: Exception => println(s"Error in Level ${level} Swing ${swing}")
                case ex: IOException => println(s"IOException in Level ${level} Swing ${swing}")
            }
        }
    }
    sqlConf.setConf(VARY_CARD_ENABLED, false)
    sqlConf.setConf(VARY_CARD_SINGLE_ENABLED, false)
    
    println("Finished")
    osDataset.write("\n".getBytes("UTF-8"))
}
osDataset.close()
osCache.close()
println("Final Finished")