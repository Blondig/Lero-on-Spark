package org.apache.spark.streaming.scheduler;
  class BatchAllocationEvent implements org.apache.spark.streaming.scheduler.ReceivedBlockTrackerLogEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time time ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.AllocatedBlocks allocatedBlocks ()  { throw new RuntimeException(); }
  // not preceding
  public   BatchAllocationEvent (org.apache.spark.streaming.Time time, org.apache.spark.streaming.scheduler.AllocatedBlocks allocatedBlocks)  { throw new RuntimeException(); }
}
