package org.apache.spark.scheduler.dynalloc;
/**
 * A monitor for executor activity, used by ExecutorAllocationManager to detect idle executors.
 */
  class ExecutorMonitor extends org.apache.spark.scheduler.SparkListener implements org.apache.spark.CleanerListener, org.apache.spark.internal.Logging {
  public   ExecutorMonitor (org.apache.spark.SparkConf conf, org.apache.spark.ExecutorAllocationClient client, org.apache.spark.scheduler.LiveListenerBus listenerBus, org.apache.spark.util.Clock clock, org.apache.spark.ExecutorAllocationManagerSource metrics)  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
  /**
   * Returns the list of executors and their ResourceProfile id that are currently considered to
   * be timed out. Should only be called from the EAM thread.
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> timedOutExecutors ()  { throw new RuntimeException(); }
  /**
   * Mark the given executors as pending to be removed. Should only be called in the EAM thread.
   * This covers both kills and decommissions.
   * @param ids (undocumented)
   */
  public  void executorsKilled (scala.collection.Seq<java.lang.String> ids)  { throw new RuntimeException(); }
    void executorsDecommissioned (scala.collection.Seq<java.lang.String> ids)  { throw new RuntimeException(); }
  public  int executorCount ()  { throw new RuntimeException(); }
  public  int executorCountWithResourceProfile (int id)  { throw new RuntimeException(); }
  public  int getResourceProfileId (java.lang.String executorId)  { throw new RuntimeException(); }
  public  int pendingRemovalCount ()  { throw new RuntimeException(); }
  public  int pendingRemovalCountPerResourceProfileId (int id)  { throw new RuntimeException(); }
  public  int decommissioningCount ()  { throw new RuntimeException(); }
  public  int decommissioningPerResourceProfileId (int id)  { throw new RuntimeException(); }
  public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart event)  { throw new RuntimeException(); }
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd event)  { throw new RuntimeException(); }
  public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart event)  { throw new RuntimeException(); }
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd event)  { throw new RuntimeException(); }
  public  void onExecutorAdded (org.apache.spark.scheduler.SparkListenerExecutorAdded event)  { throw new RuntimeException(); }
  public  void onExecutorRemoved (org.apache.spark.scheduler.SparkListenerExecutorRemoved event)  { throw new RuntimeException(); }
  public  void onBlockUpdated (org.apache.spark.scheduler.SparkListenerBlockUpdated event)  { throw new RuntimeException(); }
  public  void onUnpersistRDD (org.apache.spark.scheduler.SparkListenerUnpersistRDD event)  { throw new RuntimeException(); }
  public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  public  void rddCleaned (int rddId)  { throw new RuntimeException(); }
  public  void shuffleCleaned (int shuffleId)  { throw new RuntimeException(); }
  public  void broadcastCleaned (long broadcastId)  { throw new RuntimeException(); }
  public  void accumCleaned (long accId)  { throw new RuntimeException(); }
  public  void checkpointCleaned (long rddId)  { throw new RuntimeException(); }
    boolean isExecutorIdle (java.lang.String id)  { throw new RuntimeException(); }
    scala.collection.Seq<java.lang.String> timedOutExecutors (long when)  { throw new RuntimeException(); }
    scala.collection.immutable.Set<java.lang.String> executorsPendingToRemove ()  { throw new RuntimeException(); }
    scala.collection.immutable.Set<java.lang.String> executorsDecommissioning ()  { throw new RuntimeException(); }
}
