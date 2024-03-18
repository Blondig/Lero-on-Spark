package org.apache.spark.status;
public  class KVUtils {
  /**
   * A KVStoreSerializer that provides Scala types serialization too, and uses the same options as
   * the API serializer.
   */
  static   class KVStoreScalaSerializer extends org.apache.spark.util.kvstore.KVStoreSerializer {
    public   KVStoreScalaSerializer ()  { throw new RuntimeException(); }
  }
  static   class MetadataMismatchException extends java.lang.Exception {
    public   MetadataMismatchException ()  { throw new RuntimeException(); }
  }
  /**
   * Open or create a disk-based KVStore.
   * <p>
   * @param path Location of the store.
   * @param metadata Metadata value to compare to the data in the store. If the store does not
   *                 contain any metadata (e.g. it's a new store), this value is written as
   *                 the store's metadata.
   * @param conf SparkConf use to get <code>HYBRID_STORE_DISK_BACKEND</code>
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  static public <M extends java.lang.Object> org.apache.spark.util.kvstore.KVStore open (java.io.File path, M metadata, org.apache.spark.SparkConf conf, scala.reflect.ClassTag<M> evidence$1)  { throw new RuntimeException(); }
  /** Turns a KVStoreView into a Scala sequence, applying a filter. */
  static public <T extends java.lang.Object> scala.collection.Seq<T> viewToSeq (org.apache.spark.util.kvstore.KVStoreView<T> view, int max, scala.Function1<T, java.lang.Object> filter)  { throw new RuntimeException(); }
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
}
