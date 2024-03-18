package org.apache.spark.mllib.evaluation;
/**
 * Computes the area under the curve (AUC) using the trapezoidal rule.
 */
public  class AreaUnderCurve$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AreaUnderCurve$ MODULE$ = null;
  public   AreaUnderCurve$ ()  { throw new RuntimeException(); }
  /**
   * Returns the area under the given curve.
   * <p>
   * @param curve an RDD of ordered 2D points stored in pairs representing a curve
   * @return (undocumented)
   */
  public  double of (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> curve)  { throw new RuntimeException(); }
  /**
   * Returns the area under the given curve.
   * <p>
   * @param curve an iterator over ordered 2D points stored in pairs representing a curve
   * @return (undocumented)
   */
  public  double of (scala.collection.Iterable<scala.Tuple2<java.lang.Object, java.lang.Object>> curve)  { throw new RuntimeException(); }
}
