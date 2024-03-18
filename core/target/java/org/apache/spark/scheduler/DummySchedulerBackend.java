package org.apache.spark.scheduler;
public  class DummySchedulerBackend implements org.apache.spark.scheduler.SchedulerBackend {
  public   DummySchedulerBackend ()  { throw new RuntimeException(); }
  public  int defaultParallelism ()  { throw new RuntimeException(); }
  public  boolean initialized ()  { throw new RuntimeException(); }
  public  int maxNumConcurrentTasks (org.apache.spark.resource.ResourceProfile rp)  { throw new RuntimeException(); }
  public  void reviveOffers ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
