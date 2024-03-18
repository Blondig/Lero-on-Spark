package org.apache.spark.broadcast;
/**
 * A BitTorrent-like implementation of {@link org.apache.spark.broadcast.Broadcast}.
 * <p>
 * The mechanism is as follows:
 * <p>
 * The driver divides the serialized object into small chunks and
 * stores those chunks in the BlockManager of the driver.
 * <p>
 * On each executor, the executor first attempts to fetch the object from its BlockManager. If
 * it does not exist, it then uses remote fetches to fetch the small chunks from the driver and/or
 * other executors if available. Once it gets the chunks, it puts the chunks in its own
 * BlockManager, ready for other executors to fetch from.
 * <p>
 * This prevents the driver from being the bottleneck in sending out multiple copies of the
 * broadcast data (one per executor).
 * <p>
 * When initialized, TorrentBroadcast objects read SparkEnv.get.conf.
 * <p>
 * param:  obj object to broadcast
 * param:  id A unique identifier for the broadcast variable.
 */
  class TorrentBroadcast<T extends java.lang.Object> extends org.apache.spark.broadcast.Broadcast<T> implements org.apache.spark.internal.Logging, java.io.Serializable {
  static public <T extends java.lang.Object> java.nio.ByteBuffer[] blockifyObject (T obj, int blockSize, org.apache.spark.serializer.Serializer serializer, scala.Option<org.apache.spark.io.CompressionCodec> compressionCodec, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T unBlockifyObject (java.io.InputStream[] blocks, org.apache.spark.serializer.Serializer serializer, scala.Option<org.apache.spark.io.CompressionCodec> compressionCodec, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  /**
   * Remove all persisted blocks associated with this torrent broadcast on the executors.
   * If removeFromDriver is true, also remove these persisted blocks on the driver.
   * @param id (undocumented)
   * @param removeFromDriver (undocumented)
   * @param blocking (undocumented)
   */
  static public  void unpersist (long id, boolean removeFromDriver, boolean blocking)  { throw new RuntimeException(); }
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
  // not preceding
  public   TorrentBroadcast (T obj, long id, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  protected  T getValue ()  { throw new RuntimeException(); }
  /**
   * Remove all persisted state associated with this Torrent broadcast on the executors.
   * @param blocking (undocumented)
   */
  protected  void doUnpersist (boolean blocking)  { throw new RuntimeException(); }
  /**
   * Remove all persisted state associated with this Torrent broadcast on the executors
   * and driver.
   * @param blocking (undocumented)
   */
  protected  void doDestroy (boolean blocking)  { throw new RuntimeException(); }
}
