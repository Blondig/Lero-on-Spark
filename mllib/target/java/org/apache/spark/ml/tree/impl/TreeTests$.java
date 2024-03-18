package org.apache.spark.ml.tree.impl;
public  class TreeTests$ extends org.apache.spark.SparkFunSuite {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TreeTests$ MODULE$ = null;
  public   TreeTests$ ()  { throw new RuntimeException(); }
  /**
   * Convert the given data to a DataFrame, and set the features and label metadata.
   * <p>
   * @param data  Dataset.  Categorical features and labels must already have 0-based indices.
   *              This must be non-empty.
   * @param categoricalFeatures  Map: categorical feature index to number of distinct values
   * @param numClasses  Number of classes label can take.  If 0, mark as continuous.
   * @return DataFrame with metadata
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> setMetadata (org.apache.spark.rdd.RDD<?> data, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numClasses)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>setMetadata()</code>
   * @param data (undocumented)
   * @param categoricalFeatures (undocumented)
   * @param numClasses (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> setMetadata (org.apache.spark.api.java.JavaRDD<org.apache.spark.ml.feature.LabeledPoint> data, java.util.Map<java.lang.Integer, java.lang.Integer> categoricalFeatures, int numClasses)  { throw new RuntimeException(); }
  /**
   * Set label metadata (particularly the number of classes) on a DataFrame.
   * <p>
   * @param data  Dataset.  Categorical features and labels must already have 0-based indices.
   *              This must be non-empty.
   * @param numClasses  Number of classes label can take. If 0, mark as continuous.
   * @param labelColName  Name of the label column on which to set the metadata.
   * @param featuresColName  Name of the features column
   * @return DataFrame with metadata
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> setMetadata (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, int numClasses, java.lang.String labelColName, java.lang.String featuresColName)  { throw new RuntimeException(); }
  /**
   * Check if the two trees are exactly the same.
   * Note: I hesitate to override Node.equals since it could cause problems if users
   *       make mistakes such as creating loops of Nodes.
   * If the trees are not equal, this prints the two trees and throws an exception.
   * @param a (undocumented)
   * @param b (undocumented)
   */
  public  void checkEqual (org.apache.spark.ml.tree.DecisionTreeModel a, org.apache.spark.ml.tree.DecisionTreeModel b)  { throw new RuntimeException(); }
  /**
   * Check if the two models are exactly the same.
   * If the models are not equal, this throws an exception.
   * @param a (undocumented)
   * @param b (undocumented)
   */
  public <M extends org.apache.spark.ml.tree.DecisionTreeModel> void checkEqual (org.apache.spark.ml.tree.TreeEnsembleModel<M> a, org.apache.spark.ml.tree.TreeEnsembleModel<M> b)  { throw new RuntimeException(); }
  /**
   * Helper method for constructing a tree for testing.
   * Given left, right children, construct a parent node.
   * <p>
   * @param split  Split for parent node
   * @return  Parent node with children attached
   * @param left (undocumented)
   * @param right (undocumented)
   */
  public  org.apache.spark.ml.tree.Node buildParentNode (org.apache.spark.ml.tree.Node left, org.apache.spark.ml.tree.Node right, org.apache.spark.ml.tree.Split split)  { throw new RuntimeException(); }
  /**
   * Create some toy data for testing feature importances.
   * @param sc (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.LabeledPoint> featureImportanceData (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /**
   * Create some toy data for testing correctness of variance.
   * @param sc (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.LabeledPoint> varianceData (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /**
   * Mapping from all Params to valid settings which differ from the defaults.
   * This is useful for tests which need to exercise all Params, such as save/load.
   * This excludes input columns to simplify some tests.
   * <p>
   * This set of Params is for all Decision Tree-based models.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> allParamSettings ()  { throw new RuntimeException(); }
  /** Data for tree read/write tests which produces a non-trivial tree. */
  public  org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.LabeledPoint> getTreeReadWriteData (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /**
   * Feature vectors used in tree-based transformation.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector[] leafVectors ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tree.InternalNode root0 ()  { throw new RuntimeException(); }
  /**
   * The leaf indices of vectors after transformation by root0.
   * @return (undocumented)
   */
  public  double[] leafIndices0 ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tree.InternalNode root1 ()  { throw new RuntimeException(); }
  /**
   * The leaf indices of vectors after transformation by root1.
   * @return (undocumented)
   */
  public  double[] leafIndices1 ()  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, org.apache.spark.ml.linalg.Vector>[] getSingleTreeLeafData ()  { throw new RuntimeException(); }
  public  scala.Tuple2<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector>[] getTwoTreesLeafData ()  { throw new RuntimeException(); }
}
