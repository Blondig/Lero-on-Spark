package org.apache.spark.storage;
public  class FallbackStorage$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FallbackStorage$ MODULE$ = null;
  public   FallbackStorage$ ()  { throw new RuntimeException(); }
  /** We use one block manager id as a place holder. */
  public  org.apache.spark.storage.BlockManagerId FALLBACK_BLOCK_MANAGER_ID ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.storage.FallbackStorage> getFallbackStorage (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /** Register the fallback block manager and its RPC endpoint. */
  public  void registerBlockManagerIfNeeded (org.apache.spark.storage.BlockManagerMaster master, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /** Clean up the generated fallback location for this app. */
  public  void cleanUp (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /**
   * Read a ManagedBuffer.
   * @param conf (undocumented)
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.buffer.ManagedBuffer read (org.apache.spark.SparkConf conf, org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
}
