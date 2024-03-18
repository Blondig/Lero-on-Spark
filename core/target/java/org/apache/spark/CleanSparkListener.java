package org.apache.spark;
public  class CleanSparkListener implements org.apache.spark.CleanupTask, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.SparkListener listener ()  { throw new RuntimeException(); }
  // not preceding
  public   CleanSparkListener (org.apache.spark.scheduler.SparkListener listener)  { throw new RuntimeException(); }
}
