package org.apache.spark.storage;
public  class ShuffleMergedIndexBlockId extends org.apache.spark.storage.BlockId implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String appId ()  { throw new RuntimeException(); }
  public  int shuffleId ()  { throw new RuntimeException(); }
  public  int shuffleMergeId ()  { throw new RuntimeException(); }
  public  int reduceId ()  { throw new RuntimeException(); }
  // not preceding
  public   ShuffleMergedIndexBlockId (java.lang.String appId, int shuffleId, int shuffleMergeId, int reduceId)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
}
