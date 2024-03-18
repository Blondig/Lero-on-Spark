package org.apache.spark.scheduler;
public  class TaskSchedulerImplSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.scalatest.BeforeAndAfterEach, org.apache.spark.internal.Logging, org.scalatestplus.mockito.MockitoSugar, org.scalatest.concurrent.Eventually {
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  public   TaskSchedulerImplSuite ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  public  void beforeEach ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.DAGScheduler dagScheduler ()  { throw new RuntimeException(); }
  public  boolean failedTaskSet ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Throwable> failedTaskSetException ()  { throw new RuntimeException(); }
  public  java.lang.String failedTaskSetReason ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.HealthTracker healthTracker ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSchedulerImpl setupHelper ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSchedulerImpl setupScheduler (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> confs)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSchedulerImpl setupScheduler (int numCores, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> confs)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSchedulerImpl setupSchedulerWithMaster (java.lang.String master, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> confs)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSchedulerImpl setupSchedulerWithMockTaskSetExcludelist (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> confs)  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.TaskSetExcludelist> stageToMockTaskSetExcludelist ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.TaskSetManager> stageToMockTaskSetManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSchedulerImpl taskScheduler ()  { throw new RuntimeException(); }
}
