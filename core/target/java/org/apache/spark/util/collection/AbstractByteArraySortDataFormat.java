package org.apache.spark.util.collection;
public abstract class AbstractByteArraySortDataFormat<K extends java.lang.Object> extends org.apache.spark.util.collection.SortDataFormat<K, byte[]> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   AbstractByteArraySortDataFormat ()  { throw new RuntimeException(); }
  /** Allocates a new structure that can hold up to 'length' elements. */
  public  byte[] allocate (int length)  { throw new RuntimeException(); }
  public  void copyElement (byte[] src, int srcPos, byte[] dst, int dstPos)  { throw new RuntimeException(); }
  /** Copy a range of elements starting at src(srcPos) to dest, starting at destPos. */
  public  void copyRange (byte[] src, int srcPos, byte[] dst, int dstPos, int length)  { throw new RuntimeException(); }
  public  void swap (byte[] data, int pos0, int pos1)  { throw new RuntimeException(); }
}
