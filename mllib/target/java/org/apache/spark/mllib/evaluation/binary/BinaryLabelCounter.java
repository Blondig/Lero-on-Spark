package org.apache.spark.mllib.evaluation.binary;
/**
 * A counter for positives and negatives.
 * <p>
 * param:  weightedNumPositives weighted number of positive labels
 * param:  weightedNumNegatives weighted number of negative labels
 */
  class BinaryLabelCounter implements scala.Serializable {
  public  double weightedNumPositives ()  { throw new RuntimeException(); }
  public  double weightedNumNegatives ()  { throw new RuntimeException(); }
  // not preceding
  public   BinaryLabelCounter (double weightedNumPositives, double weightedNumNegatives)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.evaluation.binary.BinaryLabelCounter clone ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
