package org.apache.spark.streaming.kafka010;
/**
 * Object to obtain instances of {@link LocationStrategy}
 */
public  class LocationStrategies {
  /**
   * Use this only if your executors are on the same nodes as your Kafka brokers.
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.kafka010.LocationStrategy PreferBrokers ()  { throw new RuntimeException(); }
  /**
   * Use this in most cases, it will consistently distribute partitions across all executors.
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.kafka010.LocationStrategy PreferConsistent ()  { throw new RuntimeException(); }
  /**
   * Use this to place particular TopicPartitions on particular hosts if your load is uneven.
   * Any TopicPartition not specified in the map will use a consistent location.
   * @param hostMap (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.kafka010.LocationStrategy PreferFixed (scala.collection.Map<org.apache.kafka.common.TopicPartition, java.lang.String> hostMap)  { throw new RuntimeException(); }
  /**
   * Use this to place particular TopicPartitions on particular hosts if your load is uneven.
   * Any TopicPartition not specified in the map will use a consistent location.
   * @param hostMap (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.kafka010.LocationStrategy PreferFixed (java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.String> hostMap)  { throw new RuntimeException(); }
}
