package org.apache.spark.streaming;
/** This is a receiver to test multiple threads inserting data using block generator */
public  class MultiThreadTestReceiver extends org.apache.spark.streaming.receiver.Receiver<java.lang.Object> implements org.apache.spark.internal.Logging {
  static public  boolean haveAllThreadsFinished ()  { throw new RuntimeException(); }
  public   MultiThreadTestReceiver (int numThreads, int numRecordsPerThread)  { throw new RuntimeException(); }
  // not preceding
  public  java.util.concurrent.ExecutorService executorPool ()  { throw new RuntimeException(); }
  // not preceding
  public  java.util.concurrent.atomic.AtomicInteger finishCount ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
}
