package org.apache.spark.scheduler;
public  class AskPermissionToCommitOutput implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int stage ()  { throw new RuntimeException(); }
  public  int stageAttempt ()  { throw new RuntimeException(); }
  public  int partition ()  { throw new RuntimeException(); }
  public  int attemptNumber ()  { throw new RuntimeException(); }
  // not preceding
  public   AskPermissionToCommitOutput (int stage, int stageAttempt, int partition, int attemptNumber)  { throw new RuntimeException(); }
}
