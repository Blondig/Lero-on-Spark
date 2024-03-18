package org.apache.spark.streaming.kafka010;
/**
 * object for constructing Kafka streams and RDDs
 */
public  class KafkaUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KafkaUtils$ MODULE$ = null;
  public   KafkaUtils$ ()  { throw new RuntimeException(); }
  /**
   * Scala constructor for a batch-oriented interface for consuming from Kafka.
   * Starting and ending offsets are specified in advance,
   * so that you can control exactly-once semantics.
   * @param kafkaParams Kafka
   * <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
   * configuration parameters</a>. Requires "bootstrap.servers" to be set
   * with Kafka broker(s) specified in host1:port1,host2:port2 form.
   * @param offsetRanges offset ranges that define the Kafka data belonging to this RDD
   * @param locationStrategy In most cases, pass in {@link LocationStrategies.PreferConsistent},
   *   see {@link LocationStrategies} for more details.
   * @tparam K type of Kafka message key
   * @tparam V type of Kafka message value
   * @param sc (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<org.apache.kafka.clients.consumer.ConsumerRecord<K, V>> createRDD (org.apache.spark.SparkContext sc, java.util.Map<java.lang.String, java.lang.Object> kafkaParams, org.apache.spark.streaming.kafka010.OffsetRange[] offsetRanges, org.apache.spark.streaming.kafka010.LocationStrategy locationStrategy)  { throw new RuntimeException(); }
  /**
   * Java constructor for a batch-oriented interface for consuming from Kafka.
   * Starting and ending offsets are specified in advance,
   * so that you can control exactly-once semantics.
   * @param kafkaParams Kafka
   * <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
   * configuration parameters</a>. Requires "bootstrap.servers" to be set
   * with Kafka broker(s) specified in host1:port1,host2:port2 form.
   * @param offsetRanges offset ranges that define the Kafka data belonging to this RDD
   * @param locationStrategy In most cases, pass in {@link LocationStrategies.PreferConsistent},
   *   see {@link LocationStrategies} for more details.
   * @tparam K type of Kafka message key
   * @tparam V type of Kafka message value
   * @param jsc (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.api.java.JavaRDD<org.apache.kafka.clients.consumer.ConsumerRecord<K, V>> createRDD (org.apache.spark.api.java.JavaSparkContext jsc, java.util.Map<java.lang.String, java.lang.Object> kafkaParams, org.apache.spark.streaming.kafka010.OffsetRange[] offsetRanges, org.apache.spark.streaming.kafka010.LocationStrategy locationStrategy)  { throw new RuntimeException(); }
  /**
   * Scala constructor for a DStream where
   * each given Kafka topic/partition corresponds to an RDD partition.
   * The spark configuration spark.streaming.kafka.maxRatePerPartition gives the maximum number
   *  of messages
   * per second that each '''partition''' will accept.
   * @param locationStrategy In most cases, pass in {@link LocationStrategies.PreferConsistent},
   *   see {@link LocationStrategies} for more details.
   * @param consumerStrategy In most cases, pass in {@link ConsumerStrategies.Subscribe},
   *   see {@link ConsumerStrategies} for more details
   * @tparam K type of Kafka message key
   * @tparam V type of Kafka message value
   * @param ssc (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.dstream.InputDStream<org.apache.kafka.clients.consumer.ConsumerRecord<K, V>> createDirectStream (org.apache.spark.streaming.StreamingContext ssc, org.apache.spark.streaming.kafka010.LocationStrategy locationStrategy, org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> consumerStrategy)  { throw new RuntimeException(); }
  /**
   * Scala constructor for a DStream where
   * each given Kafka topic/partition corresponds to an RDD partition.
   * @param locationStrategy In most cases, pass in {@link LocationStrategies.PreferConsistent},
   *   see {@link LocationStrategies} for more details.
   * @param consumerStrategy In most cases, pass in {@link ConsumerStrategies.Subscribe},
   *   see {@link ConsumerStrategies} for more details.
   * @param perPartitionConfig configuration of settings such as max rate on a per-partition basis.
   *   see {@link PerPartitionConfig} for more details.
   * @tparam K type of Kafka message key
   * @tparam V type of Kafka message value
   * @param ssc (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.dstream.InputDStream<org.apache.kafka.clients.consumer.ConsumerRecord<K, V>> createDirectStream (org.apache.spark.streaming.StreamingContext ssc, org.apache.spark.streaming.kafka010.LocationStrategy locationStrategy, org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> consumerStrategy, org.apache.spark.streaming.kafka010.PerPartitionConfig perPartitionConfig)  { throw new RuntimeException(); }
  /**
   * Java constructor for a DStream where
   * each given Kafka topic/partition corresponds to an RDD partition.
   * @param locationStrategy In most cases, pass in {@link LocationStrategies.PreferConsistent},
   *   see {@link LocationStrategies} for more details.
   * @param consumerStrategy In most cases, pass in {@link ConsumerStrategies.Subscribe},
   *   see {@link ConsumerStrategies} for more details
   * @tparam K type of Kafka message key
   * @tparam V type of Kafka message value
   * @param jssc (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.api.java.JavaInputDStream<org.apache.kafka.clients.consumer.ConsumerRecord<K, V>> createDirectStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, org.apache.spark.streaming.kafka010.LocationStrategy locationStrategy, org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> consumerStrategy)  { throw new RuntimeException(); }
  /**
   * Java constructor for a DStream where
   * each given Kafka topic/partition corresponds to an RDD partition.
   * @param locationStrategy In most cases, pass in {@link LocationStrategies.PreferConsistent},
   *   see {@link LocationStrategies} for more details.
   * @param consumerStrategy In most cases, pass in {@link ConsumerStrategies.Subscribe},
   *   see {@link ConsumerStrategies} for more details
   * @param perPartitionConfig configuration of settings such as max rate on a per-partition basis.
   *   see {@link PerPartitionConfig} for more details.
   * @tparam K type of Kafka message key
   * @tparam V type of Kafka message value
   * @param jssc (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.api.java.JavaInputDStream<org.apache.kafka.clients.consumer.ConsumerRecord<K, V>> createDirectStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, org.apache.spark.streaming.kafka010.LocationStrategy locationStrategy, org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> consumerStrategy, org.apache.spark.streaming.kafka010.PerPartitionConfig perPartitionConfig)  { throw new RuntimeException(); }
  /**
   * Tweak kafka params to prevent issues on executors
   * @param kafkaParams (undocumented)
   */
    void fixKafkaParams (java.util.HashMap<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
}
