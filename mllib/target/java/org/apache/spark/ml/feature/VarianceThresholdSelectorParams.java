package org.apache.spark.ml.feature;
/**
 * Params for {@link VarianceThresholdSelector} and {@link VarianceThresholdSelectorModel}.
 */
public  interface VarianceThresholdSelectorParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasFeaturesCol, org.apache.spark.ml.param.shared.HasOutputCol {
  /** @group getParam */
  public  double getVarianceThreshold ()  ;
  /**
   * Param for variance threshold. Features with a variance not greater than this threshold
   * will be removed. The default value is 0.0.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam varianceThreshold ()  ;
}
