package org.apache.spark.ml.impl;
public  class Utils {
  // not preceding
  static public  double EPSILON ()  { throw new RuntimeException(); }
  /**
   * Convert an n * (n + 1) / 2 dimension array representing the upper triangular part of a matrix
   * into an n * n array representing the full symmetric matrix (column major).
   * <p>
   * @param n The order of the n by n matrix.
   * @param triangularValues The upper triangular part of the matrix packed in an array
   *                         (column major).
   * @return A dense matrix which represents the symmetric matrix in column major.
   */
  static public  double[] unpackUpperTriangular (int n, double[] triangularValues)  { throw new RuntimeException(); }
  /**
   * Indexing in an array representing the upper triangular part of a matrix
   * into an n * n array representing the full symmetric matrix (column major).
   *    val symmetricValues = unpackUpperTriangularMatrix(n, triangularValues)
   *    val matrix = new DenseMatrix(n, n, symmetricValues)
   *    val index = indexUpperTriangularMatrix(n, i, j)
   *    then: symmetricValues(index) == matrix(i, j)
   * <p>
   * @param n The order of the n by n matrix.
   * @param i (undocumented)
   * @param j (undocumented)
   * @return (undocumented)
   */
  static public  int indexUpperTriangular (int n, int i, int j)  { throw new RuntimeException(); }
  /**
   * When <code>x</code> is positive and large, computing <code>math.log(1 + math.exp(x))</code> will lead to arithmetic
   * overflow. This will happen when <code>x &amp;gt; 709.78</code> which is not a very large number.
   * It can be addressed by rewriting the formula into <code>x + math.log1p(math.exp(-x))</code>
   * when <code>x</code> is positive.
   * @param x a floating-point value as input.
   * @return the result of <code>math.log(1 + math.exp(x))</code>.
   */
  static public  double log1pExp (double x)  { throw new RuntimeException(); }
  /**
   * Perform in-place softmax conversion.
   * @param array (undocumented)
   */
  static public  void softmax (double[] array)  { throw new RuntimeException(); }
  /**
   * Perform softmax conversion.
   * @param input (undocumented)
   * @param n (undocumented)
   * @param offset (undocumented)
   * @param step (undocumented)
   * @param output (undocumented)
   */
  static public  void softmax (double[] input, int n, int offset, int step, double[] output)  { throw new RuntimeException(); }
}
