package org.apache.spark.scheduler;
public  class SparkListenerNodeUnexcluded implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long time ()  { throw new RuntimeException(); }
  public  java.lang.String hostId ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerNodeUnexcluded (long time, java.lang.String hostId)  { throw new RuntimeException(); }
}
