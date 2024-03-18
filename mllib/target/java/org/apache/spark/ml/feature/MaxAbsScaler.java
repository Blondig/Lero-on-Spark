package org.apache.spark.ml.feature;
/**
 * Rescale each feature individually to range [-1, 1] by dividing through the largest maximum
 * absolute value in each feature. It does not shift/center the data, and thus does not destroy
 * any sparsity.
 */
public  class MaxAbsScaler extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.MaxAbsScalerModel> implements org.apache.spark.ml.feature.MaxAbsScalerParams, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.MaxAbsScaler load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   MaxAbsScaler (java.lang.String uid)  { throw new RuntimeException(); }
  public   MaxAbsScaler ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MaxAbsScaler setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MaxAbsScaler setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.MaxAbsScalerModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.MaxAbsScaler copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
