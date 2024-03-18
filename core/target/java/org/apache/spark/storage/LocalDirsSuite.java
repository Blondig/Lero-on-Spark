package org.apache.spark.storage;
/**
 * Tests for the spark.local.dir and SPARK_LOCAL_DIRS configuration options.
 */
public  class LocalDirsSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalRootDirsTest {
  public   LocalDirsSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  protected  java.io.File tempDir ()  { throw new RuntimeException(); }
}
