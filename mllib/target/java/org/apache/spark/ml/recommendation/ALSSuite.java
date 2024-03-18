package org.apache.spark.ml.recommendation;
public  class ALSSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.ml.util.MLTest, org.apache.spark.ml.util.DefaultReadWriteTest, org.apache.spark.internal.Logging {
  /**
   * Mapping from all Params to valid settings which differ from the defaults.
   * This is useful for tests which need to exercise all Params, such as save/load.
   * This excludes input columns to simplify some tests.
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> allModelParamSettings ()  { throw new RuntimeException(); }
  /**
   * Mapping from all Params to valid settings which differ from the defaults.
   * This is useful for tests which need to exercise all Params, such as save/load.
   * This excludes input columns to simplify some tests.
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> allEstimatorParamSettings ()  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
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
  public   ALSSuite ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  /**
   * Generates an explicit feedback dataset for testing ALS.
   * @param numUsers number of users
   * @param numItems number of items
   * @param rank rank
   * @param noiseStd the standard deviation of additive Gaussian noise on training data
   * @param seed random seed
   * @return (training, test)
   */
  public  scala.Tuple2<org.apache.spark.rdd.RDD<org.apache.spark.ml.recommendation.ALS.Rating<java.lang.Object>>, org.apache.spark.rdd.RDD<org.apache.spark.ml.recommendation.ALS.Rating<java.lang.Object>>> genExplicitTestData (int numUsers, int numItems, int rank, double noiseStd, long seed)  { throw new RuntimeException(); }
  /**
   * Generates an implicit feedback dataset for testing ALS.
   * @param numUsers number of users
   * @param numItems number of items
   * @param rank rank
   * @param noiseStd the standard deviation of additive Gaussian noise on training data
   * @param seed random seed
   * @return (training, test)
   */
  public  scala.Tuple2<org.apache.spark.rdd.RDD<org.apache.spark.ml.recommendation.ALS.Rating<java.lang.Object>>, org.apache.spark.rdd.RDD<org.apache.spark.ml.recommendation.ALS.Rating<java.lang.Object>>> genImplicitTestData (int numUsers, int numItems, int rank, double noiseStd, long seed)  { throw new RuntimeException(); }
  /**
   * Train ALS using the given training set and parameters
   * @param training training dataset
   * @param rank rank of the matrix factorization
   * @param maxIter max number of iterations
   * @param regParam regularization constant
   * @param implicitPrefs whether to use implicit preference
   * @param numUserBlocks number of user blocks
   * @param numItemBlocks number of item blocks
   * @return a trained ALSModel
   */
  public  org.apache.spark.ml.recommendation.ALSModel trainALS (org.apache.spark.rdd.RDD<org.apache.spark.ml.recommendation.ALS.Rating<java.lang.Object>> training, int rank, int maxIter, double regParam, boolean implicitPrefs, int numUserBlocks, int numItemBlocks)  { throw new RuntimeException(); }
  /**
   * Test ALS using the given training/test splits and parameters.
   * @param training training dataset
   * @param test test dataset
   * @param rank rank of the matrix factorization
   * @param maxIter max number of iterations
   * @param regParam regularization constant
   * @param implicitPrefs whether to use implicit preference
   * @param numUserBlocks number of user blocks
   * @param numItemBlocks number of item blocks
   * @param targetRMSE target test RMSE
   */
  public  void testALS (org.apache.spark.rdd.RDD<org.apache.spark.ml.recommendation.ALS.Rating<java.lang.Object>> training, org.apache.spark.rdd.RDD<org.apache.spark.ml.recommendation.ALS.Rating<java.lang.Object>> test, int rank, int maxIter, double regParam, boolean implicitPrefs, int numUserBlocks, int numItemBlocks, double targetRMSE)  { throw new RuntimeException(); }
}
