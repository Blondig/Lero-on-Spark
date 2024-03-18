package org.apache.spark.sql.execution.streaming.state;
  class RocksDBStateStoreProvider implements org.apache.spark.sql.execution.streaming.state.StateStoreProvider, org.apache.spark.internal.Logging, java.io.Closeable {
  public  class RocksDBStateStore implements org.apache.spark.sql.execution.streaming.state.StateStore {
    public  class UPDATING {
      static public abstract  boolean canEqual (Object that)  ;
      static public abstract  boolean equals (Object that)  ;
      static public abstract  Object productElement (int n)  ;
      static public abstract  int productArity ()  ;
      static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
      static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
    }
    public  class UPDATING$ implements org.apache.spark.sql.execution.streaming.state.RocksDBStateStoreProvider.RocksDBStateStore.STATE, scala.Product, scala.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final UPDATING$ MODULE$ = null;
      public   UPDATING$ ()  { throw new RuntimeException(); }
    }
    public  class COMMITTED {
      static public abstract  boolean canEqual (Object that)  ;
      static public abstract  boolean equals (Object that)  ;
      static public abstract  Object productElement (int n)  ;
      static public abstract  int productArity ()  ;
      static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
      static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
    }
    public  class COMMITTED$ implements org.apache.spark.sql.execution.streaming.state.RocksDBStateStoreProvider.RocksDBStateStore.STATE, scala.Product, scala.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final COMMITTED$ MODULE$ = null;
      public   COMMITTED$ ()  { throw new RuntimeException(); }
    }
    public  class ABORTED {
      static public abstract  boolean canEqual (Object that)  ;
      static public abstract  boolean equals (Object that)  ;
      static public abstract  Object productElement (int n)  ;
      static public abstract  int productArity ()  ;
      static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
      static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
    }
    public  class ABORTED$ implements org.apache.spark.sql.execution.streaming.state.RocksDBStateStoreProvider.RocksDBStateStore.STATE, scala.Product, scala.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final ABORTED$ MODULE$ = null;
      public   ABORTED$ ()  { throw new RuntimeException(); }
    }
    /** Trait and classes representing the internal state of the store */
    public  interface STATE {
    }
    public  org.apache.spark.sql.execution.streaming.state.RocksDBStateStoreProvider.RocksDBStateStore.ABORTED$ ABORTED ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.state.RocksDBStateStoreProvider.RocksDBStateStore.COMMITTED$ COMMITTED ()  { throw new RuntimeException(); }
    public   RocksDBStateStore (long lastVersion)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.state.RocksDBStateStoreProvider.RocksDBStateStore.UPDATING$ UPDATING ()  { throw new RuntimeException(); }
    public  void abort ()  { throw new RuntimeException(); }
    public  long commit ()  { throw new RuntimeException(); }
    /** Return the {@link RocksDB} instance in this store. This is exposed mainly for testing. */
    public  org.apache.spark.sql.execution.streaming.state.RocksDB dbInstance ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.UnsafeRow get (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
    public  boolean hasCommitted ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.state.StateStoreId id ()  { throw new RuntimeException(); }
    public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> iterator ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.state.StateStoreMetrics metrics ()  { throw new RuntimeException(); }
    public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> prefixScan (org.apache.spark.sql.catalyst.expressions.UnsafeRow prefixKey)  { throw new RuntimeException(); }
    public  void put (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  { throw new RuntimeException(); }
    public  void remove (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  long version ()  { throw new RuntimeException(); }
  }
  static public  int STATE_ENCODING_NUM_VERSION_BYTES ()  { throw new RuntimeException(); }
  static public  byte STATE_ENCODING_VERSION ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomTimingMetric CUSTOM_METRIC_GET_TIME ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomTimingMetric CUSTOM_METRIC_PUT_TIME ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomSumMetric CUSTOM_METRIC_GET_COUNT ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomSumMetric CUSTOM_METRIC_PUT_COUNT ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomTimingMetric CUSTOM_METRIC_WRITEBATCH_TIME ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomTimingMetric CUSTOM_METRIC_FLUSH_TIME ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomTimingMetric CUSTOM_METRIC_COMMIT_COMPACT_TIME ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomTimingMetric CUSTOM_METRIC_PAUSE_TIME ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomTimingMetric CUSTOM_METRIC_CHECKPOINT_TIME ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomTimingMetric CUSTOM_METRIC_FILESYNC_TIME ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomSumMetric CUSTOM_METRIC_FILES_COPIED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomSizeMetric CUSTOM_METRIC_BYTES_COPIED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomSumMetric CUSTOM_METRIC_FILES_REUSED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomSizeMetric CUSTOM_METRIC_ZIP_FILE_BYTES_UNCOMPRESSED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomSumMetric CUSTOM_METRIC_BLOCK_CACHE_MISS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomSumMetric CUSTOM_METRIC_BLOCK_CACHE_HITS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomSizeMetric CUSTOM_METRIC_BYTES_READ ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomSizeMetric CUSTOM_METRIC_BYTES_WRITTEN ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomSizeMetric CUSTOM_METRIC_ITERATOR_BYTES_READ ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomTimingMetric CUSTOM_METRIC_STALL_TIME ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomTimingMetric CUSTOM_METRIC_TOTAL_COMPACT_TIME ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomSizeMetric CUSTOM_METRIC_COMPACT_READ_BYTES ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomSizeMetric CUSTOM_METRIC_COMPACT_WRITTEN_BYTES ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomSizeMetric CUSTOM_METRIC_SST_FILE_SIZE ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.Product> ALL_CUSTOM_METRICS ()  { throw new RuntimeException(); }
  public   RocksDBStateStoreProvider ()  { throw new RuntimeException(); }
  public  void init (org.apache.spark.sql.execution.streaming.state.StateStoreId stateStoreId, org.apache.spark.sql.types.StructType keySchema, org.apache.spark.sql.types.StructType valueSchema, int numColsPrefixKey, org.apache.spark.sql.execution.streaming.state.StateStoreConf storeConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.StateStoreId stateStoreId ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.StateStore getStore (long version)  { throw new RuntimeException(); }
  public  void doMaintenance ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.streaming.state.StateStoreCustomMetric> supportedCustomMetrics ()  { throw new RuntimeException(); }
    long latestVersion ()  { throw new RuntimeException(); }
  // not preceding
    org.apache.spark.sql.execution.streaming.state.RocksDB rocksDB ()  { throw new RuntimeException(); }
}
