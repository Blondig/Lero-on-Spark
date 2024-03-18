package org.apache.spark.ml.clustering;
/**
 * Multivariate Gaussian Mixture Model (GMM) consisting of k Gaussians, where points
 * are drawn from each Gaussian i with probability weights(i).
 * <p>
 * param:  weights Weight for each Gaussian distribution in the mixture.
 *                This is a multinomial probability distribution over the k Gaussians,
 *                where weights(i) is the weight for Gaussian i, and weights sum to 1.
 * param:  gaussians Array of <code>MultivariateGaussian</code> where gaussians(i) represents
 *                  the Multivariate Gaussian (Normal) Distribution for Gaussian i
 */
public  class GaussianMixtureModel extends org.apache.spark.ml.Model<org.apache.spark.ml.clustering.GaussianMixtureModel> implements org.apache.spark.ml.clustering.GaussianMixtureParams, org.apache.spark.ml.util.MLWritable, org.apache.spark.ml.util.HasTrainingSummary<org.apache.spark.ml.clustering.GaussianMixtureSummary> {
  /** {@link MLWriter} instance for {@link GaussianMixtureModel} */
  static   class GaussianMixtureModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   GaussianMixtureModelWriter (org.apache.spark.ml.clustering.GaussianMixtureModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.GaussianMixtureModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.clustering.GaussianMixtureModel load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Compute the probability (partial assignment) for each cluster for the given data point.
   * <p>
   * @param features  Data point
   * @param dists  Gaussians for model
   * @param weights  Weights for each Gaussian
   * @return  Probability (partial assignment) for each of the k clusters
   */
  static   double[] computeProbabilities (org.apache.spark.ml.linalg.Vector features, org.apache.spark.ml.stat.distribution.MultivariateGaussian[] dists, double[] weights)  { throw new RuntimeException(); }
   final  scala.Option<org.apache.spark.ml.clustering.GaussianMixtureSummary> trainingSummary ()  { throw new RuntimeException(); }
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
  public  double[] weights ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.stat.distribution.MultivariateGaussian[] gaussians ()  { throw new RuntimeException(); }
  // not preceding
     GaussianMixtureModel (java.lang.String uid, double[] weights, org.apache.spark.ml.stat.distribution.MultivariateGaussian[] gaussians)  { throw new RuntimeException(); }
  // not preceding
  public  int numFeatures ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixtureModel setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixtureModel setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixtureModel setProbabilityCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.GaussianMixtureModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  int predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector predictProbability (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  /**
   * Retrieve Gaussian distributions as a DataFrame.
   * Each row represents a Gaussian Distribution.
   * Two columns are defined: mean and cov.
   * Schema:
   * <pre><code>
   *  root
   *   |-- mean: vector (nullable = true)
   *   |-- cov: matrix (nullable = true)
   * </code></pre>
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> gaussiansDF ()  { throw new RuntimeException(); }
  /**
   * Returns a {@link org.apache.spark.ml.util.MLWriter} instance for this ML instance.
   * <p>
   * For {@link GaussianMixtureModel}, this does NOT currently save the training {@link summary}.
   * An option to save {@link summary} may be added in the future.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Gets summary of model on training set. An exception is
   * thrown if <code>hasSummary</code> is false.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.clustering.GaussianMixtureSummary summary ()  { throw new RuntimeException(); }
}
