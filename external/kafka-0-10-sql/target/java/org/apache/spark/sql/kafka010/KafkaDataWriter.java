package org.apache.spark.sql.kafka010;
/**
 * A {@link DataWriter} for Kafka writing. One data writer will be created in each partition to
 * process incoming rows.
 * <p>
 * param:  targetTopic The topic that this data writer is targeting. If None, topic will be inferred
 *                    from a <code>topic</code> field in the incoming data.
 * param:  producerParams Parameters to use for the Kafka producer.
 * param:  inputSchema The attributes in the input data.
 */
  class KafkaDataWriter extends org.apache.spark.sql.kafka010.KafkaRowWriter implements org.apache.spark.sql.connector.write.DataWriter<org.apache.spark.sql.catalyst.InternalRow> {
  public   KafkaDataWriter (scala.Option<java.lang.String> targetTopic, java.util.Map<java.lang.String, java.lang.Object> producerParams, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  public  void abort ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.WriterCommitMessage commit ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
}
