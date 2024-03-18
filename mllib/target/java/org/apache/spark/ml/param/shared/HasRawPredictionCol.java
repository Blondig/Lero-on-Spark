package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param rawPredictionCol (default: "rawPrediction"). This trait may be changed or
 * removed between minor versions.
 */
public  interface HasRawPredictionCol extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  java.lang.String getRawPredictionCol ()  ;
  /**
   * Param for raw prediction (a.k.a. confidence) column name.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> rawPredictionCol ()  ;
}
