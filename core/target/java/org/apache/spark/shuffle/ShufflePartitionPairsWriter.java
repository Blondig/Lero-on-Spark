package org.apache.spark.shuffle;
/**
 * A key-value writer inspired by {@link DiskBlockObjectWriter} that pushes the bytes to an
 * arbitrary partition writer instead of writing to local disk through the block manager.
 */
  class ShufflePartitionPairsWriter implements org.apache.spark.util.collection.PairsWriter, java.io.Closeable {
  public   ShufflePartitionPairsWriter (org.apache.spark.shuffle.api.ShufflePartitionWriter partitionWriter, org.apache.spark.serializer.SerializerManager serializerManager, org.apache.spark.serializer.SerializerInstance serializerInstance, org.apache.spark.storage.BlockId blockId, org.apache.spark.shuffle.ShuffleWriteMetricsReporter writeMetrics, java.util.zip.Checksum checksum)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  void write (Object key, Object value)  { throw new RuntimeException(); }
}
