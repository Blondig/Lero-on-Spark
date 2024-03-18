package org.apache.spark.scheduler.cluster;
/**
 * A {@link SchedulerBackend} implementation for Spark's standalone cluster manager.
 */
  class StandaloneSchedulerBackend extends org.apache.spark.scheduler.cluster.CoarseGrainedSchedulerBackend implements org.apache.spark.deploy.client.StandaloneAppClientListener, org.apache.spark.internal.Logging {
  // not preceding
  public   StandaloneSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.SparkContext sc, java.lang.String[] masters)  { throw new RuntimeException(); }
  public  java.lang.String applicationId ()  { throw new RuntimeException(); }
    org.apache.spark.deploy.client.StandaloneAppClient client ()  { throw new RuntimeException(); }
  public  void connected (java.lang.String appId)  { throw new RuntimeException(); }
  public  void dead (java.lang.String reason)  { throw new RuntimeException(); }
  public  void disconnected ()  { throw new RuntimeException(); }
  /**
   * Kill the given list of executors through the Master.
   * @return whether the kill request is acknowledged.
   * @param executorIds (undocumented)
   */
  protected  scala.concurrent.Future<java.lang.Object> doKillExecutors (scala.collection.Seq<java.lang.String> executorIds)  { throw new RuntimeException(); }
  /**
   * Request executors from the Master by specifying the total number desired,
   * including existing pending and running executors.
   * <p>
   * @return whether the request is acknowledged.
   * @param resourceProfileToTotalExecs (undocumented)
   */
  protected  scala.concurrent.Future<java.lang.Object> doRequestTotalExecutors (scala.collection.immutable.Map<org.apache.spark.resource.ResourceProfile, java.lang.Object> resourceProfileToTotalExecs)  { throw new RuntimeException(); }
  public  void executorAdded (java.lang.String fullId, java.lang.String workerId, java.lang.String hostPort, int cores, int memory)  { throw new RuntimeException(); }
  public  void executorDecommissioned (java.lang.String fullId, org.apache.spark.scheduler.ExecutorDecommissionInfo decommissionInfo)  { throw new RuntimeException(); }
  public  void executorRemoved (java.lang.String fullId, java.lang.String message, scala.Option<java.lang.Object> exitStatus, scala.Option<java.lang.String> workerHost)  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> getDriverLogUrls ()  { throw new RuntimeException(); }
  public  scala.Function1<org.apache.spark.scheduler.cluster.StandaloneSchedulerBackend, scala.runtime.BoxedUnit> shutdownCallback ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  boolean sufficientResourcesRegistered ()  { throw new RuntimeException(); }
  public  void workerRemoved (java.lang.String workerId, java.lang.String host, java.lang.String message)  { throw new RuntimeException(); }
}
