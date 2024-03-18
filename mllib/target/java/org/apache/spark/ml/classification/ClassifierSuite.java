package org.apache.spark.ml.classification;
public  class ClassifierSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.mllib.util.MLlibTestSparkContext {
  static public  class MockClassifier extends org.apache.spark.ml.classification.Classifier<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.ClassifierSuite.MockClassifier, org.apache.spark.ml.classification.ClassifierSuite.MockClassificationModel> {
    // not preceding
    public   MockClassifier (java.lang.String uid)  { throw new RuntimeException(); }
    public   MockClassifier ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.classification.ClassifierSuite.MockClassifier copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
    public  org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.LabeledPoint> extractLabeledPoints (org.apache.spark.sql.Dataset<?> dataset, int numClasses)  { throw new RuntimeException(); }
    public  int getNumClasses (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
    public  org.apache.spark.ml.classification.ClassifierSuite.MockClassificationModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
    public  java.lang.String uid ()  { throw new RuntimeException(); }
  }
  static public  class MockClassificationModel extends org.apache.spark.ml.classification.ClassificationModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.ClassifierSuite.MockClassificationModel> {
    // not preceding
    public   MockClassificationModel (java.lang.String uid)  { throw new RuntimeException(); }
    public   MockClassificationModel ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.classification.ClassifierSuite.MockClassificationModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
    public  int numClasses ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.linalg.Vector predictRaw (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
    public  java.lang.String uid ()  { throw new RuntimeException(); }
  }
  /**
   * Mapping from all Params to valid settings which differ from the defaults.
   * This is useful for tests which need to exercise all Params, such as save/load.
   * This excludes input columns to simplify some tests.
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> allParamSettings ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.util.MLlibTestSparkContext.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  public   ClassifierSuite ()  { throw new RuntimeException(); }
}
