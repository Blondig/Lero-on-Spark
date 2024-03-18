package org.apache.spark;
/**
 * :: DeveloperApi ::
 * Task was killed intentionally and needs to be rescheduled.
 */
public  class TaskKilled implements org.apache.spark.TaskFailedReason, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String reason ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo> accumUpdates ()  { throw new RuntimeException(); }
    scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> accums ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> metricPeaks ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskKilled (java.lang.String reason, scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo> accumUpdates, scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> accums, scala.collection.Seq<java.lang.Object> metricPeaks)  { throw new RuntimeException(); }
  public  java.lang.String toErrorString ()  { throw new RuntimeException(); }
  public  boolean countTowardsTaskFailures ()  { throw new RuntimeException(); }
}
