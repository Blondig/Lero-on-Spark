package org.apache.spark.scheduler;
  class ShuffleMergeFinalized implements org.apache.spark.scheduler.DAGSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.ShuffleMapStage stage ()  { throw new RuntimeException(); }
  // not preceding
  public   ShuffleMergeFinalized (org.apache.spark.scheduler.ShuffleMapStage stage)  { throw new RuntimeException(); }
}
