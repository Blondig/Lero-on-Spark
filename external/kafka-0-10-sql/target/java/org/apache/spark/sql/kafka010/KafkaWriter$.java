package org.apache.spark.sql.kafka010;
/**
 * The {@link KafkaWriter} class is used to write data from a batch query
 * or structured streaming query, given by a {@link QueryExecution}, to Kafka.
 * The data is assumed to have a value column, and an optional topic and key
 * columns. If the topic column is missing, then the topic must come from
 * the 'topic' configuration option. If the key column is missing, then a
 * null valued key field will be added to the
 * {@link org.apache.kafka.clients.producer.ProducerRecord}.
 */
public  class KafkaWriter$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KafkaWriter$ MODULE$ = null;
  public   KafkaWriter$ ()  { throw new RuntimeException(); }
  public  java.lang.String TOPIC_ATTRIBUTE_NAME ()  { throw new RuntimeException(); }
  public  java.lang.String KEY_ATTRIBUTE_NAME ()  { throw new RuntimeException(); }
  public  java.lang.String VALUE_ATTRIBUTE_NAME ()  { throw new RuntimeException(); }
  public  java.lang.String HEADERS_ATTRIBUTE_NAME ()  { throw new RuntimeException(); }
  public  java.lang.String PARTITION_ATTRIBUTE_NAME ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  void validateQuery (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> schema, java.util.Map<java.lang.String, java.lang.Object> kafkaParameters, scala.Option<java.lang.String> topic)  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.execution.QueryExecution queryExecution, java.util.Map<java.lang.String, java.lang.Object> kafkaParameters, scala.Option<java.lang.String> topic)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression topicExpression (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> schema, scala.Option<java.lang.String> topic)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression keyExpression (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression valueExpression (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression headersExpression (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression partitionExpression (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> schema)  { throw new RuntimeException(); }
}
