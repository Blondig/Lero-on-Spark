package org.apache.spark.scheduler;
/**
 * Message providing more detail when an executor is being decommissioned.
 * param:  message Human readable reason for why the decommissioning is happening.
 * param:  workerHost When workerHost is defined, it means the host (aka the <code>node</code> or <code>worker</code>
 *                in other places) has been decommissioned too. Used to infer if the
 *                shuffle data might be lost even if the external shuffle service is enabled.
 */
  class ExecutorDecommissionInfo implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String message ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> workerHost ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorDecommissionInfo (java.lang.String message, scala.Option<java.lang.String> workerHost)  { throw new RuntimeException(); }
}
