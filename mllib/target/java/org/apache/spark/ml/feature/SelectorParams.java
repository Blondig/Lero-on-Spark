package org.apache.spark.ml.feature;
/**
 * Params for {@link Selector} and {@link SelectorModel}.
 */
public  interface SelectorParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasFeaturesCol, org.apache.spark.ml.param.shared.HasLabelCol, org.apache.spark.ml.param.shared.HasOutputCol {
  /**
   * The upper bound of the expected false discovery rate.
   * Only applicable when selectorType = "fdr".
   * Default value is 0.05.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam fdr ()  ;
  /**
   * The highest p-value for features to be kept.
   * Only applicable when selectorType = "fpr".
   * Default value is 0.05.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam fpr ()  ;
  /**
   * The upper bound of the expected family-wise error rate.
   * Only applicable when selectorType = "fwe".
   * Default value is 0.05.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam fwe ()  ;
  /** @group getParam */
  public  double getFdr ()  ;
  /** @group getParam */
  public  double getFpr ()  ;
  /** @group getParam */
  public  double getFwe ()  ;
  /** @group getParam */
  public  int getNumTopFeatures ()  ;
  /** @group getParam */
  public  double getPercentile ()  ;
  /** @group getParam */
  public  java.lang.String getSelectorType ()  ;
  /**
   * Number of features that selector will select, ordered by ascending p-value. If the
   * number of features is less than numTopFeatures, then this will select all features.
   * Only applicable when selectorType = "numTopFeatures".
   * The default value of numTopFeatures is 50.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numTopFeatures ()  ;
  /**
   * Percentile of features that selector will select, ordered by ascending p-value.
   * Only applicable when selectorType = "percentile".
   * Default value is 0.1.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam percentile ()  ;
  /**
   * The selector type.
   * Supported options: "numTopFeatures" (default), "percentile", "fpr", "fdr", "fwe"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> selectorType ()  ;
}
