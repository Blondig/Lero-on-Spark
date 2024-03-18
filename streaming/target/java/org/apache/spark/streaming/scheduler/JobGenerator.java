package org.apache.spark.streaming.scheduler;
/**
 * This class generates jobs from DStreams as well as drives checkpointing and cleaning
 * up DStream metadata.
 */
  class JobGenerator implements org.apache.spark.internal.Logging {
  public   JobGenerator (org.apache.spark.streaming.scheduler.JobScheduler jobScheduler)  { throw new RuntimeException(); }
  public  org.apache.spark.util.Clock clock ()  { throw new RuntimeException(); }
    org.apache.spark.streaming.Time lastProcessedBatch ()  { throw new RuntimeException(); }
  /**
   * Callback called when a batch has been completely processed.
   * @param time (undocumented)
   */
  public  void onBatchCompletion (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  /**
   * Callback called when the checkpoint of a batch has been written.
   * @param time (undocumented)
   * @param clearCheckpointDataLater (undocumented)
   */
  public  void onCheckpointCompletion (org.apache.spark.streaming.Time time, boolean clearCheckpointDataLater)  { throw new RuntimeException(); }
  /** Start generation of jobs */
  public  void start ()  { throw new RuntimeException(); }
  /**
   * Stop generation of jobs. processReceivedData = true makes this wait until jobs
   * of current ongoing time interval has been generated, processed and corresponding
   * checkpoints written.
   * @param processReceivedData (undocumented)
   */
  public  void stop (boolean processReceivedData)  { throw new RuntimeException(); }
}
