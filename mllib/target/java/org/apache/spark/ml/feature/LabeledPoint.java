package org.apache.spark.ml.feature;
/**
 * Class that represents the features and label of a data point.
 * <p>
 * param:  label Label for this data point.
 * param:  features List of features for this data point.
 */
public  class LabeledPoint implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  public  double label ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector features ()  { throw new RuntimeException(); }
  // not preceding
  public   LabeledPoint (double label, org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  double getLabel ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector getFeatures ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
    org.apache.spark.ml.feature.Instance toInstance (double weight)  { throw new RuntimeException(); }
    org.apache.spark.ml.feature.Instance toInstance ()  { throw new RuntimeException(); }
}
