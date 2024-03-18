package org.apache.spark;
/**
 * Utility to help tests make sure that we can process two different iterators simultaneously
 * in different threads.  This makes sure that in your test, you don't completely process data1 with
 * f1 before processing data2 with f2 (or vice versa).  It adds a barrier so that the functions only
 * process one element, before pausing to wait for the other function to "catch up".
 */
public  class InterleaveIterators<T extends java.lang.Object, R extends java.lang.Object> {
  public  class BarrierIterator<E extends java.lang.Object> implements scala.collection.Iterator<E> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   BarrierIterator (int id, scala.collection.Iterator<E> sub)  { throw new RuntimeException(); }
    public  boolean hasNext ()  { throw new RuntimeException(); }
    public  E next ()  { throw new RuntimeException(); }
  }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   InterleaveIterators (scala.collection.Seq<T> data1, scala.Function1<scala.collection.Iterator<T>, R> f1, scala.collection.Seq<T> data2, scala.Function1<scala.collection.Iterator<T>, R> f2)  { throw new RuntimeException(); }
  public  java.util.concurrent.CyclicBarrier barrier ()  { throw new RuntimeException(); }
  public  java.lang.Object c1 ()  { throw new RuntimeException(); }
  public  java.lang.Object c2 ()  { throw new RuntimeException(); }
  public  java.util.concurrent.ExecutorService e ()  { throw new RuntimeException(); }
  public  scala.Tuple2<R, R> run ()  { throw new RuntimeException(); }
}
