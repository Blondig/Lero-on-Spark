package org.apache.spark.streaming.scheduler;
  class AddBlock implements org.apache.spark.streaming.scheduler.ReceiverTrackerMessage, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.ReceivedBlockInfo receivedBlockInfo ()  { throw new RuntimeException(); }
  // not preceding
  public   AddBlock (org.apache.spark.streaming.scheduler.ReceivedBlockInfo receivedBlockInfo)  { throw new RuntimeException(); }
}
