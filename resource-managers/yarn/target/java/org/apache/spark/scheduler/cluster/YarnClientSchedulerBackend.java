package org.apache.spark.scheduler.cluster;
  class YarnClientSchedulerBackend extends org.apache.spark.scheduler.cluster.YarnSchedulerBackend implements org.apache.spark.internal.Logging {
  public   YarnClientSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /**
   * Create a Yarn client to submit an application to the ResourceManager.
   * This waits until the application is running.
   */
  public  void start ()  { throw new RuntimeException(); }
  /**
   * Stop the scheduler. This assumes <code>start()</code> has already been called.
   */
  public  void stop ()  { throw new RuntimeException(); }
  protected  void updateDelegationTokens (byte[] tokens)  { throw new RuntimeException(); }
}
