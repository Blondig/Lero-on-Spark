package org.apache.spark.mllib.clustering;
/**
 * Clustering model produced by {@link BisectingKMeans}.
 * The prediction is done level-by-level from the root node to a leaf node, and at each node among
 * its children the closest to the input point is selected.
 * <p>
 * param:  root the root node of the clustering tree
 */
public  class BisectingKMeansModel implements scala.Serializable, org.apache.spark.mllib.util.Saveable, org.apache.spark.internal.Logging {
  static public  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    public   SaveLoadV1_0$ ()  { throw new RuntimeException(); }
      java.lang.String thisFormatVersion ()  { throw new RuntimeException(); }
      java.lang.String thisClassName ()  { throw new RuntimeException(); }
    public  void save (org.apache.spark.SparkContext sc, org.apache.spark.mllib.clustering.BisectingKMeansModel model, java.lang.String path)  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.clustering.BisectingKMeansModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class SaveLoadV2_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV2_0$ MODULE$ = null;
    public   SaveLoadV2_0$ ()  { throw new RuntimeException(); }
      java.lang.String thisFormatVersion ()  { throw new RuntimeException(); }
      java.lang.String thisClassName ()  { throw new RuntimeException(); }
    public  void save (org.apache.spark.SparkContext sc, org.apache.spark.mllib.clustering.BisectingKMeansModel model, java.lang.String path)  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.clustering.BisectingKMeansModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class SaveLoadV3_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV3_0$ MODULE$ = null;
    public   SaveLoadV3_0$ ()  { throw new RuntimeException(); }
      java.lang.String thisFormatVersion ()  { throw new RuntimeException(); }
      java.lang.String thisClassName ()  { throw new RuntimeException(); }
    public  void save (org.apache.spark.SparkContext sc, org.apache.spark.mllib.clustering.BisectingKMeansModel model, java.lang.String path)  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.clustering.BisectingKMeansModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.mllib.clustering.BisectingKMeansModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
    org.apache.spark.mllib.clustering.ClusteringTreeNode root ()  { throw new RuntimeException(); }
  public  java.lang.String distanceMeasure ()  { throw new RuntimeException(); }
  public  double trainingCost ()  { throw new RuntimeException(); }
  // not preceding
     BisectingKMeansModel (org.apache.spark.mllib.clustering.ClusteringTreeNode root, java.lang.String distanceMeasure, double trainingCost)  { throw new RuntimeException(); }
  public   BisectingKMeansModel (org.apache.spark.mllib.clustering.ClusteringTreeNode root)  { throw new RuntimeException(); }
  /**
   * Leaf cluster centers.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector[] clusterCenters ()  { throw new RuntimeException(); }
  // not preceding
  public  int k ()  { throw new RuntimeException(); }
  /**
   * Predicts the index of the cluster that the input point belongs to.
   * @param point (undocumented)
   * @return (undocumented)
   */
  public  int predict (org.apache.spark.mllib.linalg.Vector point)  { throw new RuntimeException(); }
  /**
   * Predicts the indices of the clusters that the input points belong to.
   * @param points (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> points)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>predict()</code>.
   * @param points (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Integer> predict (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> points)  { throw new RuntimeException(); }
  /**
   * Computes the squared distance between the input point and the cluster center it belongs to.
   * @param point (undocumented)
   * @return (undocumented)
   */
  public  double computeCost (org.apache.spark.mllib.linalg.Vector point)  { throw new RuntimeException(); }
  /**
   * Computes the sum of squared distances between the input points and their corresponding cluster
   * centers.
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  double computeCost (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>computeCost()</code>.
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  double computeCost (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
}
