package org.apache.spark.internal.config;
public  class History {
  static public  class HybridStoreDiskBackend$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final HybridStoreDiskBackend$ MODULE$ = null;
    public   HybridStoreDiskBackend$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value LEVELDB ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value ROCKSDB ()  { throw new RuntimeException(); }
  }
  static public  java.lang.String DEFAULT_LOG_DIR ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> HISTORY_LOG_DIR ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> SAFEMODE_CHECK_INTERVAL_S ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> UPDATE_INTERVAL_S ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CLEANER_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CLEANER_INTERVAL_S ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> MAX_LOG_AGE_S ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> MAX_LOG_NUM ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.OptionalConfigEntry<java.lang.String> LOCAL_STORE_DIR ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> MAX_LOCAL_DISK_USAGE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> HISTORY_SERVER_UI_PORT ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FAST_IN_PROGRESS_PARSING ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> END_EVENT_REPARSE_CHUNK_SIZE ()  { throw new RuntimeException(); }
  static   org.apache.spark.internal.config.ConfigEntry<java.lang.Object> EVENT_LOG_ROLLING_MAX_FILES_TO_RETAIN ()  { throw new RuntimeException(); }
  static   org.apache.spark.internal.config.ConfigEntry<java.lang.Object> EVENT_LOG_COMPACTION_SCORE_THRESHOLD ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> DRIVER_LOG_CLEANER_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> DRIVER_LOG_CLEANER_INTERVAL ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> MAX_DRIVER_LOG_AGE_S ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> HISTORY_SERVER_UI_ACLS_ENABLE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<scala.collection.Seq<java.lang.String>> HISTORY_SERVER_UI_ADMIN_ACLS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<scala.collection.Seq<java.lang.String>> HISTORY_SERVER_UI_ADMIN_ACLS_GROUPS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> NUM_REPLAY_THREADS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> RETAINED_APPLICATIONS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.OptionalConfigEntry<java.lang.String> PROVIDER ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> KERBEROS_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.OptionalConfigEntry<java.lang.String> KERBEROS_PRINCIPAL ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.OptionalConfigEntry<java.lang.String> KERBEROS_KEYTAB ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.OptionalConfigEntry<java.lang.String> CUSTOM_EXECUTOR_LOG_URL ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> APPLY_CUSTOM_EXECUTOR_LOG_URL_TO_INCOMPLETE_APP ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> HYBRID_STORE_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> MAX_IN_MEMORY_STORE_USAGE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> HYBRID_STORE_DISK_BACKEND ()  { throw new RuntimeException(); }
}
