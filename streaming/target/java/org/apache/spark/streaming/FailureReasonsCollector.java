package org.apache.spark.streaming;
/**
 * A StreamingListener that saves all latest <code>failureReasons</code> in a batch.
 */
public  class FailureReasonsCollector implements org.apache.spark.streaming.scheduler.StreamingListener {
  public   FailureReasonsCollector ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, java.lang.String> failureReasons ()  { throw new RuntimeException(); }
  public  void onOutputOperationCompleted (org.apache.spark.streaming.scheduler.StreamingListenerOutputOperationCompleted outputOperationCompleted)  { throw new RuntimeException(); }
}
