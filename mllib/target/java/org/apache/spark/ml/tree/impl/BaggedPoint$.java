package org.apache.spark.ml.tree.impl;
public  class BaggedPoint$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BaggedPoint$ MODULE$ = null;
  public   BaggedPoint$ ()  { throw new RuntimeException(); }
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
  public <Datum extends java.lang.Object> org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.BaggedPoint<Datum>> convertToBaggedRDD (org.apache.spark.rdd.RDD<Datum> input, double subsamplingRate, int numSubsamples, boolean withReplacement, scala.Function1<Datum, java.lang.Object> extractSampleWeight, long seed)  { throw new RuntimeException(); }
}
