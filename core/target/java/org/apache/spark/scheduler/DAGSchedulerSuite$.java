package org.apache.spark.scheduler;
public  class DAGSchedulerSuite$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DAGSchedulerSuite$ MODULE$ = null;
  public   DAGSchedulerSuite$ ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.storage.BlockManagerId> mergerLocs ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.MapStatus makeMapStatus (java.lang.String host, int reduces, byte sizes, long mapTaskId)  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId makeBlockManagerId (java.lang.String host)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.MergeStatus makeMergeStatus (java.lang.String host, int shuffleMergeId, long size)  { throw new RuntimeException(); }
  public  void addMergerLocs (scala.collection.Seq<java.lang.String> locs)  { throw new RuntimeException(); }
  public  void clearMergerLocs ()  { throw new RuntimeException(); }
}
