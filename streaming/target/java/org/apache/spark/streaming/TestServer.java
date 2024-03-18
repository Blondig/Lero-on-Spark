package org.apache.spark.streaming;
/** This is a server to test the network input stream */
public  class TestServer implements org.apache.spark.internal.Logging, org.scalatest.Assertions {
  public final  org.scalatest.compatible.Assertion succeed ()  { throw new RuntimeException(); }
  public   TestServer (int portToBind)  { throw new RuntimeException(); }
  public  java.util.concurrent.ArrayBlockingQueue<java.lang.String> queue ()  { throw new RuntimeException(); }
  public  java.net.ServerSocket serverSocket ()  { throw new RuntimeException(); }
  public  java.lang.Thread servingThread ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void send (java.lang.String msg)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  int port ()  { throw new RuntimeException(); }
}
