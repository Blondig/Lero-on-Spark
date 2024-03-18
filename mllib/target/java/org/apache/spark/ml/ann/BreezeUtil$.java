package org.apache.spark.ml.ann;
/**
 * In-place DGEMM and DGEMV for Breeze
 */
public  class BreezeUtil$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BreezeUtil$ MODULE$ = null;
  public   BreezeUtil$ ()  { throw new RuntimeException(); }
  /**
   * DGEMM: C := alpha * A * B + beta * C
   * @param alpha alpha
   * @param A A
   * @param B B
   * @param beta beta
   * @param C C
   */
  public  void dgemm (double alpha, breeze.linalg.DenseMatrix<java.lang.Object> A, breeze.linalg.DenseMatrix<java.lang.Object> B, double beta, breeze.linalg.DenseMatrix<java.lang.Object> C)  { throw new RuntimeException(); }
  /**
   * DGEMV: y := alpha * A * x + beta * y
   * @param alpha alpha
   * @param A A
   * @param x x
   * @param beta beta
   * @param y y
   */
  public  void dgemv (double alpha, breeze.linalg.DenseMatrix<java.lang.Object> A, breeze.linalg.DenseVector<java.lang.Object> x, double beta, breeze.linalg.DenseVector<java.lang.Object> y)  { throw new RuntimeException(); }
}
