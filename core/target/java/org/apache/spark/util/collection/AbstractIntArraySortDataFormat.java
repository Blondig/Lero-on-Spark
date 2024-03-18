package org.apache.spark.util.collection;
/**
 * Tests for sorting with primitive keys with/without key reuse. Java's Arrays.sort is used as
 * reference, which is expected to be faster but it can only sort a single array. Sorter can be
 * used to sort parallel arrays.
 * <p>
 * Ideally these would be executed one at a time, each in their own JVM, so their listing
 * here is mainly to have the code. Running multiple tests within the same JVM session would
 * prevent JIT inlining overridden methods and hence hurt the performance.
 */
public abstract class AbstractIntArraySortDataFormat<K extends java.lang.Object> extends org.apache.spark.util.collection.SortDataFormat<K, int[]> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   AbstractIntArraySortDataFormat ()  { throw new RuntimeException(); }
  /** Allocates a new structure that can hold up to 'length' elements. */
  public  int[] allocate (int length)  { throw new RuntimeException(); }
  public  void copyElement (int[] src, int srcPos, int[] dst, int dstPos)  { throw new RuntimeException(); }
  /** Copy a range of elements starting at src(srcPos) to dest, starting at destPos. */
  public  void copyRange (int[] src, int srcPos, int[] dst, int dstPos, int length)  { throw new RuntimeException(); }
  public  void swap (int[] data, int pos0, int pos1)  { throw new RuntimeException(); }
}
