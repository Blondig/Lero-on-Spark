package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param regParam. This trait may be changed or
 * removed between minor versions.
 */
public  interface HasRegParam extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  double getRegParam ()  ;
  /**
   * Param for regularization parameter (&amp;gt;= 0).
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam regParam ()  ;
}
