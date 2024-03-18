package org.apache.spark.ml.regression;
/**
 * Model produced by {@link FMRegressor}.
 */
public  class FMRegressionModel extends org.apache.spark.ml.regression.RegressionModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.regression.FMRegressionModel> implements org.apache.spark.ml.regression.FMRegressorParams, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link FMRegressionModel} */
  static   class FMRegressionModelWriter extends org.apache.spark.ml.util.MLWriter implements org.apache.spark.internal.Logging {
    public   FMRegressionModelWriter (org.apache.spark.ml.regression.FMRegressionModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.FMRegressionModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.regression.FMRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam factorSize ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam fitLinear ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam miniBatchFraction ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam initStd ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> solver ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam regParam ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam fitIntercept ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam stepSize ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  double intercept ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector linear ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Matrix factors ()  { throw new RuntimeException(); }
  // not preceding
     FMRegressionModel (java.lang.String uid, double intercept, org.apache.spark.ml.linalg.Vector linear, org.apache.spark.ml.linalg.Matrix factors)  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  double predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.FMRegressionModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
