package org.apache.spark;
/**
 * Manages a local <code>sc</code> <code>SparkContext</code> variable, correctly stopping it after each test.
 * <p>
 * Note: this class is a copy of {@link LocalSparkContext}. Why copy it? Reduce conflict. Because
 * many test suites use {@link LocalSparkContext} and overwrite some variable or function (e.g.
 * sc of LocalSparkContext), there occurs conflict when we refactor the <code>sc</code> as a new function.
 * After migrating all test suites that use {@link LocalSparkContext} to use
 * {@link TempLocalSparkContext}, we will delete the original {@link LocalSparkContext} and rename
 * {@link TempLocalSparkContext} to {@link LocalSparkContext}.
 */
public  interface TempLocalSparkContext extends org.scalatest.BeforeAndAfterEach, org.scalatest.BeforeAndAfterAll, org.apache.spark.internal.Logging {
  public  org.apache.spark.SparkConf conf ()  ;
  /**
   * Currently, we are focusing on the reconstruction of LocalSparkContext, so this method
   * was created temporarily. When the migration work is completed, this method will be
   * renamed to <code>sc</code> and the variable <code>sc</code> will be deleted.
   * @return (undocumented)
   */
  public  org.apache.spark.SparkContext sc ()  ;
  public  void beforeAll ()  ;
  public  void afterEach ()  ;
  public  void resetSparkContext ()  ;
  public  org.apache.spark.SparkConf defaultSparkConf ()  ;
}
