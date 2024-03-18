package org.apache.spark.ml.feature;
/**
 * Feature selector that removes all low-variance features. Features with a
 * variance not greater than the threshold will be removed. The default is to keep
 * all features with non-zero variance, i.e. remove the features that have the
 * same value in all samples.
 */
public final class VarianceThresholdSelector extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.VarianceThresholdSelectorModel> implements org.apache.spark.ml.feature.VarianceThresholdSelectorParams, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.VarianceThresholdSelector load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam varianceThreshold ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   VarianceThresholdSelector (java.lang.String uid)  { throw new RuntimeException(); }
  public   VarianceThresholdSelector ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VarianceThresholdSelector setVarianceThreshold (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VarianceThresholdSelector setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VarianceThresholdSelector setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.VarianceThresholdSelectorModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.VarianceThresholdSelector copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
