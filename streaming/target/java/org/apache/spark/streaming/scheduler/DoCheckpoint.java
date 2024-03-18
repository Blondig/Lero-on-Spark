package org.apache.spark.streaming.scheduler;
  class DoCheckpoint implements org.apache.spark.streaming.scheduler.JobGeneratorEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time time ()  { throw new RuntimeException(); }
  public  boolean clearCheckpointDataLater ()  { throw new RuntimeException(); }
  // not preceding
  public   DoCheckpoint (org.apache.spark.streaming.Time time, boolean clearCheckpointDataLater)  { throw new RuntimeException(); }
}
