package org.apache.spark.ml.util;
public  class MLTestingUtils$ extends org.apache.spark.SparkFunSuite {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MLTestingUtils$ MODULE$ = null;
  public   MLTestingUtils$ ()  { throw new RuntimeException(); }
  public <T extends org.apache.spark.ml.Estimator<?>> void checkCopyAndUids (T estimator, org.apache.spark.ml.Model<?> model)  { throw new RuntimeException(); }
  public <M extends org.apache.spark.ml.Model<M>, T extends org.apache.spark.ml.Estimator<M>> void checkNumericTypes (T estimator, org.apache.spark.sql.SparkSession spark, boolean isClassification, scala.Function2<M, M, scala.runtime.BoxedUnit> check)  { throw new RuntimeException(); }
  public <T extends org.apache.spark.ml.evaluation.Evaluator> void checkNumericTypes (T evaluator, org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.spark.sql.types.NumericType, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> genClassifDFWithNumericLabelCol (org.apache.spark.sql.SparkSession spark, java.lang.String labelColName, java.lang.String featuresColName, java.lang.String weightColName)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.spark.sql.types.NumericType, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> genRegressionDFWithNumericLabelCol (org.apache.spark.sql.SparkSession spark, java.lang.String labelColName, java.lang.String weightColName, java.lang.String featuresColName, java.lang.String censorColName)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.spark.sql.types.NumericType, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> genEvaluatorDFWithNumericLabelCol (org.apache.spark.sql.SparkSession spark, java.lang.String labelColName, java.lang.String predictionColName)  { throw new RuntimeException(); }
  /**
   * Given a DataFrame, generate two output DataFrames: one having the original rows oversampled
   * an integer number of times, and one having the original rows but with a column of weights
   * proportional to the number of oversampled instances in the oversampled DataFrames.
   * @param data (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple2<org.apache.spark.sql.Dataset<org.apache.spark.ml.feature.Instance>, org.apache.spark.sql.Dataset<org.apache.spark.ml.feature.Instance>> genEquivalentOversampledAndWeightedInstances (org.apache.spark.sql.Dataset<org.apache.spark.ml.feature.LabeledPoint> data, long seed)  { throw new RuntimeException(); }
  /**
   * Helper function for testing sample weights. Tests that oversampling each point is equivalent
   * to assigning a sample weight proportional to the number of samples for each point.
   * @param data (undocumented)
   * @param estimator (undocumented)
   * @param modelEquals (undocumented)
   * @param seed (undocumented)
   */
  public <M extends org.apache.spark.ml.Model<M>, E extends org.apache.spark.ml.Estimator<M>> void testOversamplingVsWeighting (org.apache.spark.sql.Dataset<org.apache.spark.ml.feature.LabeledPoint> data, E estimator, scala.Function2<M, M, scala.runtime.BoxedUnit> modelEquals, long seed)  { throw new RuntimeException(); }
  /**
   * Helper function for testing sample weights. Tests that injecting a large number of outliers
   * with very small sample weights does not affect fitting. The predictor should learn the true
   * model despite the outliers.
   * @param data (undocumented)
   * @param estimator (undocumented)
   * @param numClasses (undocumented)
   * @param modelEquals (undocumented)
   * @param outlierRatio (undocumented)
   */
  public <M extends org.apache.spark.ml.Model<M>, E extends org.apache.spark.ml.Estimator<M>> void testOutliersWithSmallWeights (org.apache.spark.sql.Dataset<org.apache.spark.ml.feature.LabeledPoint> data, E estimator, int numClasses, scala.Function2<M, M, scala.runtime.BoxedUnit> modelEquals, int outlierRatio)  { throw new RuntimeException(); }
  /**
   * Helper function for testing sample weights. Tests that giving constant weights to each data
   * point yields the same model, regardless of the magnitude of the weight.
   * @param data (undocumented)
   * @param estimator (undocumented)
   * @param modelEquals (undocumented)
   */
  public <M extends org.apache.spark.ml.Model<M>, E extends org.apache.spark.ml.Estimator<M>> void testArbitrarilyScaledWeights (org.apache.spark.sql.Dataset<org.apache.spark.ml.feature.LabeledPoint> data, E estimator, scala.Function2<M, M, scala.runtime.BoxedUnit> modelEquals)  { throw new RuntimeException(); }
  /**
   * Helper function for testing different input types for "features" column. Given a DataFrame,
   * generate three output DataFrames: one having vector "features" column with float precision,
   * one having double array "features" column with float precision, and one having float array
   * "features" column.
   * @param dataset (undocumented)
   * @param featuresColName (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple3<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> generateArrayFeatureDataset (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataset, java.lang.String featuresColName)  { throw new RuntimeException(); }
  public <M extends org.apache.spark.ml.PredictionModel<?, M>> void modelPredictionEquals (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, scala.Function2<java.lang.Object, java.lang.Object, java.lang.Object> compareFunc, double fractionInTol, M model1, M model2)  { throw new RuntimeException(); }
}
