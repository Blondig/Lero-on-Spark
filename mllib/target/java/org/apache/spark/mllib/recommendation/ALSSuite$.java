package org.apache.spark.mllib.recommendation;
public  class ALSSuite$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ALSSuite$ MODULE$ = null;
  public   ALSSuite$ ()  { throw new RuntimeException(); }
  public  scala.Tuple3<java.util.List<org.apache.spark.mllib.recommendation.Rating>, double[], double[]> generateRatingsAsJava (int users, int products, int features, double samplingRate, boolean implicitPrefs, boolean negativeWeights)  { throw new RuntimeException(); }
  public  scala.Tuple3<scala.collection.Seq<org.apache.spark.mllib.recommendation.Rating>, breeze.linalg.DenseMatrix<java.lang.Object>, breeze.linalg.DenseMatrix<java.lang.Object>> generateRatings (int users, int products, int features, double samplingRate, boolean implicitPrefs, boolean negativeWeights, boolean negativeFactors)  { throw new RuntimeException(); }
}
