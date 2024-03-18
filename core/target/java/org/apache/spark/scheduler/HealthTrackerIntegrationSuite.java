package org.apache.spark.scheduler;
public  class HealthTrackerIntegrationSuite extends org.apache.spark.scheduler.SchedulerIntegrationSuite<org.apache.spark.scheduler.MultiExecutorMockBackend> {
  public   HealthTrackerIntegrationSuite ()  { throw new RuntimeException(); }
  public  java.lang.String badHost ()  { throw new RuntimeException(); }
  /**
   * This backend just always fails if the task is executed on a bad host, but otherwise succeeds
   * all tasks.
   */
  public  void badHostBackend ()  { throw new RuntimeException(); }
}
