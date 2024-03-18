package org.apache.spark.status.api.v1;
public  class TaskData {
  public  long taskId ()  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
  public  int attempt ()  { throw new RuntimeException(); }
  public  int partitionId ()  { throw new RuntimeException(); }
  public  java.util.Date launchTime ()  { throw new RuntimeException(); }
  public  scala.Option<java.util.Date> resultFetchStart ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> duration ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  java.lang.String status ()  { throw new RuntimeException(); }
  public  java.lang.String taskLocality ()  { throw new RuntimeException(); }
  public  boolean speculative ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.AccumulableInfo> accumulatorUpdates ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> errorMessage ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.TaskMetrics> taskMetrics ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> executorLogs ()  { throw new RuntimeException(); }
  public  long schedulerDelay ()  { throw new RuntimeException(); }
  public  long gettingResultTime ()  { throw new RuntimeException(); }
  // not preceding
     TaskData (long taskId, int index, int attempt, int partitionId, java.util.Date launchTime, scala.Option<java.util.Date> resultFetchStart, scala.Option<java.lang.Object> duration, java.lang.String executorId, java.lang.String host, java.lang.String status, java.lang.String taskLocality, boolean speculative, scala.collection.Seq<org.apache.spark.status.api.v1.AccumulableInfo> accumulatorUpdates, scala.Option<java.lang.String> errorMessage, scala.Option<org.apache.spark.status.api.v1.TaskMetrics> taskMetrics, scala.collection.immutable.Map<java.lang.String, java.lang.String> executorLogs, long schedulerDelay, long gettingResultTime)  { throw new RuntimeException(); }
}
