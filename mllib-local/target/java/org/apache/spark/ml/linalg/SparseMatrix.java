package org.apache.spark.ml.linalg;
/**
 * Column-major sparse matrix.
 * The entry values are stored in Compressed Sparse Column (CSC) format.
 * For example, the following matrix
 * <pre><code>
 *   1.0 0.0 4.0
 *   0.0 3.0 5.0
 *   2.0 0.0 6.0
 * </code></pre>
 * is stored as <code>values: [1.0, 2.0, 3.0, 4.0, 5.0, 6.0]</code>,
 * <code>rowIndices=[0, 2, 1, 0, 1, 2]</code>, <code>colPointers=[0, 2, 3, 6]</code>.
 * <p>
 * param:  numRows number of rows
 * param:  numCols number of columns
 * param:  colPtrs the index corresponding to the start of a new column (if not transposed)
 * param:  rowIndices the row index of the entry (if not transposed). They must be in strictly
 *                   increasing order for each column
 * param:  values nonzero matrix entries in column major (if not transposed)
 * param:  isTransposed whether the matrix is transposed. If true, the matrix can be considered
 *                     Compressed Sparse Row (CSR) format, where <code>colPtrs</code> behaves as rowPtrs,
 *                     and <code>rowIndices</code> behave as colIndices, and <code>values</code> are stored in row major.
 */
public  class SparseMatrix implements org.apache.spark.ml.linalg.Matrix {
  static   scala.Option<scala.Tuple6<java.lang.Object, java.lang.Object, int[], int[], double[], java.lang.Object>> unapply (org.apache.spark.ml.linalg.SparseMatrix sm)  { throw new RuntimeException(); }
  /**
   * Generate a <code>SparseMatrix</code> from Coordinate List (COO) format. Input must be an array of
   * (i, j, value) tuples. Entries that have duplicate values of i and j are
   * added together. Tuples where value is equal to zero will be omitted.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @param entries Array of (i, j, value) tuples
   * @return The corresponding <code>SparseMatrix</code>
   */
  static public  org.apache.spark.ml.linalg.SparseMatrix fromCOO (int numRows, int numCols, scala.collection.Iterable<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> entries)  { throw new RuntimeException(); }
  /**
   * Generate an Identity Matrix in <code>SparseMatrix</code> format.
   * @param n number of rows and columns of the matrix
   * @return <code>SparseMatrix</code> with size <code>n</code> x <code>n</code> and values of ones on the diagonal
   */
  static public  org.apache.spark.ml.linalg.SparseMatrix speye (int n)  { throw new RuntimeException(); }
  /**
   * Generate a <code>SparseMatrix</code> consisting of <code>i.i.d</code>. uniform random numbers. The number of non-zero
   * elements equal the ceiling of <code>numRows</code> x <code>numCols</code> x <code>density</code>
   * <p>
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @param density the desired density for the matrix
   * @param rng a random number generator
   * @return <code>SparseMatrix</code> with size <code>numRows</code> x <code>numCols</code> and values in U(0, 1)
   */
  static public  org.apache.spark.ml.linalg.SparseMatrix sprand (int numRows, int numCols, double density, java.util.Random rng)  { throw new RuntimeException(); }
  /**
   * Generate a <code>SparseMatrix</code> consisting of <code>i.i.d</code>. gaussian random numbers.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @param density the desired density for the matrix
   * @param rng a random number generator
   * @return <code>SparseMatrix</code> with size <code>numRows</code> x <code>numCols</code> and values in N(0, 1)
   */
  static public  org.apache.spark.ml.linalg.SparseMatrix sprandn (int numRows, int numCols, double density, java.util.Random rng)  { throw new RuntimeException(); }
  /**
   * Generate a diagonal matrix in <code>SparseMatrix</code> format from the supplied values.
   * @param vector a <code>Vector</code> that will form the values on the diagonal of the matrix
   * @return Square <code>SparseMatrix</code> with size <code>values.length</code> x <code>values.length</code> and non-zero
   *         <code>values</code> on the diagonal
   */
  static public  org.apache.spark.ml.linalg.SparseMatrix spdiag (org.apache.spark.ml.linalg.Vector vector)  { throw new RuntimeException(); }
  public  int numRows ()  { throw new RuntimeException(); }
  public  int numCols ()  { throw new RuntimeException(); }
  public  int[] colPtrs ()  { throw new RuntimeException(); }
  public  int[] rowIndices ()  { throw new RuntimeException(); }
  public  double[] values ()  { throw new RuntimeException(); }
  public  boolean isTransposed ()  { throw new RuntimeException(); }
  // not preceding
  public   SparseMatrix (int numRows, int numCols, int[] colPtrs, int[] rowIndices, double[] values, boolean isTransposed)  { throw new RuntimeException(); }
  /**
   * Column-major sparse matrix.
   * The entry values are stored in Compressed Sparse Column (CSC) format.
   * For example, the following matrix
   * <pre><code>
   *   1.0 0.0 4.0
   *   0.0 3.0 5.0
   *   2.0 0.0 6.0
   * </code></pre>
   * is stored as <code>values: [1.0, 2.0, 3.0, 4.0, 5.0, 6.0]</code>,
   * <code>rowIndices=[0, 2, 1, 0, 1, 2]</code>, <code>colPointers=[0, 2, 3, 6]</code>.
   * <p>
   * @param numRows number of rows
   * @param numCols number of columns
   * @param colPtrs the index corresponding to the start of a new column
   * @param rowIndices the row index of the entry. They must be in strictly increasing
   *                   order for each column
   * @param values non-zero matrix entries in column major
   */
  public   SparseMatrix (int numRows, int numCols, int[] colPtrs, int[] rowIndices, double[] values)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object o)  { throw new RuntimeException(); }
    breeze.linalg.Matrix<java.lang.Object> asBreeze ()  { throw new RuntimeException(); }
  public  double apply (int i, int j)  { throw new RuntimeException(); }
    int index (int i, int j)  { throw new RuntimeException(); }
    void update (int i, int j, double v)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.SparseMatrix copy ()  { throw new RuntimeException(); }
    org.apache.spark.ml.linalg.SparseMatrix map (scala.Function1<java.lang.Object, java.lang.Object> f)  { throw new RuntimeException(); }
    org.apache.spark.ml.linalg.SparseMatrix update (scala.Function1<java.lang.Object, java.lang.Object> f)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.SparseMatrix transpose ()  { throw new RuntimeException(); }
  public  void foreachActive (scala.Function3<java.lang.Object, java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  public  int numNonzeros ()  { throw new RuntimeException(); }
  public  int numActives ()  { throw new RuntimeException(); }
  /**
   * Generate a <code>SparseMatrix</code> from this <code>SparseMatrix</code>, removing explicit zero values if they
   * exist.
   * <p>
   * @param colMajor Whether or not the resulting <code>SparseMatrix</code> values are in column major
   *                    order.
   * @return (undocumented)
   */
    org.apache.spark.ml.linalg.SparseMatrix toSparseMatrix (boolean colMajor)  { throw new RuntimeException(); }
  /**
   * Generate a <code>DenseMatrix</code> from the given <code>SparseMatrix</code>.
   * <p>
   * @param colMajor Whether the resulting <code>DenseMatrix</code> values are in column major order.
   * @return (undocumented)
   */
    org.apache.spark.ml.linalg.DenseMatrix toDenseMatrix (boolean colMajor)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.ml.linalg.Vector> colIter ()  { throw new RuntimeException(); }
    long getSizeInBytes ()  { throw new RuntimeException(); }
}
