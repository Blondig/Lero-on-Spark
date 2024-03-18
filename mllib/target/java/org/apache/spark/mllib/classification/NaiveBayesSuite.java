package org.apache.spark.mllib.classification;
public  class NaiveBayesSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.mllib.util.MLlibTestSparkContext {
  static public  scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> generateNaiveBayesInput (double[] pi, double[][] theta, int nPoints, int seed, java.lang.String modelType, int sample)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.util.MLlibTestSparkContext.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  public   NaiveBayesSuite ()  { throw new RuntimeException(); }
  public  void validatePrediction (scala.collection.Seq<java.lang.Object> predictions, scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> input)  { throw new RuntimeException(); }
  public  void validateModelFit (double[] piData, double[][] thetaData, org.apache.spark.mllib.classification.NaiveBayesModel model)  { throw new RuntimeException(); }
}
