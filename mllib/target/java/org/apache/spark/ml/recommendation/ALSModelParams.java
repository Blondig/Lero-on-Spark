package org.apache.spark.ml.recommendation;
/**
 * Common params for ALS and ALSModel.
 */
public  interface ALSModelParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasPredictionCol, org.apache.spark.ml.param.shared.HasBlockSize {
  /**
   * Attempts to safely cast a user/item id to an Int. Throws an exception if the value is
   * out of integer range or contains a fractional part.
   * @return (undocumented)
   */
    org.apache.spark.sql.expressions.UserDefinedFunction checkedCast ()  ;
  /**
   * Param for strategy for dealing with unknown or new users/items at prediction time.
   * This may be useful in cross-validation or production scenarios, for handling user/item ids
   * the model has not seen in the training data.
   * Supported values:
   * - "nan":  predicted value for unknown ids will be NaN.
   * - "drop": rows in the input DataFrame containing unknown ids will be dropped from
   *           the output DataFrame containing predictions.
   * Default: "nan".
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> coldStartStrategy ()  ;
  /** @group expertGetParam */
  public  java.lang.String getColdStartStrategy ()  ;
  /** @group getParam */
  public  java.lang.String getItemCol ()  ;
  /** @group getParam */
  public  java.lang.String getUserCol ()  ;
  /**
   * Param for the column name for item ids. Ids must be integers. Other
   * numeric types are supported for this column, but will be cast to integers as long as they
   * fall within the integer value range.
   * Default: "item"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> itemCol ()  ;
  /**
   * Param for the column name for user ids. Ids must be integers. Other
   * numeric types are supported for this column, but will be cast to integers as long as they
   * fall within the integer value range.
   * Default: "user"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> userCol ()  ;
}
