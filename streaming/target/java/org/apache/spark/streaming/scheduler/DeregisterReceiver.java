package org.apache.spark.streaming.scheduler;
  class DeregisterReceiver implements org.apache.spark.streaming.scheduler.ReceiverTrackerMessage, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int streamId ()  { throw new RuntimeException(); }
  public  java.lang.String msg ()  { throw new RuntimeException(); }
  public  java.lang.String error ()  { throw new RuntimeException(); }
  // not preceding
  public   DeregisterReceiver (int streamId, java.lang.String msg, java.lang.String error)  { throw new RuntimeException(); }
}
