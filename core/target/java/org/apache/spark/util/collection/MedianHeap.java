package org.apache.spark.util.collection;
/**
 * MedianHeap is designed to be used to quickly track the median of a group of numbers
 * that may contain duplicates. Inserting a new number has O(log n) time complexity and
 * determining the median has O(1) time complexity.
 * The basic idea is to maintain two heaps: a smallerHalf and a largerHalf. The smallerHalf
 * stores the smaller half of all numbers while the largerHalf stores the larger half.
 * The sizes of two heaps need to be balanced each time when a new number is inserted so
 * that their sizes will not be different by more than 1. Therefore each time when
 * findMedian() is called we check if two heaps have the same size. If they do, we should
 * return the average of the two top values of heaps. Otherwise we return the top of the
 * heap which has one more element.
 */
  class MedianHeap {
  // not preceding
  public   MedianHeap (scala.math.Ordering<java.lang.Object> ord)  { throw new RuntimeException(); }
  public  void insert (double x)  { throw new RuntimeException(); }
  /**
   * Stores all the numbers greater than the current median in a largerHalf,
   * i.e median is the minimum, at the root.
   * @return (undocumented)
   */
  public  boolean isEmpty ()  { throw new RuntimeException(); }
  public  double median ()  { throw new RuntimeException(); }
  public  scala.math.Ordering<java.lang.Object> ord ()  { throw new RuntimeException(); }
  public  int size ()  { throw new RuntimeException(); }
}
