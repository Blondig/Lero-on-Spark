package org.apache.spark.storage;
public  class FallbackStorageSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext {
  public   FallbackStorageSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf getSparkConf (int initialExecutor, int minExecutor)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
}
