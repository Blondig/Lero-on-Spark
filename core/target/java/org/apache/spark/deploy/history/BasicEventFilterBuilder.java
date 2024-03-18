package org.apache.spark.deploy.history;
/**
 * This class tracks both live jobs and live executors, and pass the list to the
 * {@link BasicEventFilter} to help BasicEventFilter to reject finished jobs (+ stages/tasks/RDDs)
 * and dead executors.
 */
  class BasicEventFilterBuilder extends org.apache.spark.scheduler.SparkListener implements org.apache.spark.deploy.history.EventFilterBuilder {
  public   BasicEventFilterBuilder ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.history.EventFilter createFilter ()  { throw new RuntimeException(); }
    scala.collection.immutable.Set<java.lang.String> liveExecutors ()  { throw new RuntimeException(); }
    scala.collection.immutable.Set<java.lang.Object> liveJobs ()  { throw new RuntimeException(); }
    scala.collection.immutable.Set<java.lang.Object> liveRDDs ()  { throw new RuntimeException(); }
    scala.collection.immutable.Set<java.lang.Object> liveStages ()  { throw new RuntimeException(); }
    scala.collection.immutable.Set<java.lang.Object> liveTasks ()  { throw new RuntimeException(); }
  public  void onExecutorAdded (org.apache.spark.scheduler.SparkListenerExecutorAdded executorAdded)  { throw new RuntimeException(); }
  public  void onExecutorRemoved (org.apache.spark.scheduler.SparkListenerExecutorRemoved executorRemoved)  { throw new RuntimeException(); }
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd jobEnd)  { throw new RuntimeException(); }
  public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart jobStart)  { throw new RuntimeException(); }
  public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted stageSubmitted)  { throw new RuntimeException(); }
  public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart taskStart)  { throw new RuntimeException(); }
}
