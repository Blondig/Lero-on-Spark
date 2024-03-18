package org.apache.spark.scheduler;
  class ExecutorAdded implements org.apache.spark.scheduler.DAGSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String execId ()  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorAdded (java.lang.String execId, java.lang.String host)  { throw new RuntimeException(); }
}
