package org.apache.spark.scheduler;
public  class ExecutorTaskStatus implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  int freeCores ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorTaskStatus (java.lang.String host, java.lang.String executorId, int freeCores)  { throw new RuntimeException(); }
}
