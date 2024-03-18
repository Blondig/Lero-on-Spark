package org.apache.spark.scheduler;
  class RegisterMergeStatuses implements org.apache.spark.scheduler.DAGSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.ShuffleMapStage stage ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.Object, org.apache.spark.scheduler.MergeStatus>> mergeStatuses ()  { throw new RuntimeException(); }
  // not preceding
  public   RegisterMergeStatuses (org.apache.spark.scheduler.ShuffleMapStage stage, scala.collection.Seq<scala.Tuple2<java.lang.Object, org.apache.spark.scheduler.MergeStatus>> mergeStatuses)  { throw new RuntimeException(); }
}
