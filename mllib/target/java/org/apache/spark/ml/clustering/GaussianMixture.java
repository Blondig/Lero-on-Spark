package org.apache.spark.ml.clustering;
/**
 * Gaussian Mixture clustering.
 * <p>
 * This class performs expectation maximization for multivariate Gaussian
 * Mixture Models (GMMs).  A GMM represents a composite distribution of
 * independent Gaussian distributions with associated "mixing" weights
 * specifying each's contribution to the composite.
 * <p>
 * Given a set of sample points, this class will maximize the log-likelihood
 * for a mixture of k Gaussians, iterating until the log-likelihood changes by
 * less than convergenceTol, or until it has reached the max number of iterations.
 * While this process is generally guaranteed to converge, it is not guaranteed
 * to find a global optimum.
 * <p>
 * @note This algorithm is limited in its number of features since it requires storing a covariance
 * matrix which has size quadratic in the number of features. Even when the number of features does
 * not exceed this limit, this algorithm may perform poorly on high-dimensional data.
 * This is due to high-dimensional data (a) making it difficult to cluster at all (based
 * on statistical/theoretical arguments) and (b) numerical issues with Gaussian distributions.
 */
public  class GaussianMixture extends org.apache.spark.ml.Estimator<org.apache.spark.ml.clustering.GaussianMixtureModel> implements org.apache.spark.ml.clustering.GaussianMixtureParams, org.apache.spark.ml.util.DefaultParamsWritable {
  /** Limit number of features such that numFeatures^2^ < Int.MaxValue */
  static   int MAX_NUM_FEATURES ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.clustering.GaussianMixture load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Convert an n * (n + 1) / 2 dimension array representing the upper triangular part of a matrix
   * into an n * n array representing the full symmetric matrix (column major).
   * <p>
   * @param n The order of the n by n matrix.
   * @param triangularValues The upper triangular part of the matrix packed in an array
   *                         (column major).
   * @return A dense matrix which represents the symmetric matrix in column major.
   */
  static   org.apache.spark.ml.linalg.DenseMatrix unpackUpperTriangularMatrix (int n, double[] triangularValues)  { throw new RuntimeException(); }
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
  static   scala.Tuple2<java.lang.Object, scala.Tuple2<org.apache.spark.ml.linalg.DenseVector, org.apache.spark.ml.linalg.DenseVector>> updateWeightsAndGaussians (org.apache.spark.ml.linalg.DenseVector mean, org.apache.spark.ml.linalg.DenseVector cov, double weight, double sumWeights)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam k ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam aggregationDepth ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> probabilityCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   GaussianMixture (java.lang.String uid)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.GaussianMixture copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public   GaussianMixture ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixture setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixture setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixture setProbabilityCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixture setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixture setK (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixture setMaxIter (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixture setTol (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixture setSeed (long value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.clustering.GaussianMixture setAggregationDepth (int value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.GaussianMixtureModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
