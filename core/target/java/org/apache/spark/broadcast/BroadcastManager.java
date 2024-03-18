package org.apache.spark.broadcast;
  class BroadcastManager implements org.apache.spark.internal.Logging {
  // not preceding
  public   BroadcastManager (boolean isDriver, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    java.util.Map<java.lang.Object, java.lang.Object> cachedValues ()  { throw new RuntimeException(); }
  public  boolean isDriver ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.broadcast.Broadcast<T> newBroadcast (T value_, boolean isLocal, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  void unbroadcast (long id, boolean removeFromDriver, boolean blocking)  { throw new RuntimeException(); }
}
