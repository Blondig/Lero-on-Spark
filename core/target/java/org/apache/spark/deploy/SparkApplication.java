package org.apache.spark.deploy;
/**
 * Entry point for a Spark application. Implementations must provide a no-argument constructor.
 */
public  interface SparkApplication {
  public  void start (java.lang.String[] args, org.apache.spark.SparkConf conf)  ;
}
