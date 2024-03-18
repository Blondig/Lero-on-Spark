package org.apache.spark.storage;
/**
 * Class to handle block manager decommissioning retries.
 * It creates a Thread to retry migrating all RDD cache and Shuffle blocks
 */
  class BlockManagerDecommissioner implements org.apache.spark.internal.Logging {
  public   BlockManagerDecommissioner (org.apache.spark.SparkConf conf, org.apache.spark.storage.BlockManager bm)  { throw new RuntimeException(); }
  /**
   * Tries to migrate all cached RDD blocks from this BlockManager to peer BlockManagers
   * Visible for testing
   * Returns true if we have not migrated all of our RDD blocks.
   * @return (undocumented)
   */
    boolean decommissionRddCacheBlocks ()  { throw new RuntimeException(); }
    scala.Tuple2<java.lang.Object, java.lang.Object> lastMigrationInfo ()  { throw new RuntimeException(); }
    long lastRDDMigrationTime ()  { throw new RuntimeException(); }
    long lastShuffleMigrationTime ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashSet<org.apache.spark.shuffle.ShuffleBlockInfo> migratingShuffles ()  { throw new RuntimeException(); }
    java.util.concurrent.atomic.AtomicInteger numMigratedShuffles ()  { throw new RuntimeException(); }
    boolean rddBlocksLeft ()  { throw new RuntimeException(); }
  /**
   * Tries to migrate all shuffle blocks that are registered with the shuffle service locally.
   * Note: this does not delete the shuffle files in-case there is an in-progress fetch
   * but rather shadows them.
   * Requires an Indexed based shuffle resolver.
   * Note: if called in testing please call stopMigratingShuffleBlocks to avoid thread leakage.
   * Returns true if we are not done migrating shuffle blocks.
   * @return (undocumented)
   */
    boolean refreshMigratableShuffleBlocks ()  { throw new RuntimeException(); }
    boolean shuffleBlocksLeft ()  { throw new RuntimeException(); }
    java.util.concurrent.ConcurrentLinkedQueue<scala.Tuple2<org.apache.spark.shuffle.ShuffleBlockInfo, java.lang.Object>> shufflesToMigrate ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Stop migrating shuffle blocks.
   */
    void stopMigratingShuffleBlocks ()  { throw new RuntimeException(); }
}
