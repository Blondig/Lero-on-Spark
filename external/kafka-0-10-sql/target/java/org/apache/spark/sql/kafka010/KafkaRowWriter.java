package org.apache.spark.sql.kafka010;
 abstract class KafkaRowWriter {
  public   KafkaRowWriter (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema, scala.Option<java.lang.String> topic)  { throw new RuntimeException(); }
  protected  void checkForErrors ()  { throw new RuntimeException(); }
  protected  java.lang.Exception failedWrite ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.UnsafeProjection projection ()  { throw new RuntimeException(); }
  /**
   * Send the specified row to the producer, with a callback that will save any exception
   * to failedWrite. Note that send is asynchronous; subclasses must flush() their producer before
   * assuming the row is in Kafka.
   * @param row (undocumented)
   * @param producer (undocumented)
   */
  protected  void sendRow (org.apache.spark.sql.catalyst.InternalRow row, org.apache.kafka.clients.producer.KafkaProducer<byte[], byte[]> producer)  { throw new RuntimeException(); }
}
