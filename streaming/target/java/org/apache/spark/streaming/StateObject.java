package org.apache.spark.streaming;
public  class StateObject implements scala.Serializable {
  public  int counter ()  { throw new RuntimeException(); }
  public  int expireCounter ()  { throw new RuntimeException(); }
  // not preceding
  public   StateObject (int counter, int expireCounter)  { throw new RuntimeException(); }
}
