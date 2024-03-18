package org.apache.spark.ml.feature;
/**
 * Params for {@link MinMaxScaler} and {@link MinMaxScalerModel}.
 */
public  interface MinMaxScalerParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol {
  /** @group getParam */
  public  double getMax ()  ;
  /** @group getParam */
  public  double getMin ()  ;
  /**
   * upper bound after transformation, shared by all features
   * Default: 1.0
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam max ()  ;
  /**
   * lower bound after transformation, shared by all features
   * Default: 0.0
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam min ()  ;
  /** Validates and transforms the input schema. */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  ;
}
