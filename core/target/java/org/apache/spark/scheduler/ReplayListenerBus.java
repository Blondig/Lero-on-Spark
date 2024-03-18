package org.apache.spark.scheduler;
/**
 * A SparkListenerBus that can be used to replay events from serialized event data.
 */
  class ReplayListenerBus implements org.apache.spark.scheduler.SparkListenerBus, org.apache.spark.internal.Logging {
  static public  scala.Function1<java.lang.String, java.lang.Object> SELECT_ALL_FILTER ()  { throw new RuntimeException(); }
  public   ReplayListenerBus ()  { throw new RuntimeException(); }
  /**
   * Replay each event in the order maintained in the given stream. The stream is expected to
   * contain one JSON-encoded SparkListenerEvent per line.
   * <p>
   * This method can be called multiple times, but the listener behavior is undefined after any
   * error is thrown by this method.
   * <p>
   * @param logData Stream containing event log data.
   * @param sourceName Filename (or other source identifier) from whence @logData is being read
   * @param maybeTruncated Indicate whether log file might be truncated (some abnormal situations
   *        encountered, log file might not finished writing) or not
   * @param eventsFilter Filter function to select JSON event strings in the log data stream that
   *        should be parsed and replayed. When not specified, all event strings in the log data
   *        are parsed and replayed.
   * @return whether it succeeds to replay the log file entirely without error including
   *         HaltReplayException. false otherwise.
   */
  public  boolean replay (java.io.InputStream logData, java.lang.String sourceName, boolean maybeTruncated, scala.Function1<java.lang.String, java.lang.Object> eventsFilter)  { throw new RuntimeException(); }
  /**
   * Overloaded variant of {@link replay()} which accepts an iterator of lines instead of an
   * {@link InputStream}. Exposed for use by custom ApplicationHistoryProvider implementations.
   * @param lines (undocumented)
   * @param sourceName (undocumented)
   * @param maybeTruncated (undocumented)
   * @param eventsFilter (undocumented)
   * @return (undocumented)
   */
  public  boolean replay (scala.collection.Iterator<java.lang.String> lines, java.lang.String sourceName, boolean maybeTruncated, scala.Function1<java.lang.String, java.lang.Object> eventsFilter)  { throw new RuntimeException(); }
  /**
   * Overloaded variant of {@link replay()} which accepts an iterator of lines instead of an
   * {@link InputStream}. Exposed for use by custom ApplicationHistoryProvider implementations.
   * @param e (undocumented)
   * @return (undocumented)
   */
  protected  boolean isIgnorableException (java.lang.Throwable e)  { throw new RuntimeException(); }
}
