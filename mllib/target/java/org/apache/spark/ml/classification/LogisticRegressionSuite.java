package org.apache.spark.ml.classification;
public  class LogisticRegressionSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.ml.util.MLTest, org.apache.spark.ml.util.DefaultReadWriteTest {
  /**
   * Mapping from all Params to valid settings which differ from the defaults.
   * This is useful for tests which need to exercise all Params, such as save/load.
   * This excludes input columns to simplify some tests.
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> allParamSettings ()  { throw new RuntimeException(); }
  static public  java.util.List<org.apache.spark.ml.feature.LabeledPoint> generateLogisticInputAsList (double offset, double scale, int nPoints, int seed)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.ml.feature.LabeledPoint> generateLogisticInput (double offset, double scale, int nPoints, int seed)  { throw new RuntimeException(); }
  /**
   * Generates <code>k</code> classes multinomial synthetic logistic input in <code>n</code> dimensional space given the
   * model weights and mean/variance of the features. The synthetic data will be drawn from
   * the probability distribution constructed by weights using the following formula.
   * <p>
   * P(y = 0 | x) = 1 / norm
   * P(y = 1 | x) = exp(x * w_1) / norm
   * P(y = 2 | x) = exp(x * w_2) / norm
   * ...
   * P(y = k-1 | x) = exp(x * w_{k-1}) / norm
   * where norm = 1 + exp(x * w_1) + exp(x * w_2) + ... + exp(x * w_{k-1})
   * <p>
   * @param weights matrix is flatten into a vector; as a result, the dimension of weights vector
   *                will be (k - 1) * (n + 1) if <code>addIntercept == true</code>, and
   *                if <code>addIntercept != true</code>, the dimension will be (k - 1) * n.
   * @param xMean the mean of the generated features. Lots of time, if the features are not properly
   *              standardized, the algorithm with poor implementation will have difficulty
   *              to converge.
   * @param xVariance the variance of the generated features.
   * @param addIntercept whether to add intercept.
   * @param nPoints the number of instance of generated data.
   * @param seed the seed for random generator. For consistent testing result, it will be fixed.
   * @return (undocumented)
   */
  static public  scala.collection.Seq<org.apache.spark.ml.feature.LabeledPoint> generateMultinomialLogisticInput (double[] weights, double[] xMean, double[] xVariance, boolean addIntercept, int nPoints, int seed)  { throw new RuntimeException(); }
  /**
   * Note: This method is only used in Bounded MLOR (without regularization) test
   * When no regularization is applied, the multinomial coefficients lack identifiability
   * because we do not use a pivot class. We can add any constant value to the coefficients
   * and get the same likelihood. If fitting under bound constrained optimization, we don't
   * choose the mean centered coefficients like what we do for unbound problems, since they
   * may out of the bounds. We use this function to check whether two coefficients are equivalent.
   * @param coefficients1 (undocumented)
   * @param coefficients2 (undocumented)
   */
  static public  void checkBoundedMLORCoefficientsEquivalent (org.apache.spark.ml.linalg.Matrix coefficients1, org.apache.spark.ml.linalg.Matrix coefficients2)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.Signaler defaultSignaler ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.streaming.Trigger defaultTrigger ()  { throw new RuntimeException(); }
  public  org.scalatest.time.Span streamingTimeout ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AddData$ AddData ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.MultiAddData$ MultiAddData ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AddDataMemory$ AddDataMemory ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswer$ CheckAnswer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckLastBatch$ CheckLastBatch ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows$ CheckAnswerRows ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRowsContains$ CheckAnswerRowsContains ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRowsByFunc$ CheckAnswerRowsByFunc ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckNewAnswerRows$ CheckNewAnswerRows ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckNewAnswer$ CheckNewAnswer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.StopStream$ StopStream ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.StartStream$ StartStream ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AdvanceManualClock$ AdvanceManualClock ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.ExpectFailure$ ExpectFailure ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.StreamProgressLockedActions$ StreamProgressLockedActions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.Assert$ Assert ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery$ AssertOnQuery ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.Execute$ Execute ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.ProcessAllAvailable$ ProcessAllAvailable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AwaitEpoch$ AwaitEpoch ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.IncrementEpoch$ IncrementEpoch ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$ AwaitTerminationTester ()  { throw new RuntimeException(); }
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  protected  scala.Function1<java.lang.String, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> sql ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData2 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData3 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> negativeData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> largeAndSmallInts ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> lowerCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> lowerCaseDataWithDuplicates ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.MapData> mapData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calendarIntervalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> repeatedData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> nullableRepeatedData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> nullInts ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> nullStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> tableName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> person ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> salary ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> intervalData ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  public   LogisticRegressionSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> smallBinaryDataset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> smallMultinomialDataset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> binaryDataset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> binaryDatasetWithSmallVar ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> multinomialDataset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> multinomialDatasetWithSmallVar ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> multinomialDatasetWithZeroVar ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
}
