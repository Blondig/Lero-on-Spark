package org.apache.spark.streaming;
/** Listener that collects information on processed batches */
public  class BatchInfoCollector implements org.apache.spark.streaming.scheduler.StreamingListener {
  public   BatchInfoCollector ()  { throw new RuntimeException(); }
  public  java.util.concurrent.ConcurrentLinkedQueue<org.apache.spark.streaming.scheduler.BatchInfo> batchInfosCompleted ()  { throw new RuntimeException(); }
  public  java.util.concurrent.ConcurrentLinkedQueue<org.apache.spark.streaming.scheduler.BatchInfo> batchInfosStarted ()  { throw new RuntimeException(); }
  public  java.util.concurrent.ConcurrentLinkedQueue<org.apache.spark.streaming.scheduler.BatchInfo> batchInfosSubmitted ()  { throw new RuntimeException(); }
  public  void onBatchCompleted (org.apache.spark.streaming.scheduler.StreamingListenerBatchCompleted batchCompleted)  { throw new RuntimeException(); }
  public  void onBatchStarted (org.apache.spark.streaming.scheduler.StreamingListenerBatchStarted batchStarted)  { throw new RuntimeException(); }
  public  void onBatchSubmitted (org.apache.spark.streaming.scheduler.StreamingListenerBatchSubmitted batchSubmitted)  { throw new RuntimeException(); }
}
