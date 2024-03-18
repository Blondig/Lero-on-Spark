package org.apache.spark.ml.feature;
/**
 * <code>Bucketizer</code> maps a column of continuous features to a column of feature buckets.
 * <p>
 * Since 2.3.0,
 * <code>Bucketizer</code> can map multiple columns at once by setting the <code>inputCols</code> parameter. Note that
 * when both the <code>inputCol</code> and <code>inputCols</code> parameters are set, an Exception will be thrown. The
 * <code>splits</code> parameter is only used for single column usage, and <code>splitsArray</code> is for multiple
 * columns.
 */
public final class Bucketizer extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.Bucketizer> implements org.apache.spark.ml.param.shared.HasHandleInvalid, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.param.shared.HasInputCols, org.apache.spark.ml.param.shared.HasOutputCols, org.apache.spark.ml.util.DefaultParamsWritable {
  static   java.lang.String SKIP_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String ERROR_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String KEEP_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String[] supportedHandleInvalids ()  { throw new RuntimeException(); }
  /**
   * We require splits to be of length >= 3 and to be in strictly increasing order.
   * No NaN split should be accepted.
   * @param splits (undocumented)
   * @return (undocumented)
   */
  static   boolean checkSplits (double[] splits)  { throw new RuntimeException(); }
  /**
   * Check each splits in the splits array.
   * @param splitsArray (undocumented)
   * @return (undocumented)
   */
  static   boolean checkSplitsArray (double[][] splitsArray)  { throw new RuntimeException(); }
  /**
   * Binary searching in several buckets to place each data point.
   * @param splits array of split points
   * @param feature data point
   * @param keepInvalid NaN flag.
   *                    Set "true" to make an extra bucket for NaN values;
   *                    Set "false" to report an error for NaN values
   * @return bucket for each data point
   * @throws SparkException if a feature is < splits.head or > splits.last
   */
  static   double binarySearchForBuckets (double[] splits, double feature, boolean keepInvalid)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.Bucketizer load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.StringArrayParam outputCols ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.StringArrayParam inputCols ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   Bucketizer (java.lang.String uid)  { throw new RuntimeException(); }
  public   Bucketizer ()  { throw new RuntimeException(); }
  /**
   * Parameter for mapping continuous features into buckets. With n+1 splits, there are n buckets.
   * A bucket defined by splits x,y holds values in the range [x,y) except the last bucket, which
   * also includes y. Splits should be of length greater than or equal to 3 and strictly increasing.
   * Values at -inf, inf must be explicitly provided to cover all Double values;
   * otherwise, values outside the splits specified will be treated as errors.
   * <p>
   * See also {@link handleInvalid}, which can optionally create an additional bucket for NaN values.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleArrayParam splits ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  double[] getSplits ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Bucketizer setSplits (double[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Bucketizer setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Bucketizer setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Param for how to handle invalid entries containing NaN values. Values outside the splits
   * will always be treated as errors. Options are 'skip' (filter out rows with
   * invalid values), 'error' (throw an error), or 'keep' (keep invalid values in a special
   * additional bucket). Note that in the multiple column case, the invalid handling is applied
   * to all columns. That said for 'error' it will throw an error if any invalids are found in
   * any column, for 'skip' it will skip rows with any invalids in any columns, etc.
   * Default: "error"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Bucketizer setHandleInvalid (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Parameter for specifying multiple splits parameters. Each element in this array can be used to
   * map continuous features into buckets.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleArrayArrayParam splitsArray ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  double[][] getSplitsArray ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Bucketizer setSplitsArray (double[][] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Bucketizer setInputCols (java.lang.String[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Bucketizer setOutputCols (java.lang.String[] value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Bucketizer copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
