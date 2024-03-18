package org.apache.spark.scheduler;
public  class SparkListenerBlockManagerRemoved implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long time ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerBlockManagerRemoved (long time, org.apache.spark.storage.BlockManagerId blockManagerId)  { throw new RuntimeException(); }
}
