package org.apache.spark.streaming;
/**
 * This test suites tests the checkpointing functionality of DStreams -
 * the checkpointing of a DStream's RDDs as well as the checkpointing of
 * the whole DStream graph.
 */
public  class CheckpointSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.streaming.TestSuiteBase, org.apache.spark.streaming.LocalStreamingContext, org.apache.spark.streaming.DStreamCheckpointTester, org.apache.spark.util.ResetSystemProperties {
  static public  boolean batchThreeShouldBlockALongTime ()  { throw new RuntimeException(); }
  public  java.util.Properties oldProperties ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.StreamingContext ssc ()  { throw new RuntimeException(); }
  public  boolean stopSparkContext ()  { throw new RuntimeException(); }
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.PatienceConfiguration.Timeout eventuallyTimeout ()  { throw new RuntimeException(); }
  public   CheckpointSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration batchDuration ()  { throw new RuntimeException(); }
  public  void beforeEach ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  /**
   * Advances the manual clock on the streaming scheduler by given number of batches.
   * It also waits for the expected amount of time for each batch.
   * @param ssc (undocumented)
   * @param numBatches (undocumented)
   * @param evidence$6 (undocumented)
   * @return (undocumented)
   */
  public <V extends java.lang.Object> scala.collection.Iterable<scala.collection.Seq<V>> advanceTimeWithRealDelay (org.apache.spark.streaming.StreamingContext ssc, long numBatches, scala.reflect.ClassTag<V> evidence$6)  { throw new RuntimeException(); }
}
