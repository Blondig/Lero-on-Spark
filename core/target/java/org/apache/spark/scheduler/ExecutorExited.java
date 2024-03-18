package org.apache.spark.scheduler;
  class ExecutorExited extends org.apache.spark.scheduler.ExecutorLossReason implements scala.Product, scala.Serializable {
  static public  org.apache.spark.scheduler.ExecutorExited apply (int exitCode, boolean exitCausedByApp)  { throw new RuntimeException(); }
  public  int exitCode ()  { throw new RuntimeException(); }
  public  boolean exitCausedByApp ()  { throw new RuntimeException(); }
  public  java.lang.String reason ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorExited (int exitCode, boolean exitCausedByApp, java.lang.String reason)  { throw new RuntimeException(); }
}
