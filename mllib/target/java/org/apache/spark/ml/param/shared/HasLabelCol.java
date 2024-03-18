package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param labelCol (default: "label"). This trait may be changed or
 * removed between minor versions.
 */
public  interface HasLabelCol extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  java.lang.String getLabelCol ()  ;
  /**
   * Param for label column name.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  ;
}
