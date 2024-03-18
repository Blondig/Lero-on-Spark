package org.apache.spark.ml.stat;
/**
 * API for correlation functions in MLlib, compatible with DataFrames and Datasets.
 * <p>
 * The functions in this package generalize the functions in {@link org.apache.spark.sql.Dataset#stat}
 * to spark.ml's Vector types.
 */
public  class Correlation {
  /**
   * Compute the correlation matrix for the input Dataset of Vectors using the specified method.
   * Methods currently supported: <code>pearson</code> (default), <code>spearman</code>.
   * <p>
   * @param dataset A dataset or a dataframe
   * @param column The name of the column of vectors for which the correlation coefficient needs
   *               to be computed. This must be a column of the dataset, and it must contain
   *               Vector objects.
   * @param method String specifying the method to use for computing correlation.
   *               Supported: <code>pearson</code> (default), <code>spearman</code>
   * @return A dataframe that contains the correlation matrix of the column of vectors. This
   *         dataframe contains a single row and a single column of name
   *         <code>$METHODNAME($COLUMN)</code>.
   * @throws IllegalArgumentException if the column is not a valid column in the dataset, or if
   *                                  the content of this column is not of type Vector.
   * <p>
   *  Here is how to access the correlation coefficient:
   *  <pre><code>
   *    val data: Dataset[Vector] = ...
   *    val Row(coeff: Matrix) = Correlation.corr(data, "value").head
   *    // coeff now contains the Pearson correlation matrix.
   *  </code></pre>
   * <p>
   * @note For Spearman, a rank correlation, we need to create an RDD[Double] for each column
   * and sort it in order to retrieve the ranks and then join the columns back into an RDD[Vector],
   * which is fairly costly. Cache the input Dataset before calling corr with <code>method = "spearman"</code>
   * to avoid recomputing the common lineage.
   */
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> corr (org.apache.spark.sql.Dataset<?> dataset, java.lang.String column, java.lang.String method)  { throw new RuntimeException(); }
  /**
   * Compute the Pearson correlation matrix for the input Dataset of Vectors.
   * @param dataset (undocumented)
   * @param column (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> corr (org.apache.spark.sql.Dataset<?> dataset, java.lang.String column)  { throw new RuntimeException(); }
}
