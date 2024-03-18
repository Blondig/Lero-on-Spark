package org.apache.spark.streaming.scheduler;
  class GenerateJobs implements org.apache.spark.streaming.scheduler.JobGeneratorEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time time ()  { throw new RuntimeException(); }
  // not preceding
  public   GenerateJobs (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
}
