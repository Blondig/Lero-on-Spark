package org.apache.spark.scheduler;
/** TaskSchedulerImpl that just tracks a tiny bit more state to enable checks in tests. */
public  class TestTaskScheduler extends org.apache.spark.scheduler.TaskSchedulerImpl {
  public   TestTaskScheduler (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /** Set of TaskSets the DAGScheduler has requested executed. */
  public  scala.collection.mutable.HashSet<org.apache.spark.scheduler.TaskSet> runningTaskSets ()  { throw new RuntimeException(); }
  public  void submitTasks (org.apache.spark.scheduler.TaskSet taskSet)  { throw new RuntimeException(); }
  public  void taskSetFinished (org.apache.spark.scheduler.TaskSetManager manager)  { throw new RuntimeException(); }
}
