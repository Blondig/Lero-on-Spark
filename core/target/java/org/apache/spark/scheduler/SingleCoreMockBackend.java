package org.apache.spark.scheduler;
/**
 * A very simple mock backend that can just run one task at a time.
 */
  class SingleCoreMockBackend extends org.apache.spark.scheduler.MockBackend {
  public   SingleCoreMockBackend (org.apache.spark.SparkConf conf, org.apache.spark.scheduler.TaskSchedulerImpl taskScheduler)  { throw new RuntimeException(); }
  public  int cores ()  { throw new RuntimeException(); }
  public  int defaultParallelism ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.scheduler.ExecutorTaskStatus> executorIdToExecutor ()  { throw new RuntimeException(); }
  public  java.lang.String localExecutorHostname ()  { throw new RuntimeException(); }
  public  java.lang.String localExecutorId ()  { throw new RuntimeException(); }
}
