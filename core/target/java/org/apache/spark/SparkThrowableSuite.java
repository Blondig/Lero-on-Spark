package org.apache.spark;
/**
 * Test suite for Spark Throwables.
 */
public  class SparkThrowableSuite extends org.apache.spark.SparkFunSuite {
  public   SparkThrowableSuite ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void checkCondition (scala.collection.Seq<java.lang.String> ss, scala.Function1<java.lang.String, java.lang.Object> fx)  { throw new RuntimeException(); }
  public  void checkIfUnique (scala.collection.Seq<java.lang.Object> ss)  { throw new RuntimeException(); }
}
