package org.apache.spark.ml.classification;
/**
 * Reduction of Multiclass Classification to Binary Classification.
 * Performs reduction using one against all strategy.
 * For a multiclass classification with k classes, train k models (one per class).
 * Each example is scored against all k models and the model with highest score
 * is picked to label the example.
 */
public final class OneVsRest extends org.apache.spark.ml.Estimator<org.apache.spark.ml.classification.OneVsRestModel> implements org.apache.spark.ml.classification.OneVsRestParams, org.apache.spark.ml.param.shared.HasParallelism, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link OneVsRest} */
  static   class OneVsRestWriter extends org.apache.spark.ml.util.MLWriter {
    public   OneVsRestWriter (org.apache.spark.ml.classification.OneVsRest instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.OneVsRest> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.OneVsRest load (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.IntParam parallelism ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.classification.Classifier<?, ? extends org.apache.spark.ml.classification.Classifier<java.lang.Object, org.apache.spark.ml.classification.Classifier, org.apache.spark.ml.classification.ClassificationModel>, ? extends org.apache.spark.ml.classification.ClassificationModel<java.lang.Object, org.apache.spark.ml.classification.ClassificationModel>>> classifier ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> rawPredictionCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   OneVsRest (java.lang.String uid)  { throw new RuntimeException(); }
  public   OneVsRest ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.OneVsRest setClassifier (org.apache.spark.ml.classification.Classifier<?, ?, ?> value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.OneVsRest setLabelCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.OneVsRest setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.OneVsRest setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.OneVsRest setRawPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * The implementation of parallel one vs. rest runs the classification for
   * each class in a separate threads.
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.OneVsRest setParallelism (int value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link weightCol}.
   * <p>
   * This is ignored if weight is not supported by {@link classifier}.
   * If this is not set or empty, we treat all instance weights as 1.0.
   * Default is not set, so all instances have weight one.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.OneVsRest setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.OneVsRestModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.OneVsRest copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
