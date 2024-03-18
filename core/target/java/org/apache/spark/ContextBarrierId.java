package org.apache.spark;
/**
 * For each barrier stage attempt, only at most one barrier() call can be active at any time, thus
 * we can use (stageId, stageAttemptId) to identify the stage attempt where the barrier() call is
 * from.
 */
public  class ContextBarrierId implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  public  int stageId ()  { throw new RuntimeException(); }
  public  int stageAttemptId ()  { throw new RuntimeException(); }
  // not preceding
  public   ContextBarrierId (int stageId, int stageAttemptId)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
