package org.apache.spark.scheduler;
/**
 * :: DeveloperApi ::
 * A default implementation for <code>SparkListenerInterface</code> that has no-op implementations for
 * all callbacks.
 * <p>
 * Note that this is an internal interface which might change in different Spark releases.
 */
public abstract class SparkListener implements org.apache.spark.scheduler.SparkListenerInterface {
  public   SparkListener ()  { throw new RuntimeException(); }
  public  void onApplicationEnd (org.apache.spark.scheduler.SparkListenerApplicationEnd applicationEnd)  { throw new RuntimeException(); }
  public  void onApplicationStart (org.apache.spark.scheduler.SparkListenerApplicationStart applicationStart)  { throw new RuntimeException(); }
  public  void onBlockManagerAdded (org.apache.spark.scheduler.SparkListenerBlockManagerAdded blockManagerAdded)  { throw new RuntimeException(); }
  public  void onBlockManagerRemoved (org.apache.spark.scheduler.SparkListenerBlockManagerRemoved blockManagerRemoved)  { throw new RuntimeException(); }
  public  void onBlockUpdated (org.apache.spark.scheduler.SparkListenerBlockUpdated blockUpdated)  { throw new RuntimeException(); }
  public  void onEnvironmentUpdate (org.apache.spark.scheduler.SparkListenerEnvironmentUpdate environmentUpdate)  { throw new RuntimeException(); }
  public  void onExecutorAdded (org.apache.spark.scheduler.SparkListenerExecutorAdded executorAdded)  { throw new RuntimeException(); }
  public  void onExecutorBlacklisted (org.apache.spark.scheduler.SparkListenerExecutorBlacklisted executorBlacklisted)  { throw new RuntimeException(); }
  public  void onExecutorBlacklistedForStage (org.apache.spark.scheduler.SparkListenerExecutorBlacklistedForStage executorBlacklistedForStage)  { throw new RuntimeException(); }
  public  void onExecutorExcluded (org.apache.spark.scheduler.SparkListenerExecutorExcluded executorExcluded)  { throw new RuntimeException(); }
  public  void onExecutorExcludedForStage (org.apache.spark.scheduler.SparkListenerExecutorExcludedForStage executorExcludedForStage)  { throw new RuntimeException(); }
  public  void onExecutorMetricsUpdate (org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate executorMetricsUpdate)  { throw new RuntimeException(); }
  public  void onExecutorRemoved (org.apache.spark.scheduler.SparkListenerExecutorRemoved executorRemoved)  { throw new RuntimeException(); }
  public  void onExecutorUnblacklisted (org.apache.spark.scheduler.SparkListenerExecutorUnblacklisted executorUnblacklisted)  { throw new RuntimeException(); }
  public  void onExecutorUnexcluded (org.apache.spark.scheduler.SparkListenerExecutorUnexcluded executorUnexcluded)  { throw new RuntimeException(); }
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd jobEnd)  { throw new RuntimeException(); }
  public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart jobStart)  { throw new RuntimeException(); }
  public  void onNodeBlacklisted (org.apache.spark.scheduler.SparkListenerNodeBlacklisted nodeBlacklisted)  { throw new RuntimeException(); }
  public  void onNodeBlacklistedForStage (org.apache.spark.scheduler.SparkListenerNodeBlacklistedForStage nodeBlacklistedForStage)  { throw new RuntimeException(); }
  public  void onNodeExcluded (org.apache.spark.scheduler.SparkListenerNodeExcluded nodeExcluded)  { throw new RuntimeException(); }
  public  void onNodeExcludedForStage (org.apache.spark.scheduler.SparkListenerNodeExcludedForStage nodeExcludedForStage)  { throw new RuntimeException(); }
  public  void onNodeUnblacklisted (org.apache.spark.scheduler.SparkListenerNodeUnblacklisted nodeUnblacklisted)  { throw new RuntimeException(); }
  public  void onNodeUnexcluded (org.apache.spark.scheduler.SparkListenerNodeUnexcluded nodeUnexcluded)  { throw new RuntimeException(); }
  public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  public  void onResourceProfileAdded (org.apache.spark.scheduler.SparkListenerResourceProfileAdded event)  { throw new RuntimeException(); }
  public  void onSpeculativeTaskSubmitted (org.apache.spark.scheduler.SparkListenerSpeculativeTaskSubmitted speculativeTask)  { throw new RuntimeException(); }
  public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted)  { throw new RuntimeException(); }
  public  void onStageExecutorMetrics (org.apache.spark.scheduler.SparkListenerStageExecutorMetrics executorMetrics)  { throw new RuntimeException(); }
  public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted stageSubmitted)  { throw new RuntimeException(); }
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  { throw new RuntimeException(); }
  public  void onTaskGettingResult (org.apache.spark.scheduler.SparkListenerTaskGettingResult taskGettingResult)  { throw new RuntimeException(); }
  public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart taskStart)  { throw new RuntimeException(); }
  public  void onUnpersistRDD (org.apache.spark.scheduler.SparkListenerUnpersistRDD unpersistRDD)  { throw new RuntimeException(); }
  public  void onUnschedulableTaskSetAdded (org.apache.spark.scheduler.SparkListenerUnschedulableTaskSetAdded unschedulableTaskSetAdded)  { throw new RuntimeException(); }
  public  void onUnschedulableTaskSetRemoved (org.apache.spark.scheduler.SparkListenerUnschedulableTaskSetRemoved unschedulableTaskSetRemoved)  { throw new RuntimeException(); }
}
