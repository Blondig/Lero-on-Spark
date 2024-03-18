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
public  class KafkaWriter {
  static public  java.lang.String TOPIC_ATTRIBUTE_NAME ()  { throw new RuntimeException(); }
  static public  java.lang.String KEY_ATTRIBUTE_NAME ()  { throw new RuntimeException(); }
  static public  java.lang.String VALUE_ATTRIBUTE_NAME ()  { throw new RuntimeException(); }
  static public  java.lang.String HEADERS_ATTRIBUTE_NAME ()  { throw new RuntimeException(); }
  static public  java.lang.String PARTITION_ATTRIBUTE_NAME ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  void validateQuery (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> schema, java.util.Map<java.lang.String, java.lang.Object> kafkaParameters, scala.Option<java.lang.String> topic)  { throw new RuntimeException(); }
  static public  void write (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.execution.QueryExecution queryExecution, java.util.Map<java.lang.String, java.lang.Object> kafkaParameters, scala.Option<java.lang.String> topic)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.Expression topicExpression (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> schema, scala.Option<java.lang.String> topic)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.Expression keyExpression (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> schema)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.Expression valueExpression (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> schema)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.Expression headersExpression (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> schema)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.Expression partitionExpression (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> schema)  { throw new RuntimeException(); }
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
}
