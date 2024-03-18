# Lero: Applying Learning-to-rank in Query Optimizer

Lero is a remarkable learned query optimizer system that adheres to the rank-based paradigm. We present this repository as a demonstration to showcase the capabilities of Lero within the context of Spark SQL to generate candidate plans.

## Setup

This demonstration is built upon a customized version of Spark SQL 3.3.0, incorporating several modifications which will be indicated as follows. To ensure a seamless execution, it is essential to have the following environments in place: Hive 3.3.0, which manages the metadata of Spark SQL, and Hadoop 3.3.3, responsible for storing data in distributed environments. These environments are crucial for the successful utilization of the demo.

## Main Modifications

### LogicalPlanStats

This related file is `./sql/catalyst/src/main/scala/org/apache/spark/sql/catalyst/plans/logical/statsEstimation/LogicalPlanStats.scala`.

In this file, for the strategy based on sub-query grouping, we count the number of tables in a plan tree, which helps target the group of sub-queries to vary the cardinality estimation. For the strategy based on single sub-query, we collect encountered sub-queries with a `Seq` for the later iteration. Based on the swing factor $f$, we tune the caridinality in stats cache, which is used in CostBasedJoinReorder.

### JoinEstimation

The related file is `./sql/catalyst/src/main/scala/org/apache/spark/sql/catalyst/plans/logical/statsEstimation/JoinEstimation.scala`, which should be revised accordingly
so that only the caridnality of the specific sub-query is tuned.

### SQLConf

The file provides configures of Spark SQL is `.sql/catalyst/src/main/scala/org/apache/spark/sql/internal/SQLConf.scala`. To adopt Lero, we add variables such as `VARY_CARD_ENABLE` and `VARY_CARD_SINGLE_ENABLED` and functions such as `varyCardEnabled` and `varyCardSingleEnabled` to tune the cardinality of the sub-query.

## Building Spark

Spark is built using [Apache Maven](https://maven.apache.org/).
To build Spark and its example programs, run:

```bash
./build/mvn -Pyarn -Dhadoop.version=3.3.3 -DskipTests -Phive -Phive-thriftserver -DskipTests package
```

## Interactive Scala Shell

We use the easiest way to start using Spark, i.e., through the Scala shell:

```bash
./bin/spark-shell --master yarn --deploy-mode client --num-executors 4 --executor-memory 32g --driver-memory 32g --conf spark.kryoserializer.buffer.max=2047
```

## Script to Generate Candidate Plans

You should prepare the SQL queries following the criterion of Spark SQL. The sample queries are provided in `./sample_queries.scala`.

After that, run the script in `./main_sub_query_grouping.scala` or `./main_single_sub_query.scala` using Scala shell to generate candidate plans. It is required to indicate the specific database. Comment `planDF.show()` if you only need to generate candidate plans without collecting the true query execution time.

## Use Comparator Model

After collecting candidate plans with Spark SQL,
please refer to 
[Lero-on-PostgreSQL](https://github.com/Blondig/Lero-on-PostgreSQL)
for detailed guidance on using a model to select the optimal execution plan.