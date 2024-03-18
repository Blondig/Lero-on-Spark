package org.apache.spark.mllib.util;
public  class TestingUtils {
  static public  class CompareDoubleRightSide implements scala.Product, scala.Serializable {
    public  scala.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> fun ()  { throw new RuntimeException(); }
    public  double y ()  { throw new RuntimeException(); }
    public  double eps ()  { throw new RuntimeException(); }
    public  java.lang.String method ()  { throw new RuntimeException(); }
    // not preceding
    public   CompareDoubleRightSide (scala.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> fun, double y, double eps, java.lang.String method)  { throw new RuntimeException(); }
  }
  static public  class CompareDoubleRightSide$ extends scala.runtime.AbstractFunction4<scala.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object>, java.lang.Object, java.lang.Object, java.lang.String, org.apache.spark.mllib.util.TestingUtils.CompareDoubleRightSide> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CompareDoubleRightSide$ MODULE$ = null;
    public   CompareDoubleRightSide$ ()  { throw new RuntimeException(); }
  }
  static public  class CompareVectorRightSide implements scala.Product, scala.Serializable {
    public  scala.Function3<org.apache.spark.mllib.linalg.Vector, org.apache.spark.mllib.linalg.Vector, java.lang.Object, java.lang.Object> fun ()  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.linalg.Vector y ()  { throw new RuntimeException(); }
    public  double eps ()  { throw new RuntimeException(); }
    public  java.lang.String method ()  { throw new RuntimeException(); }
    // not preceding
    public   CompareVectorRightSide (scala.Function3<org.apache.spark.mllib.linalg.Vector, org.apache.spark.mllib.linalg.Vector, java.lang.Object, java.lang.Object> fun, org.apache.spark.mllib.linalg.Vector y, double eps, java.lang.String method)  { throw new RuntimeException(); }
  }
  static public  class CompareVectorRightSide$ extends scala.runtime.AbstractFunction4<scala.Function3<org.apache.spark.mllib.linalg.Vector, org.apache.spark.mllib.linalg.Vector, java.lang.Object, java.lang.Object>, org.apache.spark.mllib.linalg.Vector, java.lang.Object, java.lang.String, org.apache.spark.mllib.util.TestingUtils.CompareVectorRightSide> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CompareVectorRightSide$ MODULE$ = null;
    public   CompareVectorRightSide$ ()  { throw new RuntimeException(); }
  }
  static public  class CompareMatrixRightSide implements scala.Product, scala.Serializable {
    public  scala.Function3<org.apache.spark.mllib.linalg.Matrix, org.apache.spark.mllib.linalg.Matrix, java.lang.Object, java.lang.Object> fun ()  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.linalg.Matrix y ()  { throw new RuntimeException(); }
    public  double eps ()  { throw new RuntimeException(); }
    public  java.lang.String method ()  { throw new RuntimeException(); }
    // not preceding
    public   CompareMatrixRightSide (scala.Function3<org.apache.spark.mllib.linalg.Matrix, org.apache.spark.mllib.linalg.Matrix, java.lang.Object, java.lang.Object> fun, org.apache.spark.mllib.linalg.Matrix y, double eps, java.lang.String method)  { throw new RuntimeException(); }
  }
  static public  class CompareMatrixRightSide$ extends scala.runtime.AbstractFunction4<scala.Function3<org.apache.spark.mllib.linalg.Matrix, org.apache.spark.mllib.linalg.Matrix, java.lang.Object, java.lang.Object>, org.apache.spark.mllib.linalg.Matrix, java.lang.Object, java.lang.String, org.apache.spark.mllib.util.TestingUtils.CompareMatrixRightSide> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CompareMatrixRightSide$ MODULE$ = null;
    public   CompareMatrixRightSide$ ()  { throw new RuntimeException(); }
  }
  /**
   * Implicit class for comparing two double values using relative tolerance or absolute tolerance.
   */
  static public  class DoubleWithAlmostEquals {
    // not preceding
    public   DoubleWithAlmostEquals (double x)  { throw new RuntimeException(); }
    /**
     * Comparison using absolute tolerance.
     * @param eps (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.mllib.util.TestingUtils.CompareDoubleRightSide absTol (double eps)  { throw new RuntimeException(); }
    /**
     * Comparison using relative tolerance.
     * @param eps (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.mllib.util.TestingUtils.CompareDoubleRightSide relTol (double eps)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  double x ()  { throw new RuntimeException(); }
  }
  /**
   * Implicit class for comparing two vectors using relative tolerance or absolute tolerance.
   */
  static public  class VectorWithAlmostEquals {
    // not preceding
    public   VectorWithAlmostEquals (org.apache.spark.mllib.linalg.Vector x)  { throw new RuntimeException(); }
    /**
     * Comparison using absolute tolerance.
     * @param eps (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.mllib.util.TestingUtils.CompareVectorRightSide absTol (double eps)  { throw new RuntimeException(); }
    /**
     * Comparison using relative tolerance. Note that comparing against sparse vector
     * with elements having value of zero will raise exception because it involves with
     * comparing against zero.
     * @param eps (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.mllib.util.TestingUtils.CompareVectorRightSide relTol (double eps)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.linalg.Vector x ()  { throw new RuntimeException(); }
  }
  /**
   * Implicit class for comparing two matrices using relative tolerance or absolute tolerance.
   */
  static public  class MatrixWithAlmostEquals {
    // not preceding
    public   MatrixWithAlmostEquals (org.apache.spark.mllib.linalg.Matrix x)  { throw new RuntimeException(); }
    /**
     * Comparison using absolute tolerance.
     * @param eps (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.mllib.util.TestingUtils.CompareMatrixRightSide absTol (double eps)  { throw new RuntimeException(); }
    /**
     * Comparison using relative tolerance. Note that comparing against sparse vector
     * with elements having value of zero will raise exception because it involves with
     * comparing against zero.
     * @param eps (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.mllib.util.TestingUtils.CompareMatrixRightSide relTol (double eps)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.linalg.Matrix x ()  { throw new RuntimeException(); }
  }
  static public  java.lang.String ABS_TOL_MSG ()  { throw new RuntimeException(); }
  static public  java.lang.String REL_TOL_MSG ()  { throw new RuntimeException(); }
}
