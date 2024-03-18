package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param seed (default: this.getClass.getName.hashCode.toLong). This trait may be changed or
 * removed between minor versions.
 */
public  interface HasSeed extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  long getSeed ()  ;
  /**
   * Param for random seed.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.LongParam seed ()  ;
}
