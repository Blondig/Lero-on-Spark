package org.apache.spark.sql.kafka010;
public abstract class KafkaSourceTest extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.streaming.StreamTest, org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.kafka010.KafkaTest {
  /**
   * Add data to Kafka.
   * <p>
   * <code>topicAction</code> can be used to run actions for each topic before inserting data.
   */
  public  class AddKafkaData implements org.apache.spark.sql.streaming.StreamTest.AddData, scala.Product, scala.Serializable {
    public  scala.collection.immutable.Set<java.lang.String> topics ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.Object> data ()  { throw new RuntimeException(); }
    // not preceding
    public   AddKafkaData (scala.collection.immutable.Set<java.lang.String> topics, scala.collection.Seq<java.lang.Object> data, boolean ensureDataInMultiplePartition, boolean concurrent, java.lang.String message, scala.Function2<java.lang.String, scala.Option<java.lang.Object>, scala.runtime.BoxedUnit> topicAction)  { throw new RuntimeException(); }
    public  scala.Tuple2<org.apache.spark.sql.connector.read.streaming.SparkDataStream, org.apache.spark.sql.execution.streaming.Offset> addData (scala.Option<org.apache.spark.sql.execution.streaming.StreamExecution> query)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  public  class AddKafkaData$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AddKafkaData$ MODULE$ = null;
    public   AddKafkaData$ ()  { throw new RuntimeException(); }
  }
  public  class WithOffsetSync {
    /**
     * Run <code>func</code> to write some Kafka messages and wait until the latest offset of the given
     * <code>TopicPartition</code> is not less than <code>expectedOffset</code>.
     * @param topicPartition (undocumented)
     * @param expectedOffset (undocumented)
     * @param func (undocumented)
     * @return (undocumented)
     */
    static public  org.apache.spark.sql.streaming.StreamTest.StreamAction apply (org.apache.kafka.common.TopicPartition topicPartition, long expectedOffset, scala.Function0<scala.runtime.BoxedUnit> func)  { throw new RuntimeException(); }
  }
  public  class WithOffsetSync$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final WithOffsetSync$ MODULE$ = null;
    public   WithOffsetSync$ ()  { throw new RuntimeException(); }
    /**
     * Run <code>func</code> to write some Kafka messages and wait until the latest offset of the given
     * <code>TopicPartition</code> is not less than <code>expectedOffset</code>.
     * @param topicPartition (undocumented)
     * @param expectedOffset (undocumented)
     * @param func (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.streaming.StreamTest.StreamAction apply (org.apache.kafka.common.TopicPartition topicPartition, long expectedOffset, scala.Function0<scala.runtime.BoxedUnit> func)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.streaming.StreamTest.AddData$ AddData ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AddDataMemory$ AddDataMemory ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AdvanceManualClock$ AdvanceManualClock ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.Assert$ Assert ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery$ AssertOnQuery ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AwaitEpoch$ AwaitEpoch ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$ AwaitTerminationTester ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswer$ CheckAnswer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows$ CheckAnswerRows ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRowsByFunc$ CheckAnswerRowsByFunc ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRowsContains$ CheckAnswerRowsContains ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckLastBatch$ CheckLastBatch ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckNewAnswer$ CheckNewAnswer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckNewAnswerRows$ CheckNewAnswerRows ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.Execute$ Execute ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.ExpectFailure$ ExpectFailure ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.IncrementEpoch$ IncrementEpoch ()  { throw new RuntimeException(); }
  public   KafkaSourceTest ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.MultiAddData$ MultiAddData ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.ProcessAllAvailable$ ProcessAllAvailable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.StartStream$ StartStream ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.StopStream$ StopStream ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.StreamProgressLockedActions$ StreamProgressLockedActions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaSourceTest.WithOffsetSync$ WithOffsetSync ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  protected  scala.collection.immutable.Map<java.lang.String, java.lang.Object> brokerProps ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calendarIntervalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.Signaler defaultSignaler ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.streaming.Trigger defaultTrigger ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> intervalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> largeAndSmallInts ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> lowerCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> lowerCaseDataWithDuplicates ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery makeSureGetOffsetCalled ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.MapData> mapData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> negativeData ()  { throw new RuntimeException(); }
  protected  java.lang.String newTopic ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> nullInts ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> nullStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> nullableRepeatedData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> person ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> repeatedData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> salary ()  { throw new RuntimeException(); }
  protected  void setTopicPartitions (java.lang.String topic, int newCount, org.apache.spark.sql.execution.streaming.StreamExecution query)  { throw new RuntimeException(); }
  protected  scala.Function1<java.lang.String, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> sql ()  { throw new RuntimeException(); }
  public  org.scalatest.time.Span streamingTimeout ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> tableName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData2 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData3 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.kafka010.KafkaTestUtils testUtils ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}
