package org.apache.spark;
/** Shares a local `SparkContext` between all tests in a suite and closes it at the end */
public  interface SharedSparkContext extends org.scalatest.BeforeAndAfterAll, org.scalatest.BeforeAndAfterEach {
  public  void afterAll ()  ;
  public  void afterEach ()  ;
  public  void beforeAll ()  ;
  public  void beforeEach ()  ;
  public  org.apache.spark.SparkConf conf ()  ;
  /**
   * Initialize the {@link SparkContext}.  Generally, this is just called from beforeAll; however, in
   * test using styles other than FunSuite, there is often code that relies on the session between
   * test group constructs and the actual tests, which may need this session.  It is purely a
   * semantic difference, but semantically, it makes more sense to call 'initializeContext' between
   * a 'describe' and an 'it' call than it does to call 'beforeAll'.
   */
  public  void initializeContext ()  ;
  public  org.apache.spark.SparkContext sc ()  ;
}
