package org.apache.spark.streaming.scheduler;
/** An input DStream with for testing rate controlling */
  class RateTestInputDStream extends org.apache.spark.streaming.dstream.ReceiverInputDStream<java.lang.Object> {
  public   RateTestInputDStream (org.apache.spark.streaming.StreamingContext _ssc)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.receiver.Receiver<java.lang.Object> getReceiver ()  { throw new RuntimeException(); }
  public  int publishedRates ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.scheduler.RateController> rateController ()  { throw new RuntimeException(); }
}
