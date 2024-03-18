package org.apache.spark.ml.clustering;
/**
 * Summary of clustering algorithms.
 * <p>
 * param:  predictions  <code>DataFrame</code> produced by model.transform().
 * param:  predictionCol  Name for column of predicted clusters in <code>predictions</code>.
 * param:  featuresCol  Name for column of features in <code>predictions</code>.
 * param:  k  Number of clusters.
 * param:  numIter  Number of iterations.
 */
public  class ClusteringSummary implements scala.Serializable {
  // not preceding
     ClusteringSummary (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String predictionCol, java.lang.String featuresCol, int k, int numIter)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> cluster ()  { throw new RuntimeException(); }
  // not preceding
  public  long[] clusterSizes ()  { throw new RuntimeException(); }
  public  java.lang.String featuresCol ()  { throw new RuntimeException(); }
  public  int k ()  { throw new RuntimeException(); }
  public  int numIter ()  { throw new RuntimeException(); }
  public  java.lang.String predictionCol ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions ()  { throw new RuntimeException(); }
}
