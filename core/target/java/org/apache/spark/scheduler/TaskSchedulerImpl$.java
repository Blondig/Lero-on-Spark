package org.apache.spark.scheduler;
public  class TaskSchedulerImpl$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TaskSchedulerImpl$ MODULE$ = null;
  public   TaskSchedulerImpl$ ()  { throw new RuntimeException(); }
  public  java.lang.String SCHEDULER_MODE_PROPERTY ()  { throw new RuntimeException(); }
  /**
   * Calculate the max available task slots given the <code>availableCpus</code> and <code>availableResources</code>
   * from a collection of ResourceProfiles. And only those ResourceProfiles who has the
   * same id with the <code>rpId</code> can be used to calculate the task slots.
   * <p>
   * @param scheduler the TaskSchedulerImpl instance
   * @param conf SparkConf used to calculate the limiting resource and get the cpu amount per task
   * @param rpId the target ResourceProfile id. Only those ResourceProfiles who has the same id
   *             with it can be used to calculate the task slots.
   * @param availableRPIds an Array of ids of the available ResourceProfiles from the executors.
   * @param availableCpus an Array of the amount of available cpus from the executors.
   * @param availableResources an Array of the resources map from the executors. In the resource
   *                           map, it maps from the resource name to its amount.
   * @return the number of max task slots
   */
  public  int calculateAvailableSlots (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.SparkConf conf, int rpId, int[] availableRPIds, int[] availableCpus, scala.collection.immutable.Map<java.lang.String, java.lang.Object>[] availableResources)  { throw new RuntimeException(); }
  /**
   * Used to balance containers across hosts.
   * <p>
   * Accepts a map of hosts to resource offers for that host, and returns a prioritized list of
   * resource offers representing the order in which the offers should be used. The resource
   * offers are ordered such that we'll allocate one container on each host before allocating a
   * second container on any host, and so on, in order to reduce the damage if a host fails.
   * <p>
   * For example, given {@literal <h1, [o1, o2, o3]>}, {@literal <h2, [o4]>} and
   * {@literal <h3, [o5, o6]>}, returns {@literal [o1, o5, o4, o2, o6, o3]}.
   * @param map (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, T extends java.lang.Object> scala.collection.immutable.List<T> prioritizeContainers (scala.collection.mutable.HashMap<K, scala.collection.mutable.ArrayBuffer<T>> map)  { throw new RuntimeException(); }
}
