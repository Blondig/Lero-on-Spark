package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param validationIndicatorCol. This trait may be changed or
 * removed between minor versions.
 */
public  interface HasValidationIndicatorCol extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  java.lang.String getValidationIndicatorCol ()  ;
  /**
   * Param for name of the column that indicates whether each row is for training or for validation. False indicates training; true indicates validation..
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> validationIndicatorCol ()  ;
}
