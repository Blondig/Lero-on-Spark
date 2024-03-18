package org.apache.spark;
/**
 * This test suite covers all the cases that shall fail fast on job submitted that contains one
 * of more barrier stages.
 */
public  class BarrierStageOnSubmittedSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext {
  public   BarrierStageOnSubmittedSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
}
