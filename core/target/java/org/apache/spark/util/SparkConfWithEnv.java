package org.apache.spark.util;
/**
 * Customized SparkConf that allows env variables to be overridden.
 */
public  class SparkConfWithEnv extends org.apache.spark.SparkConf {
  // not preceding
  public   SparkConfWithEnv (scala.collection.immutable.Map<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf clone ()  { throw new RuntimeException(); }
  public  java.lang.String getenv (java.lang.String name)  { throw new RuntimeException(); }
}
