package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param weightCol. This trait may be changed or
 * removed between minor versions.
 */
public  interface HasWeightCol extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  java.lang.String getWeightCol ()  ;
  /**
   * Param for weight column name. If this is not set or empty, we treat all instance weights as 1.0.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  ;
}
