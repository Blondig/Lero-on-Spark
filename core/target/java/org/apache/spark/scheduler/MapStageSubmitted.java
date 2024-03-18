package org.apache.spark.scheduler;
/** A map stage as submitted to run as a separate job */
  class MapStageSubmitted implements org.apache.spark.scheduler.DAGSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int jobId ()  { throw new RuntimeException(); }
  public  org.apache.spark.ShuffleDependency<?, ?, ?> dependency ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.CallSite callSite ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.JobListener listener ()  { throw new RuntimeException(); }
  public  java.util.Properties properties ()  { throw new RuntimeException(); }
  // not preceding
  public   MapStageSubmitted (int jobId, org.apache.spark.ShuffleDependency<?, ?, ?> dependency, org.apache.spark.util.CallSite callSite, org.apache.spark.scheduler.JobListener listener, java.util.Properties properties)  { throw new RuntimeException(); }
}
