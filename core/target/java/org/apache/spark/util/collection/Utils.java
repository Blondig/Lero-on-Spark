package org.apache.spark.util.collection;
/**
 * Utility functions for collections.
 */
public  class Utils {
  /**
   * Returns the first K elements from the input as defined by the specified implicit Ordering[T]
   * and maintains the ordering.
   * @param input (undocumented)
   * @param num (undocumented)
   * @param ord (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> scala.collection.Iterator<T> takeOrdered (scala.collection.Iterator<T> input, int num, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  /**
   * Only returns <code>Some</code> iff ALL elements in <code>input</code> are defined. In this case, it is
   * equivalent to <code>Some(input.flatten)</code>.
   * <p>
   * Otherwise, returns <code>None</code>.
   * @param input (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> scala.Option<scala.collection.Seq<T>> sequenceToOption (scala.collection.Seq<scala.Option<T>> input)  { throw new RuntimeException(); }
}
