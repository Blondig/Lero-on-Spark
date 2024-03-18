package org.apache.spark.ml.feature;
/** Private trait for params for VectorIndexer and VectorIndexerModel */
public  interface VectorIndexerParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.param.shared.HasHandleInvalid {
  /** @group getParam */
  public  int getMaxCategories ()  ;
  /**
   * Param for how to handle invalid data (unseen labels or NULL values).
   * Note: this param only applies to categorical features, not continuous ones.
   * Options are:
   * 'skip': filter out rows with invalid data.
   * 'error': throw an error.
   * 'keep': put invalid data in a special additional bucket, at index of the number of
   * categories of the feature.
   * Default value: "error"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  ;
  /**
   * Threshold for the number of values a categorical feature can take.
   * If a feature is found to have {@literal >} maxCategories values, then it is declared
   * continuous. Must be greater than or equal to 2.
   * <p>
   * (default = 20)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam maxCategories ()  ;
}
