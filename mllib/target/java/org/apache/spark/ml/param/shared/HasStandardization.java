package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param standardization (default: true). This trait may be changed or
 * removed between minor versions.
 */
public  interface HasStandardization extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  boolean getStandardization ()  ;
  /**
   * Param for whether to standardize the training features before fitting the model.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam standardization ()  ;
}
