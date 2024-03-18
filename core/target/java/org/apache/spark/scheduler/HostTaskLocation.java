package org.apache.spark.scheduler;
/**
 * A location on a host.
 */
  class HostTaskLocation implements org.apache.spark.scheduler.TaskLocation, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  public  java.lang.String host ()  { throw new RuntimeException(); }
  // not preceding
  public   HostTaskLocation (java.lang.String host)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
