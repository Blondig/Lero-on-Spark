package org.apache.spark.ml.feature;
/**
 * Standardizes features by removing the mean and scaling to unit variance using column summary
 * statistics on the samples in the training set.
 * <p>
 * The "unit std" is computed using the
 * <a href="https://en.wikipedia.org/wiki/Standard_deviation#Corrected_sample_standard_deviation">
 * corrected sample standard deviation</a>,
 * which is computed as the square root of the unbiased sample variance.
 */
public  class StandardScaler extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.StandardScalerModel> implements org.apache.spark.ml.feature.StandardScalerParams, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.StandardScaler load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.BooleanParam withMean ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.BooleanParam withStd ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   StandardScaler (java.lang.String uid)  { throw new RuntimeException(); }
  public   StandardScaler ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StandardScaler setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StandardScaler setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StandardScaler setWithMean (boolean value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StandardScaler setWithStd (boolean value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StandardScalerModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StandardScaler copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
