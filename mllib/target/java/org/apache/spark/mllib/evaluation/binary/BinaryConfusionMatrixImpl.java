package org.apache.spark.mllib.evaluation.binary;
/**
 * Implementation of {@link org.apache.spark.mllib.evaluation.binary.BinaryConfusionMatrix}.
 * <p>
 * param:  count label counter for labels with scores greater than or equal to the current score
 * param:  totalCount label counter for all labels
 */
  class BinaryConfusionMatrixImpl implements org.apache.spark.mllib.evaluation.binary.BinaryConfusionMatrix, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.evaluation.binary.BinaryLabelCounter count ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.evaluation.binary.BinaryLabelCounter totalCount ()  { throw new RuntimeException(); }
  // not preceding
  public   BinaryConfusionMatrixImpl (org.apache.spark.mllib.evaluation.binary.BinaryLabelCounter count, org.apache.spark.mllib.evaluation.binary.BinaryLabelCounter totalCount)  { throw new RuntimeException(); }
  /** number of true positives */
  public  double weightedTruePositives ()  { throw new RuntimeException(); }
  /** number of false positives */
  public  double weightedFalsePositives ()  { throw new RuntimeException(); }
  /** number of false negatives */
  public  double weightedFalseNegatives ()  { throw new RuntimeException(); }
  /** number of true negatives */
  public  double weightedTrueNegatives ()  { throw new RuntimeException(); }
  /** number of positives */
  public  double weightedPositives ()  { throw new RuntimeException(); }
  /** number of negatives */
  public  double weightedNegatives ()  { throw new RuntimeException(); }
}
