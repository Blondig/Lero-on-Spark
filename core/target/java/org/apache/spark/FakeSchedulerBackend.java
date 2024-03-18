package org.apache.spark;
/**
 * Dummy scheduler backend to simulate executor allocation requests to the cluster manager.
 */
public  class FakeSchedulerBackend extends org.apache.spark.scheduler.cluster.CoarseGrainedSchedulerBackend {
  public   FakeSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.rpc.RpcEndpointRef clusterManagerEndpoint, org.apache.spark.resource.ResourceProfileManager resourceProfileManager)  { throw new RuntimeException(); }
  public   FakeSchedulerBackend ()  { throw new RuntimeException(); }
  protected  scala.concurrent.Future<java.lang.Object> doKillExecutors (scala.collection.Seq<java.lang.String> executorIds)  { throw new RuntimeException(); }
  protected  scala.concurrent.Future<java.lang.Object> doRequestTotalExecutors (scala.collection.immutable.Map<org.apache.spark.resource.ResourceProfile, java.lang.Object> resourceProfileToTotalExecs)  { throw new RuntimeException(); }
}
