package org.apache.spark.scheduler.cluster;
/**
 * Grouping of data for an executor used by CoarseGrainedSchedulerBackend.
 * <p>
 * param:  executorEndpoint The RpcEndpointRef representing this executor
 * param:  executorAddress The network address of this executor
 * param:  executorHost The hostname that this executor is running on
 * param:  freeCores  The current number of cores available for work on the executor
 * param:  totalCores The total number of cores available to the executor
 * param:  resourcesInfo The information of the currently available resources on the executor
 * param:  resourceProfileId The id of the ResourceProfile being used by this executor
 * param:  registrationTs The registration timestamp of this executor
 */
  class ExecutorData extends org.apache.spark.scheduler.cluster.ExecutorInfo {
  // not preceding
  public   ExecutorData (org.apache.spark.rpc.RpcEndpointRef executorEndpoint, org.apache.spark.rpc.RpcAddress executorAddress, java.lang.String executorHost, int freeCores, int totalCores, scala.collection.immutable.Map<java.lang.String, java.lang.String> logUrlMap, scala.collection.immutable.Map<java.lang.String, java.lang.String> attributes, scala.collection.immutable.Map<java.lang.String, org.apache.spark.scheduler.ExecutorResourceInfo> resourcesInfo, int resourceProfileId, long registrationTs)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> attributes ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcAddress executorAddress ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef executorEndpoint ()  { throw new RuntimeException(); }
  public  java.lang.String executorHost ()  { throw new RuntimeException(); }
  public  int freeCores ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> logUrlMap ()  { throw new RuntimeException(); }
  public  long registrationTs ()  { throw new RuntimeException(); }
  public  int resourceProfileId ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.scheduler.ExecutorResourceInfo> resourcesInfo ()  { throw new RuntimeException(); }
  public  int totalCores ()  { throw new RuntimeException(); }
}
