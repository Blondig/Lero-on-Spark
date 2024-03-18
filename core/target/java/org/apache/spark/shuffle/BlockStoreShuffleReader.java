package org.apache.spark.shuffle;
/**
 * Fetches and reads the blocks from a shuffle by requesting them from other nodes' block stores.
 */
  class BlockStoreShuffleReader<K extends java.lang.Object, C extends java.lang.Object> implements org.apache.spark.shuffle.ShuffleReader<K, C>, org.apache.spark.internal.Logging {
  public   BlockStoreShuffleReader (org.apache.spark.shuffle.BaseShuffleHandle<K, ?, C> handle, scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> blocksByAddress, org.apache.spark.TaskContext context, org.apache.spark.shuffle.ShuffleReadMetricsReporter readMetrics, org.apache.spark.serializer.SerializerManager serializerManager, org.apache.spark.storage.BlockManager blockManager, org.apache.spark.MapOutputTracker mapOutputTracker, boolean shouldBatchFetch)  { throw new RuntimeException(); }
  /** Read the combined key-values for this reduce task */
  public  scala.collection.Iterator<scala.Product2<K, C>> read ()  { throw new RuntimeException(); }
}
