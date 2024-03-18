package org.apache.spark.scheduler;
/**
 * param:  _message human readable loss reason
 * param:  workerHost it's defined when the host is confirmed lost too (i.e. including
 *                   shuffle service)
 * param:  causedByApp whether the loss of the executor is the fault of the running app.
 *                    (assumed true by default unless known explicitly otherwise)
 */
  class ExecutorProcessLost extends org.apache.spark.scheduler.ExecutorLossReason implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String _message ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> workerHost ()  { throw new RuntimeException(); }
  public  boolean causedByApp ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorProcessLost (java.lang.String _message, scala.Option<java.lang.String> workerHost, boolean causedByApp)  { throw new RuntimeException(); }
}
