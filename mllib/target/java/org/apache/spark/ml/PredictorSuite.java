package org.apache.spark.ml;
public  class PredictorSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.mllib.util.MLlibTestSparkContext {
  static public  class MockPredictor extends org.apache.spark.ml.Predictor<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.PredictorSuite.MockPredictor, org.apache.spark.ml.PredictorSuite.MockPredictionModel> implements org.apache.spark.ml.param.shared.HasWeightCol {
    // not preceding
    public   MockPredictor (java.lang.String uid)  { throw new RuntimeException(); }
    public   MockPredictor ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.PredictorSuite.MockPredictor copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
    public  org.apache.spark.ml.PredictorSuite.MockPredictor setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
    public  org.apache.spark.ml.PredictorSuite.MockPredictionModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
    public  java.lang.String uid ()  { throw new RuntimeException(); }
    public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  }
  static public  class MockPredictionModel extends org.apache.spark.ml.PredictionModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.PredictorSuite.MockPredictionModel> {
    // not preceding
    public   MockPredictionModel (java.lang.String uid)  { throw new RuntimeException(); }
    public   MockPredictionModel ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.PredictorSuite.MockPredictionModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
    public  double predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
    public  java.lang.String uid ()  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.util.MLlibTestSparkContext.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  public   PredictorSuite ()  { throw new RuntimeException(); }
}
