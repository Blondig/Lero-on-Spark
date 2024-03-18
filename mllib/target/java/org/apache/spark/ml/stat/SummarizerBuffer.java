package org.apache.spark.ml.stat;
  class SummarizerBuffer implements java.io.Serializable {
  public   SummarizerBuffer (scala.collection.Seq<org.apache.spark.ml.stat.SummaryBuilderImpl.Metric> requestedMetrics, scala.collection.Seq<org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric> requestedCompMetrics)  { throw new RuntimeException(); }
  public   SummarizerBuffer ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.stat.SummarizerBuffer add (scala.collection.Iterator<scala.Tuple2<java.lang.Object, java.lang.Object>> nonZeroIterator, int size, double weight)  { throw new RuntimeException(); }
  /**
   * Add a new sample to this summarizer, and update the statistical summary.
   * @param instance (undocumented)
   * @param weight (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.stat.SummarizerBuffer add (org.apache.spark.ml.linalg.Vector instance, double weight)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.stat.SummarizerBuffer add (org.apache.spark.ml.linalg.Vector instance)  { throw new RuntimeException(); }
  /**
   * Sample size.
   * @return (undocumented)
   */
  public  long count ()  { throw new RuntimeException(); }
  /**
   * Maximum value of each dimension.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector max ()  { throw new RuntimeException(); }
  /**
   * Sample mean of each dimension.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector mean ()  { throw new RuntimeException(); }
  /**
   * Merge another SummarizerBuffer, and update the statistical summary.
   * (Note that it's in place merging; as a result, <code>this</code> object will be modified.)
   * <p>
   * @param other The other MultivariateOnlineSummarizer to be merged.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.stat.SummarizerBuffer merge (org.apache.spark.ml.stat.SummarizerBuffer other)  { throw new RuntimeException(); }
  /**
   * Minimum value of each dimension.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector min ()  { throw new RuntimeException(); }
  /**
   * L1 norm of each dimension.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector normL1 ()  { throw new RuntimeException(); }
  /**
   * L2 (Euclidean) norm of each dimension.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector normL2 ()  { throw new RuntimeException(); }
  /**
   * Number of nonzero elements in each dimension.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector numNonzeros ()  { throw new RuntimeException(); }
  /**
   * Unbiased estimate of standard deviation of each dimension.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector std ()  { throw new RuntimeException(); }
  /**
   * Sum of each dimension.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector sum ()  { throw new RuntimeException(); }
  /**
   * Unbiased estimate of sample variance of each dimension.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector variance ()  { throw new RuntimeException(); }
  /**
   * Sum of weights.
   * @return (undocumented)
   */
  public  double weightSum ()  { throw new RuntimeException(); }
}
