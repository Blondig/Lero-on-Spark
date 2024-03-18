package org.apache.spark.storage.memory;
public  interface MemoryEntryBuilder<T extends java.lang.Object> {
  public  org.apache.spark.storage.memory.MemoryEntry<T> build ()  ;
  public  long preciseSize ()  ;
}
