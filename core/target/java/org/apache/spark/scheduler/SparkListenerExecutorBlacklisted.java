package org.apache.spark.scheduler;
/**
 * @deprecated use SparkListenerExecutorExcluded instead. Since 3.1.0. 
*/
public  class SparkListenerExecutorBlacklisted implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long time ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  int taskFailures ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerExecutorBlacklisted (long time, java.lang.String executorId, int taskFailures)  { throw new RuntimeException(); }
}
