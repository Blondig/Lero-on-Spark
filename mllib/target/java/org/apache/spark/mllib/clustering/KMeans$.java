package org.apache.spark.mllib.clustering;
/**
 * Top-level methods for calling K-means clustering.
 */
public  class KMeans$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KMeans$ MODULE$ = null;
  public   KMeans$ ()  { throw new RuntimeException(); }
  public  java.lang.String RANDOM ()  { throw new RuntimeException(); }
  public  java.lang.String K_MEANS_PARALLEL ()  { throw new RuntimeException(); }
  /**
   * Trains a k-means model using the given set of parameters.
   * <p>
   * @param data Training points as an <code>RDD</code> of <code>Vector</code> types.
   * @param k Number of clusters to create.
   * @param maxIterations Maximum number of iterations allowed.
   * @param initializationMode The initialization algorithm. This can either be "random" or
   *                           "k-means||". (default: "k-means||")
   * @param seed Random seed for cluster initialization. Default is to generate seed based
   *             on system time.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.KMeansModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations, java.lang.String initializationMode, long seed)  { throw new RuntimeException(); }
  /**
   * Trains a k-means model using the given set of parameters.
   * <p>
   * @param data Training points as an <code>RDD</code> of <code>Vector</code> types.
   * @param k Number of clusters to create.
   * @param maxIterations Maximum number of iterations allowed.
   * @param initializationMode The initialization algorithm. This can either be "random" or
   *                           "k-means||". (default: "k-means||")
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.KMeansModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations, java.lang.String initializationMode)  { throw new RuntimeException(); }
  /**
   * Trains a k-means model using specified parameters and the default values for unspecified.
   * @param data (undocumented)
   * @param k (undocumented)
   * @param maxIterations (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.KMeansModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations)  { throw new RuntimeException(); }
    boolean validateInitMode (java.lang.String initMode)  { throw new RuntimeException(); }
}
