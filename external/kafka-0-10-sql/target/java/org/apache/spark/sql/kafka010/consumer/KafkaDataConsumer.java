package org.apache.spark.sql.kafka010.consumer;
/**
 * This class helps caller to read from Kafka leveraging consumer pool as well as fetched data pool.
 * This class throws error when data loss is detected while reading from Kafka.
 * <p>
 * NOTE for contributors: we need to ensure all the public methods to initialize necessary resources
 * via calling <code>getOrRetrieveConsumer</code> and <code>getOrRetrieveFetchedData</code>.
 */
  class KafkaDataConsumer implements org.apache.spark.internal.Logging {
  static public  class AvailableOffsetRange implements scala.Product, scala.Serializable {
    public  long earliest ()  { throw new RuntimeException(); }
    public  long latest ()  { throw new RuntimeException(); }
    // not preceding
    public   AvailableOffsetRange (long earliest, long latest)  { throw new RuntimeException(); }
  }
  static public  class AvailableOffsetRange$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.Object, org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer.AvailableOffsetRange> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AvailableOffsetRange$ MODULE$ = null;
    public   AvailableOffsetRange$ ()  { throw new RuntimeException(); }
  }
  static public  class CacheKey implements scala.Product, scala.Serializable {
    public  java.lang.String groupId ()  { throw new RuntimeException(); }
    public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
    // not preceding
    public   CacheKey (java.lang.String groupId, org.apache.kafka.common.TopicPartition topicPartition)  { throw new RuntimeException(); }
    public   CacheKey (org.apache.kafka.common.TopicPartition topicPartition, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  }
  static public  class CacheKey$ extends scala.runtime.AbstractFunction2<java.lang.String, org.apache.kafka.common.TopicPartition, org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer.CacheKey> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CacheKey$ MODULE$ = null;
    public   CacheKey$ ()  { throw new RuntimeException(); }
  }
  static public  long UNKNOWN_OFFSET ()  { throw new RuntimeException(); }
  /**
   * Get a data reader for groupId, assigned to topic and partition.
   * If matching consumer doesn't already exist, will be created using kafkaParams.
   * The returned data reader must be released explicitly.
   * @param topicPartition (undocumented)
   * @param kafkaParams (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer acquire (org.apache.kafka.common.TopicPartition topicPartition, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
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
  public   KafkaDataConsumer (org.apache.kafka.common.TopicPartition topicPartition, java.util.Map<java.lang.String, java.lang.Object> kafkaParams, org.apache.spark.sql.kafka010.consumer.InternalKafkaConsumerPool consumerPool, org.apache.spark.sql.kafka010.consumer.FetchedDataPool fetchedDataPool)  { throw new RuntimeException(); }
    scala.Option<org.apache.spark.sql.kafka010.consumer.InternalKafkaConsumer> _consumer ()  { throw new RuntimeException(); }
  /**
   * Get the record for the given offset if available.
   * <p>
   * If the record is invisible (either a
   * transaction message, or an aborted message when the consumer's <code>isolation.level</code> is
   * <code>read_committed</code>), it will be skipped and this method will try to fetch next available record
   * within [offset, untilOffset).
   * <p>
   * This method also will try its best to detect data loss. If <code>failOnDataLoss</code> is <code>true</code>, it will
   * throw an exception when we detect an unavailable offset. If <code>failOnDataLoss</code> is <code>false</code>, this
   * method will try to fetch next available record within [offset, untilOffset).
   * <p>
   * When this method tries to skip offsets due to either invisible messages or data loss and
   * reaches <code>untilOffset</code>, it will return <code>null</code>.
   * <p>
   * @param offset         the offset to fetch.
   * @param untilOffset    the max offset to fetch. Exclusive.
   * @param pollTimeoutMs  timeout in milliseconds to poll data from Kafka.
   * @param failOnDataLoss When <code>failOnDataLoss</code> is <code>true</code>, this method will either return record at
   *                       offset if available, or throw exception.when <code>failOnDataLoss</code> is <code>false</code>,
   *                       this method will either return record at offset if available, or return
   *                       the next earliest available record less than untilOffset, or null. It
   *                       will not throw any exception.
   * @return (undocumented)
   */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> get (long offset, long untilOffset, long pollTimeoutMs, boolean failOnDataLoss)  { throw new RuntimeException(); }
  /**
   * Return the available offset range of the current partition. It's a pair of the earliest offset
   * and the latest offset.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer.AvailableOffsetRange getAvailableOffsetRange ()  { throw new RuntimeException(); }
  public  long getNumOffsetOutOfRange ()  { throw new RuntimeException(); }
  public  long getNumDataLoss ()  { throw new RuntimeException(); }
  /**
   * Release borrowed objects in data reader to the pool. Once the instance is created, caller
   * must call method after using the instance to make sure resources are not leaked.
   */
  public  void release ()  { throw new RuntimeException(); }
    org.apache.spark.sql.kafka010.consumer.InternalKafkaConsumer getOrRetrieveConsumer ()  { throw new RuntimeException(); }
}
