package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param handleInvalid. This trait may be changed or
 * removed between minor versions.
 */
public  interface HasHandleInvalid extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  java.lang.String getHandleInvalid ()  ;
  /**
   * Param for how to handle invalid entries. Options are skip (which will filter out rows with bad values), or error (which will throw an error). More options may be added later.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  ;
}
