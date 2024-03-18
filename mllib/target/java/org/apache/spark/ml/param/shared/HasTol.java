package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param tol. This trait may be changed or
 * removed between minor versions.
 */
public  interface HasTol extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  double getTol ()  ;
  /**
   * Param for the convergence tolerance for iterative algorithms (&amp;gt;= 0).
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam tol ()  ;
}
