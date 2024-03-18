package org.apache.spark.ml.evaluation;
/**
 * SquaredEuclideanSilhouette computes the average of the
 * Silhouette over all the data of the dataset, which is
 * a measure of how appropriately the data have been clustered.
 * <p>
 * The Silhouette for each point <code>i</code> is defined as:
 * <p>
 * <blockquote>
 *   $$
 *   s_{i} = \frac{b_{i}-a_{i}}{max\{a_{i},b_{i}\}}
 *   $$
 * </blockquote>
 * <p>
 * which can be rewritten as
 * <p>
 * <blockquote>
 *   $$
 *   s_{i}= \begin{cases}
 *   1-\frac{a_{i}}{b_{i}} &amp; \text{if } a_{i} \leq b_{i} \\
 *   \frac{b_{i}}{a_{i}}-1 &amp; \text{if } a_{i} \gt b_{i} \end{cases}
 *   $$
 * </blockquote>
 * <p>
 * where <code>$a_{i}$</code> is the average dissimilarity of <code>i</code> with all other data
 * within the same cluster, <code>$b_{i}$</code> is the lowest average dissimilarity
 * of <code>i</code> to any other cluster, of which <code>i</code> is not a member.
 * <code>$a_{i}$</code> can be interpreted as how well <code>i</code> is assigned to its cluster
 * (the smaller the value, the better the assignment), while <code>$b_{i}$</code> is
 * a measure of how well <code>i</code> has not been assigned to its "neighboring cluster",
 * i.e. the nearest cluster to <code>i</code>.
 * <p>
 * Unfortunately, the naive implementation of the algorithm requires to compute
 * the distance of each couple of points in the dataset. Since the computation of
 * the distance measure takes <code>D</code> operations - if <code>D</code> is the number of dimensions
 * of each point, the computational complexity of the algorithm is <code>O(N^2^*D)</code>, where
 * <code>N</code> is the cardinality of the dataset. Of course this is not scalable in <code>N</code>,
 * which is the critical number in a Big Data context.
 * <p>
 * The algorithm which is implemented in this object, instead, is an efficient
 * and parallel implementation of the Silhouette using the squared Euclidean
 * distance measure.
 * <p>
 * With this assumption, the total distance of the point <code>X</code>
 * to the points <code>$C_{i}$</code> belonging to the cluster <code>$\Gamma$</code> is:
 * <p>
 * <blockquote>
 *   $$
 *   \sum\limits_{i=1}^N d(X, C_{i} ) =
 *   \sum\limits_{i=1}^N \Big( \sum\limits_{j=1}^D (x_{j}-c_{ij})^2 \Big)
 *   = \sum\limits_{i=1}^N \Big( \sum\limits_{j=1}^D x_{j}^2 +
 *   \sum\limits_{j=1}^D c_{ij}^2 -2\sum\limits_{j=1}^D x_{j}c_{ij} \Big)
 *   = \sum\limits_{i=1}^N \sum\limits_{j=1}^D x_{j}^2 +
 *   \sum\limits_{i=1}^N \sum\limits_{j=1}^D c_{ij}^2
 *   -2 \sum\limits_{i=1}^N \sum\limits_{j=1}^D x_{j}c_{ij}
 *   $$
 * </blockquote>
 * <p>
 * where <code>$x_{j}$</code> is the <code>j</code>-th dimension of the point <code>X</code> and
 * <code>$c_{ij}$</code> is the <code>j</code>-th dimension of the <code>i</code>-th point in cluster <code>$\Gamma$</code>.
 * <p>
 * Then, the first term of the equation can be rewritten as:
 * <p>
 * <blockquote>
 *   $$
 *   \sum\limits_{i=1}^N \sum\limits_{j=1}^D x_{j}^2 = N \xi_{X} \text{ ,
 *   with } \xi_{X} = \sum\limits_{j=1}^D x_{j}^2
 *   $$
 * </blockquote>
 * <p>
 * where <code>$\xi_{X}$</code> is fixed for each point and it can be precomputed.
 * <p>
 * Moreover, the second term is fixed for each cluster too,
 * thus we can name it <code>$\Psi_{\Gamma}$</code>
 * <p>
 * <blockquote>
 *   $$
 *   \sum\limits_{i=1}^N \sum\limits_{j=1}^D c_{ij}^2 =
 *   \sum\limits_{i=1}^N \xi_{C_{i}} = \Psi_{\Gamma}
 *   $$
 * </blockquote>
 * <p>
 * Last, the third element becomes
 * <p>
 * <blockquote>
 *   $$
 *   \sum\limits_{i=1}^N \sum\limits_{j=1}^D x_{j}c_{ij} =
 *   \sum\limits_{j=1}^D \Big(\sum\limits_{i=1}^N c_{ij} \Big) x_{j}
 *   $$
 * </blockquote>
 * <p>
 * thus defining the vector
 * <p>
 * <blockquote>
 *   $$
 *   Y_{\Gamma}:Y_{\Gamma j} = \sum\limits_{i=1}^N c_{ij} , j=0, ..., D
 *   $$
 * </blockquote>
 * <p>
 * which is fixed for each cluster <code>$\Gamma$</code>, we have
 * <p>
 * <blockquote>
 *   $$
 *   \sum\limits_{j=1}^D \Big(\sum\limits_{i=1}^N c_{ij} \Big) x_{j} =
 *   \sum\limits_{j=1}^D Y_{\Gamma j} x_{j}
 *   $$
 * </blockquote>
 * <p>
 * In this way, the previous equation becomes
 * <p>
 * <blockquote>
 *   $$
 *   N\xi_{X} + \Psi_{\Gamma} - 2 \sum\limits_{j=1}^D Y_{\Gamma j} x_{j}
 *   $$
 * </blockquote>
 * <p>
 * and the average distance of a point to a cluster can be computed as
 * <p>
 * <blockquote>
 *   $$
 *   \frac{\sum\limits_{i=1}^N d(X, C_{i} )}{N} =
 *   \frac{N\xi_{X} + \Psi_{\Gamma} - 2 \sum\limits_{j=1}^D Y_{\Gamma j} x_{j}}{N} =
 *   \xi_{X} + \frac{\Psi_{\Gamma} }{N} - 2 \frac{\sum\limits_{j=1}^D Y_{\Gamma j} x_{j}}{N}
 *   $$
 * </blockquote>
 * <p>
 * Thus, it is enough to precompute: the constant <code>$\xi_{X}$</code> for each point <code>X</code>; the
 * constants <code>$\Psi_{\Gamma}$</code>, <code>N</code> and the vector <code>$Y_{\Gamma}$</code> for
 * each cluster <code>$\Gamma$</code>.
 * <p>
 * In the implementation, the precomputed values for the clusters
 * are distributed among the worker nodes via broadcasted variables,
 * because we can assume that the clusters are limited in number and
 * anyway they are much fewer than the points.
 * <p>
 * The main strengths of this algorithm are the low computational complexity
 * and the intrinsic parallelism. The precomputed information for each point
 * and for each cluster can be computed with a computational complexity
 * which is <code>O(N/W)</code>, where <code>N</code> is the number of points in the dataset and
 * <code>W</code> is the number of worker nodes. After that, every point can be
 * analyzed independently of the others.
 * <p>
 * For every point we need to compute the average distance to all the clusters.
 * Since the formula above requires <code>O(D)</code> operations, this phase has a
 * computational complexity which is <code>O(C*D*N/W)</code> where <code>C</code> is the number of
 * clusters (which we assume quite low), <code>D</code> is the number of dimensions,
 * <code>N</code> is the number of points in the dataset and <code>W</code> is the number
 * of worker nodes.
 */
