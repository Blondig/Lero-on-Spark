package org.apache.spark.streaming.rdd;
/**
 * This class represents a special case of the BlockRDD where the data blocks in
 * the block manager are also backed by data in write ahead logs. For reading
 * the data, this RDD first looks up the blocks by their ids in the block manager.
 * If it does not find them, it looks up the WAL using the corresponding record handle.
 * The lookup of the blocks from the block manager can be skipped by setting the corresponding
 * element in isBlockIdValid to false. This is a performance optimization which does not affect
 * correctness, and it can be used in situations where it is known that the block
 * does not exist in the Spark executors (e.g. after a failed driver is restarted).
 * <p>
 * param:  sc SparkContext
 * param:  _blockIds Ids of the blocks that contains this RDD's data
 * param:  walRecordHandles Record handles in write ahead logs that contain this RDD's data
 * param:  isBlockIdValid Whether the block Ids are valid (i.e., the blocks are present in the Spark
 *                         executors). If not, then block lookups by the block ids will be skipped.
 *                         By default, this is an empty array signifying true for all the blocks.
 * param:  storeInBlockManager Whether to store a block in the block manager
 *                            after reading it from the WAL
 * param:  storageLevel storage level to store when storing in block manager
 *                     (applicable when storeInBlockManager = true)
 */
  class WriteAheadLogBackedBlockRDD<T extends java.lang.Object> extends org.apache.spark.rdd.BlockRDD<T> {
  public  org.apache.spark.streaming.util.WriteAheadLogRecordHandle[] walRecordHandles ()  { throw new RuntimeException(); }
  // not preceding
  public   WriteAheadLogBackedBlockRDD (org.apache.spark.SparkContext sc, org.apache.spark.storage.BlockId[] _blockIds, org.apache.spark.streaming.util.WriteAheadLogRecordHandle[] walRecordHandles, boolean[] isBlockIdValid, boolean storeInBlockManager, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  boolean isValid ()  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  /**
   * Gets the partition data by getting the corresponding block from the block manager.
   * If the block does not exist, then the data is read from the corresponding record
   * in write ahead log files.
   * @param split (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<T> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  /**
   * Get the preferred location of the partition. This returns the locations of the block
   * if it is present in the block manager, else if FileBasedWriteAheadLogSegment is used,
   * it returns the location of the corresponding file segment in HDFS .
   * @param split (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
}
