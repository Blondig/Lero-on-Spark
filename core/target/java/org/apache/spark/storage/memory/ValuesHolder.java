package org.apache.spark.storage.memory;
public  interface ValuesHolder<T extends java.lang.Object> {
  public  long estimatedSize ()  ;
  /**
   * Note: After this method is called, the ValuesHolder is invalid, we can't store data and
   * get estimate size again.
   * @return a MemoryEntryBuilder which is used to build a memory entry and get the stored data
   *         size.
   */
  public  org.apache.spark.storage.memory.MemoryEntryBuilder<T> getBuilder ()  ;
  public  void storeValue (T value)  ;
}
