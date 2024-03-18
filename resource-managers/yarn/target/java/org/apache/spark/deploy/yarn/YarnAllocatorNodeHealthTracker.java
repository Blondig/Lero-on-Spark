package org.apache.spark.deploy.yarn;
/**
 * YarnAllocatorNodeHealthTracker is responsible for tracking the health of nodes
 * and synchronizing the node list to YARN as to which nodes are excluded.
 * <p>
 * Excluding nodes are coming from two different sources:
 * <p>
 * <ul>
 *   <li> from the scheduler as task level excluded nodes
 *   <li> from this class (tracked here) as YARN resource allocation problems
 * </ul>
 * <p>
 * The reason to realize this logic here (and not in the driver) is to avoid possible delays
 * between synchronizing the excluded nodes with YARN and resource allocations.
 */
  class YarnAllocatorNodeHealthTracker implements org.apache.spark.internal.Logging {
  public   YarnAllocatorNodeHealthTracker (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.yarn.client.api.AMRMClient<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> amClient, org.apache.spark.deploy.yarn.FailureTracker failureTracker)  { throw new RuntimeException(); }
  public  void handleResourceAllocationFailure (scala.Option<java.lang.String> hostOpt)  { throw new RuntimeException(); }
  public  boolean isAllNodeExcluded ()  { throw new RuntimeException(); }
  public  void setNumClusterNodes (int numClusterNodes)  { throw new RuntimeException(); }
  public  void setSchedulerExcludedNodes (scala.collection.immutable.Set<java.lang.String> schedulerExcludedNodesWithExpiry)  { throw new RuntimeException(); }
}
