package org.apache.spark.scheduler;
/**
 * :: DeveloperApi ::
 * Information about a running task attempt inside a TaskSet.
 */
public  class TaskInfo {
  // not preceding
  public   TaskInfo (long taskId, int index, int attemptNumber, int partitionId, long launchTime, java.lang.String executorId, java.lang.String host, scala.Enumeration.Value taskLocality, boolean speculative)  { throw new RuntimeException(); }
  /**
   * This api doesn't contains partitionId, please use the new api.
   * Remain it for backward compatibility before Spark 3.3.
   * @param taskId (undocumented)
   * @param index (undocumented)
   * @param attemptNumber (undocumented)
   * @param launchTime (undocumented)
   * @param executorId (undocumented)
   * @param host (undocumented)
   * @param taskLocality (undocumented)
   * @param speculative (undocumented)
   */
  public   TaskInfo (long taskId, int index, int attemptNumber, long launchTime, java.lang.String executorId, java.lang.String host, scala.Enumeration.Value taskLocality, boolean speculative)  { throw new RuntimeException(); }
  /**
   * Intermediate updates to accumulables during this task. Note that it is valid for the same
   * accumulable to be updated multiple times in a single task or for two accumulables with the
   * same name but different IDs to exist in a task.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo> accumulables ()  { throw new RuntimeException(); }
  public  int attemptNumber ()  { throw new RuntimeException(); }
  public  long duration ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  boolean failed ()  { throw new RuntimeException(); }
  /**
   * The time when the task has completed successfully (including the time to remotely fetch
   * results, if necessary).
   * @return (undocumented)
   */
  public  long finishTime ()  { throw new RuntimeException(); }
  public  boolean finished ()  { throw new RuntimeException(); }
  public  boolean gettingResult ()  { throw new RuntimeException(); }
  /**
   * The time when the task started remotely getting the result. Will not be set if the
   * task result was sent immediately when the task finished (as opposed to sending an
   * IndirectTaskResult and later fetching the result from the block manager).
   * @return (undocumented)
   */
  public  long gettingResultTime ()  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  java.lang.String id ()  { throw new RuntimeException(); }
  /**
   * The index of this task within its task set. Not necessarily the same as the ID of the RDD
   * partition that the task is computing.
   * @return (undocumented)
   */
  public  int index ()  { throw new RuntimeException(); }
  public  boolean killed ()  { throw new RuntimeException(); }
  public  long launchTime ()  { throw new RuntimeException(); }
    void markFinished (scala.Enumeration.Value state, long time)  { throw new RuntimeException(); }
    void markGettingResult (long time)  { throw new RuntimeException(); }
  /**
   * The actual RDD partition ID in this task.
   * The ID of the RDD partition is always same across task attempts.
   * This will be -1 for historical data, and available for all applications since Spark 3.3.
   * @return (undocumented)
   */
  public  int partitionId ()  { throw new RuntimeException(); }
  public  boolean running ()  { throw new RuntimeException(); }
    void setAccumulables (scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo> newAccumulables)  { throw new RuntimeException(); }
  public  boolean speculative ()  { throw new RuntimeException(); }
  public  java.lang.String status ()  { throw new RuntimeException(); }
  public  boolean successful ()  { throw new RuntimeException(); }
  public  long taskId ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value taskLocality ()  { throw new RuntimeException(); }
    long timeRunning (long currentTime)  { throw new RuntimeException(); }
}
