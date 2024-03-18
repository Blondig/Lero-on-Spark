package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param outputCols. This trait may be changed or
 * removed between minor versions.
 */
public  interface HasOutputCols extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  java.lang.String[] getOutputCols ()  ;
  /**
   * Param for output column names.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.StringArrayParam outputCols ()  ;
}
