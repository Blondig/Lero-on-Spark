package org.apache.spark.deploy;
/**
 * Implementation of SparkApplication that wraps a standard Java class with a "main" method.
 * <p>
 * Configuration is propagated to the application via system properties, so running multiple
 * of these in the same JVM may lead to undefined behavior due to configuration leaks.
 */
  class JavaMainApplication implements org.apache.spark.deploy.SparkApplication {
  public   JavaMainApplication (java.lang.Class<?> klass)  { throw new RuntimeException(); }
  public  void start (java.lang.String[] args, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
}
