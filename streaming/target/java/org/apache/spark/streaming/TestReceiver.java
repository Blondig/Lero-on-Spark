package org.apache.spark.streaming;
/** Custom receiver for testing whether all data received by a receiver gets processed or not */
public  class TestReceiver extends org.apache.spark.streaming.receiver.Receiver<java.lang.Object> implements org.apache.spark.internal.Logging {
  static public  java.util.concurrent.atomic.AtomicInteger counter ()  { throw new RuntimeException(); }
  public   TestReceiver ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Thread> receivingThreadOption ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
}
