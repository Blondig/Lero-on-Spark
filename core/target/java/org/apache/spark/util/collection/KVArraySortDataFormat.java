package org.apache.spark.util.collection;
/**
 * Supports sorting an array of key-value pairs where the elements of the array alternate between
 * keys and values, as used in {@link AppendOnlyMap}.
 * <p>
 * @param <K>  Type of the sort key of each element
 * @param <T>  Type of the Array we're sorting. Typically this must extend AnyRef, to support cases
 *           when the keys and values are not the same type.
 */
  class KVArraySortDataFormat<K extends java.lang.Object, T extends java.lang.Object> extends org.apache.spark.util.collection.SortDataFormat<K, T[]> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(Select(Ident(scala), TypeName("AnyRef")))))
  public   KVArraySortDataFormat (scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  T[] allocate (int length)  { throw new RuntimeException(); }
  public  void copyElement (T[] src, int srcPos, T[] dst, int dstPos)  { throw new RuntimeException(); }
  public  void copyRange (T[] src, int srcPos, T[] dst, int dstPos, int length)  { throw new RuntimeException(); }
  public  K getKey (T[] data, int pos)  { throw new RuntimeException(); }
  public  void swap (T[] data, int pos0, int pos1)  { throw new RuntimeException(); }
}
