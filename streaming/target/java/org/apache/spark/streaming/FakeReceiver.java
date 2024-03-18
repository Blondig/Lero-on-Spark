package org.apache.spark.streaming;
/**
 * An implementation of Receiver that is used for testing a receiver's life cycle.
 */
public  class FakeReceiver extends org.apache.spark.streaming.receiver.Receiver<java.lang.Object> {
  public   FakeReceiver (boolean sendData)  { throw new RuntimeException(); }
  public  java.lang.Thread otherThread ()  { throw new RuntimeException(); }
  public  boolean receiving ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.streaming.MethodsCallRecorder callsRecorder ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
}
