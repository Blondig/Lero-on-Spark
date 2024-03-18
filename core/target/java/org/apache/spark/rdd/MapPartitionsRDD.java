package org.apache.spark.rdd;
/**
 * An RDD that applies the provided function to every partition of the parent RDD.
 * <p>
 * param:  prev the parent RDD.
 * param:  f The function used to map a tuple of (TaskContext, partition index, input iterator) to
 *          an output iterator.
 * param:  preservesPartitioning Whether the input function preserves the partitioner, which should
 *                              be <code>false</code> unless <code>prev</code> is a pair RDD and the input function
 *                              doesn't modify the keys.
 * param:  isFromBarrier Indicates whether this RDD is transformed from an RDDBarrier, a stage
 *                      containing at least one RDDBarrier shall be turned into a barrier stage.
 * param:  isOrderSensitive whether or not the function is order-sensitive. If it's order
 *                         sensitive, it may return totally different result when the input order
 *                         is changed. Mostly stateful functions are order-sensitive.
 */
  class MapPartitionsRDD<U extends java.lang.Object, T extends java.lang.Object> extends org.apache.spark.rdd.RDD<U> {
  public  org.apache.spark.rdd.RDD<T> prev ()  { throw new RuntimeException(); }
  // not preceding
  public   MapPartitionsRDD (org.apache.spark.rdd.RDD<T> prev, scala.Function3<org.apache.spark.TaskContext, java.lang.Object, scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, boolean isFromBarrier, boolean isOrderSensitive, scala.reflect.ClassTag<U> evidence$1, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.Partitioner> partitioner ()  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<U> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  void clearDependencies ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean isBarrier_ ()  { throw new RuntimeException(); }
  protected  scala.Enumeration.Value getOutputDeterministicLevel ()  { throw new RuntimeException(); }
}
