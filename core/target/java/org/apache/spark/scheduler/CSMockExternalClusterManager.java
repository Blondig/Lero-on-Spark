package org.apache.spark.scheduler;
/** Simple cluster manager that wires up our mock backend for the resource tests. */
public  class CSMockExternalClusterManager implements org.apache.spark.scheduler.ExternalClusterManager {
  public   CSMockExternalClusterManager ()  { throw new RuntimeException(); }
  public  boolean canCreate (java.lang.String masterURL)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.SchedulerBackend createSchedulerBackend (org.apache.spark.SparkContext sc, java.lang.String masterURL, org.apache.spark.scheduler.TaskScheduler scheduler)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskScheduler createTaskScheduler (org.apache.spark.SparkContext sc, java.lang.String masterURL)  { throw new RuntimeException(); }
  public  void initialize (org.apache.spark.scheduler.TaskScheduler scheduler, org.apache.spark.scheduler.SchedulerBackend backend)  { throw new RuntimeException(); }
}
