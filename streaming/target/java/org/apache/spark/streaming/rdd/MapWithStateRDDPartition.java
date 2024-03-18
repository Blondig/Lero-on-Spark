package org.apache.spark.streaming.rdd;
/**
 * Partition of the {@link MapWithStateRDD}, which depends on corresponding partitions of prev state
 * RDD, and a partitioned keyed-data RDD
 */
  class MapWithStateRDDPartition implements org.apache.spark.Partition {
  // not preceding
  public   MapWithStateRDDPartition (int index, org.apache.spark.rdd.RDD<?> prevStateRDD, org.apache.spark.rdd.RDD<?> partitionedDataRDD)  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
    org.apache.spark.Partition partitionedDataRDDPartition ()  { throw new RuntimeException(); }
    org.apache.spark.Partition previousSessionRDDPartition ()  { throw new RuntimeException(); }
}
