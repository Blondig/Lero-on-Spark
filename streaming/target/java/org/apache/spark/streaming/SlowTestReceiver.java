package org.apache.spark.streaming;
/** Custom receiver for testing whether a slow receiver can be shutdown gracefully or not */
public  class SlowTestReceiver extends org.apache.spark.streaming.receiver.Receiver<java.lang.Object> implements org.apache.spark.internal.Logging {
  static public  boolean initialized ()  { throw new RuntimeException(); }
  public   SlowTestReceiver (int totalRecords, int recordsPerSecond)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Thread> receivingThreadOption ()  { throw new RuntimeException(); }
  public  boolean receivedAllRecords ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
}
