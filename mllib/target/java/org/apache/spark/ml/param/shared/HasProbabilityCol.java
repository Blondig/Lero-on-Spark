package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param probabilityCol (default: "probability"). This trait may be changed or
 * removed between minor versions.
 */
public  interface HasProbabilityCol extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  java.lang.String getProbabilityCol ()  ;
  /**
   * Param for Column name for predicted class conditional probabilities. Note: Not all models output well-calibrated probability estimates! These probabilities should be treated as confidences, not precise probabilities.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> probabilityCol ()  ;
}
