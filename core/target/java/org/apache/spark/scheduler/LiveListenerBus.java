package org.apache.spark.scheduler;
/**
 * Asynchronously passes SparkListenerEvents to registered SparkListeners.
 * <p>
 * Until <code>start()</code> is called, all posted events are only buffered. Only after this listener bus
 * has started will events be actually propagated to all attached listeners. This listener bus
 * is stopped when <code>stop()</code> is called, and it will drop further events after stopping.
 */
  class LiveListenerBus {
  static public  scala.util.DynamicVariable<java.lang.Object> withinListenerThread ()  { throw new RuntimeException(); }
  static   java.lang.String SHARED_QUEUE ()  { throw new RuntimeException(); }
  static   java.lang.String APP_STATUS_QUEUE ()  { throw new RuntimeException(); }
  static   java.lang.String EXECUTOR_MANAGEMENT_QUEUE ()  { throw new RuntimeException(); }
  static   java.lang.String EVENT_LOG_QUEUE ()  { throw new RuntimeException(); }
  public   LiveListenerBus (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    org.apache.spark.scheduler.LiveListenerBusMetrics metrics ()  { throw new RuntimeException(); }
    scala.collection.mutable.ListBuffer<org.apache.spark.scheduler.SparkListenerEvent> queuedEvents ()  { throw new RuntimeException(); }
  /** Add a listener to queue shared by all non-internal listeners. */
  public  void addToSharedQueue (org.apache.spark.scheduler.SparkListenerInterface listener)  { throw new RuntimeException(); }
  /** Add a listener to the executor management queue. */
  public  void addToManagementQueue (org.apache.spark.scheduler.SparkListenerInterface listener)  { throw new RuntimeException(); }
  /** Add a listener to the application status queue. */
  public  void addToStatusQueue (org.apache.spark.scheduler.SparkListenerInterface listener)  { throw new RuntimeException(); }
  /** Add a listener to the event log queue. */
  public  void addToEventLogQueue (org.apache.spark.scheduler.SparkListenerInterface listener)  { throw new RuntimeException(); }
  /**
   * Add a listener to a specific queue, creating a new queue if needed. Queues are independent
   * of each other (each one uses a separate thread for delivering events), allowing slower
   * listeners to be somewhat isolated from others.
   * @param listener (undocumented)
   * @param queue (undocumented)
   */
    void addToQueue (org.apache.spark.scheduler.SparkListenerInterface listener, java.lang.String queue)  { throw new RuntimeException(); }
  public  void removeListener (org.apache.spark.scheduler.SparkListenerInterface listener)  { throw new RuntimeException(); }
  /** Post an event to all queues. */
  public  void post (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  /**
   * Start sending events to attached listeners.
   * <p>
   * This first sends out all buffered events posted before this listener bus has started, then
   * listens for any additional events asynchronously while the listener bus is still running.
   * This should only be called once.
   * <p>
   * @param sc Used to stop the SparkContext in case the listener thread dies.
   * @param metricsSystem (undocumented)
   */
  public  void start (org.apache.spark.SparkContext sc, org.apache.spark.metrics.MetricsSystem metricsSystem)  { throw new RuntimeException(); }
  /**
   * For testing only. Wait until there are no more events in the queue, or until the default
   * wait time has elapsed. Throw <code>TimeoutException</code> if the specified time elapsed before the queue
   * emptied.
   * Exposed for testing.
   */
    void waitUntilEmpty () throws java.util.concurrent.TimeoutException { throw new RuntimeException(); }
  /**
   * For testing only. Wait until there are no more events in the queue, or until the specified
   * time has elapsed. Throw <code>TimeoutException</code> if the specified time elapsed before the queue
   * emptied.
   * Exposed for testing.
   * @param timeoutMillis (undocumented)
   */
  public  void waitUntilEmpty (long timeoutMillis) throws java.util.concurrent.TimeoutException { throw new RuntimeException(); }
  /**
   * Stop the listener bus. It will wait until the queued events have been processed, but drop the
   * new events after stopping.
   */
  public  void stop ()  { throw new RuntimeException(); }
   <T extends org.apache.spark.scheduler.SparkListenerInterface> scala.collection.Seq<T> findListenersByClass (scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
    java.util.List<org.apache.spark.scheduler.SparkListenerInterface> listeners ()  { throw new RuntimeException(); }
    scala.collection.immutable.Set<java.lang.String> activeQueues ()  { throw new RuntimeException(); }
    scala.Option<java.lang.Object> getQueueCapacity (java.lang.String name)  { throw new RuntimeException(); }
}
