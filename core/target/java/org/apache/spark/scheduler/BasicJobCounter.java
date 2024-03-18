package org.apache.spark.scheduler;
/**
 * A simple listener that counts the number of jobs observed.
 */
public  class BasicJobCounter extends org.apache.spark.scheduler.SparkListener {
  public   BasicJobCounter ()  { throw new RuntimeException(); }
  public  int count ()  { throw new RuntimeException(); }
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd job)  { throw new RuntimeException(); }
}
