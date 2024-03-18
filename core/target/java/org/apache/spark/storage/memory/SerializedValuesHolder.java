package org.apache.spark.storage.memory;
/**
 * A holder for storing the serialized values.
 */
public  class SerializedValuesHolder<T extends java.lang.Object> implements org.apache.spark.storage.memory.ValuesHolder<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   SerializedValuesHolder (org.apache.spark.storage.BlockId blockId, int chunkSize, scala.reflect.ClassTag<T> classTag, org.apache.spark.memory.MemoryMode memoryMode, org.apache.spark.serializer.SerializerManager serializerManager)  { throw new RuntimeException(); }
  public  scala.Function1<java.lang.Object, java.nio.ByteBuffer> allocator ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.io.ChunkedByteBufferOutputStream bbos ()  { throw new RuntimeException(); }
  public  long estimatedSize ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.memory.MemoryEntryBuilder<T> getBuilder ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.memory.RedirectableOutputStream redirectableStream ()  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.SerializationStream serializationStream ()  { throw new RuntimeException(); }
  public  void storeValue (T value)  { throw new RuntimeException(); }
}
