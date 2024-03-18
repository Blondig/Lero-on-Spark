package org.apache.spark.status;
public  class ListenerEventsTestHelper {
  static public  class JobInfo implements scala.Product, scala.Serializable {
    public  scala.collection.Seq<java.lang.Object> stageIds ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.Object, scala.collection.Seq<java.lang.Object>> stageToTaskIds ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.Object, scala.collection.Seq<java.lang.Object>> stageToRddIds ()  { throw new RuntimeException(); }
    // not preceding
    public   JobInfo (scala.collection.Seq<java.lang.Object> stageIds, scala.collection.immutable.Map<java.lang.Object, scala.collection.Seq<java.lang.Object>> stageToTaskIds, scala.collection.immutable.Map<java.lang.Object, scala.collection.Seq<java.lang.Object>> stageToRddIds)  { throw new RuntimeException(); }
  }
  static public  class JobInfo$ extends scala.runtime.AbstractFunction3<scala.collection.Seq<java.lang.Object>, scala.collection.immutable.Map<java.lang.Object, scala.collection.Seq<java.lang.Object>>, scala.collection.immutable.Map<java.lang.Object, scala.collection.Seq<java.lang.Object>>, org.apache.spark.status.ListenerEventsTestHelper.JobInfo> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final JobInfo$ MODULE$ = null;
    public   JobInfo$ ()  { throw new RuntimeException(); }
  }
  static public  void reset ()  { throw new RuntimeException(); }
  static public  java.util.Properties createJobProps ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.storage.RDDInfo> createRddsWithId (scala.collection.Seq<java.lang.Object> ids)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.storage.RDDInfo> createRdds (int count)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.StageInfo createStage (int id, scala.collection.Seq<org.apache.spark.storage.RDDInfo> rdds, scala.collection.Seq<java.lang.Object> parentIds)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.StageInfo createStage (scala.collection.Seq<org.apache.spark.storage.RDDInfo> rdds, scala.collection.Seq<java.lang.Object> parentIds)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.scheduler.TaskInfo> createTasks (scala.collection.Seq<java.lang.Object> ids, java.lang.String[] execs, long time)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.scheduler.TaskInfo> createTasks (int count, java.lang.String[] execs, long time)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.TaskInfo createTaskWithNewAttempt (org.apache.spark.scheduler.TaskInfo orig, long time)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerTaskStart createTaskStartEvent (org.apache.spark.scheduler.TaskInfo taskInfo, int stageId, int attemptId)  { throw new RuntimeException(); }
  /** Create a stage submitted event for the specified stage Id. */
  static public  org.apache.spark.scheduler.SparkListenerStageSubmitted createStageSubmittedEvent (int stageId)  { throw new RuntimeException(); }
  /** Create a stage completed event for the specified stage Id. */
  static public  org.apache.spark.scheduler.SparkListenerStageCompleted createStageCompletedEvent (int stageId)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerExecutorAdded createExecutorAddedEvent (int executorId)  { throw new RuntimeException(); }
  /** Create an executor added event for the specified executor Id. */
  static public  org.apache.spark.scheduler.SparkListenerExecutorAdded createExecutorAddedEvent (java.lang.String executorId, long time)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerExecutorRemoved createExecutorRemovedEvent (int executorId)  { throw new RuntimeException(); }
  /** Create an executor added event for the specified executor Id. */
  static public  org.apache.spark.scheduler.SparkListenerExecutorRemoved createExecutorRemovedEvent (java.lang.String executorId, long time)  { throw new RuntimeException(); }
  /** Create an executor metrics update event, with the specified executor metrics values. */
  static public  org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate createExecutorMetricsUpdateEvent (int stageId, int executorId, long[] executorMetrics)  { throw new RuntimeException(); }
  static public  org.apache.spark.status.ListenerEventsTestHelper.JobInfo pushJobEventsWithoutJobEnd (org.apache.spark.scheduler.SparkListener listener, int jobId, java.util.Properties jobProps, java.lang.String[] execIds, long time)  { throw new RuntimeException(); }
}
