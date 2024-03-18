package org.apache.spark.ml.tree.impl;
/**
 * DecisionTree statistics aggregator for a node.
 * This holds a flat array of statistics for a set of (features, bins)
 * and helps with indexing.
 * This class is abstract to support learning with and without feature subsampling.
 */
  class DTStatsAggregator implements scala.Serializable {
  // not preceding
  public   DTStatsAggregator (org.apache.spark.ml.tree.impl.DecisionTreeMetadata metadata, scala.Option<int[]> featureSubset)  { throw new RuntimeException(); }
  /**
   * Faster version of {@link update}.
   * Update the stats for a given (feature, bin), using the given label.
   * <p>
   * @param featureOffset  This is a pre-computed feature offset
   *                           from {@link getFeatureOffset}.
   * @param binIndex (undocumented)
   * @param label (undocumented)
   * @param numSamples (undocumented)
   * @param sampleWeight (undocumented)
   */
  public  void featureUpdate (int featureOffset, int binIndex, double label, int numSamples, double sampleWeight)  { throw new RuntimeException(); }
  /**
   * Pre-compute feature offset for use with {@link featureUpdate}.
   * For ordered features only.
   * @param featureIndex (undocumented)
   * @return (undocumented)
   */
  public  int getFeatureOffset (int featureIndex)  { throw new RuntimeException(); }
  /**
   * Get an {@link ImpurityCalculator} for a given (node, feature, bin).
   * <p>
   * @param featureOffset  This is a pre-computed (node, feature) offset
   *                           from {@link getFeatureOffset}.
   * @param binIndex (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.impurity.ImpurityCalculator getImpurityCalculator (int featureOffset, int binIndex)  { throw new RuntimeException(); }
  /**
   * Get an {@link ImpurityCalculator} for the parent node.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.impurity.ImpurityCalculator getParentImpurityCalculator ()  { throw new RuntimeException(); }
  /**
   * {@link ImpurityAggregator} instance specifying the impurity type.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.impurity.ImpurityAggregator impurityAggregator ()  { throw new RuntimeException(); }
  /**
   * Merge this aggregator with another, and returns this aggregator.
   * This method modifies this aggregator in-place.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tree.impl.DTStatsAggregator merge (org.apache.spark.ml.tree.impl.DTStatsAggregator other)  { throw new RuntimeException(); }
  /**
   * For a given feature, merge the stats for two bins.
   * <p>
   * @param featureOffset  This is a pre-computed feature offset
   *                           from {@link getFeatureOffset}.
   * @param binIndex  The other bin is merged into this bin.
   * @param otherBinIndex  This bin is not modified.
   */
  public  void mergeForFeature (int featureOffset, int binIndex, int otherBinIndex)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tree.impl.DecisionTreeMetadata metadata ()  { throw new RuntimeException(); }
  /**
   * Update the stats for a given (feature, bin) for ordered features, using the given label.
   * @param featureIndex (undocumented)
   * @param binIndex (undocumented)
   * @param label (undocumented)
   * @param numSamples (undocumented)
   * @param sampleWeight (undocumented)
   */
  public  void update (int featureIndex, int binIndex, double label, int numSamples, double sampleWeight)  { throw new RuntimeException(); }
  /**
   * Update the parent node stats using the given label.
   * @param label (undocumented)
   * @param numSamples (undocumented)
   * @param sampleWeight (undocumented)
   */
  public  void updateParent (double label, int numSamples, double sampleWeight)  { throw new RuntimeException(); }
}
