package org.apache.spark.streaming;
/** Listener that collects information on processed batches */
public  class ReceiverInfoCollector implements org.apache.spark.streaming.scheduler.StreamingListener {
  public   ReceiverInfoCollector ()  { throw new RuntimeException(); }
  public  void onReceiverError (org.apache.spark.streaming.scheduler.StreamingListenerReceiverError receiverError)  { throw new RuntimeException(); }
  public  void onReceiverStarted (org.apache.spark.streaming.scheduler.StreamingListenerReceiverStarted receiverStarted)  { throw new RuntimeException(); }
  public  void onReceiverStopped (org.apache.spark.streaming.scheduler.StreamingListenerReceiverStopped receiverStopped)  { throw new RuntimeException(); }
  public  java.util.concurrent.ConcurrentLinkedQueue<scala.Tuple3<java.lang.Object, java.lang.String, java.lang.String>> receiverErrors ()  { throw new RuntimeException(); }
  public  java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> startedReceiverStreamIds ()  { throw new RuntimeException(); }
  public  java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> stoppedReceiverStreamIds ()  { throw new RuntimeException(); }
}
