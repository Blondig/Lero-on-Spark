package org.apache.spark.scheduler;
/**
 * An asynchronous queue for events. All events posted to this queue will be delivered to the child
 * listeners in a separate thread.
 * <p>
 * Delivery will only begin when the <code>start()</code> method is called. The <code>stop()</code> method should be
 * called when no more events need to be delivered.
 */
public  class AsyncEventQueue implements org.apache.spark.scheduler.SparkListenerBus, org.apache.spark.internal.Logging {
  static public  java.lang.Object POISON_PILL ()  { throw new RuntimeException(); }
  static public  int LOGGING_INTERVAL ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String name ()  { throw new RuntimeException(); }
  // not preceding
  public   AsyncEventQueue (java.lang.String name, org.apache.spark.SparkConf conf, org.apache.spark.scheduler.LiveListenerBusMetrics metrics, org.apache.spark.scheduler.LiveListenerBus bus)  { throw new RuntimeException(); }
    int capacity ()  { throw new RuntimeException(); }
  protected  scala.Option<com.codahale.metrics.Timer> getTimer (org.apache.spark.scheduler.SparkListenerInterface listener)  { throw new RuntimeException(); }
  /**
   * Start an asynchronous thread to dispatch events to the underlying listeners.
   * <p>
   * @param sc Used to stop the SparkContext in case the async dispatcher fails.
   */
    void start (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /**
   * Stop the listener bus. It will wait until the queued events have been processed, but new
   * events will be dropped.
   */
    void stop ()  { throw new RuntimeException(); }
  public  void post (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  /**
   * For testing only. Wait until there are no more events in the queue.
   * <p>
   * @return true if the queue is empty.
   * @param deadline (undocumented)
   */
  public  boolean waitUntilEmpty (long deadline)  { throw new RuntimeException(); }
  public  void removeListenerOnError (org.apache.spark.scheduler.SparkListenerInterface listener)  { throw new RuntimeException(); }
}
