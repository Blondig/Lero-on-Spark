package org.apache.spark.scheduler;
  class UnschedulableTaskSetAdded implements org.apache.spark.scheduler.DAGSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
  public  int stageAttemptId ()  { throw new RuntimeException(); }
  // not preceding
  public   UnschedulableTaskSetAdded (int stageId, int stageAttemptId)  { throw new RuntimeException(); }
}
