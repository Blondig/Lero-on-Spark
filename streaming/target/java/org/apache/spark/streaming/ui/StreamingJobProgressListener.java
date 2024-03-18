package org.apache.spark.streaming.ui;
  class StreamingJobProgressListener extends org.apache.spark.scheduler.SparkListener implements org.apache.spark.streaming.scheduler.StreamingListener {
  public   StreamingJobProgressListener (org.apache.spark.streaming.StreamingContext ssc)  { throw new RuntimeException(); }
    java.util.LinkedHashMap<org.apache.spark.streaming.Time, java.util.concurrent.ConcurrentLinkedQueue<org.apache.spark.streaming.ui.OutputOpIdAndSparkJobId>> batchTimeToOutputOpIdSparkJobIdPair ()  { throw new RuntimeException(); }
  public  long batchDuration ()  { throw new RuntimeException(); }
  public  void onStreamingStarted (org.apache.spark.streaming.scheduler.StreamingListenerStreamingStarted streamingStarted)  { throw new RuntimeException(); }
  public  void onReceiverStarted (org.apache.spark.streaming.scheduler.StreamingListenerReceiverStarted receiverStarted)  { throw new RuntimeException(); }
  public  void onReceiverError (org.apache.spark.streaming.scheduler.StreamingListenerReceiverError receiverError)  { throw new RuntimeException(); }
  public  void onReceiverStopped (org.apache.spark.streaming.scheduler.StreamingListenerReceiverStopped receiverStopped)  { throw new RuntimeException(); }
  public  void onBatchSubmitted (org.apache.spark.streaming.scheduler.StreamingListenerBatchSubmitted batchSubmitted)  { throw new RuntimeException(); }
  public  void onBatchStarted (org.apache.spark.streaming.scheduler.StreamingListenerBatchStarted batchStarted)  { throw new RuntimeException(); }
  public  void onBatchCompleted (org.apache.spark.streaming.scheduler.StreamingListenerBatchCompleted batchCompleted)  { throw new RuntimeException(); }
  public  void onOutputOperationStarted (org.apache.spark.streaming.scheduler.StreamingListenerOutputOperationStarted outputOperationStarted)  { throw new RuntimeException(); }
  public  void onOutputOperationCompleted (org.apache.spark.streaming.scheduler.StreamingListenerOutputOperationCompleted outputOperationCompleted)  { throw new RuntimeException(); }
  public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart jobStart)  { throw new RuntimeException(); }
  public  long startTime ()  { throw new RuntimeException(); }
  public  int numReceivers ()  { throw new RuntimeException(); }
  public  int numActiveReceivers ()  { throw new RuntimeException(); }
  public  int numInactiveReceivers ()  { throw new RuntimeException(); }
  public  long numTotalCompletedBatches ()  { throw new RuntimeException(); }
  public  long numTotalReceivedRecords ()  { throw new RuntimeException(); }
  public  long numTotalProcessedRecords ()  { throw new RuntimeException(); }
  public  long numUnprocessedBatches ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.ui.BatchUIData> waitingBatches ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.ui.BatchUIData> runningBatches ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.ui.BatchUIData> retainedCompletedBatches ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> streamName (int streamId)  { throw new RuntimeException(); }
  /**
   * Return all InputDStream Ids
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.Object> streamIds ()  { throw new RuntimeException(); }
  /**
   * Return all of the record rates for each InputDStream in each batch. The key of the return value
   * is the stream id, and the value is a sequence of batch time with its record rate.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.Object, scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>>> receivedRecordRateWithBatchTime ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> lastReceivedBatchRecords ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.scheduler.ReceiverInfo> receiverInfo (int receiverId)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.ui.BatchUIData> lastCompletedBatch ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.ui.BatchUIData> lastReceivedBatch ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.ui.BatchUIData> retainedBatches ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.ui.BatchUIData> getBatchUIData (org.apache.spark.streaming.Time batchTime)  { throw new RuntimeException(); }
}
