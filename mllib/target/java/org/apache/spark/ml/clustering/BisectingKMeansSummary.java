package org.apache.spark.ml.clustering;
/**
 * Summary of BisectingKMeans.
 * <p>
 * param:  predictions  <code>DataFrame</code> produced by <code>BisectingKMeansModel.transform()</code>.
 * param:  predictionCol  Name for column of predicted clusters in <code>predictions</code>.
 * param:  featuresCol  Name for column of features in <code>predictions</code>.
 * param:  k  Number of clusters.
 * param:  numIter  Number of iterations.
 * param:  trainingCost Sum of the cost to the nearest centroid for all points in the training
 *                     dataset. This is equivalent to sklearn's inertia.
 */
public  class BisectingKMeansSummary extends org.apache.spark.ml.clustering.ClusteringSummary {
  // not preceding
     BisectingKMeansSummary (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String predictionCol, java.lang.String featuresCol, int k, int numIter, double trainingCost)  { throw new RuntimeException(); }
  public  double trainingCost ()  { throw new RuntimeException(); }
}
