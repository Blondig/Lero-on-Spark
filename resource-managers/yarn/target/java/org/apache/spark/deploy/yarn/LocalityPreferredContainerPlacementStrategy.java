package org.apache.spark.deploy.yarn;
/**
 * This strategy is calculating the optimal locality preferences of YARN containers by considering
 * the node ratio of pending tasks, number of required cores/containers and locality of current
 * existing and pending allocated containers. The target of this algorithm is to maximize the number
 * of tasks that would run locally.
 * <p>
 * Consider a situation in which we have 20 tasks that require (host1, host2, host3)
 * and 10 tasks that require (host1, host2, host4), besides each container has 2 cores
 * and cpus per task is 1, so the required container number is 15,
 * and host ratio is (host1: 30, host2: 30, host3: 20, host4: 10).
 * <p>
 * 1. If the requested container number (18) is more than the required container number (15):
 * <p>
 * requests for 5 containers with nodes: (host1, host2, host3, host4)
 * requests for 5 containers with nodes: (host1, host2, host3)
 * requests for 5 containers with nodes: (host1, host2)
 * requests for 3 containers with no locality preferences.
 * <p>
 * The placement ratio is 3 : 3 : 2 : 1, and set the additional containers with no locality
 * preferences.
 * <p>
 * 2. If requested container number (10) is less than or equal to the required container number
 * (15):
 * <p>
 * requests for 4 containers with nodes: (host1, host2, host3, host4)
 * requests for 3 containers with nodes: (host1, host2, host3)
 * requests for 3 containers with nodes: (host1, host2)
 * <p>
 * The placement ratio is 10 : 10 : 7 : 4, close to expected ratio (3 : 3 : 2 : 1)
 * <p>
 * 3. If containers exist but none of them can match the requested localities,
 * follow the method of 1 and 2.
 * <p>
 * 4. If containers exist and some of them can match the requested localities.
 * For example if we have 1 container on each node (host1: 1, host2: 1: host3: 1, host4: 1),
 * and the expected containers on each node would be (host1: 5, host2: 5, host3: 4, host4: 2),
 * so the newly requested containers on each node would be updated to (host1: 4, host2: 4,
 * host3: 3, host4: 1), 12 containers by total.
 * <p>
 *   4.1 If requested container number (18) is more than newly required containers (12). Follow
 *   method 1 with an updated ratio 4 : 4 : 3 : 1.
 * <p>
 *   4.2 If request container number (10) is less than newly required containers (12). Follow
 *   method 2 with an updated ratio 4 : 4 : 3 : 1.
 * <p>
 * 5. If containers exist and existing localities can fully cover the requested localities.
 * For example if we have 5 containers on each node (host1: 5, host2: 5, host3: 5, host4: 5),
 * which could cover the current requested localities. This algorithm will allocate all the
 * requested containers with no localities.
 */
  class LocalityPreferredContainerPlacementStrategy {
  // not preceding
  public   LocalityPreferredContainerPlacementStrategy (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration yarnConf, org.apache.spark.deploy.yarn.SparkRackResolver resolver)  { throw new RuntimeException(); }
  /**
   * Calculate each container's node locality and rack locality
   * @param numContainer number of containers to calculate
   * @param numLocalityAwareTasks number of locality required tasks
   * @param hostToLocalTaskCount a map to store the preferred hostname and possible task
   *                             numbers running on it, used as hints for container allocation
   * @param allocatedHostToContainersMap host to allocated containers map, used to calculate the
   *                                     expected locality preference by considering the existing
   *                                     containers
   * @param localityMatchedPendingAllocations A sequence of pending container request which
   *                                          matches the localities of current required tasks.
   * @param rp The ResourceProfile associated with this container.
   * @return node localities and rack localities, each locality is an array of string,
   *         the length of localities is the same as number of containers
   */
  public  org.apache.spark.deploy.yarn.ContainerLocalityPreferences[] localityOfRequestedContainers (int numContainer, int numLocalityAwareTasks, scala.collection.immutable.Map<java.lang.String, java.lang.Object> hostToLocalTaskCount, scala.collection.mutable.HashMap<java.lang.String, scala.collection.mutable.Set<org.apache.hadoop.yarn.api.records.ContainerId>> allocatedHostToContainersMap, scala.collection.Seq<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> localityMatchedPendingAllocations, org.apache.spark.resource.ResourceProfile rp)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration yarnConf ()  { throw new RuntimeException(); }
}
