package org.apache.spark.scheduler;
/**
 * A cluster manager interface to plugin external scheduler.
 */
public  interface ExternalClusterManager {
  /**
   * Check if this cluster manager instance can create scheduler components
   * for a certain master URL.
   * @param masterURL the master URL
   * @return True if the cluster manager can create scheduler backend/
   */
  public  boolean canCreate (java.lang.String masterURL)  ;
  /**
   * Create a scheduler backend for the given SparkContext and scheduler. This is
   * called after task scheduler is created using <code>ExternalClusterManager.createTaskScheduler()</code>.
   * @param sc SparkContext
   * @param masterURL the master URL
   * @param scheduler TaskScheduler that will be used with the scheduler backend.
   * @return SchedulerBackend that works with a TaskScheduler
   */
  public  org.apache.spark.scheduler.SchedulerBackend createSchedulerBackend (org.apache.spark.SparkContext sc, java.lang.String masterURL, org.apache.spark.scheduler.TaskScheduler scheduler)  ;
  /**
   * Create a task scheduler instance for the given SparkContext
   * @param sc SparkContext
   * @param masterURL the master URL
   * @return TaskScheduler that will be responsible for task handling
   */
  public  org.apache.spark.scheduler.TaskScheduler createTaskScheduler (org.apache.spark.SparkContext sc, java.lang.String masterURL)  ;
  /**
   * Initialize task scheduler and backend scheduler. This is called after the
   * scheduler components are created
   * @param scheduler TaskScheduler that will be responsible for task handling
   * @param backend SchedulerBackend that works with a TaskScheduler
   */
  public  void initialize (org.apache.spark.scheduler.TaskScheduler scheduler, org.apache.spark.scheduler.SchedulerBackend backend)  ;
}
