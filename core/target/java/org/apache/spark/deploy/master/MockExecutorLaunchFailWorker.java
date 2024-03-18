package org.apache.spark.deploy.master;
public  class MockExecutorLaunchFailWorker extends org.apache.spark.deploy.master.MockWorker implements org.scalatest.concurrent.Eventually {
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  // not preceding
  public   MockExecutorLaunchFailWorker (org.apache.spark.deploy.master.Master master, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  java.util.concurrent.CountDownLatch appRegistered ()  { throw new RuntimeException(); }
  public  java.util.concurrent.CountDownLatch launchExecutorReceived ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<java.lang.String> appIdsToLaunchExecutor ()  { throw new RuntimeException(); }
  public  int failedCnt ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
}
