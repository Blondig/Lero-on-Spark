package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param distanceMeasure (default: "euclidean"). This trait may be changed or
 * removed between minor versions.
 */
public  interface HasDistanceMeasure extends org.apache.spark.ml.param.Params {
  /**
   * Param for The distance measure. Supported options: 'euclidean' and 'cosine'.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> distanceMeasure ()  ;
  /** @group getParam */
  public  java.lang.String getDistanceMeasure ()  ;
}
