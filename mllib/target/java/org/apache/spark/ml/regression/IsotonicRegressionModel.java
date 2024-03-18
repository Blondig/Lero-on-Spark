package org.apache.spark.ml.regression;
/**
 * Model fitted by IsotonicRegression.
 * Predicts using a piecewise linear function.
 * <p>
 * For detailed rules see <code>org.apache.spark.mllib.regression.IsotonicRegressionModel.predict()</code>.
 * <p>
 * param:  oldModel A {@link org.apache.spark.mllib.regression.IsotonicRegressionModel}
 *                 model trained by {@link org.apache.spark.mllib.regression.IsotonicRegression}.
 */
public  class IsotonicRegressionModel extends org.apache.spark.ml.Model<org.apache.spark.ml.regression.IsotonicRegressionModel> implements org.apache.spark.ml.regression.IsotonicRegressionBase, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link IsotonicRegressionModel} */
  static   class IsotonicRegressionModelWriter extends org.apache.spark.ml.util.MLWriter implements org.apache.spark.internal.Logging {
    public   IsotonicRegressionModelWriter (org.apache.spark.ml.regression.IsotonicRegressionModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.IsotonicRegressionModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.regression.IsotonicRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam isotonic ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam featureIndex ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
     IsotonicRegressionModel (java.lang.String uid, org.apache.spark.mllib.regression.IsotonicRegressionModel oldModel)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.IsotonicRegressionModel setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.IsotonicRegressionModel setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.IsotonicRegressionModel setFeatureIndex (int value)  { throw new RuntimeException(); }
  /** Boundaries in increasing order for which predictions are known. */
  public  org.apache.spark.ml.linalg.Vector boundaries ()  { throw new RuntimeException(); }
  /**
   * Predictions associated with the boundaries at the same index, monotone because of isotonic
   * regression.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector predictions ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.IsotonicRegressionModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  double predict (double value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
