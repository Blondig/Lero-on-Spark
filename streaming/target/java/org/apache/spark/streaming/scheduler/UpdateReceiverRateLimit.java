package org.apache.spark.streaming.scheduler;
  class UpdateReceiverRateLimit implements org.apache.spark.streaming.scheduler.ReceiverTrackerLocalMessage, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int streamUID ()  { throw new RuntimeException(); }
  public  long newRate ()  { throw new RuntimeException(); }
  // not preceding
  public   UpdateReceiverRateLimit (int streamUID, long newRate)  { throw new RuntimeException(); }
}
