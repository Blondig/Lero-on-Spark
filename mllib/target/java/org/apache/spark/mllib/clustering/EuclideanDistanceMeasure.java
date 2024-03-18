package org.apache.spark.mllib.clustering;
  class EuclideanDistanceMeasure extends org.apache.spark.mllib.clustering.DistanceMeasure {
  /**
   * @return the squared Euclidean distance between two vectors computed by
   * {@link org.apache.spark.mllib.util.MLUtils#fastSquaredDistance}.
   * @param v1 (undocumented)
   * @param v2 (undocumented)
   */
  static   double fastSquaredDistance (org.apache.spark.mllib.clustering.VectorWithNorm v1, org.apache.spark.mllib.clustering.VectorWithNorm v2)  { throw new RuntimeException(); }
  public   EuclideanDistanceMeasure ()  { throw new RuntimeException(); }
  /**
   * Statistics used in triangle inequality to obtain useful bounds to find closest centers.
   * @see <a href="https://www.aaai.org/Papers/ICML/2003/ICML03-022.pdf">Charles Elkan,
   *      Using the Triangle Inequality to Accelerate k-Means</a>
   * <p>
   * @return One element used in statistics matrix to make matrix(i,j) represents:
   *         1, if i != j: a bound r = matrix(i,j) to help avoiding unnecessary distance
   *         computation. Given point x, let i be current closest center, and d be current best
   *         squared distance, if d < r, then we no longer need to compute the distance to center
   *         j. matrix(i,j) equals to squared of half of Euclidean distance between centers i
   *         and j;
   *         2, if i == j: a bound r = matrix(i,i) = min_k{matrix(i,k)|k!=i}. If squared
   *         distance between point x and center i is less than r, then center i is the closest
   *         center to point x.
   * @param distance (undocumented)
   */
  public  double computeStatistics (double distance)  { throw new RuntimeException(); }
  /**
   * @return the index of the closest center to the given point, as well as the cost.
   * @param centers (undocumented)
   * @param statistics (undocumented)
   * @param point (undocumented)
   */
  public  scala.Tuple2<java.lang.Object, java.lang.Object> findClosest (org.apache.spark.mllib.clustering.VectorWithNorm[] centers, double[] statistics, org.apache.spark.mllib.clustering.VectorWithNorm point)  { throw new RuntimeException(); }
  /**
   * @return the index of the closest center to the given point, as well as the squared distance.
   * @param centers (undocumented)
   * @param point (undocumented)
   */
  public  scala.Tuple2<java.lang.Object, java.lang.Object> findClosest (org.apache.spark.mllib.clustering.VectorWithNorm[] centers, org.apache.spark.mllib.clustering.VectorWithNorm point)  { throw new RuntimeException(); }
  /**
   * @return whether a center converged or not, given the epsilon parameter.
   * @param oldCenter (undocumented)
   * @param newCenter (undocumented)
   * @param epsilon (undocumented)
   */
  public  boolean isCenterConverged (org.apache.spark.mllib.clustering.VectorWithNorm oldCenter, org.apache.spark.mllib.clustering.VectorWithNorm newCenter, double epsilon)  { throw new RuntimeException(); }
  /**
   * @param v1: first vector
   * @param v2: second vector
   * @return the Euclidean distance between the two input vectors
   */
  public  double distance (org.apache.spark.mllib.clustering.VectorWithNorm v1, org.apache.spark.mllib.clustering.VectorWithNorm v2)  { throw new RuntimeException(); }
  /**
   * @return the total cost of the cluster from its aggregated properties
   * @param centroid (undocumented)
   * @param pointsSum (undocumented)
   * @param weightSum (undocumented)
   * @param pointsSquaredNorm (undocumented)
   */
  public  double clusterCost (org.apache.spark.mllib.clustering.VectorWithNorm centroid, org.apache.spark.mllib.clustering.VectorWithNorm pointsSum, double weightSum, double pointsSquaredNorm)  { throw new RuntimeException(); }
  /**
   * @return the cost of a point to be assigned to the cluster centroid
   * @param point (undocumented)
   * @param centroid (undocumented)
   */
  public  double cost (org.apache.spark.mllib.clustering.VectorWithNorm point, org.apache.spark.mllib.clustering.VectorWithNorm centroid)  { throw new RuntimeException(); }
}
