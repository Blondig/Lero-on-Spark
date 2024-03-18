package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param fitIntercept (default: true). This trait may be changed or
 * removed between minor versions.
 */
public  interface HasFitIntercept extends org.apache.spark.ml.param.Params {
  /**
   * Param for whether to fit an intercept term.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam fitIntercept ()  ;
  /** @group getParam */
  public  boolean getFitIntercept ()  ;
}
