package org.apache.spark.status;
/**
 * Data about a single partition of a cached RDD. The RDD storage level is used to compute the
 * effective storage level of the partition, which takes into account the storage actually being
 * used by the partition in the executors, and thus may differ from the storage level requested
 * by the application.
 */
public  class LiveRDDPartition {
  // not preceding
  public   LiveRDDPartition (java.lang.String blockName, org.apache.spark.storage.StorageLevel rddLevel)  { throw new RuntimeException(); }
  public  java.lang.String blockName ()  { throw new RuntimeException(); }
  public  long diskUsed ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> executors ()  { throw new RuntimeException(); }
  public  long memoryUsed ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.LiveRDDPartition next ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.LiveRDDPartition prev ()  { throw new RuntimeException(); }
  public  void update (scala.collection.Seq<java.lang.String> executors, long memoryUsed, long diskUsed)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.RDDPartitionInfo value ()  { throw new RuntimeException(); }
}
