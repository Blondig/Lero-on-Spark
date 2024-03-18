package org.apache.spark;
/**
 * :: DeveloperApi ::
 * Represents a dependency on the output of a shuffle stage. Note that in the case of shuffle,
 * the RDD is transient since we don't need it on the executor side.
 * <p>
 * param:  _rdd the parent RDD
 * param:  partitioner partitioner used to partition the shuffle output
 * param:  serializer {@link org.apache.spark.serializer.Serializer Serializer} to use. If not set
 *                   explicitly then the default serializer, as specified by <code>spark.serializer</code>
 *                   config option, will be used.
 * param:  keyOrdering key ordering for RDD's shuffles
 * param:  aggregator map/reduce-side aggregator for RDD's shuffle
 * param:  mapSideCombine whether to perform partial aggregation (also known as map-side combine)
 * param:  shuffleWriterProcessor the processor to control the write behavior in ShuffleMapTask
 */
public  class ShuffleDependency<K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> extends org.apache.spark.Dependency<scala.Product2<K, V>> implements org.apache.spark.internal.Logging {
  public  org.apache.spark.Partitioner partitioner ()  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.Serializer serializer ()  { throw new RuntimeException(); }
  public  scala.Option<scala.math.Ordering<K>> keyOrdering ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.Aggregator<K, V, C>> aggregator ()  { throw new RuntimeException(); }
  public  boolean mapSideCombine ()  { throw new RuntimeException(); }
  public  org.apache.spark.shuffle.ShuffleWriteProcessor shuffleWriterProcessor ()  { throw new RuntimeException(); }
  // not preceding
  public   ShuffleDependency (org.apache.spark.rdd.RDD<? extends scala.Product2<K, V>> _rdd, org.apache.spark.Partitioner partitioner, org.apache.spark.serializer.Serializer serializer, scala.Option<scala.math.Ordering<K>> keyOrdering, scala.Option<org.apache.spark.Aggregator<K, V, C>> aggregator, boolean mapSideCombine, org.apache.spark.shuffle.ShuffleWriteProcessor shuffleWriterProcessor, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2, scala.reflect.ClassTag<C> evidence$3)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<scala.Product2<K, V>> rdd ()  { throw new RuntimeException(); }
    java.lang.String keyClassName ()  { throw new RuntimeException(); }
    java.lang.String valueClassName ()  { throw new RuntimeException(); }
    scala.Option<java.lang.String> combinerClassName ()  { throw new RuntimeException(); }
  public  int shuffleId ()  { throw new RuntimeException(); }
  public  org.apache.spark.shuffle.ShuffleHandle shuffleHandle ()  { throw new RuntimeException(); }
    void setShuffleMergeAllowed (boolean shuffleMergeAllowed)  { throw new RuntimeException(); }
  public  boolean shuffleMergeEnabled ()  { throw new RuntimeException(); }
  public  boolean shuffleMergeAllowed ()  { throw new RuntimeException(); }
  /**
   * Stores the location of the list of chosen external shuffle services for handling the
   * shuffle merge requests from mappers in this shuffle map stage.
   * @return (undocumented)
   */
    scala.collection.Seq<org.apache.spark.storage.BlockManagerId> mergerLocs ()  { throw new RuntimeException(); }
  /**
   * shuffleMergeId is used to uniquely identify merging process of shuffle
   * by an indeterminate stage attempt.
   * @return (undocumented)
   */
  public  int shuffleMergeId ()  { throw new RuntimeException(); }
  public  void setMergerLocs (scala.collection.Seq<org.apache.spark.storage.BlockManagerId> mergerLocs)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.storage.BlockManagerId> getMergerLocs ()  { throw new RuntimeException(); }
    void markShuffleMergeFinalized ()  { throw new RuntimeException(); }
    boolean isShuffleMergeFinalizedMarked ()  { throw new RuntimeException(); }
  /**
   * Returns true if push-based shuffle is disabled or if the shuffle merge for
   * this shuffle is finalized.
   * @return (undocumented)
   */
  public  boolean shuffleMergeFinalized ()  { throw new RuntimeException(); }
  public  void newShuffleMergeState ()  { throw new RuntimeException(); }
  /**
   * Mark a given map task as push completed in the tracking bitmap.
   * Using the bitmap ensures that the same map task launched multiple times due to
   * either speculation or stage retry is only counted once.
   * @param mapIndex Map task index
   * @return number of map tasks with block push completed
   */
    int incPushCompleted (int mapIndex)  { throw new RuntimeException(); }
    scala.Option<java.util.concurrent.ScheduledFuture<?>> getFinalizeTask ()  { throw new RuntimeException(); }
    void setFinalizeTask (java.util.concurrent.ScheduledFuture<?> task)  { throw new RuntimeException(); }
}
