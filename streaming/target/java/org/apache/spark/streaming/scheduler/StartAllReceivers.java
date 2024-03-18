package org.apache.spark.streaming.scheduler;
/**
 * This message is sent to ReceiverTrackerEndpoint when we start to launch Spark jobs for receivers
 * at the first time.
 */
  class StartAllReceivers implements org.apache.spark.streaming.scheduler.ReceiverTrackerLocalMessage, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.receiver.Receiver<?>> receiver ()  { throw new RuntimeException(); }
  // not preceding
  public   StartAllReceivers (scala.collection.Seq<org.apache.spark.streaming.receiver.Receiver<?>> receiver)  { throw new RuntimeException(); }
}
