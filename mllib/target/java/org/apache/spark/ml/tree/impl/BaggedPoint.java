package org.apache.spark.ml.tree.impl;
/**
 * Internal representation of a datapoint which belongs to several subsamples of the same dataset,
 * particularly for bagging (e.g., for random forests).
 * <p>
 * This holds one instance, as well as an array of weights which represent the (weighted)
 * number of times which this instance appears in each subsamplingRate.
 * E.g., (datum, [1, 0, 4]) indicates that there are 3 subsamples of the dataset and that
 * this datum has 1 copy, 0 copies, and 4 copies in the 3 subsamples, respectively.
 * <p>
 * param:  datum  Data instance
 * param:  subsampleCounts  Number of samples of this instance in each subsampled dataset.
 * param:  sampleWeight The weight of this instance.
 */
  class BaggedPoint<Datum extends java.lang.Object> implements scala.Serializable {
  /**
   * Convert an input dataset into its BaggedPoint representation,
   * choosing subsamplingRate counts for each instance.
   * Each subsamplingRate has the same number of instances as the original dataset,
   * and is created by subsampling without replacement.
   * @param input Input dataset.
   * @param subsamplingRate Fraction of the training data used for learning decision tree.
   * @param numSubsamples Number of subsamples of this RDD to take.
   * @param withReplacement Sampling with/without replacement.
   * @param extractSampleWeight A function to get the sample weight of each datum.
   * @param seed Random seed.
   * @return BaggedPoint dataset representation.
   */
  static public <Datum extends java.lang.Object> org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.BaggedPoint<Datum>> convertToBaggedRDD (org.apache.spark.rdd.RDD<Datum> input, double subsamplingRate, int numSubsamples, boolean withReplacement, scala.Function1<Datum, java.lang.Object> extractSampleWeight, long seed)  { throw new RuntimeException(); }
  public  Datum datum ()  { throw new RuntimeException(); }
  public  int[] subsampleCounts ()  { throw new RuntimeException(); }
  public  double sampleWeight ()  { throw new RuntimeException(); }
  // not preceding
  public   BaggedPoint (Datum datum, int[] subsampleCounts, double sampleWeight)  { throw new RuntimeException(); }
}
