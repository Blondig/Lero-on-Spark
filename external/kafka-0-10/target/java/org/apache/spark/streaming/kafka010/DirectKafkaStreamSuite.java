package org.apache.spark.streaming.kafka010;
public  class DirectKafkaStreamSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.streaming.LocalStreamingContext, org.scalatest.concurrent.Eventually, org.apache.spark.internal.Logging {
  static public  class InputInfoCollector implements org.apache.spark.streaming.scheduler.StreamingListener {
    public   InputInfoCollector ()  { throw new RuntimeException(); }
    public  java.util.concurrent.atomic.AtomicLong numRecordsCompleted ()  { throw new RuntimeException(); }
    public  java.util.concurrent.atomic.AtomicLong numRecordsStarted ()  { throw new RuntimeException(); }
    public  java.util.concurrent.atomic.AtomicLong numRecordsSubmitted ()  { throw new RuntimeException(); }
    public  void onBatchCompleted (org.apache.spark.streaming.scheduler.StreamingListenerBatchCompleted batchCompleted)  { throw new RuntimeException(); }
    public  void onBatchStarted (org.apache.spark.streaming.scheduler.StreamingListenerBatchStarted batchStarted)  { throw new RuntimeException(); }
    public  void onBatchSubmitted (org.apache.spark.streaming.scheduler.StreamingListenerBatchSubmitted batchSubmitted)  { throw new RuntimeException(); }
  }
  static public  java.util.concurrent.atomic.AtomicLong total ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.StreamingContext ssc ()  { throw new RuntimeException(); }
  public  boolean stopSparkContext ()  { throw new RuntimeException(); }
  public   DirectKafkaStreamSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  public  java.util.HashMap<java.lang.String, java.lang.Object> getKafkaParams (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> extra)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kafka010.LocationStrategy preferredHosts ()  { throw new RuntimeException(); }
}
