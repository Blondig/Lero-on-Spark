package org.apache.spark.ml.param;
/**
 * Factory methods for common validation functions for <code>Param.isValid</code>.
 * The numerical methods only support Int, Long, Float, and Double.
 */
public  class ParamValidators$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ParamValidators$ MODULE$ = null;
  public   ParamValidators$ ()  { throw new RuntimeException(); }
  /** (private[param]) Default validation always return true */
   <T extends java.lang.Object> scala.Function1<T, java.lang.Object> alwaysTrue ()  { throw new RuntimeException(); }
  /**
   * Check if value is greater than lowerBound
   * @param lowerBound (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> gt (double lowerBound)  { throw new RuntimeException(); }
  /**
   * Check if value is greater than or equal to lowerBound
   * @param lowerBound (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> gtEq (double lowerBound)  { throw new RuntimeException(); }
  /**
   * Check if value is less than upperBound
   * @param upperBound (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> lt (double upperBound)  { throw new RuntimeException(); }
  /**
   * Check if value is less than or equal to upperBound
   * @param upperBound (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> ltEq (double upperBound)  { throw new RuntimeException(); }
  /**
   * Check for value in range lowerBound to upperBound.
   * <p>
   * @param lowerInclusive if true, range includes value = lowerBound
   * @param upperInclusive if true, range includes value = upperBound
   * @param lowerBound (undocumented)
   * @param upperBound (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> inRange (double lowerBound, double upperBound, boolean lowerInclusive, boolean upperInclusive)  { throw new RuntimeException(); }
  /** Version of `inRange()` which uses inclusive be default: [lowerBound, upperBound] */
  public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> inRange (double lowerBound, double upperBound)  { throw new RuntimeException(); }
  /** Check for value in an allowed set of values. */
  public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> inArray (java.lang.Object allowed)  { throw new RuntimeException(); }
  /** Check for value in an allowed set of values. */
  public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> inArray (java.util.List<T> allowed)  { throw new RuntimeException(); }
  /** Check that the array length is greater than lowerBound. */
  public <T extends java.lang.Object> scala.Function1<java.lang.Object, java.lang.Object> arrayLengthGt (double lowerBound)  { throw new RuntimeException(); }
  /**
   * Utility for Param validity checks for Transformers which have both single- and multi-column
   * support.  This utility assumes that <code>inputCol</code> indicates single-column usage and
   * that <code>inputCols</code> indicates multi-column usage.
   * <p>
   * This checks to ensure that exactly one set of Params has been set, and it
   * raises an <code>IllegalArgumentException</code> if not.
   * <p>
   * @param singleColumnParams Params which should be set (or have defaults) if <code>inputCol</code> has been
   *                           set.  This does not need to include <code>inputCol</code>.
   * @param multiColumnParams Params which should be set (or have defaults) if <code>inputCols</code> has been
   *                           set.  This does not need to include <code>inputCols</code>.
   * @param model (undocumented)
   */
  public  void checkSingleVsMultiColumnParams (org.apache.spark.ml.param.Params model, scala.collection.Seq<org.apache.spark.ml.param.Param<?>> singleColumnParams, scala.collection.Seq<org.apache.spark.ml.param.Param<?>> multiColumnParams)  { throw new RuntimeException(); }
}
