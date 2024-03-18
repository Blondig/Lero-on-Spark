package org.apache.spark.streaming.receiver;
  class CleanupOldBlocks implements org.apache.spark.streaming.receiver.ReceiverMessage, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time threshTime ()  { throw new RuntimeException(); }
  // not preceding
  public   CleanupOldBlocks (org.apache.spark.streaming.Time threshTime)  { throw new RuntimeException(); }
}
