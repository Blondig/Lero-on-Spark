package org.apache.spark.ml.tuning;
/**
 * Params for {@link CrossValidator} and {@link CrossValidatorModel}.
 */
public  interface CrossValidatorParams extends org.apache.spark.ml.tuning.ValidatorParams {
  /**
   * Param for the column name of user specified fold number. Once this is specified,
   * <code>CrossValidator</code> won't do random k-fold split. Note that this column should be
   * integer type with range [0, numFolds) and Spark will throw exception on out-of-range
   * fold numbers.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> foldCol ()  ;
  public  java.lang.String getFoldCol ()  ;
  /** @group getParam */
  public  int getNumFolds ()  ;
  /**
   * Param for number of folds for cross validation.  Must be &amp;gt;= 2.
   * Default: 3
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numFolds ()  ;
}
