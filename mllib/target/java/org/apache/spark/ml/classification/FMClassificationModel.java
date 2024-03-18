package org.apache.spark.ml.classification;
/**
 * Model produced by {@link FMClassifier}
 */
public  class FMClassificationModel extends org.apache.spark.ml.classification.ProbabilisticClassificationModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.FMClassificationModel> implements org.apache.spark.ml.classification.FMClassifierParams, org.apache.spark.ml.util.MLWritable, org.apache.spark.ml.util.HasTrainingSummary<org.apache.spark.ml.classification.FMClassificationTrainingSummary> {
  /** {@link MLWriter} instance for {@link FMClassificationModel} */
  static   class FMClassificationModelWriter extends org.apache.spark.ml.util.MLWriter implements org.apache.spark.internal.Logging {
    public   FMClassificationModelWriter (org.apache.spark.ml.classification.FMClassificationModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.FMClassificationModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.FMClassificationModel load (java.lang.String path)  { throw new RuntimeException(); }
   final  scala.Option<org.apache.spark.ml.classification.FMClassificationTrainingSummary> trainingSummary ()  { throw new RuntimeException(); }
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
     FMClassificationModel (java.lang.String uid, double intercept, org.apache.spark.ml.linalg.Vector linear, org.apache.spark.ml.linalg.Matrix factors)  { throw new RuntimeException(); }
  public  int numClasses ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  /**
   * Gets summary of model on training set. An exception is thrown
   * if <code>hasSummary</code> is false.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.FMClassificationTrainingSummary summary ()  { throw new RuntimeException(); }
  /**
   * Evaluates the model on a test dataset.
   * <p>
   * @param dataset Test dataset to evaluate model on.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.FMClassificationSummary evaluate (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector predictRaw (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.linalg.Vector raw2probabilityInPlace (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.FMClassificationModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
