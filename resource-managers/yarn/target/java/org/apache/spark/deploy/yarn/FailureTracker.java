package org.apache.spark.deploy.yarn;
/**
 * FailureTracker is responsible for tracking executor failures both for each host separately
 * and for all hosts altogether.
 */
  class FailureTracker implements org.apache.spark.internal.Logging {
  public  org.apache.spark.util.Clock clock ()  { throw new RuntimeException(); }
  // not preceding
  public   FailureTracker (org.apache.spark.SparkConf sparkConf, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  public  int numFailedExecutors ()  { throw new RuntimeException(); }
  public  void registerFailureOnHost (java.lang.String hostname)  { throw new RuntimeException(); }
  public  void registerExecutorFailure ()  { throw new RuntimeException(); }
  public  int numFailuresOnHost (java.lang.String hostname)  { throw new RuntimeException(); }
}
