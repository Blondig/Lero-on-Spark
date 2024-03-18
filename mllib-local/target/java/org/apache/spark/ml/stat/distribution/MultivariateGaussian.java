package org.apache.spark.ml.stat.distribution;
/**
 * This class provides basic functionality for a Multivariate Gaussian (Normal) Distribution. In
 * the event that the covariance matrix is singular, the density will be computed in a
 * reduced dimensional subspace under which the distribution is supported.
 * (see <a href="http://en.wikipedia.org/wiki/Multivariate_normal_distribution#Degenerate_case">
 * here</a>)
 * <p>
 * param:  mean The mean vector of the distribution
 * param:  cov The covariance matrix of the distribution
 */
public  class MultivariateGaussian implements scala.Serializable {
  // not preceding
  public   MultivariateGaussian (org.apache.spark.ml.linalg.Vector mean, org.apache.spark.ml.linalg.Matrix cov)  { throw new RuntimeException(); }
  /** Private constructor taking Breeze types */
     MultivariateGaussian (breeze.linalg.DenseVector<java.lang.Object> mean, breeze.linalg.DenseMatrix<java.lang.Object> cov)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Matrix cov ()  { throw new RuntimeException(); }
  /**
   * Returns the log-density of this multivariate Gaussian at given point, x
   * @param x (undocumented)
   * @return (undocumented)
   */
  public  double logpdf (org.apache.spark.ml.linalg.Vector x)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector mean ()  { throw new RuntimeException(); }
  /**
   * Returns density of this multivariate Gaussian at given point, x
   * @param x (undocumented)
   * @return (undocumented)
   */
  public  double pdf (org.apache.spark.ml.linalg.Vector x)  { throw new RuntimeException(); }
}
