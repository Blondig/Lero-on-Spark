package org.apache.spark.streaming.scheduler;
/** A receiver implementation for testing rate controlling */
  class RateTestReceiver extends org.apache.spark.streaming.receiver.Receiver<java.lang.Object> {
  static public  void registerReceiver (org.apache.spark.streaming.scheduler.RateTestReceiver receiver)  { throw new RuntimeException(); }
  static public  void deregisterReceiver ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.streaming.scheduler.RateTestReceiver> getActive ()  { throw new RuntimeException(); }
  public   RateTestReceiver (int receiverId, scala.Option<java.lang.String> host)  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> preferredLocation ()  { throw new RuntimeException(); }
  public  long getDefaultBlockGeneratorRateLimit ()  { throw new RuntimeException(); }
  public  long getCustomBlockGeneratorRateLimit ()  { throw new RuntimeException(); }
}
