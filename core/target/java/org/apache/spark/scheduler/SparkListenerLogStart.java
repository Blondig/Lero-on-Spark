package org.apache.spark.scheduler;
/**
 * An internal class that describes the metadata of an event log.
 */
public  class SparkListenerLogStart implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String sparkVersion ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerLogStart (java.lang.String sparkVersion)  { throw new RuntimeException(); }
}
