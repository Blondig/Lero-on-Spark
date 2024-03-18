package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param thresholds. This trait may be changed or
 * removed between minor versions.
 */
public  interface HasThresholds extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  double[] getThresholds ()  ;
  /**
   * Param for Thresholds in multi-class classification to adjust the probability of predicting each class. Array must have length equal to the number of classes, with values &amp;gt; 0 excepting that at most one value may be 0. The class with largest value p/t is predicted, where p is the original probability of that class and t is the class's threshold.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleArrayParam thresholds ()  ;
}
