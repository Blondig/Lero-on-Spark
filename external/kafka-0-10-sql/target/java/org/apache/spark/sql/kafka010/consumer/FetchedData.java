package org.apache.spark.sql.kafka010.consumer;
/**
 * The internal object to store the fetched data from Kafka consumer and the next offset to poll.
 * <p>
 * param:  _records the pre-fetched Kafka records.
 * param:  _nextOffsetInFetchedData the next offset in <code>records</code>. We use this to verify if we
 *                                 should check if the pre-fetched data is still valid.
 * param:  _offsetAfterPoll the Kafka offset after calling <code>poll</code>. We will use this offset to
 *                           poll when <code>records</code> is drained.
 * param:  _availableOffsetRange the available offset range in Kafka when polling the records.
 */
  class FetchedData implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public   FetchedData (java.util.ListIterator<org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]>> _records, long _nextOffsetInFetchedData, long _offsetAfterPoll, org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer.AvailableOffsetRange _availableOffsetRange)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.consumer.FetchedData withNewPoll (java.util.ListIterator<org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]>> records, long offsetAfterPoll, org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer.AvailableOffsetRange availableOffsetRange)  { throw new RuntimeException(); }
  /** Whether there are more elements */
  public  boolean hasNext ()  { throw new RuntimeException(); }
  /** Move `records` forward and return the next record. */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> next ()  { throw new RuntimeException(); }
  /** Move `records` backward and return the previous record. */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> previous ()  { throw new RuntimeException(); }
  /** Reset the internal pre-fetched data. */
  public  void reset ()  { throw new RuntimeException(); }
  /**
   * Returns the next offset in <code>records</code>. We use this to verify if we should check if the
   * pre-fetched data is still valid.
   * @return (undocumented)
   */
  public  long nextOffsetInFetchedData ()  { throw new RuntimeException(); }
  /**
   * Returns the next offset to poll after draining the pre-fetched records.
   * @return (undocumented)
   */
  public  long offsetAfterPoll ()  { throw new RuntimeException(); }
  /**
   * Returns the tuple of earliest and latest offsets that is the available offset range when
   * polling the records.
   * @return (undocumented)
   */
  public  scala.Tuple2<java.lang.Object, java.lang.Object> availableOffsetRange ()  { throw new RuntimeException(); }
}
