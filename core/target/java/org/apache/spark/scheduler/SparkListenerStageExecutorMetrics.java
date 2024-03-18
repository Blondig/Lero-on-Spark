package org.apache.spark.scheduler;
/**
 * Peak metric values for the executor for the stage, written to the history log at stage
 * completion.
 * param:  execId executor id
 * param:  stageId stage id
 * param:  stageAttemptId stage attempt
 * param:  executorMetrics executor level metrics peak values
 */
public  class SparkListenerStageExecutorMetrics implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String execId ()  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
  public  int stageAttemptId ()  { throw new RuntimeException(); }
  public  org.apache.spark.executor.ExecutorMetrics executorMetrics ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerStageExecutorMetrics (java.lang.String execId, int stageId, int stageAttemptId, org.apache.spark.executor.ExecutorMetrics executorMetrics)  { throw new RuntimeException(); }
}
