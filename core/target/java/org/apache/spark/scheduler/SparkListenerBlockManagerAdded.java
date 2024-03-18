package org.apache.spark.scheduler;
public  class SparkListenerBlockManagerAdded implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long time ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
  public  long maxMem ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxOnHeapMem ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxOffHeapMem ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerBlockManagerAdded (long time, org.apache.spark.storage.BlockManagerId blockManagerId, long maxMem, scala.Option<java.lang.Object> maxOnHeapMem, scala.Option<java.lang.Object> maxOffHeapMem)  { throw new RuntimeException(); }
}
