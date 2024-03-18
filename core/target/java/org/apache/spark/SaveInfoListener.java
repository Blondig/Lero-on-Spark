package org.apache.spark;
/**
 * A simple listener that keeps track of the TaskInfos and StageInfos of all completed jobs.
 */
public  class SaveInfoListener extends org.apache.spark.scheduler.SparkListener {
  public   SaveInfoListener ()  { throw new RuntimeException(); }
  /**
   * If <code>jobCompletionCallback</code> is set, block until the next call has finished.
   * If the callback failed with an exception, throw it.
   */
  public  void awaitNextJobCompletion ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.scheduler.StageInfo> getCompletedStageInfos ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.scheduler.TaskInfo> getCompletedTaskInfos ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.scheduler.TaskInfo> getCompletedTaskInfos (int stageId, int stageAttemptId)  { throw new RuntimeException(); }
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd jobEnd)  { throw new RuntimeException(); }
  public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted)  { throw new RuntimeException(); }
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  { throw new RuntimeException(); }
  /**
   * Register a callback to be called on job end.
   * A call to this should be followed by {@link awaitNextJobCompletion}.
   * @param callback (undocumented)
   */
  public  void registerJobCompletionCallback (scala.Function0<scala.runtime.BoxedUnit> callback)  { throw new RuntimeException(); }
}
