package org.apache.spark.ml.evaluation;
/**
 * The algorithm which is implemented in this object, instead, is an efficient and parallel
 * implementation of the Silhouette using the cosine distance measure. The cosine distance
 * measure is defined as <code>1 - s</code> where <code>s</code> is the cosine similarity between two points.
 * <p>
 * The total distance of the point <code>X</code> to the points <code>$C_{i}$</code> belonging to the cluster <code>$\Gamma$</code>
 * is:
 * <p>
 * <blockquote>
 *   $$
 *   \sum\limits_{i=1}^N d(X, C_{i} ) =
 *   \sum\limits_{i=1}^N \Big( 1 - \frac{\sum\limits_{j=1}^D x_{j}c_{ij} }{ \|X\|\|C_{i}\|} \Big)
 *   = \sum\limits_{i=1}^N 1 - \sum\limits_{i=1}^N \sum\limits_{j=1}^D \frac{x_{j}}{\|X\|}
 *   \frac{c_{ij}}{\|C_{i}\|}
 *   = N - \sum\limits_{j=1}^D \frac{x_{j}}{\|X\|} \Big( \sum\limits_{i=1}^N
 *   \frac{c_{ij}}{\|C_{i}\|} \Big)
 *   $$
 * </blockquote>
 * <p>
 * where <code>$x_{j}$</code> is the <code>j</code>-th dimension of the point <code>X</code> and <code>$c_{ij}$</code> is the <code>j</code>-th dimension
 * of the <code>i</code>-th point in cluster <code>$\Gamma$</code>.
 * <p>
 * Then, we can define the vector:
 * <p>
 * <blockquote>
 *   $$
 *   \xi_{X} : \xi_{X i} = \frac{x_{i}}{\|X\|}, i = 1, ..., D
 *   $$
 * </blockquote>
 * <p>
 * which can be precomputed for each point and the vector
 * <p>
 * <blockquote>
 *   $$
 *   \Omega_{\Gamma} : \Omega_{\Gamma i} = \sum\limits_{j=1}^N \xi_{C_{j}i}, i = 1, ..., D
 *   $$
 * </blockquote>
 * <p>
 * which can be precomputed too for each cluster <code>$\Gamma$</code> by its points <code>$C_{i}$</code>.
 * <p>
 * With these definitions, the numerator becomes:
 * <p>
 * <blockquote>
 *   $$
 *   N - \sum\limits_{j=1}^D \xi_{X j} \Omega_{\Gamma j}
 *   $$
 * </blockquote>
 * <p>
 * Thus the average distance of a point <code>X</code> to the points of the cluster <code>$\Gamma$</code> is:
 * <p>
 * <blockquote>
 *   $$
 *   1 - \frac{\sum\limits_{j=1}^D \xi_{X j} \Omega_{\Gamma j}}{N}
 *   $$
 * </blockquote>
 * <p>
 * In the implementation, the precomputed values for the clusters are distributed among the worker
 * nodes via broadcasted variables, because we can assume that the clusters are limited in number.
 * <p>
 * The main strengths of this algorithm are the low computational complexity and the intrinsic
 * parallelism. The precomputed information for each point and for each cluster can be computed
 * with a computational complexity which is <code>O(N/W)</code>, where <code>N</code> is the number of points in the
 * dataset and <code>W</code> is the number of worker nodes. After that, every point can be analyzed
 * independently from the others.
 * <p>
 * For every point we need to compute the average distance to all the clusters. Since the formula
 * above requires <code>O(D)</code> operations, this phase has a computational complexity which is
 * <code>O(C*D*N/W)</code> where <code>C</code> is the number of clusters (which we assume quite low), <code>D</code> is the number
 * of dimensions, <code>N</code> is the number of points in the dataset and <code>W</code> is the number of worker
 * nodes.
 */
public  class CosineSilhouette$ extends org.apache.spark.ml.evaluation.Silhouette {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CosineSilhouette$ MODULE$ = null;
  public   CosineSilhouette$ ()  { throw new RuntimeException(); }
  /**
   * The method takes the input dataset and computes the aggregated values
   * about a cluster which are needed by the algorithm.
   * <p>
   * @param df The DataFrame which contains the input data
   * @param featuresCol The name of the column which contains the feature vector of the point.
   * @param predictionCol The name of the column which contains the predicted cluster id
   *                      for the point.
   * @param weightCol The name of the column which contains the instance weight.
   * @return A {@link scala.collection.immutable.Map} which associates each cluster id to a
   *         its statistics (i.e. the precomputed values <code>N</code> and <code>$\Omega_{\Gamma}$</code>).
   */
  public  scala.collection.immutable.Map<java.lang.Object, scala.Tuple2<org.apache.spark.ml.linalg.Vector, java.lang.Object>> computeClusterStats (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.lang.String featuresCol, java.lang.String predictionCol, java.lang.String weightCol)  { throw new RuntimeException(); }
  /**
   * It computes the Silhouette coefficient for a point.
   * <p>
   * @param broadcastedClustersMap A map of the precomputed values for each cluster.
   * @param normalizedFeatures The {@link org.apache.spark.ml.linalg.Vector} representing the
   *                           normalized features of the current point.
   * @param clusterId The id of the cluster the current point belongs to.
   * @param weight The instance weight of the current point.
   * @return (undocumented)
   */
  public  double computeSilhouetteCoefficient (org.apache.spark.broadcast.Broadcast<scala.collection.immutable.Map<java.lang.Object, scala.Tuple2<org.apache.spark.ml.linalg.Vector, java.lang.Object>>> broadcastedClustersMap, org.apache.spark.ml.linalg.Vector normalizedFeatures, double clusterId, double weight)  { throw new RuntimeException(); }
  /**
   * Compute the Silhouette score of the dataset using the cosine distance measure.
   * <p>
   * @param dataset The input dataset (previously clustered) on which compute the Silhouette.
   * @param predictionCol The name of the column which contains the predicted cluster id
   *                      for the point.
   * @param featuresCol The name of the column which contains the feature vector of the point.
   * @param weightCol The name of the column which contains the instance weight.
   * @return The average of the Silhouette values of the clustered data.
   */
  public  double computeSilhouetteScore (org.apache.spark.sql.Dataset<?> dataset, java.lang.String predictionCol, java.lang.String featuresCol, java.lang.String weightCol)  { throw new RuntimeException(); }
}
