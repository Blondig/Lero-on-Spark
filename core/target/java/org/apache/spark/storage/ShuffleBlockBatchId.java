package org.apache.spark.storage;
public  class ShuffleBlockBatchId extends org.apache.spark.storage.BlockId implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int shuffleId ()  { throw new RuntimeException(); }
  public  long mapId ()  { throw new RuntimeException(); }
  public  int startReduceId ()  { throw new RuntimeException(); }
  public  int endReduceId ()  { throw new RuntimeException(); }
  // not preceding
  public   ShuffleBlockBatchId (int shuffleId, long mapId, int startReduceId, int endReduceId)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
}
