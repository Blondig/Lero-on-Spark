package org.apache.spark.ml.stat;
/**
 * Tools for vectorized statistics on MLlib Vectors.
 * <p>
 * The methods in this package provide various statistics for Vectors contained inside DataFrames.
 * <p>
 * This class lets users pick the statistics they would like to extract for a given column. Here is
 * an example in Scala:
 * <pre><code>
 *   import org.apache.spark.ml.linalg._
 *   import org.apache.spark.sql.Row
 *   val dataframe = ... // Some dataframe containing a feature column and a weight column
 *   val multiStatsDF = dataframe.select(
 *       Summarizer.metrics("min", "max", "count").summary($"features", $"weight")
 *   val Row(minVec, maxVec, count) = multiStatsDF.first()
 * </code></pre>
 * <p>
 * If one wants to get a single metric, shortcuts are also available:
 * <pre><code>
 *   val meanDF = dataframe.select(Summarizer.mean($"features"))
 *   val Row(meanVec) = meanDF.first()
 * </code></pre>
 * <p>
 * Note: Currently, the performance of this interface is about 2x~3x slower than using the RDD
 * interface.
 */
// not preceding
public  class Summarizer$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Summarizer$ MODULE$ = null;
  /**
   * Given a list of metrics, provides a builder that it turns computes metrics from a column.
   * <p>
   * See the documentation of {@link Summarizer} for an example.
   * <p>
   * The following metrics are accepted (case sensitive):
   *  - mean: a vector that contains the coefficient-wise mean.
   *  - sum: a vector that contains the coefficient-wise sum.
   *  - variance: a vector tha contains the coefficient-wise variance.
   *  - std: a vector tha contains the coefficient-wise standard deviation.
   *  - count: the count of all vectors seen.
   *  - numNonzeros: a vector with the number of non-zeros for each coefficients
   *  - max: the maximum for each coefficient.
   *  - min: the minimum for each coefficient.
   *  - normL2: the Euclidean norm for each coefficient.
   *  - normL1: the L1 norm of each coefficient (sum of the absolute values).
   * @param metrics metrics that can be provided.
   * @return a builder.
   * @throws IllegalArgumentException if one of the metric names is not understood.
   * <p>
   * Note: Currently, the performance of this interface is about 2x~3x slower then using the RDD
   * interface.
   */
  public  org.apache.spark.ml.stat.SummaryBuilder metrics (java.lang.String... metrics)  { throw new RuntimeException(); }
  public   Summarizer$ ()  { throw new RuntimeException(); }
  /**
   * Given a list of metrics, provides a builder that it turns computes metrics from a column.
   * <p>
   * See the documentation of {@link Summarizer} for an example.
   * <p>
   * The following metrics are accepted (case sensitive):
   *  - mean: a vector that contains the coefficient-wise mean.
   *  - sum: a vector that contains the coefficient-wise sum.
   *  - variance: a vector tha contains the coefficient-wise variance.
   *  - std: a vector tha contains the coefficient-wise standard deviation.
   *  - count: the count of all vectors seen.
   *  - numNonzeros: a vector with the number of non-zeros for each coefficients
   *  - max: the maximum for each coefficient.
   *  - min: the minimum for each coefficient.
   *  - normL2: the Euclidean norm for each coefficient.
   *  - normL1: the L1 norm of each coefficient (sum of the absolute values).
   * @param metrics metrics that can be provided.
   * @return a builder.
   * @throws IllegalArgumentException if one of the metric names is not understood.
   * <p>
   * Note: Currently, the performance of this interface is about 2x~3x slower then using the RDD
   * interface.
   */
  public  org.apache.spark.ml.stat.SummaryBuilder metrics (scala.collection.Seq<java.lang.String> metrics)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column mean (org.apache.spark.sql.Column col, org.apache.spark.sql.Column weightCol)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column mean (org.apache.spark.sql.Column col)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column sum (org.apache.spark.sql.Column col, org.apache.spark.sql.Column weightCol)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column sum (org.apache.spark.sql.Column col)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column variance (org.apache.spark.sql.Column col, org.apache.spark.sql.Column weightCol)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column variance (org.apache.spark.sql.Column col)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column std (org.apache.spark.sql.Column col, org.apache.spark.sql.Column weightCol)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column std (org.apache.spark.sql.Column col)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column count (org.apache.spark.sql.Column col, org.apache.spark.sql.Column weightCol)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column count (org.apache.spark.sql.Column col)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column numNonZeros (org.apache.spark.sql.Column col, org.apache.spark.sql.Column weightCol)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column numNonZeros (org.apache.spark.sql.Column col)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column max (org.apache.spark.sql.Column col, org.apache.spark.sql.Column weightCol)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column max (org.apache.spark.sql.Column col)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column min (org.apache.spark.sql.Column col, org.apache.spark.sql.Column weightCol)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column min (org.apache.spark.sql.Column col)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column normL1 (org.apache.spark.sql.Column col, org.apache.spark.sql.Column weightCol)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column normL1 (org.apache.spark.sql.Column col)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column normL2 (org.apache.spark.sql.Column col, org.apache.spark.sql.Column weightCol)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column normL2 (org.apache.spark.sql.Column col)  { throw new RuntimeException(); }
    org.apache.spark.ml.stat.SummarizerBuffer createSummarizerBuffer (scala.collection.Seq<java.lang.String> requested)  { throw new RuntimeException(); }
  /** Get regression feature and label summarizers for provided data. */
    scala.Tuple2<org.apache.spark.ml.stat.SummarizerBuffer, org.apache.spark.ml.stat.SummarizerBuffer> getRegressionSummarizers (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> instances, int aggregationDepth, scala.collection.Seq<java.lang.String> requested)  { throw new RuntimeException(); }
  /** Get classification feature and label summarizers for provided data. */
    scala.Tuple2<org.apache.spark.ml.stat.SummarizerBuffer, org.apache.spark.ml.stat.MultiClassSummarizer> getClassificationSummarizers (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> instances, int aggregationDepth, scala.collection.Seq<java.lang.String> requested)  { throw new RuntimeException(); }
}
