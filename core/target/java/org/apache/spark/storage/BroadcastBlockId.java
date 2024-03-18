package org.apache.spark.storage;
public  class BroadcastBlockId extends org.apache.spark.storage.BlockId implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long broadcastId ()  { throw new RuntimeException(); }
  public  java.lang.String field ()  { throw new RuntimeException(); }
  // not preceding
  public   BroadcastBlockId (long broadcastId, java.lang.String field)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
}
