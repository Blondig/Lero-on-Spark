package org.apache.spark.ml.evaluation;
 abstract class Silhouette {
  public   Silhouette ()  { throw new RuntimeException(); }
  /**
   * Compute the mean Silhouette values of all samples.
   * @param df (undocumented)
   * @param scoreColumn (undocumented)
   * @param weightColumn (undocumented)
   * @return (undocumented)
   */
  public  double overallScore (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, org.apache.spark.sql.Column scoreColumn, org.apache.spark.sql.Column weightColumn)  { throw new RuntimeException(); }
  /**
   * It computes the Silhouette coefficient for a point.
   * @param clusterIds (undocumented)
   * @param pointClusterId (undocumented)
   * @param weightSum (undocumented)
   * @param weight (undocumented)
   * @param averageDistanceToCluster (undocumented)
   * @return (undocumented)
   */
  public  double pointSilhouetteCoefficient (scala.collection.immutable.Set<java.lang.Object> clusterIds, double pointClusterId, double weightSum, double weight, scala.Function1<java.lang.Object, java.lang.Object> averageDistanceToCluster)  { throw new RuntimeException(); }
}
