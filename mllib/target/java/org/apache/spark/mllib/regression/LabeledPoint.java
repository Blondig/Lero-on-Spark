package org.apache.spark.mllib.regression;
/**
 * Class that represents the features and labels of a data point.
 * <p>
 * param:  label Label for this data point.
 * param:  features List of features for this data point.
 */
public  class LabeledPoint implements scala.Product, scala.Serializable {
  /**
   * Parses a string resulted from <code>LabeledPoint#toString</code> into
   * an {@link org.apache.spark.mllib.regression.LabeledPoint}.
   * <p>
   * @param s (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.regression.LabeledPoint parse (java.lang.String s)  { throw new RuntimeException(); }
  static   org.apache.spark.mllib.regression.LabeledPoint fromML (org.apache.spark.ml.feature.LabeledPoint point)  { throw new RuntimeException(); }
  public  double label ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector features ()  { throw new RuntimeException(); }
  // not preceding
  public   LabeledPoint (double label, org.apache.spark.mllib.linalg.Vector features)  { throw new RuntimeException(); }
  public  double getLabel ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector getFeatures ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
    org.apache.spark.ml.feature.LabeledPoint asML ()  { throw new RuntimeException(); }
}
