package org.apache.spark.examples.sql.streaming;
/**
 * Consumes messages from one or more topics in Kafka and does wordcount.
 * Usage: StructuredKerberizedKafkaWordCount <bootstrap-servers> <subscribe-type> <topics>
 *     [<checkpoint-location>]
 *   <bootstrap-servers> The Kafka "bootstrap.servers" configuration. A
 *   comma-separated list of host:port.
 *   <subscribe-type> There are three kinds of type, i.e. 'assign', 'subscribe',
 *   'subscribePattern'.
 *   |- <assign> Specific TopicPartitions to consume. Json string
 *   |  {"topicA":[0,1],"topicB":[2,4]}.
 *   |- <subscribe> The topic list to subscribe. A comma-separated list of
 *   |  topics.
 *   |- <subscribePattern> The pattern used to subscribe to topic(s).
 *   |  Java regex string.
 *   |- Only one of "assign, "subscribe" or "subscribePattern" options can be
 *   |  specified for Kafka source.
 *   <topics> Different value format depends on the value of 'subscribe-type'.
 *   <checkpoint-location> Directory in which to create checkpoints. If not
 *   provided, defaults to a randomized directory in /tmp.
 * <p>
 * Example:
 *   Yarn client:
 *    $ bin/run-example --files ${jaas_path}/kafka_jaas.conf,${keytab_path}/kafka.service.keytab \
 *      --driver-java-options "-Djava.security.auth.login.config=${path}/kafka_driver_jaas.conf" \
 *      --conf \
 *      "spark.executor.extraJavaOptions=-Djava.security.auth.login.config=./kafka_jaas.conf" \
 *      --master yarn
 *      sql.streaming.StructuredKerberizedKafkaWordCount broker1-host:port,broker2-host:port \
 *      subscribe topic1,topic2
 *   Yarn cluster:
 *    $ bin/run-example --files \
 *      ${jaas_path}/kafka_jaas.conf,${keytab_path}/kafka.service.keytab,${krb5_path}/krb5.conf \
 *      --driver-java-options \
 *      "-Djava.security.auth.login.config=./kafka_jaas.conf \
 *      -Djava.security.krb5.conf=./krb5.conf" \
 *      --conf \
 *      "spark.executor.extraJavaOptions=-Djava.security.auth.login.config=./kafka_jaas.conf" \
 *      --master yarn --deploy-mode cluster \
 *      sql.streaming.StructuredKerberizedKafkaWordCount broker1-host:port,broker2-host:port \
 *      subscribe topic1,topic2
 * <p>
 * kafka_jaas.conf can manually create, template as:
 *   KafkaClient {
 *     com.sun.security.auth.module.Krb5LoginModule required
 *     keyTab="./kafka.service.keytab"
 *     useKeyTab=true
 *     storeKey=true
 *     useTicketCache=false
 *     serviceName="kafka"
 *     principal="kafka/host@EXAMPLE.COM";
 *   };
 * kafka_driver_jaas.conf (used by yarn client) and kafka_jaas.conf are basically the same
 * except for some differences at 'keyTab'. In kafka_driver_jaas.conf, 'keyTab' should be
 * "${keytab_path}/kafka.service.keytab".
 * In addition, for IBM JVMs, please use 'com.ibm.security.auth.module.Krb5LoginModule'
 * instead of 'com.sun.security.auth.module.Krb5LoginModule'.
 * <p>
 * Note that this example uses SASL_PLAINTEXT for simplicity; however,
 * SASL_PLAINTEXT has no SSL encryption and likely be less secure. Please consider
 * using SASL_SSL in production.
 */
public  class StructuredKerberizedKafkaWordCount$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StructuredKerberizedKafkaWordCount$ MODULE$ = null;
  public   StructuredKerberizedKafkaWordCount$ ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
