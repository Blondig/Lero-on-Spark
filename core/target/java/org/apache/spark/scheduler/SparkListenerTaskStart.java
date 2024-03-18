package org.apache.spark.scheduler;
public  class SparkListenerTaskStart implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
  public  int stageAttemptId ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskInfo taskInfo ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerTaskStart (int stageId, int stageAttemptId, org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
}
