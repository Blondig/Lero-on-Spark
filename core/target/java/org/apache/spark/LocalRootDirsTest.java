package org.apache.spark;
public  interface LocalRootDirsTest extends org.apache.spark.LocalSparkContext {
  public  void afterEach ()  ;
  public  void beforeAll ()  ;
  public  void beforeEach ()  ;
  public  org.apache.spark.SparkConf conf ()  ;
  public  java.io.File tempDir ()  ;
}
