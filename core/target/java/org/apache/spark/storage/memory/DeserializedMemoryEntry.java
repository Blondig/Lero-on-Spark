package org.apache.spark.storage.memory;
public  class DeserializedMemoryEntry<T extends java.lang.Object> implements org.apache.spark.storage.memory.MemoryEntry<T>, scala.Product, scala.Serializable {
  public  java.lang.Object value ()  { throw new RuntimeException(); }
  public  long size ()  { throw new RuntimeException(); }
  public  org.apache.spark.memory.MemoryMode memoryMode ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<T> classTag ()  { throw new RuntimeException(); }
  // not preceding
  public   DeserializedMemoryEntry (java.lang.Object value, long size, org.apache.spark.memory.MemoryMode memoryMode, scala.reflect.ClassTag<T> classTag)  { throw new RuntimeException(); }
}
