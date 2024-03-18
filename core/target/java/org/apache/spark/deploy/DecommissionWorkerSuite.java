package org.apache.spark.deploy;
public  class DecommissionWorkerSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.internal.Logging, org.apache.spark.LocalSparkContext, org.scalatest.BeforeAndAfterEach {
  public   DecommissionWorkerSuite ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  public  void beforeEach ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext createSparkContext (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> extraConfs)  { throw new RuntimeException(); }
  public  void decommissionWorkerOnMaster (org.apache.spark.deploy.master.WorkerInfo workerInfo, java.lang.String reason)  { throw new RuntimeException(); }
  public  void killWorkerAfterTimeout (org.apache.spark.deploy.master.WorkerInfo workerInfo, int secondsToWait)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  void testFetchFailures (int initialSleepMillis)  { throw new RuntimeException(); }
  public  void withListener (org.apache.spark.SparkContext sc, org.apache.spark.deploy.DecommissionWorkerSuite.RootStageAwareListener listener, scala.Function1<org.apache.spark.scheduler.SparkListener, scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
}
