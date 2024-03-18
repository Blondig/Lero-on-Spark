package org.apache.spark.streaming;
public  class WindowOperationsSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.streaming.TestSuiteBase {
  public   WindowOperationsSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration batchDuration ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<scala.Tuple2<java.lang.String, scala.collection.Seq<java.lang.Object>>>> bigGroupByOutput ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>>> bigInput ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>>> bigReduceInvOutput ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>>> bigReduceOutput ()  { throw new RuntimeException(); }
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.PatienceConfiguration.Timeout eventuallyTimeout ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>>> largerSlideInput ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>>> largerSlideReduceOutput ()  { throw new RuntimeException(); }
  public  int maxWaitTimeMillis ()  { throw new RuntimeException(); }
  public  void testReduceByKeyAndWindow (java.lang.String name, scala.collection.Seq<scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>>> input, scala.collection.Seq<scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>>> expectedOutput, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  public  void testReduceByKeyAndWindowWithFilteredInverse (java.lang.String name, scala.collection.Seq<scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>>> input, scala.collection.Seq<scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>>> expectedOutput, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  public  void testReduceByKeyAndWindowWithInverse (java.lang.String name, scala.collection.Seq<scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>>> input, scala.collection.Seq<scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>>> expectedOutput, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  public  void testWindow (java.lang.String name, scala.collection.Seq<scala.collection.Seq<java.lang.Object>> input, scala.collection.Seq<scala.collection.Seq<java.lang.Object>> expectedOutput, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
}
