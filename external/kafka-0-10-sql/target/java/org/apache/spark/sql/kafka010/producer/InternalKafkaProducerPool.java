package org.apache.spark.sql.kafka010.producer;
/**
 * Provides object pool for {@link CachedKafkaProducer} which is grouped by
 * {@link org.apache.spark.sql.kafka010.producer.InternalKafkaProducerPool.CacheKey}.
 */
  class InternalKafkaProducerPool implements org.apache.spark.internal.Logging {
  /**
   * This class is used as metadata of producer pool, and shouldn't be exposed to the public.
   * This class assumes thread-safety is guaranteed by the caller.
   */
  static   class CachedProducerEntry {
    // not preceding
    public   CachedProducerEntry (org.apache.spark.sql.kafka010.producer.CachedKafkaProducer producer, long cacheExpireTimeoutNs)  { throw new RuntimeException(); }
      long expireAt ()  { throw new RuntimeException(); }
    public  boolean expired (long curTimeNs)  { throw new RuntimeException(); }
    public  void handleBorrowed ()  { throw new RuntimeException(); }
    public  void handleReturned (long curTimeNs)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.kafka010.producer.CachedKafkaProducer producer ()  { throw new RuntimeException(); }
    /** exposed for testing */
      long refCount ()  { throw new RuntimeException(); }
  }
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
  public  org.apache.spark.util.Clock clock ()  { throw new RuntimeException(); }
  // not preceding
  public   InternalKafkaProducerPool (java.util.concurrent.ScheduledExecutorService executorService, org.apache.spark.util.Clock clock, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public   InternalKafkaProducerPool (org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
  /** exposed for testing */
    long cacheExpireTimeoutMillis ()  { throw new RuntimeException(); }
  /**
   * Get a cached KafkaProducer for a given configuration. If matching KafkaProducer doesn't
   * exist, a new KafkaProducer will be created. KafkaProducer is thread safe, it is best to keep
   * one instance per specified kafkaParams.
   * @param kafkaParams (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.sql.kafka010.producer.CachedKafkaProducer acquire (java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
    void release (org.apache.spark.sql.kafka010.producer.CachedKafkaProducer producer)  { throw new RuntimeException(); }
    void shutdown ()  { throw new RuntimeException(); }
  /** exposed for testing. */
    void reset ()  { throw new RuntimeException(); }
  /** exposed for testing */
    scala.collection.immutable.Map<scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>>, org.apache.spark.sql.kafka010.producer.InternalKafkaProducerPool.CachedProducerEntry> getAsMap ()  { throw new RuntimeException(); }
}
