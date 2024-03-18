package org.apache.spark.scheduler;
/**
 * A task that sends back the output to the driver application.
 * <p>
 * See {@link Task} for more information.
 * <p>
 * param:  stageId id of the stage this task belongs to
 * param:  stageAttemptId attempt id of the stage this task belongs to
 * param:  taskBinary broadcasted version of the serialized RDD and the function to apply on each
 *                   partition of the given RDD. Once deserialized, the type should be
 *                   (RDD[T], (TaskContext, Iterator[T]) =&gt; U).
 * param:  partition partition of the RDD this task is associated with
 * param:  locs preferred task execution locations for locality scheduling
 * param:  outputId index of the task in this job (a job can launch tasks on only a subset of the
 *                 input RDD's partitions).
 * param:  localProperties copy of thread-local properties set by the user on the driver side.
 * param:  serializedTaskMetrics a <code>TaskMetrics</code> that is created and serialized on the driver side
 *                              and sent to executor side.
 * <p>
 * The parameters below are optional:
 * param:  jobId id of the job this task belongs to
 * param:  appId id of the app this task belongs to
 * param:  appAttemptId attempt id of the app this task belongs to
 * param:  isBarrier whether this task belongs to a barrier stage. Spark must launch all the tasks
 *                  at the same time for a barrier stage.
 */
  class ResultTask<T extends java.lang.Object, U extends java.lang.Object> extends org.apache.spark.scheduler.Task<U> implements java.io.Serializable {
  public  int outputId ()  { throw new RuntimeException(); }
  // not preceding
  public   ResultTask (int stageId, int stageAttemptId, org.apache.spark.broadcast.Broadcast<byte[]> taskBinary, org.apache.spark.Partition partition, scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> locs, int outputId, java.util.Properties localProperties, byte[] serializedTaskMetrics, scala.Option<java.lang.Object> jobId, scala.Option<java.lang.String> appId, scala.Option<java.lang.String> appAttemptId, boolean isBarrier)  { throw new RuntimeException(); }
  public  U runTask (org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> preferredLocations ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
