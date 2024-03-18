package org.apache.spark.streaming.receiver;
  class UpdateRateLimit implements org.apache.spark.streaming.receiver.ReceiverMessage, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long elementsPerSecond ()  { throw new RuntimeException(); }
  // not preceding
  public   UpdateRateLimit (long elementsPerSecond)  { throw new RuntimeException(); }
}
