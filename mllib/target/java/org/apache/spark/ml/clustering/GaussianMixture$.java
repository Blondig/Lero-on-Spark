package org.apache.spark.ml.clustering;
public  class GaussianMixture$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.clustering.GaussianMixture>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GaussianMixture$ MODULE$ = null;
  public   GaussianMixture$ ()  { throw new RuntimeException(); }
  /** Limit number of features such that numFeatures^2^ < Int.MaxValue */
    int MAX_NUM_FEATURES ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.GaussianMixture load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Convert an n * (n + 1) / 2 dimension array representing the upper triangular part of a matrix
   * into an n * n array representing the full symmetric matrix (column major).
   * <p>
   * @param n The order of the n by n matrix.
   * @param triangularValues The upper triangular part of the matrix packed in an array
   *                         (column major).
   * @return A dense matrix which represents the symmetric matrix in column major.
   */
    org.apache.spark.ml.linalg.DenseMatrix unpackUpperTriangularMatrix (int n, double[] triangularValues)  { throw new RuntimeException(); }
  /**
   * Update the weight, mean and covariance of gaussian distribution.
   * <p>
   * @param mean The mean of the gaussian distribution.
   * @param cov The covariance matrix of the gaussian distribution. Note we only
   *            save the upper triangular part as a dense vector (column major).
   * @param weight The weight of the gaussian distribution.
   * @param sumWeights The sum of weights of all clusters.
   * @return The updated weight, mean and covariance.
   */
    scala.Tuple2<java.lang.Object, scala.Tuple2<org.apache.spark.ml.linalg.DenseVector, org.apache.spark.ml.linalg.DenseVector>> updateWeightsAndGaussians (org.apache.spark.ml.linalg.DenseVector mean, org.apache.spark.ml.linalg.DenseVector cov, double weight, double sumWeights)  { throw new RuntimeException(); }
}
