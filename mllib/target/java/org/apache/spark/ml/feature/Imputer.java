package org.apache.spark.ml.feature;
/**
 * Imputation estimator for completing missing values, using the mean, median or mode
 * of the columns in which the missing values are located. The input columns should be of
 * numeric type. Currently Imputer does not support categorical features
 * (SPARK-15041) and possibly creates incorrect values for a categorical feature.
 * <p>
 * Note when an input column is integer, the imputed value is casted (truncated) to an integer type.
 * For example, if the input column is IntegerType (1, 2, 4, null),
 * the output will be IntegerType (1, 2, 4, 2) after mean imputation.
 * <p>
 * Note that the mean/median/mode value is computed after filtering out missing values.
 * All Null values in the input columns are treated as missing, and so are also imputed. For
 * computing median, DataFrameStatFunctions.approxQuantile is used with a relative error of 0.001.
 */
public  class Imputer extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.ImputerModel> implements org.apache.spark.ml.feature.ImputerParams, org.apache.spark.ml.util.DefaultParamsWritable {
  /** strategy names that Imputer currently supports. */
  static   java.lang.String mean ()  { throw new RuntimeException(); }
  static   java.lang.String median ()  { throw new RuntimeException(); }
  static   java.lang.String mode ()  { throw new RuntimeException(); }
  static   java.lang.String[] supportedStrategies ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.Imputer load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> strategy ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam missingValue ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam relativeError ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.StringArrayParam outputCols ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.StringArrayParam inputCols ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   Imputer (java.lang.String uid)  { throw new RuntimeException(); }
  public   Imputer ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Imputer setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Imputer setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Imputer setInputCols (java.lang.String[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Imputer setOutputCols (java.lang.String[] value)  { throw new RuntimeException(); }
  /**
   * Imputation strategy. Available options are ["mean", "median", "mode"].
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.feature.Imputer setStrategy (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Imputer setMissingValue (double value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.feature.Imputer setRelativeError (double value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.ImputerModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Imputer copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
