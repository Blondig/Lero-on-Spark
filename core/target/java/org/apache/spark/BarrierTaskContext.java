package org.apache.spark;
/**
 * :: Experimental ::
 * A {@link TaskContext} with extra contextual info and tooling for tasks in a barrier stage.
 * Use {@link BarrierTaskContext#get} to obtain the barrier context for a running barrier task.
 */
public  class BarrierTaskContext extends org.apache.spark.TaskContext implements org.apache.spark.internal.Logging {
  /**
   * :: Experimental ::
   * Returns the currently active BarrierTaskContext. This can be called inside of user functions to
   * access contextual information about running barrier tasks.
   * @return (undocumented)
   */
  static public  org.apache.spark.BarrierTaskContext get ()  { throw new RuntimeException(); }
     BarrierTaskContext (org.apache.spark.TaskContext taskContext)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Sets a global barrier and waits until all tasks in this stage hit this barrier. Similar to
   * MPI_Barrier function in MPI, the barrier() function call blocks until all tasks in the same
   * stage have reached this routine.
   * <p>
   * CAUTION! In a barrier stage, each task must have the same number of barrier() calls, in all
   * possible code branches. Otherwise, you may get the job hanging or a SparkException after
   * timeout. Some examples of '''misuses''' are listed below:
   * 1. Only call barrier() function on a subset of all the tasks in the same barrier stage, it
   * shall lead to timeout of the function call.
   * <pre><code>
   *   rdd.barrier().mapPartitions { iter =&gt;
   *       val context = BarrierTaskContext.get()
   *       if (context.partitionId() == 0) {
   *           // Do nothing.
   *       } else {
   *           context.barrier()
   *       }
   *       iter
   *   }
   * </code></pre>
   * <p>
   * 2. Include barrier() function in a try-catch code block, this may lead to timeout of the
   * second function call.
   * <pre><code>
   *   rdd.barrier().mapPartitions { iter =&gt;
   *       val context = BarrierTaskContext.get()
   *       try {
   *           // Do something that might throw an Exception.
   *           doSomething()
   *           context.barrier()
   *       } catch {
   *           case e: Exception =&gt; logWarning("...", e)
   *       }
   *       context.barrier()
   *       iter
   *   }
   * </code></pre>
   */
  public  void barrier ()  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Blocks until all tasks in the same stage have reached this routine. Each task passes in
   * a message and returns with a list of all the messages passed in by each of those tasks.
   * <p>
   * CAUTION! The allGather method requires the same precautions as the barrier method
   * <p>
   * The message is type String rather than Array[Byte] because it is more convenient for
   * the user at the cost of worse performance.
   * @param message (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String[] allGather (java.lang.String message)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Returns {@link BarrierTaskInfo} for all tasks in this barrier stage, ordered by partition ID.
   * @return (undocumented)
   */
  public  org.apache.spark.BarrierTaskInfo[] getTaskInfos ()  { throw new RuntimeException(); }
  public  boolean isCompleted ()  { throw new RuntimeException(); }
  public  boolean isInterrupted ()  { throw new RuntimeException(); }
  public  org.apache.spark.BarrierTaskContext addTaskCompletionListener (org.apache.spark.util.TaskCompletionListener listener)  { throw new RuntimeException(); }
  public  org.apache.spark.BarrierTaskContext addTaskFailureListener (org.apache.spark.util.TaskFailureListener listener)  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
  public  int stageAttemptNumber ()  { throw new RuntimeException(); }
  public  int partitionId ()  { throw new RuntimeException(); }
  public  int attemptNumber ()  { throw new RuntimeException(); }
  public  long taskAttemptId ()  { throw new RuntimeException(); }
  public  java.lang.String getLocalProperty (java.lang.String key)  { throw new RuntimeException(); }
  public  org.apache.spark.executor.TaskMetrics taskMetrics ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.metrics.source.Source> getMetricsSources (java.lang.String sourceName)  { throw new RuntimeException(); }
  public  int cpus ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resourcesJMap ()  { throw new RuntimeException(); }
    void killTaskIfInterrupted ()  { throw new RuntimeException(); }
    scala.Option<java.lang.String> getKillReason ()  { throw new RuntimeException(); }
    org.apache.spark.memory.TaskMemoryManager taskMemoryManager ()  { throw new RuntimeException(); }
    void registerAccumulator (org.apache.spark.util.AccumulatorV2<?, ?> a)  { throw new RuntimeException(); }
    void setFetchFailed (org.apache.spark.shuffle.FetchFailedException fetchFailed)  { throw new RuntimeException(); }
    void markInterrupted (java.lang.String reason)  { throw new RuntimeException(); }
    void markTaskFailed (java.lang.Throwable error)  { throw new RuntimeException(); }
    void markTaskCompleted (scala.Option<java.lang.Throwable> error)  { throw new RuntimeException(); }
    scala.Option<org.apache.spark.shuffle.FetchFailedException> fetchFailed ()  { throw new RuntimeException(); }
    java.util.Properties getLocalProperties ()  { throw new RuntimeException(); }
}
