package org.apache.spark.graphx;
/**
 * Provides a method to run tests against a <code>SparkContext</code> variable that is correctly stopped
 * after each test.
 */
public  interface LocalSparkContext {
  /** Runs `f` on a new SparkContext and ensures that it is stopped afterwards. */
  public <T extends java.lang.Object> T withSpark (scala.Function1<org.apache.spark.SparkContext, T> f)  ;
}
