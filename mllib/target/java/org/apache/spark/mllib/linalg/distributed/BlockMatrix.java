package org.apache.spark.mllib.linalg.distributed;
/**
 * Represents a distributed matrix in blocks of local matrices.
 * <p>
 * param:  blocks The RDD of sub-matrix blocks ((blockRowIndex, blockColIndex), sub-matrix) that
 *               form this distributed matrix. If multiple blocks with the same index exist, the
 *               results for operations like add and multiply will be unpredictable.
 * param:  rowsPerBlock Number of rows that make up each block. The blocks forming the final
 *                     rows are not required to have the given number of rows
 * param:  colsPerBlock Number of columns that make up each block. The blocks forming the final
 *                     columns are not required to have the given number of columns
 * param:  nRows Number of rows of this matrix. If the supplied value is less than or equal to zero,
 *              the number of rows will be calculated when <code>numRows</code> is invoked.
 * param:  nCols Number of columns of this matrix. If the supplied value is less than or equal to
 *              zero, the number of columns will be calculated when <code>numCols</code> is invoked.
 */
public  class BlockMatrix implements org.apache.spark.mllib.linalg.distributed.DistributedMatrix, org.apache.spark.internal.Logging {
  // not preceding
  public   BlockMatrix (org.apache.spark.rdd.RDD<scala.Tuple2<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.mllib.linalg.Matrix>> blocks, int rowsPerBlock, int colsPerBlock, long nRows, long nCols)  { throw new RuntimeException(); }
  /**
   * Alternate constructor for BlockMatrix without the input of the number of rows and columns.
   * <p>
   * @param blocks The RDD of sub-matrix blocks ((blockRowIndex, blockColIndex), sub-matrix) that
   *               form this distributed matrix. If multiple blocks with the same index exist, the
   *               results for operations like add and multiply will be unpredictable.
   * @param rowsPerBlock Number of rows that make up each block. The blocks forming the final
   *                     rows are not required to have the given number of rows
   * @param colsPerBlock Number of columns that make up each block. The blocks forming the final
   *                     columns are not required to have the given number of columns
   */
  public   BlockMatrix (org.apache.spark.rdd.RDD<scala.Tuple2<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.mllib.linalg.Matrix>> blocks, int rowsPerBlock, int colsPerBlock)  { throw new RuntimeException(); }
  /**
   * Adds the given block matrix <code>other</code> to <code>this</code> block matrix: <code>this + other</code>.
   * The matrices must have the same size and matching <code>rowsPerBlock</code> and <code>colsPerBlock</code>
   * values. If one of the blocks that are being added are instances of <code>SparseMatrix</code>,
   * the resulting sub matrix will also be a <code>SparseMatrix</code>, even if it is being added
   * to a <code>DenseMatrix</code>. If two dense matrices are added, the output will also be a
   * <code>DenseMatrix</code>.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.distributed.BlockMatrix add (org.apache.spark.mllib.linalg.distributed.BlockMatrix other)  { throw new RuntimeException(); }
  /**
   * For given matrices <code>this</code> and <code>other</code> of compatible dimensions and compatible block dimensions,
   * it applies a binary function on their corresponding blocks.
   * <p>
   * @param other The second BlockMatrix argument for the operator specified by <code>binMap</code>
   * @param binMap A function taking two breeze matrices and returning a breeze matrix
   * @return A {@link BlockMatrix} whose blocks are the results of a specified binary map on blocks
   *         of <code>this</code> and <code>other</code>.
   * Note: <code>blockMap</code> ONLY works for <code>add</code> and <code>subtract</code> methods and it does not support
   * operators such as (a, b) =&gt; -a + b
   * TODO: Make the use of zero matrices more storage efficient.
   */
    org.apache.spark.mllib.linalg.distributed.BlockMatrix blockMap (org.apache.spark.mllib.linalg.distributed.BlockMatrix other, scala.Function2<breeze.linalg.Matrix<java.lang.Object>, breeze.linalg.Matrix<java.lang.Object>, breeze.linalg.Matrix<java.lang.Object>> binMap)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<scala.Tuple2<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.mllib.linalg.Matrix>> blocks ()  { throw new RuntimeException(); }
  /** Caches the underlying RDD. */
  public  org.apache.spark.mllib.linalg.distributed.BlockMatrix cache ()  { throw new RuntimeException(); }
  public  int colsPerBlock ()  { throw new RuntimeException(); }
    org.apache.spark.mllib.linalg.distributed.GridPartitioner createPartitioner ()  { throw new RuntimeException(); }
  /**
   * Left multiplies this {@link BlockMatrix} to <code>other</code>, another {@link BlockMatrix}. The <code>colsPerBlock</code>
   * of this matrix must equal the <code>rowsPerBlock</code> of <code>other</code>. If <code>other</code> contains
   * <code>SparseMatrix</code>, they will have to be converted to a <code>DenseMatrix</code>. The output
   * {@link BlockMatrix} will only consist of blocks of <code>DenseMatrix</code>. This may cause
   * some performance issues until support for multiplying two sparse matrices is added.
   * <p>
   * @note The behavior of multiply has changed in 1.6.0. <code>multiply</code> used to throw an error when
   * there were blocks with duplicate indices. Now, the blocks with duplicate indices will be added
   * with each other.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.distributed.BlockMatrix multiply (org.apache.spark.mllib.linalg.distributed.BlockMatrix other)  { throw new RuntimeException(); }
  /**
   * Left multiplies this {@link BlockMatrix} to <code>other</code>, another {@link BlockMatrix}. The <code>colsPerBlock</code>
   * of this matrix must equal the <code>rowsPerBlock</code> of <code>other</code>. If <code>other</code> contains
   * <code>SparseMatrix</code>, they will have to be converted to a <code>DenseMatrix</code>. The output
   * {@link BlockMatrix} will only consist of blocks of <code>DenseMatrix</code>. This may cause
   * some performance issues until support for multiplying two sparse matrices is added.
   * Blocks with duplicate indices will be added with each other.
   * <p>
   * @param other Matrix <code>B</code> in <code>A * B = C</code>
   * @param numMidDimSplits Number of splits to cut on the middle dimension when doing
   *                        multiplication. For example, when multiplying a Matrix <code>A</code> of
   *                        size <code>m x n</code> with Matrix <code>B</code> of size <code>n x k</code>, this parameter
   *                        configures the parallelism to use when grouping the matrices. The
   *                        parallelism will increase from <code>m x k</code> to <code>m x k x numMidDimSplits</code>,
   *                        which in some cases also reduces total shuffled data.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.distributed.BlockMatrix multiply (org.apache.spark.mllib.linalg.distributed.BlockMatrix other, int numMidDimSplits)  { throw new RuntimeException(); }
  public  int numColBlocks ()  { throw new RuntimeException(); }
  public  long numCols ()  { throw new RuntimeException(); }
  public  int numRowBlocks ()  { throw new RuntimeException(); }
  public  long numRows ()  { throw new RuntimeException(); }
  /** Persists the underlying RDD with the specified storage level. */
  public  org.apache.spark.mllib.linalg.distributed.BlockMatrix persist (org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  public  int rowsPerBlock ()  { throw new RuntimeException(); }
  /**
   * Simulate the multiplication with just block indices in order to cut costs on communication,
   * when we are actually shuffling the matrices.
   * The <code>colsPerBlock</code> of this matrix must equal the <code>rowsPerBlock</code> of <code>other</code>.
   * Exposed for tests.
   * <p>
   * @param other The BlockMatrix to multiply
   * @param partitioner The partitioner that will be used for the resulting matrix <code>C = A * B</code>
   * @return A tuple of {@link BlockDestinations}. The first element is the Map of the set of partitions
   *         that we need to shuffle each blocks of <code>this</code>, and the second element is the Map for
   *         <code>other</code>.
   * @param midDimSplitNum (undocumented)
   */
    scala.Tuple2<scala.collection.immutable.Map<scala.Tuple2<java.lang.Object, java.lang.Object>, scala.collection.immutable.Set<java.lang.Object>>, scala.collection.immutable.Map<scala.Tuple2<java.lang.Object, java.lang.Object>, scala.collection.immutable.Set<java.lang.Object>>> simulateMultiply (org.apache.spark.mllib.linalg.distributed.BlockMatrix other, org.apache.spark.mllib.linalg.distributed.GridPartitioner partitioner, int midDimSplitNum)  { throw new RuntimeException(); }
  /**
   * Subtracts the given block matrix <code>other</code> from <code>this</code> block matrix: <code>this - other</code>.
   * The matrices must have the same size and matching <code>rowsPerBlock</code> and <code>colsPerBlock</code>
   * values. If one of the blocks that are being subtracted are instances of <code>SparseMatrix</code>,
   * the resulting sub matrix will also be a <code>SparseMatrix</code>, even if it is being subtracted
   * from a <code>DenseMatrix</code>. If two dense matrices are subtracted, the output will also be a
   * <code>DenseMatrix</code>.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.distributed.BlockMatrix subtract (org.apache.spark.mllib.linalg.distributed.BlockMatrix other)  { throw new RuntimeException(); }
  /** Collects data and assembles a local dense breeze matrix (for test only). */
    breeze.linalg.DenseMatrix<java.lang.Object> toBreeze ()  { throw new RuntimeException(); }
  /** Converts to CoordinateMatrix. */
  public  org.apache.spark.mllib.linalg.distributed.CoordinateMatrix toCoordinateMatrix ()  { throw new RuntimeException(); }
  /** Converts to IndexedRowMatrix. The number of columns must be within the integer range. */
  public  org.apache.spark.mllib.linalg.distributed.IndexedRowMatrix toIndexedRowMatrix ()  { throw new RuntimeException(); }
  /**
   * Collect the distributed matrix on the driver as a <code>DenseMatrix</code>.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Matrix toLocalMatrix ()  { throw new RuntimeException(); }
  /**
   * Transpose this <code>BlockMatrix</code>. Returns a new <code>BlockMatrix</code> instance sharing the
   * same underlying data. Is a lazy operation.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.distributed.BlockMatrix transpose ()  { throw new RuntimeException(); }
  /**
   * Validates the block matrix info against the matrix data (<code>blocks</code>) and throws an exception if
   * any error is found.
   */
  public  void validate ()  { throw new RuntimeException(); }
}
