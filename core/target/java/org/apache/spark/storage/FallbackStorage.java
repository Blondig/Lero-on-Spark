package org.apache.spark.storage;
/**
 * A fallback storage used by storage decommissioners.
 */
  class FallbackStorage implements org.apache.spark.internal.Logging {
  /** We use one block manager id as a place holder. */
  static public  org.apache.spark.storage.BlockManagerId FALLBACK_BLOCK_MANAGER_ID ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.storage.FallbackStorage> getFallbackStorage (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /** Register the fallback block manager and its RPC endpoint. */
  static public  void registerBlockManagerIfNeeded (org.apache.spark.storage.BlockManagerMaster master, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /** Clean up the generated fallback location for this app. */
  static public  void cleanUp (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /**
   * Read a ManagedBuffer.
   * @param conf (undocumented)
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.network.buffer.ManagedBuffer read (org.apache.spark.SparkConf conf, org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  public   FallbackStorage (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  void copy (org.apache.spark.shuffle.ShuffleBlockInfo shuffleBlockInfo, org.apache.spark.storage.BlockManager bm)  { throw new RuntimeException(); }
  public  boolean exists (int shuffleId, java.lang.String filename)  { throw new RuntimeException(); }
}
