package org.apache.spark.ml.regression;
/**
 * Isotonic regression.
 * <p>
 * Currently implemented using parallelized pool adjacent violators algorithm.
 * Only univariate (single feature) algorithm supported.
 * <p>
 * Uses {@link org.apache.spark.mllib.regression.IsotonicRegression}.
 */
public  class IsotonicRegression extends org.apache.spark.ml.Estimator<org.apache.spark.ml.regression.IsotonicRegressionModel> implements org.apache.spark.ml.regression.IsotonicRegressionBase, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.regression.IsotonicRegression load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam isotonic ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam featureIndex ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   IsotonicRegression (java.lang.String uid)  { throw new RuntimeException(); }
  public   IsotonicRegression ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.IsotonicRegression setLabelCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.IsotonicRegression setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.IsotonicRegression setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.IsotonicRegression setIsotonic (boolean value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.IsotonicRegression setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.IsotonicRegression setFeatureIndex (int value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.IsotonicRegression copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.IsotonicRegressionModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
