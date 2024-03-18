package org.apache.spark;
/**
 * :: DeveloperApi ::
 * The task failed because the executor that it was running on was lost. This may happen because
 * the task crashed the JVM.
 */
public  class ExecutorLostFailure implements org.apache.spark.TaskFailedReason, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String execId ()  { throw new RuntimeException(); }
  public  boolean exitCausedByApp ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> reason ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorLostFailure (java.lang.String execId, boolean exitCausedByApp, scala.Option<java.lang.String> reason)  { throw new RuntimeException(); }
  public  java.lang.String toErrorString ()  { throw new RuntimeException(); }
  public  boolean countTowardsTaskFailures ()  { throw new RuntimeException(); }
}
