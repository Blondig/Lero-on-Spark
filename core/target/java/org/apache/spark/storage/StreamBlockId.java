package org.apache.spark.storage;
public  class StreamBlockId extends org.apache.spark.storage.BlockId implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int streamId ()  { throw new RuntimeException(); }
  public  long uniqueId ()  { throw new RuntimeException(); }
  // not preceding
  public   StreamBlockId (int streamId, long uniqueId)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
}
