package org.apache.spark.status;
/**
 * Tracker for data related to a persisted RDD.
 * <p>
 * The RDD storage level is immutable, following the current behavior of <code>RDD.persist()</code>, even
 * though it is mutable in the <code>RDDInfo</code> structure. Since the listener does not track unpersisted
 * RDDs, this covers the case where an early stage is run on the unpersisted RDD, and a later stage
 * it started after the RDD is marked for caching.
 */
public  class LiveRDD extends org.apache.spark.status.LiveEntity {
  // not preceding
  public   LiveRDD (org.apache.spark.storage.RDDInfo info, org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  public  long diskUsed ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.LiveRDDDistribution distribution (org.apache.spark.status.LiveExecutor exec)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.LiveRDDDistribution> distributionOpt (org.apache.spark.status.LiveExecutor exec)  { throw new RuntimeException(); }
  protected  Object doUpdate ()  { throw new RuntimeException(); }
  public  scala.collection.Map<java.lang.String, org.apache.spark.status.LiveRDDDistribution> getDistributions ()  { throw new RuntimeException(); }
  public  scala.collection.Map<java.lang.String, org.apache.spark.status.LiveRDDPartition> getPartitions ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.RDDInfo info ()  { throw new RuntimeException(); }
  public  long memoryUsed ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.LiveRDDPartition partition (java.lang.String blockName)  { throw new RuntimeException(); }
  public  boolean removeDistribution (org.apache.spark.status.LiveExecutor exec)  { throw new RuntimeException(); }
  public  void removePartition (java.lang.String blockName)  { throw new RuntimeException(); }
}
