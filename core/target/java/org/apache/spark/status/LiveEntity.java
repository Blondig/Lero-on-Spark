package org.apache.spark.status;
/**
 * A mutable representation of a live entity in Spark (jobs, stages, tasks, et al). Every live
 * entity uses one of these instances to keep track of their evolving state, and periodically
 * flush an immutable view of the entity to the app state store.
 */
 abstract class LiveEntity {
  public   LiveEntity ()  { throw new RuntimeException(); }
  /**
   * Returns an updated view of entity data, to be stored in the status store, reflecting the
   * latest information collected by the listener.
   * @return (undocumented)
   */
  protected abstract  Object doUpdate ()  ;
  public  long lastWriteTime ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.status.ElementTrackingStore store, long now, boolean checkTriggers)  { throw new RuntimeException(); }
}
