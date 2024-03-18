package org.apache.spark.mllib.tree.impurity;
/**
 * Stores statistics for one (node, feature, bin) for calculating impurity.
 * Unlike {@link EntropyAggregator}, this class stores its own data and is for a specific
 * (node, feature, bin).
 * param:  stats  Array of sufficient statistics for a (node, feature, bin).
 */
  class EntropyCalculator extends org.apache.spark.mllib.tree.impurity.ImpurityCalculator {
  // not preceding
  public   EntropyCalculator (double[] stats, long rawCount)  { throw new RuntimeException(); }
  /**
   * Calculate the impurity from the stored sufficient statistics.
   * @return (undocumented)
   */
  public  double calculate ()  { throw new RuntimeException(); }
  /**
   * Make a deep copy of this {@link ImpurityCalculator}.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.impurity.EntropyCalculator copy ()  { throw new RuntimeException(); }
  /**
   * Weighted number of data points accounted for in the sufficient statistics.
   * @return (undocumented)
   */
  public  double count ()  { throw new RuntimeException(); }
  /**
   * Prediction which should be made based on the sufficient statistics.
   * @return (undocumented)
   */
  public  double predict ()  { throw new RuntimeException(); }
  /**
   * Probability of the label given by {@link predict}.
   * @param label (undocumented)
   * @return (undocumented)
   */
  public  double prob (double label)  { throw new RuntimeException(); }
  // not preceding
  public  long rawCount ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
