package org.apache.spark.streaming.scheduler;
  class BlockAdditionEvent implements org.apache.spark.streaming.scheduler.ReceivedBlockTrackerLogEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.ReceivedBlockInfo receivedBlockInfo ()  { throw new RuntimeException(); }
  // not preceding
  public   BlockAdditionEvent (org.apache.spark.streaming.scheduler.ReceivedBlockInfo receivedBlockInfo)  { throw new RuntimeException(); }
}
