package org.apache.spark.scheduler;
/**
 * Super basic ExternalClusterManager, just to verify ExternalClusterManagers can be configured.
 * <p>
 * Note that if you want a special ClusterManager for tests, you are probably much more interested
 * in {@link MockExternalClusterManager} and the corresponding {@link SchedulerIntegrationSuite}
 */
public  class DummyExternalClusterManager implements org.apache.spark.scheduler.ExternalClusterManager {
  public   DummyExternalClusterManager ()  { throw new RuntimeException(); }
  public  boolean canCreate (java.lang.String masterURL)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.SchedulerBackend createSchedulerBackend (org.apache.spark.SparkContext sc, java.lang.String masterURL, org.apache.spark.scheduler.TaskScheduler scheduler)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskScheduler createTaskScheduler (org.apache.spark.SparkContext sc, java.lang.String masterURL)  { throw new RuntimeException(); }
  public  void initialize (org.apache.spark.scheduler.TaskScheduler scheduler, org.apache.spark.scheduler.SchedulerBackend backend)  { throw new RuntimeException(); }
}
