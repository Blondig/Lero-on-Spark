package org.apache.spark.scheduler;
public  class SparkListenerExecutorUnexcluded implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long time ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerExecutorUnexcluded (long time, java.lang.String executorId)  { throw new RuntimeException(); }
}
