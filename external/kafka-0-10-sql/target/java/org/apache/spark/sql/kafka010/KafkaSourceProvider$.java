package org.apache.spark.sql.kafka010;
public  class KafkaSourceProvider$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KafkaSourceProvider$ MODULE$ = null;
  public   KafkaSourceProvider$ ()  { throw new RuntimeException(); }
    java.lang.String STARTING_OFFSETS_OPTION_KEY ()  { throw new RuntimeException(); }
    java.lang.String ENDING_OFFSETS_OPTION_KEY ()  { throw new RuntimeException(); }
    java.lang.String STARTING_OFFSETS_BY_TIMESTAMP_OPTION_KEY ()  { throw new RuntimeException(); }
    java.lang.String ENDING_OFFSETS_BY_TIMESTAMP_OPTION_KEY ()  { throw new RuntimeException(); }
    java.lang.String STARTING_TIMESTAMP_OPTION_KEY ()  { throw new RuntimeException(); }
    java.lang.String ENDING_TIMESTAMP_OPTION_KEY ()  { throw new RuntimeException(); }
    java.lang.String MIN_PARTITIONS_OPTION_KEY ()  { throw new RuntimeException(); }
    java.lang.String MAX_OFFSET_PER_TRIGGER ()  { throw new RuntimeException(); }
    java.lang.String MIN_OFFSET_PER_TRIGGER ()  { throw new RuntimeException(); }
    java.lang.String MAX_TRIGGER_DELAY ()  { throw new RuntimeException(); }
    java.lang.String DEFAULT_MAX_TRIGGER_DELAY ()  { throw new RuntimeException(); }
    java.lang.String FETCH_OFFSET_NUM_RETRY ()  { throw new RuntimeException(); }
    java.lang.String FETCH_OFFSET_RETRY_INTERVAL_MS ()  { throw new RuntimeException(); }
    java.lang.String CONSUMER_POLL_TIMEOUT ()  { throw new RuntimeException(); }
    java.lang.String STARTING_OFFSETS_BY_TIMESTAMP_STRATEGY_KEY ()  { throw new RuntimeException(); }
    java.lang.String INCLUDE_HEADERS ()  { throw new RuntimeException(); }
    java.lang.String MOCK_SYSTEM_TIME ()  { throw new RuntimeException(); }
  public  java.lang.String TOPIC_OPTION_KEY ()  { throw new RuntimeException(); }
  public  java.lang.String INSTRUCTION_FOR_FAIL_ON_DATA_LOSS_FALSE ()  { throw new RuntimeException(); }
  public  java.lang.String INSTRUCTION_FOR_FAIL_ON_DATA_LOSS_TRUE ()  { throw new RuntimeException(); }
  public  java.lang.String CUSTOM_GROUP_ID_ERROR_MESSAGE ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit getKafkaOffsetRangeLimit (org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> params, java.lang.String globalOffsetTimestampOptionKey, java.lang.String offsetByTimestampOptionKey, java.lang.String offsetOptionKey, org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit defaultOffsets)  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> kafkaParamsForDriver (scala.collection.immutable.Map<java.lang.String, java.lang.String> specifiedKafkaParams)  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> kafkaParamsForExecutors (scala.collection.immutable.Map<java.lang.String, java.lang.String> specifiedKafkaParams, java.lang.String uniqueGroupId)  { throw new RuntimeException(); }
  /**
   * Returns a unique batch consumer group (group.id), allowing the user to set the prefix of
   * the consumer group
   * @param params (undocumented)
   * @return (undocumented)
   */
    java.lang.String batchUniqueGroupId (org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> params)  { throw new RuntimeException(); }
    java.util.Map<java.lang.String, java.lang.Object> kafkaParamsForProducer (org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> params)  { throw new RuntimeException(); }
}
