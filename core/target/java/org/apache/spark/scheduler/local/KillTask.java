package org.apache.spark.scheduler.local;
public  class KillTask implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long taskId ()  { throw new RuntimeException(); }
  public  boolean interruptThread ()  { throw new RuntimeException(); }
  public  java.lang.String reason ()  { throw new RuntimeException(); }
  // not preceding
  public   KillTask (long taskId, boolean interruptThread, java.lang.String reason)  { throw new RuntimeException(); }
}
