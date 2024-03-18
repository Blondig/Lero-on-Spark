package org.apache.spark.mllib.stat.distribution;
/**
 * This class provides basic functionality for a Multivariate Gaussian (Normal) Distribution. In
 * the event that the covariance matrix is singular, the density will be computed in a
 * reduced dimensional subspace under which the distribution is supported.
 * (see <a href="http://en.wikipedia.org/wiki/Multivariate_normal_distribution#Degenerate_case">
 * Degenerate case in Multivariate normal distribution (Wikipedia)</a>)
 * <p>
 * param:  mu The mean vector of the distribution
 * param:  sigma The covariance matrix of the distribution
 */
public  class MultivariateGaussian implements scala.Serializable {
  // not preceding
  public   MultivariateGaussian (org.apache.spark.mllib.linalg.Vector mu, org.apache.spark.mllib.linalg.Matrix sigma)  { throw new RuntimeException(); }
  /**
   * private[mllib] constructor
   * <p>
   * @param mu The mean vector of the distribution
   * @param sigma The covariance matrix of the distribution
   */
     MultivariateGaussian (breeze.linalg.DenseVector<java.lang.Object> mu, breeze.linalg.DenseMatrix<java.lang.Object> sigma)  { throw new RuntimeException(); }
  /**
   * Returns the log-density of this multivariate Gaussian at given point, x
   * @param x (undocumented)
   * @return (undocumented)
   */
  public  double logpdf (org.apache.spark.mllib.linalg.Vector x)  { throw new RuntimeException(); }
  /** Returns the log-density of this multivariate Gaussian at given point, x */
    double logpdf (breeze.linalg.Vector<java.lang.Object> x)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector mu ()  { throw new RuntimeException(); }
  /**
   * Returns density of this multivariate Gaussian at given point, x
   * @param x (undocumented)
   * @return (undocumented)
   */
  public  double pdf (org.apache.spark.mllib.linalg.Vector x)  { throw new RuntimeException(); }
  /** Returns density of this multivariate Gaussian at given point, x */
    double pdf (breeze.linalg.Vector<java.lang.Object> x)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Matrix sigma ()  { throw new RuntimeException(); }
}
