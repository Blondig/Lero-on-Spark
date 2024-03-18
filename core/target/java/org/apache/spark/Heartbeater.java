package org.apache.spark;
/**
 * Creates a heartbeat thread which will call the specified reportHeartbeat function at
 * intervals of intervalMs.
 * <p>
 * param:  reportHeartbeat the heartbeat reporting function to call.
 * param:  name the thread name for the heartbeater.
 * param:  intervalMs the interval between heartbeats.
 */
  class Heartbeater implements org.apache.spark.internal.Logging {
  public   Heartbeater (scala.Function0<scala.runtime.BoxedUnit> reportHeartbeat, java.lang.String name, long intervalMs)  { throw new RuntimeException(); }
  /** Schedules a task to report a heartbeat. */
  public  void start ()  { throw new RuntimeException(); }
  /** Stops the heartbeat thread. */
  public  void stop ()  { throw new RuntimeException(); }
}
