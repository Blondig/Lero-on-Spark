package org.apache.spark.sql.execution.streaming.state;
/**
 * Configurations for optimizing RocksDB
 * param:  compactOnCommit Whether to compact RocksDB data before commit / checkpointing
 */
public  class RocksDBConf implements scala.Product, scala.Serializable {
  /** Common prefix of all confs in SQLConf that affects RocksDB */
  static public  java.lang.String ROCKSDB_CONF_NAME_PREFIX ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.RocksDBConf apply (org.apache.spark.sql.execution.streaming.state.StateStoreConf storeConf)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.RocksDBConf apply ()  { throw new RuntimeException(); }
  public  int minVersionsToRetain ()  { throw new RuntimeException(); }
  public  boolean compactOnCommit ()  { throw new RuntimeException(); }
  public  long blockSizeKB ()  { throw new RuntimeException(); }
  public  long blockCacheSizeMB ()  { throw new RuntimeException(); }
  public  long lockAcquireTimeoutMs ()  { throw new RuntimeException(); }
  public  boolean resetStatsOnLoad ()  { throw new RuntimeException(); }
  public  int formatVersion ()  { throw new RuntimeException(); }
  public  boolean trackTotalNumberOfRows ()  { throw new RuntimeException(); }
  // not preceding
  public   RocksDBConf (int minVersionsToRetain, boolean compactOnCommit, long blockSizeKB, long blockCacheSizeMB, long lockAcquireTimeoutMs, boolean resetStatsOnLoad, int formatVersion, boolean trackTotalNumberOfRows)  { throw new RuntimeException(); }
}
