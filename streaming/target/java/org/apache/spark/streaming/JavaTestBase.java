package org.apache.spark.streaming;
/** Exposes streaming test functionality in a Java-friendly way. */
public  interface JavaTestBase extends org.apache.spark.streaming.TestSuiteBase {
  /**
   * Create a {@link org.apache.spark.streaming.TestInputStream} and attach it to the supplied context.
   * The stream will be derived from the supplied lists of Java objects.
   * @param ssc (undocumented)
   * @param data (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<T> attachTestInputStream (org.apache.spark.streaming.api.java.JavaStreamingContext ssc, java.util.List<java.util.List<T>> data, int numPartitions)  ;
  /**
   * Attach a provided stream to it's associated StreamingContext as a
   * {@link org.apache.spark.streaming.TestOutputStream}.
   * @param dstream (undocumented)
   */
  public <T extends java.lang.Object, This extends org.apache.spark.streaming.api.java.JavaDStreamLike<T, This, R>, R extends org.apache.spark.api.java.JavaRDDLike<T, R>> void attachTestOutputStream (org.apache.spark.streaming.api.java.JavaDStreamLike<T, This, R> dstream)  ;
  /**
   * Process all registered streams for a numBatches batches, failing if
   * numExpectedOutput RDD's are not generated. Generated RDD's are collected
   * and returned, represented as a list for each batch interval.
   * <p>
   * Returns a list of items for each RDD.
   * @param ssc (undocumented)
   * @param numBatches (undocumented)
   * @param numExpectedOutput (undocumented)
   * @return (undocumented)
   */
  public <V extends java.lang.Object> java.util.List<java.util.List<V>> runStreams (org.apache.spark.streaming.api.java.JavaStreamingContext ssc, int numBatches, int numExpectedOutput)  ;
  /**
   * Process all registered streams for a numBatches batches, failing if
   * numExpectedOutput RDD's are not generated. Generated RDD's are collected
   * and returned, represented as a list for each batch interval.
   * <p>
   * Returns a sequence of RDD's. Each RDD is represented as several sequences of items, each
   * representing one partition.
   * @param ssc (undocumented)
   * @param numBatches (undocumented)
   * @param numExpectedOutput (undocumented)
   * @return (undocumented)
   */
  public <V extends java.lang.Object> java.util.List<java.util.List<java.util.List<V>>> runStreamsWithPartitions (org.apache.spark.streaming.api.java.JavaStreamingContext ssc, int numBatches, int numExpectedOutput)  ;
}
