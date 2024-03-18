package org.apache.spark.streaming;
/**
 * A StreamingListener that calls StreamingContext.stop().
 */
public  class StreamingContextStoppingCollector implements org.apache.spark.streaming.scheduler.StreamingListener {
  // not preceding
  public   StreamingContextStoppingCollector (org.apache.spark.streaming.StreamingContext ssc)  { throw new RuntimeException(); }
  public  void onBatchCompleted (org.apache.spark.streaming.scheduler.StreamingListenerBatchCompleted batchCompleted)  { throw new RuntimeException(); }
  public  boolean sparkExSeen ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.StreamingContext ssc ()  { throw new RuntimeException(); }
}
