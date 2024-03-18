package org.apache.spark.examples.sql.streaming;
/**
 * User-defined data type representing the session information returned by flatMapGroupsWithState.
 * <p>
 * param:  id          Id of the user
 * param:  durationMs  Duration the session was active, that is, from first event to its expiry
 * param:  numEvents   Number of events received by the session while it was active
 */
public  class Session implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String id ()  { throw new RuntimeException(); }
  public  long durationMs ()  { throw new RuntimeException(); }
  public  int numEvents ()  { throw new RuntimeException(); }
  // not preceding
  public   Session (java.lang.String id, long durationMs, int numEvents)  { throw new RuntimeException(); }
}
