package org.apache.spark.util;
/**
 * Bounded priority queue. This class wraps the original PriorityQueue
 * class and modifies it such that only the top K elements are retained.
 * The top K elements are defined by an implicit Ordering[A].
 */
  class BoundedPriorityQueue<A extends java.lang.Object> implements scala.collection.Iterable<A>, scala.collection.generic.Growable<A>, java.io.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   BoundedPriorityQueue (int maxSize, scala.math.Ordering<A> ord)  { throw new RuntimeException(); }
  public  void clear ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<A> iterator ()  { throw new RuntimeException(); }
  public  A poll ()  { throw new RuntimeException(); }
  public  int size ()  { throw new RuntimeException(); }
}
