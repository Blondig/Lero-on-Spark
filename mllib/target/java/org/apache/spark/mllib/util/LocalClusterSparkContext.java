package org.apache.spark.mllib.util;
public  interface LocalClusterSparkContext extends org.scalatest.BeforeAndAfterAll {
  public  void afterAll ()  ;
  public  void beforeAll ()  ;
  public  org.apache.spark.SparkContext sc ()  ;
}
