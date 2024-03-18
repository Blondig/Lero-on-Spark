package org.apache.spark.scheduler;
  class ShufflePushCompleted implements org.apache.spark.scheduler.DAGSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int shuffleId ()  { throw new RuntimeException(); }
  public  int shuffleMergeId ()  { throw new RuntimeException(); }
  public  int mapIndex ()  { throw new RuntimeException(); }
  // not preceding
  public   ShufflePushCompleted (int shuffleId, int shuffleMergeId, int mapIndex)  { throw new RuntimeException(); }
}
