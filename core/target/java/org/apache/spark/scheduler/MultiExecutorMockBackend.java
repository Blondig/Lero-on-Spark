package org.apache.spark.scheduler;
public  class MultiExecutorMockBackend extends org.apache.spark.scheduler.MockBackend {
  public   MultiExecutorMockBackend (org.apache.spark.SparkConf conf, org.apache.spark.scheduler.TaskSchedulerImpl taskScheduler)  { throw new RuntimeException(); }
  public  int defaultParallelism ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.scheduler.ExecutorTaskStatus> executorIdToExecutor ()  { throw new RuntimeException(); }
  public  int nCoresPerExecutor ()  { throw new RuntimeException(); }
  public  int nExecutorsPerHost ()  { throw new RuntimeException(); }
  public  int nHosts ()  { throw new RuntimeException(); }
}
