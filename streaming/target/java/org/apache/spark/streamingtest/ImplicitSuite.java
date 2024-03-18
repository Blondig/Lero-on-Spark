package org.apache.spark.streamingtest;
/**
 * A test suite to make sure all <code>implicit</code> functions work correctly.
 * <p>
 * As <code>implicit</code> is a compiler feature, we don't need to run this class.
 * What we need to do is making the compiler happy.
 */
public  class ImplicitSuite {
  public   ImplicitSuite ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<T> mockDStream ()  { throw new RuntimeException(); }
  public  void testToPairDStreamFunctions ()  { throw new RuntimeException(); }
}
