package org.apache.spark.ml.clustering;
/**
 * Summary of GaussianMixture.
 * <p>
 * param:  predictions  <code>DataFrame</code> produced by <code>GaussianMixtureModel.transform()</code>.
 * param:  predictionCol  Name for column of predicted clusters in <code>predictions</code>.
 * param:  probabilityCol  Name for column of predicted probability of each cluster
 *                        in <code>predictions</code>.
 * param:  featuresCol  Name for column of features in <code>predictions</code>.
 * param:  k  Number of clusters.
 * param:  logLikelihood  Total log-likelihood for this model on the given data.
 * param:  numIter  Number of iterations.
 */
public  class GaussianMixtureSummary extends org.apache.spark.ml.clustering.ClusteringSummary {
  // not preceding
     GaussianMixtureSummary (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String predictionCol, java.lang.String probabilityCol, java.lang.String featuresCol, int k, double logLikelihood, int numIter)  { throw new RuntimeException(); }
  public  double logLikelihood ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> probability ()  { throw new RuntimeException(); }
  public  java.lang.String probabilityCol ()  { throw new RuntimeException(); }
}
