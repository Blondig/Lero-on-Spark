package org.apache.spark.api.java;
public  class JavaDoubleRDD extends org.apache.spark.api.java.AbstractJavaRDDLike<java.lang.Double, org.apache.spark.api.java.JavaDoubleRDD> {
  static public  org.apache.spark.api.java.JavaDoubleRDD fromRDD (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<java.lang.Object> toRDD (org.apache.spark.api.java.JavaDoubleRDD rdd)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<java.lang.Object> srdd ()  { throw new RuntimeException(); }
  // not preceding
  public   JavaDoubleRDD (org.apache.spark.rdd.RDD<java.lang.Object> srdd)  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<java.lang.Double> classTag ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<java.lang.Double> rdd ()  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaDoubleRDD wrapRDD (org.apache.spark.rdd.RDD<java.lang.Double> rdd)  { throw new RuntimeException(); }
  /**
   * Persist this RDD with the default storage level (<code>MEMORY_ONLY</code>).
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD cache ()  { throw new RuntimeException(); }
  /**
   * Set this RDD's storage level to persist its values across operations after the first time
   * it is computed. Can only be called once on each RDD.
   * @param newLevel (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD persist (org.apache.spark.storage.StorageLevel newLevel)  { throw new RuntimeException(); }
  /**
   * Mark the RDD as non-persistent, and remove all blocks for it from memory and disk.
   * This method blocks until all blocks are deleted.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD unpersist ()  { throw new RuntimeException(); }
  /**
   * Mark the RDD as non-persistent, and remove all blocks for it from memory and disk.
   * <p>
   * @param blocking Whether to block until all blocks are deleted.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD unpersist (boolean blocking)  { throw new RuntimeException(); }
  public  java.lang.Double first ()  { throw new RuntimeException(); }
  /**
   * Return a new RDD containing the distinct elements in this RDD.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD distinct ()  { throw new RuntimeException(); }
  /**
   * Return a new RDD containing the distinct elements in this RDD.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD distinct (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new RDD containing only the elements that satisfy a predicate.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD filter (org.apache.spark.api.java.function.Function<java.lang.Double, java.lang.Boolean> f)  { throw new RuntimeException(); }
  /**
   * Return a new RDD that is reduced into <code>numPartitions</code> partitions.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD coalesce (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new RDD that is reduced into <code>numPartitions</code> partitions.
   * @param numPartitions (undocumented)
   * @param shuffle (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD coalesce (int numPartitions, boolean shuffle)  { throw new RuntimeException(); }
  /**
   * Return a new RDD that has exactly numPartitions partitions.
   * <p>
   * Can increase or decrease the level of parallelism in this RDD. Internally, this uses
   * a shuffle to redistribute data.
   * <p>
   * If you are decreasing the number of partitions in this RDD, consider using <code>coalesce</code>,
   * which can avoid performing a shuffle.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD repartition (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the elements from <code>this</code> that are not in <code>other</code>.
   * <p>
   * Uses <code>this</code> partitioner/partition size, because even if <code>other</code> is huge, the resulting
   * RDD will be &amp;lt;= us.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD subtract (org.apache.spark.api.java.JavaDoubleRDD other)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the elements from <code>this</code> that are not in <code>other</code>.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD subtract (org.apache.spark.api.java.JavaDoubleRDD other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the elements from <code>this</code> that are not in <code>other</code>.
   * @param other (undocumented)
   * @param p (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD subtract (org.apache.spark.api.java.JavaDoubleRDD other, org.apache.spark.Partitioner p)  { throw new RuntimeException(); }
  /**
   * Return a sampled subset of this RDD.
   * @param withReplacement (undocumented)
   * @param fraction (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD sample (boolean withReplacement, java.lang.Double fraction)  { throw new RuntimeException(); }
  /**
   * Return a sampled subset of this RDD.
   * @param withReplacement (undocumented)
   * @param fraction (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD sample (boolean withReplacement, java.lang.Double fraction, long seed)  { throw new RuntimeException(); }
  /**
   * Return the union of this RDD and another one. Any identical elements will appear multiple
   * times (use <code>.distinct()</code> to eliminate them).
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD union (org.apache.spark.api.java.JavaDoubleRDD other)  { throw new RuntimeException(); }
  /**
   * Return the intersection of this RDD and another one. The output will not contain any duplicate
   * elements, even if the input RDDs did.
   * <p>
   * @note This method performs a shuffle internally.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD intersection (org.apache.spark.api.java.JavaDoubleRDD other)  { throw new RuntimeException(); }
  /** Add up the elements in this RDD. */
  public  java.lang.Double sum ()  { throw new RuntimeException(); }
  /**
   * Returns the minimum element from this RDD as defined by
   * the default comparator natural order.
   * @return the minimum of the RDD
   */
  public  java.lang.Double min ()  { throw new RuntimeException(); }
  /**
   * Returns the maximum element from this RDD as defined by
   * the default comparator natural order.
   * @return the maximum of the RDD
   */
  public  java.lang.Double max ()  { throw new RuntimeException(); }
  /**
   * Return a {@link org.apache.spark.util.StatCounter} object that captures the mean, variance and
   * count of the RDD's elements in one operation.
   * @return (undocumented)
   */
  public  org.apache.spark.util.StatCounter stats ()  { throw new RuntimeException(); }
  /** Compute the mean of this RDD's elements. */
  public  java.lang.Double mean ()  { throw new RuntimeException(); }
  /** Compute the population variance of this RDD's elements. */
  public  java.lang.Double variance ()  { throw new RuntimeException(); }
  /** Compute the population standard deviation of this RDD's elements. */
  public  java.lang.Double stdev ()  { throw new RuntimeException(); }
  /**
   * Compute the sample standard deviation of this RDD's elements (which corrects for bias in
   * estimating the standard deviation by dividing by N-1 instead of N).
   * @return (undocumented)
   */
  public  java.lang.Double sampleStdev ()  { throw new RuntimeException(); }
  /**
   * Compute the sample variance of this RDD's elements (which corrects for bias in
   * estimating the standard variance by dividing by N-1 instead of N).
   * @return (undocumented)
   */
  public  java.lang.Double sampleVariance ()  { throw new RuntimeException(); }
  /**
   * Compute the population standard deviation of this RDD's elements.
   * @return (undocumented)
   */
  public  java.lang.Double popStdev ()  { throw new RuntimeException(); }
  /**
   * Compute the population variance of this RDD's elements.
   * @return (undocumented)
   */
  public  java.lang.Double popVariance ()  { throw new RuntimeException(); }
  /** Return the approximate mean of the elements in this RDD. */
  public  org.apache.spark.partial.PartialResult<org.apache.spark.partial.BoundedDouble> meanApprox (long timeout, java.lang.Double confidence)  { throw new RuntimeException(); }
  /**
   * Approximate operation to return the mean within a timeout.
   * @param timeout (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.partial.PartialResult<org.apache.spark.partial.BoundedDouble> meanApprox (long timeout)  { throw new RuntimeException(); }
  /**
   * Approximate operation to return the sum within a timeout.
   * @param timeout (undocumented)
   * @param confidence (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.partial.PartialResult<org.apache.spark.partial.BoundedDouble> sumApprox (long timeout, java.lang.Double confidence)  { throw new RuntimeException(); }
  /**
   * Approximate operation to return the sum within a timeout.
   * @param timeout (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.partial.PartialResult<org.apache.spark.partial.BoundedDouble> sumApprox (long timeout)  { throw new RuntimeException(); }
  /**
   * Compute a histogram of the data using bucketCount number of buckets evenly
   *  spaced between the minimum and maximum of the RDD. For example if the min
   *  value is 0 and the max is 100 and there are two buckets the resulting
   *  buckets will be [0,50) [50,100]. bucketCount must be at least 1
   * If the RDD contains infinity, NaN throws an exception
   * If the elements in RDD do not vary (max == min) always returns a single bucket.
   * @param bucketCount (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple2<double[], long[]> histogram (int bucketCount)  { throw new RuntimeException(); }
  /**
   * Compute a histogram using the provided buckets. The buckets are all open
   * to the left except for the last which is closed
   *  e.g. for the array
   *  [1,10,20,50] the buckets are [1,10) [10,20) [20,50]
   *  e.g 1&amp;lt;=x&amp;lt;10 , 10&amp;lt;=x&amp;lt;20, 20&amp;lt;=x&amp;lt;50
   *  And on the input of 1 and 50 we would have a histogram of 1,0,0
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
   * @return (undocumented)
   */
  public  long[] histogram (double[] buckets)  { throw new RuntimeException(); }
  public  long[] histogram (java.lang.Double[] buckets, boolean evenBuckets)  { throw new RuntimeException(); }
  /** Assign a name to this RDD */
  public  org.apache.spark.api.java.JavaDoubleRDD setName (java.lang.String name)  { throw new RuntimeException(); }
}
