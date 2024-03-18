package org.apache.spark.sql.execution.adaptive;
public  class ShuffleStageInfo {
  static public  scala.Option<scala.Tuple2<org.apache.spark.sql.execution.adaptive.ShuffleQueryStageExec, scala.Option<scala.collection.Seq<org.apache.spark.sql.execution.ShufflePartitionSpec>>>> unapply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.adaptive.ShuffleQueryStageExec shuffleStage ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<org.apache.spark.sql.execution.ShufflePartitionSpec>> partitionSpecs ()  { throw new RuntimeException(); }
  // not preceding
  public   ShuffleStageInfo (org.apache.spark.sql.execution.adaptive.ShuffleQueryStageExec shuffleStage, scala.Option<scala.collection.Seq<org.apache.spark.sql.execution.ShufflePartitionSpec>> partitionSpecs)  { throw new RuntimeException(); }
}
