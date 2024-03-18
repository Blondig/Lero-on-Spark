package org.apache.spark.ml.feature;
/**
 * Params for {@link Imputer} and {@link ImputerModel}.
 */
public  interface ImputerParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasInputCols, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.param.shared.HasOutputCols, org.apache.spark.ml.param.shared.HasRelativeError {
  /** Returns the input and output column names corresponding in pair. */
    scala.Tuple2<java.lang.String[], java.lang.String[]> getInOutCols ()  ;
  /** @group getParam */
  public  double getMissingValue ()  ;
  /** @group getParam */
  public  java.lang.String getStrategy ()  ;
  /**
   * The placeholder for the missing values. All occurrences of missingValue will be imputed.
   * Note that null values are always treated as missing.
   * Default: Double.NaN
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam missingValue ()  ;
  /**
   * The imputation strategy. Currently only "mean" and "median" are supported.
   * If "mean", then replace missing values using the mean value of the feature.
   * If "median", then replace missing values using the approximate median value of the feature.
   * If "mode", then replace missing using the most frequent value of the feature.
   * Default: mean
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> strategy ()  ;
  /** Validates and transforms the input schema. */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  ;
}
