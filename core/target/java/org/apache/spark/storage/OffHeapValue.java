package org.apache.spark.storage;
public  class OffHeapValue implements org.apache.spark.util.KnownSizeEstimation, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long estimatedSize ()  { throw new RuntimeException(); }
  // not preceding
  public   OffHeapValue (long estimatedSize)  { throw new RuntimeException(); }
}
