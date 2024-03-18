package org.apache.spark.storage;
  class BlockException extends java.lang.Exception implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
  public  java.lang.String message ()  { throw new RuntimeException(); }
  // not preceding
  public   BlockException (org.apache.spark.storage.BlockId blockId, java.lang.String message)  { throw new RuntimeException(); }
}
