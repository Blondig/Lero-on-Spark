package org.apache.spark.ml.linalg;
/**
 * Trait for a local matrix.
 */
public  interface Matrix extends scala.Serializable {
  /** Gets the (i, j)-th element. */
  public  double apply (int i, int j)  ;
  /** Converts to a breeze matrix. */
    breeze.linalg.Matrix<java.lang.Object> asBreeze ()  ;
  /**
   * Returns an iterator of column vectors.
   * This operation could be expensive, depending on the underlying storage.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.ml.linalg.Vector> colIter ()  ;
  /**
   * Returns a matrix in dense column major, dense row major, sparse row major, or sparse column
   * major format, whichever uses less storage. When dense representation is optimal, it maintains
   * the current layout order.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Matrix compressed ()  ;
  /**
   * Returns a matrix in dense or sparse column major format, whichever uses less storage.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Matrix compressedColMajor ()  ;
  /**
   * Returns a matrix in dense or sparse row major format, whichever uses less storage.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Matrix compressedRowMajor ()  ;
  /** Get a deep copy of the matrix. */
  public  org.apache.spark.ml.linalg.Matrix copy ()  ;
  /**
   * Applies a function <code>f</code> to all the active elements of dense and sparse matrix. The ordering
   * of the elements are not defined.
   * <p>
   * @param f the function takes three parameters where the first two parameters are the row
   *          and column indices respectively with the type <code>Int</code>, and the final parameter is the
   *          corresponding value in the matrix with type <code>Double</code>.
   */
  public  void foreachActive (scala.Function3<java.lang.Object, java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> f)  ;
  /** Gets the size of the dense representation of this `Matrix`. */
    long getDenseSizeInBytes ()  ;
  /** Gets the current size in bytes of this `Matrix`. Useful for testing */
    long getSizeInBytes ()  ;
  /** Gets the size of the minimal sparse representation of this `Matrix`. */
    long getSparseSizeInBytes (boolean colMajor)  ;
  /** Return the index for the (i, j)-th element in the backing array. */
    int index (int i, int j)  ;
  /** Indicates whether the values backing this matrix are arranged in column major order. */
    boolean isColMajor ()  ;
  /** Indicates whether the values backing this matrix are arranged in row major order. */
    boolean isRowMajor ()  ;
  /** Flag that keeps track whether the matrix is transposed or not. False by default. */
  public  boolean isTransposed ()  ;
  /**
   * Map the values of this matrix using a function. Generates a new matrix. Performs the
   * function on only the backing array. For example, an operation such as addition or
   * subtraction will only be performed on the non-zero values in a <code>SparseMatrix</code>.
   * @param f (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.ml.linalg.Matrix map (scala.Function1<java.lang.Object, java.lang.Object> f)  ;
  /**
   * Convenience method for <code>Matrix</code>-<code>DenseMatrix</code> multiplication.
   * @param y (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.DenseMatrix multiply (org.apache.spark.ml.linalg.DenseMatrix y)  ;
  /**
   * Convenience method for <code>Matrix</code>-<code>DenseVector</code> multiplication. For binary compatibility.
   * @param y (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.DenseVector multiply (org.apache.spark.ml.linalg.DenseVector y)  ;
  /**
   * Convenience method for <code>Matrix</code>-<code>Vector</code> multiplication.
   * @param y (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.DenseVector multiply (org.apache.spark.ml.linalg.Vector y)  ;
  /**
   * Find the number of values stored explicitly. These values can be zero as well.
   * @return (undocumented)
   */
  public  int numActives ()  ;
  /** Number of columns. */
  public  int numCols ()  ;
  /**
   * Find the number of non-zero active values.
   * @return (undocumented)
   */
  public  int numNonzeros ()  ;
  /** Number of rows. */
  public  int numRows ()  ;
  /**
   * Returns an iterator of row vectors.
   * This operation could be expensive, depending on the underlying storage.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.ml.linalg.Vector> rowIter ()  ;
  /** Converts to a dense array in column major. */
  public  double[] toArray ()  ;
  /**
   * Converts this matrix to a dense matrix while maintaining the layout of the current matrix.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.DenseMatrix toDense ()  ;
  /**
   * Converts this matrix to a dense matrix in column major order.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.DenseMatrix toDenseColMajor ()  ;
  /**
   * Converts this matrix to a dense matrix.
   * <p>
   * @param colMajor Whether the values of the resulting dense matrix should be in column major
   *                    or row major order. If <code>false</code>, resulting matrix will be row major.
   * @return (undocumented)
   */
    org.apache.spark.ml.linalg.DenseMatrix toDenseMatrix (boolean colMajor)  ;
  /**
   * Converts this matrix to a dense matrix in row major order.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.DenseMatrix toDenseRowMajor ()  ;
  /**
   * Converts this matrix to a sparse matrix while maintaining the layout of the current matrix.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.SparseMatrix toSparse ()  ;
  /**
   * Converts this matrix to a sparse matrix in column major order.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.SparseMatrix toSparseColMajor ()  ;
  /**
   * Converts this matrix to a sparse matrix.
   * <p>
   * @param colMajor Whether the values of the resulting sparse matrix should be in column major
   *                    or row major order. If <code>false</code>, resulting matrix will be row major.
   * @return (undocumented)
   */
    org.apache.spark.ml.linalg.SparseMatrix toSparseMatrix (boolean colMajor)  ;
  /**
   * Converts this matrix to a sparse matrix in row major order.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.SparseMatrix toSparseRowMajor ()  ;
  /** A human readable representation of the matrix */
  public  java.lang.String toString ()  ;
  /** A human readable representation of the matrix with maximum lines and width */
  public  java.lang.String toString (int maxLines, int maxLineWidth)  ;
  /**
   * Transpose the Matrix. Returns a new <code>Matrix</code> instance sharing the same underlying data.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Matrix transpose ()  ;
  /** Update element at (i, j) */
    void update (int i, int j, double v)  ;
  /**
   * Update all the values of this matrix using the function f. Performed in-place on the
   * backing array. For example, an operation such as addition or subtraction will only be
   * performed on the non-zero values in a <code>SparseMatrix</code>.
   * @param f (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.ml.linalg.Matrix update (scala.Function1<java.lang.Object, java.lang.Object> f)  ;
}
