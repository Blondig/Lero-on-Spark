package org.apache.spark.scheduler;
/**
 * A simple listener that tries to stop SparkContext.
 */
public  class SparkContextStoppingListener extends org.apache.spark.scheduler.SparkListener {
  // not preceding
  public   SparkContextStoppingListener (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd job)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  boolean sparkExSeen ()  { throw new RuntimeException(); }
}
