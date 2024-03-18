package org.apache.spark.storage;
public  class NativeObject implements org.apache.spark.util.KnownSizeEstimation, java.lang.AutoCloseable, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.DummyAllocator alloc ()  { throw new RuntimeException(); }
  public  int size ()  { throw new RuntimeException(); }
  // not preceding
  public   NativeObject (org.apache.spark.storage.DummyAllocator alloc, int size)  { throw new RuntimeException(); }
  public  int allocated_size ()  { throw new RuntimeException(); }
  public  long estimatedSize ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
