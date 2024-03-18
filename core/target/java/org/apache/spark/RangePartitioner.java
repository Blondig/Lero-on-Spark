package org.apache.spark;
/**
 * A {@link org.apache.spark.Partitioner} that partitions sortable records by range into roughly
 * equal ranges. The ranges are determined by sampling the content of the RDD passed in.
 * <p>
 * @note The actual number of partitions created by the RangePartitioner might not be the same
 * as the <code>partitions</code> parameter, in the case where the number of sampled records is less than
 * the value of <code>partitions</code>.
 */
public  class RangePartitioner<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.Partitioner {
  /**
   * Sketches the input RDD via reservoir sampling on each partition.
   * <p>
   * @param rdd the input RDD to sketch
   * @param sampleSizePerPartition max sample size per partition
   * @return (total number of items, an array of (partitionId, number of items, sample))
   * @param evidence$5 (undocumented)
   */
  static public <K extends java.lang.Object> scala.Tuple2<java.lang.Object, scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>[]> sketch (org.apache.spark.rdd.RDD<K> rdd, int sampleSizePerPartition, scala.reflect.ClassTag<K> evidence$5)  { throw new RuntimeException(); }
  /**
   * Determines the bounds for range partitioning from candidates with weights indicating how many
   * items each represents. Usually this is 1 over the probability used to sample this candidate.
   * <p>
   * @param candidates unordered candidates with weights
   * @param partitions number of partitions
   * @return selected bounds
   * @param evidence$6 (undocumented)
   * @param evidence$7 (undocumented)
   */
  static public <K extends java.lang.Object> java.lang.Object determineBounds (scala.collection.mutable.ArrayBuffer<scala.Tuple2<K, java.lang.Object>> candidates, int partitions, scala.math.Ordering<K> evidence$6, scala.reflect.ClassTag<K> evidence$7)  { throw new RuntimeException(); }
  public  int samplePointsPerPartitionHint ()  { throw new RuntimeException(); }
  // not preceding
  public   RangePartitioner (int partitions, org.apache.spark.rdd.RDD<? extends scala.Product2<K, V>> rdd, boolean ascending, int samplePointsPerPartitionHint, scala.math.Ordering<K> evidence$1, scala.reflect.ClassTag<K> evidence$2)  { throw new RuntimeException(); }
  public   RangePartitioner (int partitions, org.apache.spark.rdd.RDD<? extends scala.Product2<K, V>> rdd, boolean ascending, scala.math.Ordering<K> evidence$3, scala.reflect.ClassTag<K> evidence$4)  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  public  int getPartition (Object key)  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
}
