package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param stepSize. This trait may be changed or
 * removed between minor versions.
 */
public  interface HasStepSize extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  double getStepSize ()  ;
  /**
   * Param for Step size to be used for each iteration of optimization (&amp;gt; 0).
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam stepSize ()  ;
}
