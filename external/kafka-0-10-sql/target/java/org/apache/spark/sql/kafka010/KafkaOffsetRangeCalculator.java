package org.apache.spark.sql.kafka010;
/**
 * Class to calculate offset ranges to process based on the from and until offsets, and
 * the configured <code>minPartitions</code>.
 */
  class KafkaOffsetRangeCalculator {
  static public  org.apache.spark.sql.kafka010.KafkaOffsetRangeCalculator apply (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> minPartitions ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaOffsetRangeCalculator (scala.Option<java.lang.Object> minPartitions)  { throw new RuntimeException(); }
  /**
   * Calculate the offset ranges that we are going to process this batch. If <code>minPartitions</code>
   * is not set or is set less than or equal the number of <code>topicPartitions</code> that we're going to
   * consume, then we fall back to a 1-1 mapping of Spark tasks to Kafka partitions. If
   * <code>minPartitions</code> is set higher than the number of our <code>topicPartitions</code>, then we will split up
   * the read tasks of the skewed partitions to multiple Spark tasks.
   * The number of Spark tasks will be *approximately* <code>minPartitions</code>. It can be less or more
   * depending on rounding errors or Kafka partitions that didn't receive any new data.
   * <p>
   * Empty (<code>KafkaOffsetRange.size == 0</code>) or invalid (<code>KafkaOffsetRange.size < 0</code>) ranges  will be
   * dropped.
   * @param ranges (undocumented)
   * @param executorLocations (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.kafka010.KafkaOffsetRange> getRanges (scala.collection.Seq<org.apache.spark.sql.kafka010.KafkaOffsetRange> ranges, scala.collection.Seq<java.lang.String> executorLocations)  { throw new RuntimeException(); }
}
