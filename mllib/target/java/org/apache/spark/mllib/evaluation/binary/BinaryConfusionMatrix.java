package org.apache.spark.mllib.evaluation.binary;
/**
 * Trait for a binary confusion matrix.
 */
public  interface BinaryConfusionMatrix {
  /** weighted number of false negatives */
  public  double weightedFalseNegatives ()  ;
  /** weighted number of false positives */
  public  double weightedFalsePositives ()  ;
  /** weighted number of negatives */
  public  double weightedNegatives ()  ;
  /** weighted number of positives */
  public  double weightedPositives ()  ;
  /** weighted number of true negatives */
  public  double weightedTrueNegatives ()  ;
  /** weighted number of true positives */
  public  double weightedTruePositives ()  ;
}
