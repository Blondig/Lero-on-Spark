package org.apache.spark.ml.fpm;
/**
 * A parallel PrefixSpan algorithm to mine frequent sequential patterns.
 * The PrefixSpan algorithm is described in J. Pei, et al., PrefixSpan: Mining Sequential Patterns
 * Efficiently by Prefix-Projected Pattern Growth
 * (see <a href="https://doi.org/10.1109/ICDE.2001.914830">here</a>).
 * This class is not yet an Estimator/Transformer, use <code>findFrequentSequentialPatterns</code> method to
 * run the PrefixSpan algorithm.
 * <p>
 * @see <a href="https://en.wikipedia.org/wiki/Sequential_Pattern_Mining">Sequential Pattern Mining
 * (Wikipedia)</a>
 */
public final class PrefixSpan implements org.apache.spark.ml.param.Params {
  // not preceding
  public   PrefixSpan (java.lang.String uid)  { throw new RuntimeException(); }
  public   PrefixSpan ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.fpm.PrefixSpan copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
    org.apache.spark.ml.param.ParamMap defaultParamMap ()  { throw new RuntimeException(); }
  /**
   * Finds the complete set of frequent sequential patterns in the input sequences of itemsets.
   * <p>
   * @param dataset A dataset or a dataframe containing a sequence column which is
   *                <pre><code>ArrayType(ArrayType(T))</code></pre> type, T is the item type for the input dataset.
   * &#64;return A `DataFrame` that contains columns of sequence and corresponding frequency.
   *         The schema of it will be:
   *          - `sequence: ArrayType(ArrayType(T))` (T is the item type)
   *          - `freq: Long`
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> findFrequentSequentialPatterns (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /** @group getParam */
  public  long getMaxLocalProjDBSize ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  int getMaxPatternLength ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  double getMinSupport ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getSequenceCol ()  { throw new RuntimeException(); }
  /**
   * Param for the maximum number of items (including delimiters used in the internal storage
   * format) allowed in a projected database before local processing (default: <code>32000000</code>).
   * If a projected database exceeds this size, another iteration of distributed prefix growth
   * is run.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.LongParam maxLocalProjDBSize ()  { throw new RuntimeException(); }
  /**
   * Param for the maximal pattern length (default: <code>10</code>).
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam maxPatternLength ()  { throw new RuntimeException(); }
  /**
   * Param for the minimal support level (default: <code>0.1</code>).
   * Sequential patterns that appear more than (minSupport * size-of-the-dataset) times are
   * identified as frequent sequential patterns.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam minSupport ()  { throw new RuntimeException(); }
    org.apache.spark.ml.param.ParamMap paramMap ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<?>[] params ()  { throw new RuntimeException(); }
  /**
   * Param for the name of the sequence column in dataset (default "sequence"), rows with
   * nulls in this column are ignored.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> sequenceCol ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.fpm.PrefixSpan setMaxLocalProjDBSize (long value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.fpm.PrefixSpan setMaxPatternLength (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.fpm.PrefixSpan setMinSupport (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.fpm.PrefixSpan setSequenceCol (java.lang.String value)  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
}
