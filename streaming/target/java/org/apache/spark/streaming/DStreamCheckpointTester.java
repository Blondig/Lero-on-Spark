package org.apache.spark.streaming;
/**
 * A trait of that can be mixed in to get methods for testing DStream operations under
 * DStream checkpointing. Note that the implementations of this trait has to implement
 * the <code>setupCheckpointOperation</code>
 */
public  interface DStreamCheckpointTester {
  public <V extends java.lang.Object> void assertOutput (scala.collection.Seq<scala.collection.Seq<V>> output, scala.collection.Seq<scala.collection.Seq<V>> expectedOutput, boolean beforeRestart, scala.reflect.ClassTag<V> evidence$5)  ;
  public  org.apache.spark.streaming.StreamingContext createContextForCheckpointOperation (org.apache.spark.streaming.Duration batchDuration)  ;
  public <V extends java.lang.Object> scala.collection.Seq<scala.collection.Seq<V>> generateOutput (org.apache.spark.streaming.StreamingContext ssc, org.apache.spark.streaming.Time targetBatchTime, java.lang.String checkpointDir, boolean stopSparkContext, scala.reflect.ClassTag<V> evidence$4)  ;
  /**
   * Get the first TestOutputStreamWithPartitions, does not check the provided generic type.
   * @param streams (undocumented)
   * @param evidence$3 (undocumented)
   * @return (undocumented)
   */
  public <V extends java.lang.Object> org.apache.spark.streaming.TestOutputStreamWithPartitions<V> getTestOutputStream (org.apache.spark.streaming.dstream.DStream<?>[] streams, scala.reflect.ClassTag<V> evidence$3)  ;
  /**
   * Tests a streaming operation under checkpointing, by restarting the operation
   * from checkpoint file and verifying whether the final output is correct.
   * The output is assumed to have come from a reliable queue which a replay
   * data as required.
   * <p>
   * NOTE: This takes into consideration that the last batch processed before
   * master failure will be re-processed after restart/recovery.
   * @param input (undocumented)
   * @param operation (undocumented)
   * @param expectedOutput (undocumented)
   * @param numBatchesBeforeRestart (undocumented)
   * @param batchDuration (undocumented)
   * @param stopSparkContextAfterTest (undocumented)
   * @param evidence$1 (undocumented)
   * @param evidence$2 (undocumented)
   */
  public <U extends java.lang.Object, V extends java.lang.Object> void testCheckpointedOperation (scala.collection.Seq<scala.collection.Seq<U>> input, scala.Function1<org.apache.spark.streaming.dstream.DStream<U>, org.apache.spark.streaming.dstream.DStream<V>> operation, scala.collection.Seq<scala.collection.Seq<V>> expectedOutput, int numBatchesBeforeRestart, org.apache.spark.streaming.Duration batchDuration, boolean stopSparkContextAfterTest, scala.reflect.ClassTag<U> evidence$1, scala.reflect.ClassTag<V> evidence$2)  ;
}
