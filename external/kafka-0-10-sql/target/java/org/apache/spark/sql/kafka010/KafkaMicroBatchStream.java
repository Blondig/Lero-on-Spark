package org.apache.spark.sql.kafka010;
/**
 * A {@link MicroBatchStream} that reads data from Kafka.
 * <p>
 * The {@link KafkaSourceOffset} is the custom {@link Offset} defined for this source that contains
 * a map of TopicPartition -> offset. Note that this offset is 1 + (available offset). For
 * example if the last record in a Kafka topic "t", partition 2 is offset 5, then
 * KafkaSourceOffset will contain TopicPartition("t", 2) -> 6. This is done keep it consistent
 * with the semantics of <code>KafkaConsumer.position()</code>.
 * <p>
 * Zero data lost is not guaranteed when topics are deleted. If zero data lost is critical, the user
 * must make sure all messages in a topic have been processed when deleting a topic.
 * <p>
 * There is a known issue caused by KAFKA-1894: the query using Kafka maybe cannot be stopped.
 * To avoid this issue, you should make sure stopping the query before stopping the Kafka brokers
 * and not use wrong broker addresses.
 */
  class KafkaMicroBatchStream implements org.apache.spark.sql.connector.read.streaming.SupportsTriggerAvailableNow, org.apache.spark.sql.connector.read.streaming.ReportsSourceMetrics, org.apache.spark.sql.connector.read.streaming.MicroBatchStream, org.apache.spark.internal.Logging {
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
    org.apache.spark.sql.kafka010.KafkaOffsetReader kafkaOffsetReader ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaMicroBatchStream (org.apache.spark.sql.kafka010.KafkaOffsetReader kafkaOffsetReader, java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams, org.apache.spark.sql.util.CaseInsensitiveStringMap options, java.lang.String metadataPath, org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit startingOffsets, boolean failOnDataLoss)  { throw new RuntimeException(); }
    long pollTimeoutMs ()  { throw new RuntimeException(); }
    scala.Option<java.lang.Object> maxOffsetsPerTrigger ()  { throw new RuntimeException(); }
    scala.Option<java.lang.Object> minOffsetPerTrigger ()  { throw new RuntimeException(); }
    long maxTriggerDelayMs ()  { throw new RuntimeException(); }
    org.apache.spark.util.Clock clock ()  { throw new RuntimeException(); }
  /**
   * Lazily initialize <code>initialPartitionOffsets</code> to make sure that <code>KafkaConsumer.poll</code> is only
   * called in StreamExecutionThread. Otherwise, interrupting a thread while running
   * <code>KafkaConsumer.poll</code> may hang forever (KAFKA-1894).
   * @return (undocumented)
   */
  public  org.apache.spark.sql.connector.read.streaming.Offset initialOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.ReadLimit getDefaultReadLimit ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset reportLatestOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset latestOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset latestOffset (org.apache.spark.sql.connector.read.streaming.Offset start, org.apache.spark.sql.connector.read.streaming.ReadLimit readLimit)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions (org.apache.spark.sql.connector.read.streaming.Offset start, org.apache.spark.sql.connector.read.streaming.Offset end)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.PartitionReaderFactory createReaderFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset deserializeOffset (java.lang.String json)  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.connector.read.streaming.Offset end)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.String> metrics (java.util.Optional<org.apache.spark.sql.connector.read.streaming.Offset> latestConsumedOffset)  { throw new RuntimeException(); }
  public  void prepareForTriggerAvailableNow ()  { throw new RuntimeException(); }
}
