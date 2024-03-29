package org.apache.spark.ml.classification;
public  class FMClassifierSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.ml.util.MLTest, org.apache.spark.ml.util.DefaultReadWriteTest {
  /**
   * Mapping from all Params to valid settings which differ from the defaults.
   * This is useful for tests which need to exercise all Params, such as save/load.
   * This excludes input columns to simplify some tests.
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> allParamSettings ()  { throw new RuntimeException(); }
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
  public   FMClassifierSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> smallBinaryDataset ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  double logLoss (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> modelRes)  { throw new RuntimeException(); }
}
