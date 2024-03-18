package org.apache.spark.mllib.tree;
public  class DecisionTreeSuite$ extends org.apache.spark.SparkFunSuite {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DecisionTreeSuite$ MODULE$ = null;
  public   DecisionTreeSuite$ ()  { throw new RuntimeException(); }
  public  void validateClassifier (org.apache.spark.mllib.tree.model.DecisionTreeModel model, scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> input, double requiredAccuracy)  { throw new RuntimeException(); }
  public  void validateRegressor (org.apache.spark.mllib.tree.model.DecisionTreeModel model, scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> input, double requiredMSE)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.regression.LabeledPoint[] generateOrderedLabeledPointsWithLabel0 ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.regression.LabeledPoint[] generateOrderedLabeledPointsWithLabel1 ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.regression.LabeledPoint[] generateOrderedLabeledPoints ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.regression.LabeledPoint[] generateCategoricalDataPoints ()  { throw new RuntimeException(); }
  public  java.util.List<org.apache.spark.mllib.regression.LabeledPoint> generateCategoricalDataPointsAsJavaList ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.regression.LabeledPoint[] generateCategoricalDataPointsForMulticlass ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.regression.LabeledPoint[] generateContinuousDataPointsForMulticlass ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.regression.LabeledPoint[] generateCategoricalDataPointsForMulticlassForOrderedFeatures ()  { throw new RuntimeException(); }
  /**
   * Create a tree model.  This is deterministic and contains a variety of node and feature types.
   * @param algo (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.mllib.tree.model.DecisionTreeModel createModel (scala.Enumeration.Value algo)  { throw new RuntimeException(); }
  /**
   * Check if the two trees are exactly the same.
   * Note: I hesitate to override Node.equals since it could cause problems if users
   *       make mistakes such as creating loops of Nodes.
   * If the trees are not equal, this prints the two trees and throws an exception.
   * @param a (undocumented)
   * @param b (undocumented)
   */
    void checkEqual (org.apache.spark.mllib.tree.model.DecisionTreeModel a, org.apache.spark.mllib.tree.model.DecisionTreeModel b)  { throw new RuntimeException(); }
}
