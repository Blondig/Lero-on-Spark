package org.apache.spark.mllib.clustering;
/**
 * A bisecting k-means algorithm based on the paper "A comparison of document clustering techniques"
 * by Steinbach, Karypis, and Kumar, with modification to fit Spark.
 * The algorithm starts from a single cluster that contains all points.
 * Iteratively it finds divisible clusters on the bottom level and bisects each of them using
 * k-means, until there are <code>k</code> leaf clusters in total or no leaf clusters are divisible.
 * The bisecting steps of clusters on the same level are grouped together to increase parallelism.
 * If bisecting all divisible clusters on the bottom level would result more than <code>k</code> leaf clusters,
 * larger clusters get higher priority.
 * <p>
 * param:  k the desired number of leaf clusters (default: 4). The actual number could be smaller if
 *          there are no divisible leaf clusters.
 * param:  maxIterations the max number of k-means iterations to split clusters (default: 20)
 * param:  minDivisibleClusterSize the minimum number of points (if greater than or equal 1.0) or
 *                                the minimum proportion of points (if less than 1.0) of a divisible
 *                                cluster (default: 1)
 * param:  seed a random seed (default: hash value of the class name)
 * <p>
 * @see <a href="http://glaros.dtc.umn.edu/gkhome/fetch/papers/docclusterKDDTMW00.pdf">
 * Steinbach, Karypis, and Kumar, A comparison of document clustering techniques,
 * KDD Workshop on Text Mining, 2000.</a>
 */
public  class BisectingKMeans implements org.apache.spark.internal.Logging {
  /**
   * Constructs with the default configuration
   */
  public   BisectingKMeans ()  { throw new RuntimeException(); }
  /**
   * Sets the desired number of leaf clusters (default: 4).
   * The actual number could be smaller if there are no divisible leaf clusters.
   * @param k (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.BisectingKMeans setK (int k)  { throw new RuntimeException(); }
  /**
   * Gets the desired number of leaf clusters.
   * @return (undocumented)
   */
  public  int getK ()  { throw new RuntimeException(); }
  /**
   * Sets the max number of k-means iterations to split clusters (default: 20).
   * @param maxIterations (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.BisectingKMeans setMaxIterations (int maxIterations)  { throw new RuntimeException(); }
  /**
   * Gets the max number of k-means iterations to split clusters.
   * @return (undocumented)
   */
  public  int getMaxIterations ()  { throw new RuntimeException(); }
  /**
   * Sets the minimum number of points (if greater than or equal to <code>1.0</code>) or the minimum proportion
   * of points (if less than <code>1.0</code>) of a divisible cluster (default: 1).
   * @param minDivisibleClusterSize (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.BisectingKMeans setMinDivisibleClusterSize (double minDivisibleClusterSize)  { throw new RuntimeException(); }
  /**
   * Gets the minimum number of points (if greater than or equal to <code>1.0</code>) or the minimum proportion
   * of points (if less than <code>1.0</code>) of a divisible cluster.
   * @return (undocumented)
   */
  public  double getMinDivisibleClusterSize ()  { throw new RuntimeException(); }
  /**
   * Sets the random seed (default: hash value of the class name).
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.BisectingKMeans setSeed (long seed)  { throw new RuntimeException(); }
  /**
   * Gets the random seed.
   * @return (undocumented)
   */
  public  long getSeed ()  { throw new RuntimeException(); }
  /**
   * The distance suite used by the algorithm.
   * @return (undocumented)
   */
  public  java.lang.String getDistanceMeasure ()  { throw new RuntimeException(); }
  /**
   * Set the distance suite used by the algorithm.
   * @param distanceMeasure (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.BisectingKMeans setDistanceMeasure (java.lang.String distanceMeasure)  { throw new RuntimeException(); }
    org.apache.spark.mllib.clustering.BisectingKMeansModel runWithWeight (org.apache.spark.rdd.RDD<scala.Tuple2<org.apache.spark.mllib.linalg.Vector, java.lang.Object>> instances, boolean handlePersistence, scala.Option<org.apache.spark.ml.util.Instrumentation> instr)  { throw new RuntimeException(); }
  /**
   * Runs the bisecting k-means algorithm.
   * @param input RDD of vectors
   * @return model for the bisecting kmeans
   */
  public  org.apache.spark.mllib.clustering.BisectingKMeansModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> input)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>run()</code>.
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.BisectingKMeansModel run (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
}
