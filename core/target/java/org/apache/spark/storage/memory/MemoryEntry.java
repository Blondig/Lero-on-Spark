package org.apache.spark.storage.memory;
public  interface MemoryEntry<T extends java.lang.Object> {
  public  scala.reflect.ClassTag<T> classTag ()  ;
  public  org.apache.spark.memory.MemoryMode memoryMode ()  ;
  public  long size ()  ;
}
