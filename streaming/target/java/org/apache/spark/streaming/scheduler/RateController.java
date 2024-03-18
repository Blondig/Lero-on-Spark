package org.apache.spark.streaming.scheduler;
/**
 * A StreamingListener that receives batch completion updates, and maintains
 * an estimate of the speed at which this stream should ingest messages,
 * given an estimate computation from a <code>RateEstimator</code>
 */
 abstract class RateController implements org.apache.spark.streaming.scheduler.StreamingListener, scala.Serializable {
  static public  boolean isBackPressureEnabled (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  int streamUID ()  { throw new RuntimeException(); }
  // not preceding
  public   RateController (int streamUID, org.apache.spark.streaming.scheduler.rate.RateEstimator rateEstimator)  { throw new RuntimeException(); }
  protected abstract  void publish (long rate)  ;
  public  long getLatestRate ()  { throw new RuntimeException(); }
  public  void onBatchCompleted (org.apache.spark.streaming.scheduler.StreamingListenerBatchCompleted batchCompleted)  { throw new RuntimeException(); }
}
