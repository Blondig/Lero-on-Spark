package org.apache.spark.scheduler;
/**
 * @deprecated use SparkListenerNodeExcluded instead. Since 3.1.0. 
*/
public  class SparkListenerNodeBlacklisted implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long time ()  { throw new RuntimeException(); }
  public  java.lang.String hostId ()  { throw new RuntimeException(); }
  public  int executorFailures ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerNodeBlacklisted (long time, java.lang.String hostId, int executorFailures)  { throw new RuntimeException(); }
}
