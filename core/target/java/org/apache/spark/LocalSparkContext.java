package org.apache.spark;
/** Manages a local `sc` `SparkContext` variable, correctly stopping it after each test. */
public  interface LocalSparkContext extends org.scalatest.BeforeAndAfterEach, org.scalatest.BeforeAndAfterAll {
  public  org.apache.spark.SparkContext sc ()  ;
  public  void beforeAll ()  ;
  public  void afterEach ()  ;
  public  void resetSparkContext ()  ;
}
