package org.apache.spark.ml;
/**
 * Base abstract class for all unit tests in Spark for handling common functionality.
 */
 abstract class SparkMLFunSuite extends org.scalatest.funsuite.AnyFunSuite implements org.scalatest.BeforeAndAfterAll {
  public   SparkMLFunSuite ()  { throw new RuntimeException(); }
  public  boolean invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected ()  { throw new RuntimeException(); }
}
