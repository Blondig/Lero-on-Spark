package org.apache.spark.mllib.clustering;
  class CosineDistanceMeasure extends org.apache.spark.mllib.clustering.DistanceMeasure {
  public   CosineDistanceMeasure ()  { throw new RuntimeException(); }
  /**
   * Returns a centroid for a cluster given its <code>sum</code> vector and its <code>count</code> of points.
   * <p>
   * @param sum   the <code>sum</code> for a cluster
   * @param weightSum the sum of weight in the cluster
   * @return the centroid of the cluster
   */
  public  org.apache.spark.mllib.clustering.VectorWithNorm centroid (org.apache.spark.mllib.linalg.Vector sum, double weightSum)  { throw new RuntimeException(); }
  /**
   * @return the total cost of the cluster from its aggregated properties
   * @param centroid (undocumented)
   * @param pointsSum (undocumented)
   * @param weightSum (undocumented)
   * @param pointsSquaredNorm (undocumented)
   */
  public  double clusterCost (org.apache.spark.mllib.clustering.VectorWithNorm centroid, org.apache.spark.mllib.clustering.VectorWithNorm pointsSum, double weightSum, double pointsSquaredNorm)  { throw new RuntimeException(); }
  /**
   * Statistics used in triangle inequality to obtain useful bounds to find closest centers.
   * <p>
   * @return One element used in statistics matrix to make matrix(i,j) represents:
   *         1, if i != j: a bound r = matrix(i,j) to help avoiding unnecessary distance
   *         computation. Given point x, let i be current closest center, and d be current best
   *         squared distance, if d < r, then we no longer need to compute the distance to center
   *         j. For Cosine distance, it is similar to Euclidean distance. However, radian/angle
   *         is used instead of Cosine distance to compute matrix(i,j): for centers i and j,
   *         compute the radian/angle between them, halving it, and converting it back to Cosine
   *         distance at the end;
   *         2, if i == j: a bound r = matrix(i,i) = min_k{matrix(i,k)|k!=i}. If Cosine
   *         distance between point x and center i is less than r, then center i is the closest
   *         center to point x.
   * @param distance (undocumented)
   */
  public  double computeStatistics (double distance)  { throw new RuntimeException(); }
  /**
   * @param v1: first vector
   * @param v2: second vector
   * @return the cosine distance between the two input vectors
   */
  public  double distance (org.apache.spark.mllib.clustering.VectorWithNorm v1, org.apache.spark.mllib.clustering.VectorWithNorm v2)  { throw new RuntimeException(); }
  /**
   * @return the index of the closest center to the given point, as well as the cost.
   * @param centers (undocumented)
   * @param statistics (undocumented)
   * @param point (undocumented)
   */
  public  scala.Tuple2<java.lang.Object, java.lang.Object> findClosest (org.apache.spark.mllib.clustering.VectorWithNorm[] centers, double[] statistics, org.apache.spark.mllib.clustering.VectorWithNorm point)  { throw new RuntimeException(); }
  /**
   * Returns two new centroids symmetric to the specified centroid applying <code>noise</code> with the
   * with the specified <code>level</code>.
   * <p>
   * @param level the level of <code>noise</code> to apply to the given centroid.
   * @param noise a noise vector
   * @param centroid the parent centroid
   * @return a left and right centroid symmetric to <code>centroid</code>
   */
  public  scala.Tuple2<org.apache.spark.mllib.clustering.VectorWithNorm, org.apache.spark.mllib.clustering.VectorWithNorm> symmetricCentroids (double level, org.apache.spark.mllib.linalg.Vector noise, org.apache.spark.mllib.linalg.Vector centroid)  { throw new RuntimeException(); }
  /**
   * Updates the value of <code>sum</code> adding the <code>point</code> vector.
   * @param point a <code>VectorWithNorm</code> to be added to <code>sum</code> of a cluster
   * @param sum the <code>sum</code> for a cluster to be updated
   */
  public  void updateClusterSum (org.apache.spark.mllib.clustering.VectorWithNorm point, org.apache.spark.mllib.linalg.Vector sum)  { throw new RuntimeException(); }
}
