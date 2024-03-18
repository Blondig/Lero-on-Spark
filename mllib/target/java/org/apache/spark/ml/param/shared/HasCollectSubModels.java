package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param collectSubModels (default: false). This trait may be changed or
 * removed between minor versions.
 */
public  interface HasCollectSubModels extends org.apache.spark.ml.param.Params {
  /**
   * Param for whether to collect a list of sub-models trained during tuning. If set to false, then only the single best sub-model will be available after fitting. If set to true, then all sub-models will be available. Warning: For large models, collecting all sub-models can cause OOMs on the Spark driver.
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam collectSubModels ()  ;
  /** @group expertGetParam */
  public  boolean getCollectSubModels ()  ;
}
