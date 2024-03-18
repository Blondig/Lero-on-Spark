package org.apache.spark.streaming.scheduler;
/**
 * This message will trigger ReceiverTrackerEndpoint to restart a Spark job for the receiver.
 */
  class RestartReceiver implements org.apache.spark.streaming.scheduler.ReceiverTrackerLocalMessage, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.receiver.Receiver<?> receiver ()  { throw new RuntimeException(); }
  // not preceding
  public   RestartReceiver (org.apache.spark.streaming.receiver.Receiver<?> receiver)  { throw new RuntimeException(); }
}
