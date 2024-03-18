package org.apache.spark.scheduler;
/**
 * Helper for running a backend in integration tests, does a bunch of the book-keeping
 * so individual tests can focus on just responding to tasks.  Individual tests will use
 * {@link beginTask}, {@link taskSuccess}, and {@link taskFailed}.
 */
 abstract class MockBackend implements org.apache.spark.scheduler.SchedulerBackend, org.apache.spark.internal.Logging {
  // not preceding
  public   MockBackend (org.apache.spark.SparkConf conf, org.apache.spark.scheduler.TaskSchedulerImpl taskScheduler)  { throw new RuntimeException(); }
  /**
   * Test backends should call this to get a task that has been assigned to them by the scheduler.
   * Each task should be responded to with either {@link taskSuccess} or {@link taskFailed}.
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Tuple2<org.apache.spark.scheduler.TaskDescription, org.apache.spark.scheduler.Task<T>> beginTask ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkEnv env ()  { throw new RuntimeException(); }
  /**
   * Accessed by both scheduling and backend thread, so should be protected by this.
   * Most likely the only thing that needs to be protected are the individual ExecutorTaskStatus,
   * but for simplicity in this mock just lock the whole backend.
   * @return (undocumented)
   */
  public abstract  scala.collection.immutable.Map<java.lang.String, org.apache.spark.scheduler.ExecutorTaskStatus> executorIdToExecutor ()  ;
  /** Accessed by both scheduling and backend thread, so should be protected by this. */
  public  int freeCores ()  { throw new RuntimeException(); }
  public  boolean hasTasks ()  { throw new RuntimeException(); }
  public  boolean hasTasksWaitingToRun ()  { throw new RuntimeException(); }
  public  void killTask (long taskId, java.lang.String executorId, boolean interruptThread, java.lang.String reason)  { throw new RuntimeException(); }
  public  int maxNumConcurrentTasks (org.apache.spark.resource.ResourceProfile rp)  { throw new RuntimeException(); }
  /**
   * This is called by the scheduler whenever it has tasks it would like to schedule, when a tasks
   * completes (which will be in a result-getter thread), and by the reviveOffers thread for delay
   * scheduling.
   */
  public  void reviveOffers ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Tell the scheduler the task failed, with the given state and result (probably ExceptionFailure
   * or FetchFailed).  Also updates some internal state for this mock.
   * @param task (undocumented)
   * @param exc (undocumented)
   */
  public  void taskFailed (org.apache.spark.scheduler.TaskDescription task, java.lang.Exception exc)  { throw new RuntimeException(); }
  public  void taskFailed (org.apache.spark.scheduler.TaskDescription task, org.apache.spark.TaskFailedReason reason)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSchedulerImpl taskScheduler ()  { throw new RuntimeException(); }
  /**
   * Tell the scheduler the task completed successfully, with the given result.  Also
   * updates some internal state for this mock.
   * @param task (undocumented)
   * @param result (undocumented)
   */
  public  void taskSuccess (org.apache.spark.scheduler.TaskDescription task, Object result)  { throw new RuntimeException(); }
  public  void taskUpdate (org.apache.spark.scheduler.TaskDescription task, scala.Enumeration.Value state, Object result)  { throw new RuntimeException(); }
}
