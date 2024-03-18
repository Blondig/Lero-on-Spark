package org.apache.spark.executor;
public  class ExecutorSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.scalatestplus.mockito.MockitoSugar, org.scalatest.concurrent.Eventually, org.scalatest.PrivateMethodTester {
  public   ExecutorSuite ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  public  org.scalatest.PrivateMethodTester.PrivateMethod$ PrivateMethod ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  /**
   * Creates an Executor with the provided arguments, is then passed to <code>f</code>
   * and will be stopped after <code>f</code> returns.
   * @param executorId (undocumented)
   * @param executorHostname (undocumented)
   * @param env (undocumented)
   * @param userClassPath (undocumented)
   * @param isLocal (undocumented)
   * @param uncaughtExceptionHandler (undocumented)
   * @param resources (undocumented)
   * @param f (undocumented)
   */
  public  void withExecutor (java.lang.String executorId, java.lang.String executorHostname, org.apache.spark.SparkEnv env, scala.collection.Seq<java.net.URL> userClassPath, boolean isLocal, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources, scala.Function1<org.apache.spark.executor.Executor, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
}
