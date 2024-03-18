package org.apache.spark.storage.memory;
public  class SerializedMemoryEntry<T extends java.lang.Object> implements org.apache.spark.storage.memory.MemoryEntry<T>, scala.Product, scala.Serializable {
  public  org.apache.spark.util.io.ChunkedByteBuffer buffer ()  { throw new RuntimeException(); }
  public  org.apache.spark.memory.MemoryMode memoryMode ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<T> classTag ()  { throw new RuntimeException(); }
  // not preceding
  public   SerializedMemoryEntry (org.apache.spark.util.io.ChunkedByteBuffer buffer, org.apache.spark.memory.MemoryMode memoryMode, scala.reflect.ClassTag<T> classTag)  { throw new RuntimeException(); }
  public  long size ()  { throw new RuntimeException(); }
}
