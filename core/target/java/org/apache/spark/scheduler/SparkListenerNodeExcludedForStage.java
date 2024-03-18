package org.apache.spark.scheduler;
public  class SparkListenerNodeExcludedForStage implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long time ()  { throw new RuntimeException(); }
  public  java.lang.String hostId ()  { throw new RuntimeException(); }
  public  int executorFailures ()  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
  public  int stageAttemptId ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerNodeExcludedForStage (long time, java.lang.String hostId, int executorFailures, int stageId, int stageAttemptId)  { throw new RuntimeException(); }
}
