package org.apache.spark.sql.kafka010;
/**
 * A {@link DataWriterFactory} for Kafka writing. Will be serialized and sent to executors to
 * generate the per-task data writers.
 * param:  topic The topic that should be written to. If None, topic will be inferred from
 *              a <code>topic</code> field in the incoming data.
 * param:  producerParams Parameters for Kafka producers in each task.
 * param:  schema The schema of the input data.
 */
public  class KafkaBatchWriterFactory implements org.apache.spark.sql.connector.write.DataWriterFactory, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> topic ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> producerParams ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaBatchWriterFactory (scala.Option<java.lang.String> topic, java.util.Map<java.lang.String, java.lang.Object> producerParams, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.DataWriter<org.apache.spark.sql.catalyst.InternalRow> createWriter (int partitionId, long taskId)  { throw new RuntimeException(); }
}
