package org.apache.spark.sql.kafka010;
/** A simple class for converting Kafka ConsumerRecord to InternalRow/UnsafeRow */
  class KafkaRecordToRowConverter {
  static public  org.apache.spark.sql.types.ArrayType headersType ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType kafkaSchema (boolean includeHeaders)  { throw new RuntimeException(); }
  public   KafkaRecordToRowConverter ()  { throw new RuntimeException(); }
  public  scala.Function1<org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]>, org.apache.spark.sql.catalyst.InternalRow> toInternalRowWithoutHeaders ()  { throw new RuntimeException(); }
  public  scala.Function1<org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]>, org.apache.spark.sql.catalyst.InternalRow> toInternalRowWithHeaders ()  { throw new RuntimeException(); }
  public  scala.Function1<org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]>, org.apache.spark.sql.catalyst.expressions.UnsafeRow> toUnsafeRowWithoutHeadersProjector ()  { throw new RuntimeException(); }
  public  scala.Function1<org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]>, org.apache.spark.sql.catalyst.expressions.UnsafeRow> toUnsafeRowWithHeadersProjector ()  { throw new RuntimeException(); }
  public  scala.Function1<org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]>, org.apache.spark.sql.catalyst.expressions.UnsafeRow> toUnsafeRowProjector (boolean includeHeaders)  { throw new RuntimeException(); }
}
