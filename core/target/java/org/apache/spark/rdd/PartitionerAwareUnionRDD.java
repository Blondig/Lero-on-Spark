package org.apache.spark.rdd;
/**
 * Class representing an RDD that can take multiple RDDs partitioned by the same partitioner and
 * unify them into a single RDD while preserving the partitioner. So m RDDs with p partitions each
 * will be unified to a single RDD with p partitions and the same partitioner. The preferred
 * location for each partition of the unified RDD will be the most common preferred location
 * of the corresponding partitions of the parent RDDs. For example, location of partition 0
 * of the unified RDD will be where most of partition 0 of the parent RDDs are located.
 */
  class PartitionerAwareUnionRDD<T extends java.lang.Object> extends org.apache.spark.rdd.RDD<T> {
  // not preceding
  public   PartitionerAwareUnionRDD (org.apache.spark.SparkContext sc, scala.collection.Seq<org.apache.spark.rdd.RDD<T>> rdds, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  void clearDependencies ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<T> compute (org.apache.spark.Partition s, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition s)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.Partitioner> partitioner ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.rdd.RDD<T>> rdds ()  { throw new RuntimeException(); }
}
