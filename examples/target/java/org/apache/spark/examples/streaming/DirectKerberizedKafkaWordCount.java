package org.apache.spark.examples.streaming;
/**
 * Consumes messages from one or more topics in Kafka and does wordcount.
 * Usage: DirectKerberizedKafkaWordCount <brokers> <topics>
 *   <brokers> is a list of one or more Kafka brokers
 *   <groupId> is a consumer group name to consume from topics
 *   <topics> is a list of one or more kafka topics to consume from
 * <p>
 * Example:
 *   Yarn client:
 *    $ bin/run-example --files ${jaas_path}/kafka_jaas.conf,${keytab_path}/kafka.service.keytab \
 *      --driver-java-options "-Djava.security.auth.login.config=${path}/kafka_driver_jaas.conf" \
 *      --conf \
 *      "spark.executor.extraJavaOptions=-Djava.security.auth.login.config=./kafka_jaas.conf" \
 *      --master yarn
 *      streaming.DirectKerberizedKafkaWordCount broker1-host:port,broker2-host:port \
 *      consumer-group topic1,topic2
 *   Yarn cluster:
 *    $ bin/run-example --files \
 *      ${jaas_path}/kafka_jaas.conf,${keytab_path}/kafka.service.keytab,${krb5_path}/krb5.conf \
 *      --driver-java-options \
 *      "-Djava.security.auth.login.config=./kafka_jaas.conf \
 *      -Djava.security.krb5.conf=./krb5.conf" \
 *      --conf \
 *      "spark.executor.extraJavaOptions=-Djava.security.auth.login.config=./kafka_jaas.conf" \
 *      --master yarn --deploy-mode cluster \
 *      streaming.DirectKerberizedKafkaWordCount broker1-host:port,broker2-host:port \
 *      consumer-group topic1,topic2
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
public  class DirectKerberizedKafkaWordCount {
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
