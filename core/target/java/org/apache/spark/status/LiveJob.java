package org.apache.spark.status;
public  class LiveJob extends org.apache.spark.status.LiveEntity {
  // not preceding
  public   LiveJob (int jobId, java.lang.String name, scala.Option<java.lang.String> description, scala.Option<java.util.Date> submissionTime, scala.collection.Seq<java.lang.Object> stageIds, scala.Option<java.lang.String> jobGroup, int numTasks, scala.Option<java.lang.Object> sqlExecutionId)  { throw new RuntimeException(); }
  public  int activeStages ()  { throw new RuntimeException(); }
  public  int activeTasks ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.OpenHashSet<java.lang.Object> completedIndices ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.Object> completedStages ()  { throw new RuntimeException(); }
  public  int completedTasks ()  { throw new RuntimeException(); }
  public  scala.Option<java.util.Date> completionTime ()  { throw new RuntimeException(); }
  protected  Object doUpdate ()  { throw new RuntimeException(); }
  public  int failedStages ()  { throw new RuntimeException(); }
  public  int failedTasks ()  { throw new RuntimeException(); }
  public  int jobId ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> killedSummary ()  { throw new RuntimeException(); }
  public  int killedTasks ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.Object> skippedStages ()  { throw new RuntimeException(); }
  public  int skippedTasks ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> stageIds ()  { throw new RuntimeException(); }
  public  org.apache.spark.JobExecutionStatus status ()  { throw new RuntimeException(); }
  public  scala.Option<java.util.Date> submissionTime ()  { throw new RuntimeException(); }
}
