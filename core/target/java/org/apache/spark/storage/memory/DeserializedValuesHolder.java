package org.apache.spark.storage.memory;
/**
 * A holder for storing the deserialized values.
 */
public  class DeserializedValuesHolder<T extends java.lang.Object> implements org.apache.spark.storage.memory.ValuesHolder<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   DeserializedValuesHolder (scala.reflect.ClassTag<T> classTag, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  public  java.lang.Object arrayValues ()  { throw new RuntimeException(); }
  public  long estimatedSize ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.memory.MemoryEntryBuilder<T> getBuilder ()  { throw new RuntimeException(); }
  public  void storeValue (T value)  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.SizeTrackingVector<T> vector ()  { throw new RuntimeException(); }
}
