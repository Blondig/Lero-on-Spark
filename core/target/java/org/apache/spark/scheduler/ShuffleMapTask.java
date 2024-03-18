package org.apache.spark.scheduler;
/**
 * A ShuffleMapTask divides the elements of an RDD into multiple buckets (based on a partitioner
 * specified in the ShuffleDependency).
 * <p>
 * See {@link org.apache.spark.scheduler.Task} for more information.
 * <p>
 * param:  stageId id of the stage this task belongs to
 * param:  stageAttemptId attempt id of the stage this task belongs to
 * param:  taskBinary broadcast version of the RDD and the ShuffleDependency. Once deserialized,
 *                   the type should be (RDD[_], ShuffleDependency[_, _, _]).
 * param:  partition partition of the RDD this task is associated with
 * param:  locs preferred task execution locations for locality scheduling
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
  class ShuffleMapTask extends org.apache.spark.scheduler.Task<org.apache.spark.scheduler.MapStatus> implements org.apache.spark.internal.Logging {
  // not preceding
  public   ShuffleMapTask (int stageId, int stageAttemptId, org.apache.spark.broadcast.Broadcast<byte[]> taskBinary, org.apache.spark.Partition partition, scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> locs, java.util.Properties localProperties, byte[] serializedTaskMetrics, scala.Option<java.lang.Object> jobId, scala.Option<java.lang.String> appId, scala.Option<java.lang.String> appAttemptId, boolean isBarrier)  { throw new RuntimeException(); }
  /** A constructor used only in test suites. This does not require passing in an RDD. */
  public   ShuffleMapTask (int partitionId)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.MapStatus runTask (org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> preferredLocations ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
