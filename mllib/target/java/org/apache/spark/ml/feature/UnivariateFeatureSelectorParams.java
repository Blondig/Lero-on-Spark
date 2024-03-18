package org.apache.spark.ml.feature;
/**
 * Params for {@link UnivariateFeatureSelector} and {@link UnivariateFeatureSelectorModel}.
 */
public  interface UnivariateFeatureSelectorParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasFeaturesCol, org.apache.spark.ml.param.shared.HasLabelCol, org.apache.spark.ml.param.shared.HasOutputCol {
  /**
   * The feature type.
   * Supported options: "categorical", "continuous"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> featureType ()  ;
  /** @group getParam */
  public  java.lang.String getFeatureType ()  ;
  /** @group getParam */
  public  java.lang.String getLabelType ()  ;
  /** @group getParam */
  public  java.lang.String getSelectionMode ()  ;
  /** @group getParam */
  public  double getSelectionThreshold ()  ;
  /**
   * The label type.
   * Supported options: "categorical", "continuous"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> labelType ()  ;
  /**
   * The selection mode.
   * Supported options: "numTopFeatures" (default), "percentile", "fpr", "fdr", "fwe"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> selectionMode ()  ;
  /**
   * The upper bound of the features that selector will select.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam selectionThreshold ()  ;
}
