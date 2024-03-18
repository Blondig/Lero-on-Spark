package org.apache.spark.ml.feature;
/**
 * Case class that represents an instance of data point with
 * label, weight, offset and features.
 * This is mainly used in GeneralizedLinearRegression currently.
 * <p>
 * param:  label Label for this data point.
 * param:  weight The weight of this instance.
 * param:  offset The offset used for this data point.
 * param:  features The vector of features for this data point.
 */
  class OffsetInstance implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  double label ()  { throw new RuntimeException(); }
  public  double weight ()  { throw new RuntimeException(); }
  public  double offset ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector features ()  { throw new RuntimeException(); }
  // not preceding
  public   OffsetInstance (double label, double weight, double offset, org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  /** Converts to an {@link Instance} object by leaving out the offset. */
  public  org.apache.spark.ml.feature.Instance toInstance ()  { throw new RuntimeException(); }
}
