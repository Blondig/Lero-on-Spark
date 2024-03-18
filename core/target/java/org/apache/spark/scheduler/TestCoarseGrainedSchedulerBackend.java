package org.apache.spark.scheduler;
  class TestCoarseGrainedSchedulerBackend extends org.apache.spark.scheduler.cluster.CoarseGrainedSchedulerBackend {
  // not preceding
  public   TestCoarseGrainedSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.rpc.RpcEnv rpcEnv)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSchedulerImpl getTaskSchedulerImpl ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
}
