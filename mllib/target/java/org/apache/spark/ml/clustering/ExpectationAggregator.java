package org.apache.spark.ml.clustering;
/**
 * ExpectationAggregator computes the partial expectation results.
 * <p>
 * param:  numFeatures The number of features.
 * param:  bcWeights The broadcast weights for each Gaussian distribution in the mixture.
 * param:  bcGaussians The broadcast array of Multivariate Gaussian (Normal) Distribution
 *                    in the mixture. Note only upper triangular part of the covariance
 *                    matrix of each distribution is stored as dense vector (column major)
 *                    in order to reduce shuffled data size.
 */
public  class ExpectationAggregator implements scala.Serializable {
  public   ExpectationAggregator (int numFeatures, org.apache.spark.broadcast.Broadcast<double[]> bcWeights, org.apache.spark.broadcast.Broadcast<scala.Tuple2<org.apache.spark.ml.linalg.DenseVector, org.apache.spark.ml.linalg.DenseVector>[]> bcGaussians)  { throw new RuntimeException(); }
  /**
   * Add a new training instance to this ExpectationAggregator, update the weights,
   * means and covariances for each distributions, and update the log likelihood.
   * <p>
   * @param instance The instance of data point to be added.
   * @return This ExpectationAggregator object.
   */
  public  org.apache.spark.ml.clustering.ExpectationAggregator add (scala.Tuple2<org.apache.spark.ml.linalg.Vector, java.lang.Object> instance)  { throw new RuntimeException(); }
  public  long count ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.DenseVector[] covs ()  { throw new RuntimeException(); }
  public  double logLikelihood ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.DenseVector[] means ()  { throw new RuntimeException(); }
  public  double[] weights ()  { throw new RuntimeException(); }
}
