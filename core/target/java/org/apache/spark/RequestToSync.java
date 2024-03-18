package org.apache.spark;
/**
 * A global sync request message from BarrierTaskContext. Each request is
 * identified by stageId + stageAttemptId + barrierEpoch.
 * <p>
 * param:  numTasks The number of global sync requests the BarrierCoordinator shall receive
 * param:  stageId ID of current stage
 * param:  stageAttemptId ID of current stage attempt
 * param:  taskAttemptId Unique ID of current task
 * param:  barrierEpoch ID of a runBarrier() call, a task may consist multiple runBarrier() calls
 * param:  partitionId ID of the current partition the task is assigned to
 * param:  message Message sent from the BarrierTaskContext
 * param:  requestMethod The BarrierTaskContext method that was called to trigger BarrierCoordinator
 */
  class RequestToSync implements org.apache.spark.BarrierCoordinatorMessage, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int numTasks ()  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
  public  int stageAttemptId ()  { throw new RuntimeException(); }
  public  long taskAttemptId ()  { throw new RuntimeException(); }
  public  int barrierEpoch ()  { throw new RuntimeException(); }
  public  int partitionId ()  { throw new RuntimeException(); }
  public  java.lang.String message ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value requestMethod ()  { throw new RuntimeException(); }
  // not preceding
  public   RequestToSync (int numTasks, int stageId, int stageAttemptId, long taskAttemptId, int barrierEpoch, int partitionId, java.lang.String message, scala.Enumeration.Value requestMethod)  { throw new RuntimeException(); }
}
