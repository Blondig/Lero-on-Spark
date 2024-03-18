package org.apache.spark.ml.feature;
/**
 * Scale features using statistics that are robust to outliers.
 * RobustScaler removes the median and scales the data according to the quantile range.
 * The quantile range is by default IQR (Interquartile Range, quantile range between the
 * 1st quartile = 25th quantile and the 3rd quartile = 75th quantile) but can be configured.
 * Centering and scaling happen independently on each feature by computing the relevant
 * statistics on the samples in the training set. Median and quantile range are then
 * stored to be used on later data using the transform method.
 * Standardization of a dataset is a common requirement for many machine learning estimators.
 * Typically this is done by removing the mean and scaling to unit variance. However,
 * outliers can often influence the sample mean / variance in a negative way.
 * In such cases, the median and the quantile range often give better results.
 * Note that NaN values are ignored in the computation of medians and ranges.
 */
public  class RobustScaler extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.RobustScalerModel> implements org.apache.spark.ml.feature.RobustScalerParams, org.apache.spark.ml.util.DefaultParamsWritable {
  static   org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.sql.catalyst.util.QuantileSummaries>> computeSummaries (org.apache.spark.rdd.RDD<org.apache.spark.ml.linalg.Vector> vectors, int numFeatures, double relativeError)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.RobustScaler load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam lower ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam upper ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.BooleanParam withCentering ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.BooleanParam withScaling ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam relativeError ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   RobustScaler (java.lang.String uid)  { throw new RuntimeException(); }
  public   RobustScaler ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RobustScaler setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RobustScaler setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RobustScaler setLower (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RobustScaler setUpper (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RobustScaler setWithCentering (boolean value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RobustScaler setWithScaling (boolean value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.feature.RobustScaler setRelativeError (double value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.RobustScalerModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.RobustScaler copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
