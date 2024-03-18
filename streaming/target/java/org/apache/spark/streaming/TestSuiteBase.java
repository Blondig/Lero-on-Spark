package org.apache.spark.streaming;
/**
 * This is the base trait for Spark Streaming testsuites. This provides basic functionality
 * to run user-defined set of input on user-defined stream operations, and verify the output.
 */
public  interface TestSuiteBase extends org.scalatest.BeforeAndAfterEach, org.apache.spark.internal.Logging {
  public  boolean actuallyWait ()  ;
  public  void afterEach ()  ;
  public  void afterFunction ()  ;
  public  org.apache.spark.streaming.Duration batchDuration ()  ;
  public  void beforeEach ()  ;
  public  void beforeFunction ()  ;
  public  java.lang.String checkpointDir ()  ;
  public  org.apache.spark.SparkConf conf ()  ;
  public  org.scalatest.concurrent.PatienceConfiguration.Timeout eventuallyTimeout ()  ;
  public  java.lang.String framework ()  ;
  public  java.lang.String master ()  ;
  public  int maxWaitTimeMillis ()  ;
  public  int numInputPartitions ()  ;
  /**
   * Runs the streams set up in <code>ssc</code> on manual clock for <code>numBatches</code> batches and
   * returns the collected output. It will wait until <code>numExpectedOutput</code> number of
   * output data has been collected or timeout (set by <code>maxWaitTimeMillis</code>) is reached.
   * <p>
   * Returns a sequence of items for each RDD.
   * <p>
   * @param ssc The StreamingContext
   * @param numBatches The number of batches should be run
   * @param numExpectedOutput The number of expected output
   * @param preStop The function to run before stopping StreamingContext
   * @param evidence$9 (undocumented)
   * @return (undocumented)
   */
  public <V extends java.lang.Object> scala.collection.Seq<scala.collection.Seq<V>> runStreams (org.apache.spark.streaming.StreamingContext ssc, int numBatches, int numExpectedOutput, scala.Function0<scala.runtime.BoxedUnit> preStop, scala.reflect.ClassTag<V> evidence$9)  ;
  /**
   * Runs the streams set up in <code>ssc</code> on manual clock for <code>numBatches</code> batches and
   * returns the collected output. It will wait until <code>numExpectedOutput</code> number of
   * output data has been collected or timeout (set by <code>maxWaitTimeMillis</code>) is reached.
   * <p>
   * Returns a sequence of RDD's. Each RDD is represented as several sequences of items, each
   * representing one partition.
   * <p>
   * @param ssc The StreamingContext
   * @param numBatches The number of batches should be run
   * @param numExpectedOutput The number of expected output
   * @param preStop The function to run before stopping StreamingContext
   * @param evidence$10 (undocumented)
   * @return (undocumented)
   */
  public <V extends java.lang.Object> scala.collection.Seq<scala.collection.Seq<scala.collection.Seq<V>>> runStreamsWithPartitions (org.apache.spark.streaming.StreamingContext ssc, int numBatches, int numExpectedOutput, scala.Function0<scala.runtime.BoxedUnit> preStop, scala.reflect.ClassTag<V> evidence$10)  ;
  /**
   * Set up required DStreams to test the DStream operation using the two sequences
   * of input collections.
   * @param input (undocumented)
   * @param operation (undocumented)
   * @param numPartitions (undocumented)
   * @param evidence$4 (undocumented)
   * @param evidence$5 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.StreamingContext setupStreams (scala.collection.Seq<scala.collection.Seq<U>> input, scala.Function1<org.apache.spark.streaming.dstream.DStream<U>, org.apache.spark.streaming.dstream.DStream<V>> operation, int numPartitions, scala.reflect.ClassTag<U> evidence$4, scala.reflect.ClassTag<V> evidence$5)  ;
  /**
   * Set up required DStreams to test the binary operation using the sequence
   * of input collections.
   * @param input1 (undocumented)
   * @param input2 (undocumented)
   * @param operation (undocumented)
   * @param evidence$6 (undocumented)
   * @param evidence$7 (undocumented)
   * @param evidence$8 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object, V extends java.lang.Object, W extends java.lang.Object> org.apache.spark.streaming.StreamingContext setupStreams (scala.collection.Seq<scala.collection.Seq<U>> input1, scala.collection.Seq<scala.collection.Seq<V>> input2, scala.Function2<org.apache.spark.streaming.dstream.DStream<U>, org.apache.spark.streaming.dstream.DStream<V>, org.apache.spark.streaming.dstream.DStream<W>> operation, scala.reflect.ClassTag<U> evidence$6, scala.reflect.ClassTag<V> evidence$7, scala.reflect.ClassTag<W> evidence$8)  ;
  /**
   * Test unary DStream operation with a list of inputs, with number of
   * batches to run same as the number of expected output values
   * @param input (undocumented)
   * @param operation (undocumented)
   * @param expectedOutput (undocumented)
   * @param useSet (undocumented)
   * @param evidence$12 (undocumented)
   * @param evidence$13 (undocumented)
   */
  public <U extends java.lang.Object, V extends java.lang.Object> void testOperation (scala.collection.Seq<scala.collection.Seq<U>> input, scala.Function1<org.apache.spark.streaming.dstream.DStream<U>, org.apache.spark.streaming.dstream.DStream<V>> operation, scala.collection.Seq<scala.collection.Seq<V>> expectedOutput, boolean useSet, scala.reflect.ClassTag<U> evidence$12, scala.reflect.ClassTag<V> evidence$13)  ;
  /**
   * Test unary DStream operation with a list of inputs
   * @param input      Sequence of input collections
   * @param operation  Binary DStream operation to be applied to the 2 inputs
   * @param expectedOutput Sequence of expected output collections
   * @param numBatches Number of batches to run the operation for
   * @param useSet     Compare the output values with the expected output values
   *                   as sets (order matters) or as lists (order does not matter)
   * @param evidence$14 (undocumented)
   * @param evidence$15 (undocumented)
   */
  public <U extends java.lang.Object, V extends java.lang.Object> void testOperation (scala.collection.Seq<scala.collection.Seq<U>> input, scala.Function1<org.apache.spark.streaming.dstream.DStream<U>, org.apache.spark.streaming.dstream.DStream<V>> operation, scala.collection.Seq<scala.collection.Seq<V>> expectedOutput, int numBatches, boolean useSet, scala.reflect.ClassTag<U> evidence$14, scala.reflect.ClassTag<V> evidence$15)  ;
  /**
   * Test binary DStream operation with two lists of inputs, with number of
   * batches to run same as the number of expected output values
   * @param input1 (undocumented)
   * @param input2 (undocumented)
   * @param operation (undocumented)
   * @param expectedOutput (undocumented)
   * @param useSet (undocumented)
   * @param evidence$16 (undocumented)
   * @param evidence$17 (undocumented)
   * @param evidence$18 (undocumented)
   */
  public <U extends java.lang.Object, V extends java.lang.Object, W extends java.lang.Object> void testOperation (scala.collection.Seq<scala.collection.Seq<U>> input1, scala.collection.Seq<scala.collection.Seq<V>> input2, scala.Function2<org.apache.spark.streaming.dstream.DStream<U>, org.apache.spark.streaming.dstream.DStream<V>, org.apache.spark.streaming.dstream.DStream<W>> operation, scala.collection.Seq<scala.collection.Seq<W>> expectedOutput, boolean useSet, scala.reflect.ClassTag<U> evidence$16, scala.reflect.ClassTag<V> evidence$17, scala.reflect.ClassTag<W> evidence$18)  ;
  /**
   * Test binary DStream operation with two lists of inputs
   * @param input1     First sequence of input collections
   * @param input2     Second sequence of input collections
   * @param operation  Binary DStream operation to be applied to the 2 inputs
   * @param expectedOutput Sequence of expected output collections
   * @param numBatches Number of batches to run the operation for
   * @param useSet     Compare the output values with the expected output values
   *                   as sets (order matters) or as lists (order does not matter)
   * @param evidence$19 (undocumented)
   * @param evidence$20 (undocumented)
   * @param evidence$21 (undocumented)
   */
  public <U extends java.lang.Object, V extends java.lang.Object, W extends java.lang.Object> void testOperation (scala.collection.Seq<scala.collection.Seq<U>> input1, scala.collection.Seq<scala.collection.Seq<V>> input2, scala.Function2<org.apache.spark.streaming.dstream.DStream<U>, org.apache.spark.streaming.dstream.DStream<V>, org.apache.spark.streaming.dstream.DStream<W>> operation, scala.collection.Seq<scala.collection.Seq<W>> expectedOutput, int numBatches, boolean useSet, scala.reflect.ClassTag<U> evidence$19, scala.reflect.ClassTag<V> evidence$20, scala.reflect.ClassTag<W> evidence$21)  ;
  public  boolean useManualClock ()  ;
  /**
   * Verify whether the output values after running a DStream operation
   * is same as the expected output values, by comparing the output
   * collections either as lists (order matters) or sets (order does not matter)
   * @param output (undocumented)
   * @param expectedOutput (undocumented)
   * @param useSet (undocumented)
   * @param evidence$11 (undocumented)
   */
  public <V extends java.lang.Object> void verifyOutput (scala.collection.Seq<scala.collection.Seq<V>> output, scala.collection.Seq<scala.collection.Seq<V>> expectedOutput, boolean useSet, scala.reflect.ClassTag<V> evidence$11)  ;
  /**
   * Run a block of code with the given StreamingContext and automatically
   * stop the context when the block completes or when an exception is thrown.
   * @param ssc (undocumented)
   * @param block (undocumented)
   * @return (undocumented)
   */
  public <R extends java.lang.Object> R withStreamingContext (org.apache.spark.streaming.StreamingContext ssc, scala.Function1<org.apache.spark.streaming.StreamingContext, R> block)  ;
  /**
   * Run a block of code with the given TestServer and automatically
   * stop the server when the block completes or when an exception is thrown.
   * @param testServer (undocumented)
   * @param block (undocumented)
   * @return (undocumented)
   */
  public <R extends java.lang.Object> R withTestServer (org.apache.spark.streaming.TestServer testServer, scala.Function1<org.apache.spark.streaming.TestServer, R> block)  ;
}
