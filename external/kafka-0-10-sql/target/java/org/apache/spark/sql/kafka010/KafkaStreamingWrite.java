package org.apache.spark.sql.kafka010;
/**
 * A {@link StreamingWrite} for Kafka writing. Responsible for generating the writer factory.
 * <p>
 * param:  topic The topic this writer is responsible for. If None, topic will be inferred from
 *              a <code>topic</code> field in the incoming data.
 * param:  producerParams Parameters for Kafka producers in each task.
 * param:  schema The schema of the input data.
 */
  class KafkaStreamingWrite implements org.apache.spark.sql.connector.write.streaming.StreamingWrite {
  public   KafkaStreamingWrite (scala.Option<java.lang.String> topic, java.util.Map<java.lang.String, java.lang.Object> producerParams, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  void abort (long epochId, org.apache.spark.sql.connector.write.WriterCommitMessage[] messages)  { throw new RuntimeException(); }
  public  void commit (long epochId, org.apache.spark.sql.connector.write.WriterCommitMessage[] messages)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaStreamWriterFactory createStreamingWriterFactory (org.apache.spark.sql.connector.write.PhysicalWriteInfo info)  { throw new RuntimeException(); }
}
