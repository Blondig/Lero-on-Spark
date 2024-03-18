package org.apache.spark.ml.feature;
/**
 * Binarize a column of continuous features given a threshold.
 * <p>
 * Since 3.0.0,
 * <code>Binarize</code> can map multiple columns at once by setting the <code>inputCols</code> parameter. Note that
 * when both the <code>inputCol</code> and <code>inputCols</code> parameters are set, an Exception will be thrown. The
 * <code>threshold</code> parameter is used for single column usage, and <code>thresholds</code> is for multiple
 * columns.
 */
public final class Binarizer extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasThreshold, org.apache.spark.ml.param.shared.HasThresholds, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.param.shared.HasInputCols, org.apache.spark.ml.param.shared.HasOutputCols, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.Binarizer load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.StringArrayParam outputCols ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.StringArrayParam inputCols ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   Binarizer (java.lang.String uid)  { throw new RuntimeException(); }
  public   Binarizer ()  { throw new RuntimeException(); }
  /**
   * Param for threshold used to binarize continuous features.
   * The features greater than the threshold, will be binarized to 1.0.
   * The features equal to or less than the threshold, will be binarized to 0.0.
   * Default: 0.0
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam threshold ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Binarizer setThreshold (double value)  { throw new RuntimeException(); }
  /**
   * Array of threshold used to binarize continuous features.
   * This is for multiple columns input. If transforming multiple columns and thresholds is
   * not set, but threshold is set, then threshold will be applied across all columns.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleArrayParam thresholds ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Binarizer setThresholds (double[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Binarizer setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Binarizer setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Binarizer setInputCols (java.lang.String[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Binarizer setOutputCols (java.lang.String[] value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Binarizer copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
