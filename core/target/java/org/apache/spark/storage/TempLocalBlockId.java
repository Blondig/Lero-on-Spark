package org.apache.spark.storage;
/** Id associated with temporary local data managed as blocks. Not serializable. */
  class TempLocalBlockId extends org.apache.spark.storage.BlockId implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.util.UUID id ()  { throw new RuntimeException(); }
  // not preceding
  public   TempLocalBlockId (java.util.UUID id)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
}
