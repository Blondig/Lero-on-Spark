package org.apache.spark;
public  class CleanBroadcast implements org.apache.spark.CleanupTask, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long broadcastId ()  { throw new RuntimeException(); }
  // not preceding
  public   CleanBroadcast (long broadcastId)  { throw new RuntimeException(); }
}
