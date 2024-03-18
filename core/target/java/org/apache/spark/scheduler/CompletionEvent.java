package org.apache.spark.scheduler;
  class CompletionEvent implements org.apache.spark.scheduler.DAGSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.Task<?> task ()  { throw new RuntimeException(); }
  public  org.apache.spark.TaskEndReason reason ()  { throw new RuntimeException(); }
  public  Object result ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> accumUpdates ()  { throw new RuntimeException(); }
  public  long[] metricPeaks ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskInfo taskInfo ()  { throw new RuntimeException(); }
  // not preceding
  public   CompletionEvent (org.apache.spark.scheduler.Task<?> task, org.apache.spark.TaskEndReason reason, Object result, scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> accumUpdates, long[] metricPeaks, org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
}
