package org.apache.spark.util.collection;
/**
 * An append-only buffer similar to ArrayBuffer, but more memory-efficient for small buffers.
 * ArrayBuffer always allocates an Object array to store the data, with 16 entries by default,
 * so it has about 80-100 bytes of overhead. In contrast, CompactBuffer can keep up to two
 * elements in fields of the main object, and only allocates an Array[AnyRef] if there are more
 * entries than that. This makes it more efficient for operations like groupBy where we expect
 * some keys to have very few elements.
 */
  class CompactBuffer<T extends java.lang.Object> implements scala.collection.Seq<T>, scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   CompactBuffer (scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  T apply (int position)  { throw new RuntimeException(); }
  public  int length ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<T> iterator ()  { throw new RuntimeException(); }
}
