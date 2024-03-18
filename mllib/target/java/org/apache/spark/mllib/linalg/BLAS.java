package org.apache.spark.mllib.linalg;
/**
 * BLAS routines for MLlib's vectors and matrices.
 */
public  class BLAS {
  static   dev.ludovic.netlib.BLAS javaBLAS ()  { throw new RuntimeException(); }
  static   dev.ludovic.netlib.BLAS nativeBLAS ()  { throw new RuntimeException(); }
  static   dev.ludovic.netlib.BLAS getBLAS (int vectorSize)  { throw new RuntimeException(); }
  /**
   * y += a * x
   * @param a (undocumented)
   * @param x (undocumented)
   * @param y (undocumented)
   */
  static public  void axpy (double a, org.apache.spark.mllib.linalg.Vector x, org.apache.spark.mllib.linalg.Vector y)  { throw new RuntimeException(); }
  /** Y += a * x */
  static   void axpy (double a, org.apache.spark.mllib.linalg.DenseMatrix X, org.apache.spark.mllib.linalg.DenseMatrix Y)  { throw new RuntimeException(); }
  /**
   * dot(x, y)
   * @param x (undocumented)
   * @param y (undocumented)
   * @return (undocumented)
   */
  static public  double dot (org.apache.spark.mllib.linalg.Vector x, org.apache.spark.mllib.linalg.Vector y)  { throw new RuntimeException(); }
  /**
   * y = x
   * @param x (undocumented)
   * @param y (undocumented)
   */
  static public  void copy (org.apache.spark.mllib.linalg.Vector x, org.apache.spark.mllib.linalg.Vector y)  { throw new RuntimeException(); }
  /**
   * x = a * x
   * @param a (undocumented)
   * @param x (undocumented)
   */
  static public  void scal (double a, org.apache.spark.mllib.linalg.Vector x)  { throw new RuntimeException(); }
  /**
   * Adds alpha * v * v.t to a matrix in-place. This is the same as BLAS's ?SPR.
   * <p>
   * @param U the upper triangular part of the matrix in a {@link DenseVector}(column major)
   * @param alpha (undocumented)
   * @param v (undocumented)
   */
  static public  void spr (double alpha, org.apache.spark.mllib.linalg.Vector v, org.apache.spark.mllib.linalg.DenseVector U)  { throw new RuntimeException(); }
  /**
   * Adds alpha * v * v.t to a matrix in-place. This is the same as BLAS's ?SPR.
   * <p>
   * @param U the upper triangular part of the matrix packed in an array (column major)
   * @param alpha (undocumented)
   * @param v (undocumented)
   */
  static public  void spr (double alpha, org.apache.spark.mllib.linalg.Vector v, double[] U)  { throw new RuntimeException(); }
  /**
   * A := alpha * x * x^T^ + A
   * @param alpha a real scalar that will be multiplied to x * x^T^.
   * @param x the vector x that contains the n elements.
   * @param A the symmetric matrix A. Size of n x n.
   */
  static public  void syr (double alpha, org.apache.spark.mllib.linalg.Vector x, org.apache.spark.mllib.linalg.DenseMatrix A)  { throw new RuntimeException(); }
  /**
   * C := alpha * A * B + beta * C
   * @param alpha a scalar to scale the multiplication A * B.
   * @param A the matrix A that will be left multiplied to B. Size of m x k.
   * @param B the matrix B that will be left multiplied by A. Size of k x n.
   * @param beta a scalar that can be used to scale matrix C.
   * @param C the resulting matrix C. Size of m x n. C.isTransposed must be false.
   */
  static public  void gemm (double alpha, org.apache.spark.mllib.linalg.Matrix A, org.apache.spark.mllib.linalg.DenseMatrix B, double beta, org.apache.spark.mllib.linalg.DenseMatrix C)  { throw new RuntimeException(); }
  /**
   * y := alpha * A * x + beta * y
   * @param alpha a scalar to scale the multiplication A * x.
   * @param A the matrix A that will be left multiplied to x. Size of m x n.
   * @param x the vector x that will be left multiplied by A. Size of n x 1.
   * @param beta a scalar that can be used to scale vector y.
   * @param y the resulting vector y. Size of m x 1.
   */
  static public  void gemv (double alpha, org.apache.spark.mllib.linalg.Matrix A, org.apache.spark.mllib.linalg.Vector x, double beta, org.apache.spark.mllib.linalg.DenseVector y)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
}
