package org.apache.spark.streaming;
public  class BasicOperationsSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.streaming.TestSuiteBase {
  public   BasicOperationsSuite ()  { throw new RuntimeException(); }
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Seq<scala.collection.Seq<java.lang.Object>> cleanupTestInput ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.PatienceConfiguration.Timeout eventuallyTimeout ()  { throw new RuntimeException(); }
  /**
   * Test cleanup of RDDs in DStream metadata. <code>assertCleanup</code> is the function that asserts the
   * cleanup of RDDs is successful.
   * @param conf2 (undocumented)
   * @param operation (undocumented)
   * @param numExpectedOutput (undocumented)
   * @param rememberDuration (undocumented)
   * @param assertCleanup (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<T> runCleanupTest (org.apache.spark.SparkConf conf2, scala.Function1<org.apache.spark.streaming.dstream.DStream<java.lang.Object>, org.apache.spark.streaming.dstream.DStream<T>> operation, int numExpectedOutput, org.apache.spark.streaming.Duration rememberDuration, scala.Function1<org.apache.spark.streaming.dstream.DStream<T>, scala.runtime.BoxedUnit> assertCleanup, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
}
