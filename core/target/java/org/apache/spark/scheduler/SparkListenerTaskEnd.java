package org.apache.spark.scheduler;
public  class SparkListenerTaskEnd implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
  public  int stageAttemptId ()  { throw new RuntimeException(); }
  public  java.lang.String taskType ()  { throw new RuntimeException(); }
  public  org.apache.spark.TaskEndReason reason ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskInfo taskInfo ()  { throw new RuntimeException(); }
  public  org.apache.spark.executor.ExecutorMetrics taskExecutorMetrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.executor.TaskMetrics taskMetrics ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerTaskEnd (int stageId, int stageAttemptId, java.lang.String taskType, org.apache.spark.TaskEndReason reason, org.apache.spark.scheduler.TaskInfo taskInfo, org.apache.spark.executor.ExecutorMetrics taskExecutorMetrics, org.apache.spark.executor.TaskMetrics taskMetrics)  { throw new RuntimeException(); }
}
