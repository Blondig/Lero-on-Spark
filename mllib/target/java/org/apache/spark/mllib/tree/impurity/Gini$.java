package org.apache.spark.mllib.tree.impurity;
/**
 * Class for calculating the Gini impurity
 * (http://en.wikipedia.org/wiki/Decision_tree_learning#Gini_impurity)
 * during multiclass classification.
 */
public  class Gini$ implements org.apache.spark.mllib.tree.impurity.Impurity {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Gini$ MODULE$ = null;
  public   Gini$ ()  { throw new RuntimeException(); }
  /**
   * information calculation for multiclass classification
   * @param counts Array[Double] with counts for each label
   * @param totalCount sum of counts for all labels
   * @return information value, or 0 if totalCount = 0
   */
  public  double calculate (double[] counts, double totalCount)  { throw new RuntimeException(); }
  /**
   * variance calculation
   * @param count number of instances
   * @param sum sum of labels
   * @param sumSquares summation of squares of the labels
   * @return information value, or 0 if count = 0
   */
  public  double calculate (double count, double sum, double sumSquares)  { throw new RuntimeException(); }
  /**
   * Get this impurity instance.
   * This is useful for passing impurity parameters to a Strategy in Java.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.impurity.Gini$ instance ()  { throw new RuntimeException(); }
}
