package org.apache.spark.sql.kafka010.consumer;
/**
 * The internal object returned by the <code>fetchRecord</code> method. If <code>record</code> is empty, it means it is
 * invisible (either a transaction message, or an aborted message when the consumer's
 * <code>isolation.level</code> is <code>read_committed</code>), and the caller should use <code>nextOffsetToFetch</code> to fetch
 * instead.
 */
  class FetchedRecord implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> record ()  { throw new RuntimeException(); }
  public  long nextOffsetToFetch ()  { throw new RuntimeException(); }
  // not preceding
  public   FetchedRecord (org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> record, long nextOffsetToFetch)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.consumer.FetchedRecord withRecord (org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> record, long nextOffsetToFetch)  { throw new RuntimeException(); }
}
