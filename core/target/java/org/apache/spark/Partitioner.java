package org.apache.spark;
/**
 * An object that defines how the elements in a key-value pair RDD are partitioned by key.
 * Maps each key to a partition ID, from 0 to <code>numPartitions - 1</code>.
 * <p>
 * Note that, partitioner must be deterministic, i.e. it must return the same partition id given
 * the same partition key.
 */
public abstract class Partitioner implements scala.Serializable {
  /**
   * Choose a partitioner to use for a cogroup-like operation between a number of RDDs.
   * <p>
   * If spark.default.parallelism is set, we'll use the value of SparkContext defaultParallelism
   * as the default partitions number, otherwise we'll use the max number of upstream partitions.
   * <p>
   * When available, we choose the partitioner from rdds with maximum number of partitions. If this
   * partitioner is eligible (number of partitions within an order of maximum number of partitions
   * in rdds), or has partition number higher than or equal to default partitions number - we use
   * this partitioner.
   * <p>
   * Otherwise, we'll use a new HashPartitioner with the default partitions number.
   * <p>
   * Unless spark.default.parallelism is set, the number of partitions will be the same as the
   * number of partitions in the largest upstream RDD, as this should be least likely to cause
   * out-of-memory errors.
   * <p>
   * We use two method parameters (rdd, others) to enforce callers passing at least 1 RDD.
   * @param rdd (undocumented)
   * @param others (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.Partitioner defaultPartitioner (org.apache.spark.rdd.RDD<?> rdd, scala.collection.Seq<org.apache.spark.rdd.RDD<?>> others)  { throw new RuntimeException(); }
  public   Partitioner ()  { throw new RuntimeException(); }
  public abstract  int numPartitions ()  ;
  public abstract  int getPartition (Object key)  ;
}
