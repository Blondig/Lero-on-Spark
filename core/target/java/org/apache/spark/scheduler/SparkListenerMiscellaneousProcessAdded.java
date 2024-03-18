package org.apache.spark.scheduler;
public  class SparkListenerMiscellaneousProcessAdded implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long time ()  { throw new RuntimeException(); }
  public  java.lang.String processId ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.MiscellaneousProcessDetails info ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerMiscellaneousProcessAdded (long time, java.lang.String processId, org.apache.spark.scheduler.MiscellaneousProcessDetails info)  { throw new RuntimeException(); }
}
