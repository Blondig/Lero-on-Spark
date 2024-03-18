package org.apache.spark;
/**
 * A <code>SparkListener</code> that detects whether spills have occurred in Spark jobs.
 */
public  class SpillListener extends org.apache.spark.scheduler.SparkListener {
  public   SpillListener ()  { throw new RuntimeException(); }
  public  int numSpilledStages ()  { throw new RuntimeException(); }
  public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageComplete)  { throw new RuntimeException(); }
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  { throw new RuntimeException(); }
}
