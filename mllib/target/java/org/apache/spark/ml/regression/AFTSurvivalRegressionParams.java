package org.apache.spark.ml.regression;
/**
 * Params for accelerated failure time (AFT) regression.
 */
public  interface AFTSurvivalRegressionParams extends org.apache.spark.ml.PredictorParams, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasTol, org.apache.spark.ml.param.shared.HasFitIntercept, org.apache.spark.ml.param.shared.HasAggregationDepth, org.apache.spark.ml.param.shared.HasMaxBlockSizeInMB, org.apache.spark.internal.Logging {
  /**
   * Param for censor column name.
   * The value of this column could be 0 or 1.
   * If the value is 1, it means the event has occurred i.e. uncensored; otherwise censored.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> censorCol ()  ;
  /** @group getParam */
  public  java.lang.String getCensorCol ()  ;
  /** @group getParam */
  public  double[] getQuantileProbabilities ()  ;
  /** @group getParam */
  public  java.lang.String getQuantilesCol ()  ;
  /** Checks whether the input has quantiles column name. */
    boolean hasQuantilesCol ()  ;
  /**
   * Param for quantile probabilities array.
   * Values of the quantile probabilities array should be in the range (0, 1)
   * and the array should be non-empty.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleArrayParam quantileProbabilities ()  ;
  /**
   * Param for quantiles column name.
   * This column will output quantiles of corresponding quantileProbabilities if it is set.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> quantilesCol ()  ;
  /**
   * Validates and transforms the input schema with the provided param map.
   * @param schema input schema
   * @param fitting whether this is in fitting or prediction
   * @return output schema
   */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting)  ;
}