public  class SquaredEuclideanSilhouette$ extends org.apache.spark.ml.evaluation.Silhouette {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SquaredEuclideanSilhouette$ MODULE$ = null;
  public   SquaredEuclideanSilhouette$ ()  { throw new RuntimeException(); }
  /**
   * This method registers the class
   * {@link org.apache.spark.ml.evaluation.SquaredEuclideanSilhouette.ClusterStats}
   * for kryo serialization.
   * <p>
   * @param sc <code>SparkContext</code> to be used
   */
  public  void registerKryoClasses (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /**
   * The method takes the input dataset and computes the aggregated values
   * about a cluster which are needed by the algorithm.
   * <p>
   * @param df The DataFrame which contains the input data
   * @param predictionCol The name of the column which contains the predicted cluster id
   *                      for the point.
   * @param featuresCol The name of the column which contains the feature vector of the point.
   * @param weightCol The name of the column which contains the instance weight.
   * @return A {@link scala.collection.immutable.Map} which associates each cluster id
   *         to a {@link ClusterStats} object (which contains the precomputed values <code>N</code>,
   *         <code>$\Psi_{\Gamma}$</code> and <code>$Y_{\Gamma}$</code> for a cluster).
   */
  public  scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.evaluation.SquaredEuclideanSilhouette.ClusterStats> computeClusterStats (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.lang.String predictionCol, java.lang.String featuresCol, java.lang.String weightCol)  { throw new RuntimeException(); }
  /**
   * It computes the Silhouette coefficient for a point.
   * <p>
   * @param broadcastedClustersMap A map of the precomputed values for each cluster.
   * @param point The {@link org.apache.spark.ml.linalg.Vector} representing the current point.
   * @param clusterId The id of the cluster the current point belongs to.
   * @param weight The instance weight of the current point.
   * @param squaredNorm The <code>$\Xi_{X}$</code> (which is the squared norm) precomputed for the point.
   * @return The Silhouette for the point.
   */
  public  double computeSilhouetteCoefficient (org.apache.spark.broadcast.Broadcast<scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.evaluation.SquaredEuclideanSilhouette.ClusterStats>> broadcastedClustersMap, org.apache.spark.ml.linalg.Vector point, double clusterId, double weight, double squaredNorm)  { throw new RuntimeException(); }
  /**
   * Compute the Silhouette score of the dataset using squared Euclidean distance measure.
   * <p>
   * @param dataset The input dataset (previously clustered) on which compute the Silhouette.
   * @param predictionCol The name of the column which contains the predicted cluster id
   *                      for the point.
   * @param featuresCol The name of the column which contains the feature vector of the point.
   * @param weightCol The name of the column which contains instance weight.
   * @return The average of the Silhouette values of the clustered data.
   */
  public  double computeSilhouetteScore (org.apache.spark.sql.Dataset<?> dataset, java.lang.String predictionCol, java.lang.String featuresCol, java.lang.String weightCol)  { throw new RuntimeException(); }
}
