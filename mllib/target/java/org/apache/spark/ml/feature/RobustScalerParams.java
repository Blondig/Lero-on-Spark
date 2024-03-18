package org.apache.spark.ml.feature;
/**
 * Params for {@link RobustScaler} and {@link RobustScalerModel}.
 */
public  interface RobustScalerParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.param.shared.HasRelativeError {
  /** @group getParam */
  public  double getLower ()  ;
  /** @group getParam */
  public  double getUpper ()  ;
  /** @group getParam */
  public  boolean getWithCentering ()  ;
  /** @group getParam */
  public  boolean getWithScaling ()  ;
  /**
   * Lower quantile to calculate quantile range, shared by all features
   * Default: 0.25
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam lower ()  ;
  /**
   * Upper quantile to calculate quantile range, shared by all features
   * Default: 0.75
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam upper ()  ;
  /** Validates and transforms the input schema. */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  ;
  /**
   * Whether to center the data with median before scaling.
   * It will build a dense output, so take care when applying to sparse input.
   * Default: false
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam withCentering ()  ;
  /**
   * Whether to scale the data to quantile range.
   * Default: true
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam withScaling ()  ;
}
