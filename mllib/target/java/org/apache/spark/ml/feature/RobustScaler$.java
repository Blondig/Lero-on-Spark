package org.apache.spark.ml.feature;
public  class RobustScaler$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.feature.RobustScaler>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RobustScaler$ MODULE$ = null;
  public   RobustScaler$ ()  { throw new RuntimeException(); }
    org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.sql.catalyst.util.QuantileSummaries>> computeSummaries (org.apache.spark.rdd.RDD<org.apache.spark.ml.linalg.Vector> vectors, int numFeatures, double relativeError)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.RobustScaler load (java.lang.String path)  { throw new RuntimeException(); }
}
