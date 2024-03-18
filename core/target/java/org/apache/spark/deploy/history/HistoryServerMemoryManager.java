package org.apache.spark.deploy.history;
/**
 * A class used to keep track of in-memory store usage by the SHS.
 */
public  class HistoryServerMemoryManager implements org.apache.spark.internal.Logging {
  public   HistoryServerMemoryManager (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<scala.Tuple2<java.lang.String, scala.Option<java.lang.String>>, java.lang.Object> active ()  { throw new RuntimeException(); }
    java.util.concurrent.atomic.AtomicLong currentUsage ()  { throw new RuntimeException(); }
  public  void initialize ()  { throw new RuntimeException(); }
  public  void lease (java.lang.String appId, scala.Option<java.lang.String> attemptId, long eventLogSize, scala.Option<java.lang.String> codec)  { throw new RuntimeException(); }
  public  void release (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
}
