package org.apache.spark.storage;
public  class DummyAllocator implements scala.Product, scala.Serializable {
  static public abstract  R apply ()  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public   DummyAllocator ()  { throw new RuntimeException(); }
  public  void alloc (int size)  { throw new RuntimeException(); }
  public  void release (int size)  { throw new RuntimeException(); }
  public  int getAllocatedMemory ()  { throw new RuntimeException(); }
}
