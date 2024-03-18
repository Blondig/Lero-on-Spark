package org.apache.spark.streaming;
/** Listener that collects information on processed output operations */
public  class OutputOperationInfoCollector implements org.apache.spark.streaming.scheduler.StreamingListener {
  public   OutputOperationInfoCollector ()  { throw new RuntimeException(); }
  public  java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> completedOutputOperationIds ()  { throw new RuntimeException(); }
  public  void onOutputOperationCompleted (org.apache.spark.streaming.scheduler.StreamingListenerOutputOperationCompleted outputOperationCompleted)  { throw new RuntimeException(); }
  public  void onOutputOperationStarted (org.apache.spark.streaming.scheduler.StreamingListenerOutputOperationStarted outputOperationStarted)  { throw new RuntimeException(); }
  public  java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> startedOutputOperationIds ()  { throw new RuntimeException(); }
}
