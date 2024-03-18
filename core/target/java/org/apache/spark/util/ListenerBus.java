package org.apache.spark.util;
/**
 * An event bus which posts events to its listeners.
 */
public  interface ListenerBus<L extends java.lang.Object, E extends java.lang.Object> extends org.apache.spark.internal.Logging {
  /**
   * Add a listener to listen events. This method is thread-safe and can be called in any thread.
   * @param listener (undocumented)
   */
  public  void addListener (L listener)  ;
  /**
   * Post an event to the specified listener. <code>onPostEvent</code> is guaranteed to be called in the same
   * thread for all listeners.
   * @param listener (undocumented)
   * @param event (undocumented)
   */
  public  void doPostEvent (L listener, E event)  ;
   <T extends L> scala.collection.Seq<T> findListenersByClass (scala.reflect.ClassTag<T> evidence$1)  ;
  /**
   * Returns a CodaHale metrics Timer for measuring the listener's event processing time.
   * This method is intended to be overridden by subclasses.
   * @param listener (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<com.codahale.metrics.Timer> getTimer (L listener)  ;
  /** Allows bus implementations to prevent error logging for certain exceptions. */
  public  boolean isIgnorableException (java.lang.Throwable e)  ;
    java.util.List<L> listeners ()  ;
  /**
   * Post the event to all registered listeners. The <code>postToAll</code> caller should guarantee calling
   * <code>postToAll</code> in the same thread for all events.
   * @param event (undocumented)
   */
  public  void postToAll (E event)  ;
  public  E redactEvent (E e)  ;
  /**
   * Remove all listeners and they won't receive any events. This method is thread-safe and can be
   * called in any thread.
   */
  public  void removeAllListeners ()  ;
  /**
   * Remove a listener and it won't receive any events. This method is thread-safe and can be called
   * in any thread.
   * @param listener (undocumented)
   */
  public  void removeListener (L listener)  ;
  /**
   * This can be overridden by subclasses if there is any extra cleanup to do when removing a
   * listener.  In particular AsyncEventQueues can clean up queues in the LiveListenerBus.
   * @param listener (undocumented)
   */
  public  void removeListenerOnError (L listener)  ;
}
