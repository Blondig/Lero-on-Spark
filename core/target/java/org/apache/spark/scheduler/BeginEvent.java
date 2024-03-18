package org.apache.spark.scheduler;
  class BeginEvent implements org.apache.spark.scheduler.DAGSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.Task<?> task ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskInfo taskInfo ()  { throw new RuntimeException(); }
  // not preceding
  public   BeginEvent (org.apache.spark.scheduler.Task<?> task, org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
}
