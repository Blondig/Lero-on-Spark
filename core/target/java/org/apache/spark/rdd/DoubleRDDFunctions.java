package org.apache.spark.rdd;
/**
 * Extra functions available on RDDs of Doubles through an implicit conversion.
 */
public  class DoubleRDDFunctions implements org.apache.spark.internal.Logging, scala.Serializable {
  public   DoubleRDDFunctions (org.apache.spark.rdd.RDD<java.lang.Object> self)  { throw new RuntimeException(); }
  /**
   * Compute a histogram of the data using bucketCount number of buckets evenly
   *  spaced between the minimum and maximum of the RDD. For example if the min
   *  value is 0 and the max is 100 and there are two buckets the resulting
   *  buckets will be [0, 50) [50, 100]. bucketCount must be at least 1
   * If the RDD contains infinity, NaN throws an exception
   * If the elements in RDD do not vary (max == min) always returns a single bucket.
   * @param bucketCount (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple2<double[], long[]> histogram (int bucketCount)  { throw new RuntimeException(); }
  /**
   * Compute a histogram using the provided buckets. The buckets are all open
   * to the right except for the last which is closed.
   *  e.g. for the array
   *  [1, 10, 20, 50] the buckets are [1, 10) [10, 20) [20, 50]
   *  e.g {@code <=x<10, 10<=x<20, 20<=x<=50}
   *  And on the input of 1 and 50 we would have a histogram of 1, 0, 1
   * <p>
   * @note If your histogram is evenly spaced (e.g. [0, 10, 20, 30]) this can be switched
   * from an O(log n) insertion to O(1) per element. (where n = # buckets) if you set evenBuckets
   * to true.
   * buckets must be sorted and not contain any duplicates.
   * buckets array must be at least two elements
   * All NaN entries are treated the same. If you have a NaN bucket it must be
   * the maximum value of the last position and all NaN entries will be counted
   * in that bucket.
   * @param buckets (undocumented)
   * @param evenBuckets (undocumented)
   * @return (undocumented)
   */
  public  long[] histogram (double[] buckets, boolean evenBuckets)  { throw new RuntimeException(); }
  /** Compute the mean of this RDD's elements. */
  public  double mean ()  { throw new RuntimeException(); }
  /**
   * Approximate operation to return the mean within a timeout.
   * @param timeout (undocumented)
   * @param confidence (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.partial.PartialResult<org.apache.spark.partial.BoundedDouble> meanApprox (long timeout, double confidence)  { throw new RuntimeException(); }
  /**
   * Compute the population standard deviation of this RDD's elements.
   * @return (undocumented)
   */
  public  double popStdev ()  { throw new RuntimeException(); }
  /**
   * Compute the population variance of this RDD's elements.
   * @return (undocumented)
   */
  public  double popVariance ()  { throw new RuntimeException(); }
  /**
   * Compute the sample standard deviation of this RDD's elements (which corrects for bias in
   * estimating the standard deviation by dividing by N-1 instead of N).
   * @return (undocumented)
   */
  public  double sampleStdev ()  { throw new RuntimeException(); }
  /**
   * Compute the sample variance of this RDD's elements (which corrects for bias in
   * estimating the variance by dividing by N-1 instead of N).
   * @return (undocumented)
   */
  public  double sampleVariance ()  { throw new RuntimeException(); }
  /**
   * Return a {@link org.apache.spark.util.StatCounter} object that captures the mean, variance and
   * count of the RDD's elements in one operation.
   * @return (undocumented)
   */
  public  org.apache.spark.util.StatCounter stats ()  { throw new RuntimeException(); }
  /** Compute the population standard deviation of this RDD's elements. */
  public  double stdev ()  { throw new RuntimeException(); }
  /** Add up the elements in this RDD. */
  public  double sum ()  { throw new RuntimeException(); }
  /**
   * Approximate operation to return the sum within a timeout.
   * @param timeout (undocumented)
   * @param confidence (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.partial.PartialResult<org.apache.spark.partial.BoundedDouble> sumApprox (long timeout, double confidence)  { throw new RuntimeException(); }
  /** Compute the population variance of this RDD's elements. */
  public  double variance ()  { throw new RuntimeException(); }
}
