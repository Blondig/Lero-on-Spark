package org.apache.spark.ml.tree.impl;
/**
 * Internal representation of LabeledPoint for DecisionTree.
 * This bins feature values based on a subsampled of data as follows:
 *  (a) Continuous features are binned into ranges.
 *  (b) Unordered categorical features are binned based on subsets of feature values.
 *      "Unordered categorical features" are categorical features with low arity used in
 *      multiclass classification.
 *  (c) Ordered categorical features are binned based on feature values.
 *      "Ordered categorical features" are categorical features with high arity,
 *      or any categorical feature used in regression or binary classification.
 * <p>
 * param:  label  Label from LabeledPoint
 * param:  binnedFeatures  Binned feature values.
 *                        Same length as LabeledPoint.features, but values are bin indices.
 * param:  weight Sample weight for this TreePoint.
 */
  class TreePoint implements scala.Serializable {
  /**
   * Convert an input dataset into its TreePoint representation,
   * binning feature values in preparation for DecisionTree training.
   * @param input     Input dataset.
   * @param splits    Splits for features, of size (numFeatures, numSplits).
   * @param metadata  Learning and dataset metadata
   * @return  TreePoint dataset representation
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.TreePoint> convertToTreeRDD (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> input, org.apache.spark.ml.tree.Split[][] splits, org.apache.spark.ml.tree.impl.DecisionTreeMetadata metadata)  { throw new RuntimeException(); }
  public  double label ()  { throw new RuntimeException(); }
  public  int[] binnedFeatures ()  { throw new RuntimeException(); }
  public  double weight ()  { throw new RuntimeException(); }
  // not preceding
  public   TreePoint (double label, int[] binnedFeatures, double weight)  { throw new RuntimeException(); }
}
