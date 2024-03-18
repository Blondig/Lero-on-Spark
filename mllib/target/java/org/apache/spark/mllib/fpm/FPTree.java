package org.apache.spark.mllib.fpm;
/**
 * FP-Tree data structure used in FP-Growth.
 * @param <T>  item type
 */
  class FPTree<T extends java.lang.Object> implements scala.Serializable {
  /** Representing a node in an FP-Tree. */
  static public  class Node<T extends java.lang.Object> implements scala.Serializable {
    // not preceding
    public   Node (org.apache.spark.mllib.fpm.FPTree.Node<T> parent)  { throw new RuntimeException(); }
    public  scala.collection.mutable.Map<T, org.apache.spark.mllib.fpm.FPTree.Node<T>> children ()  { throw new RuntimeException(); }
    public  long count ()  { throw new RuntimeException(); }
    public  boolean isRoot ()  { throw new RuntimeException(); }
    public  T item ()  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.fpm.FPTree.Node<T> parent ()  { throw new RuntimeException(); }
  }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   FPTree ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.fpm.FPTree.Node<T> root ()  { throw new RuntimeException(); }
  /** Adds a transaction with count. */
  public  org.apache.spark.mllib.fpm.FPTree<T> add (scala.collection.Iterable<T> t, long count)  { throw new RuntimeException(); }
  /** Merges another FP-Tree. */
  public  org.apache.spark.mllib.fpm.FPTree<T> merge (org.apache.spark.mllib.fpm.FPTree<T> other)  { throw new RuntimeException(); }
  /** Returns all transactions in an iterator. */
  public  scala.collection.Iterator<scala.Tuple2<scala.collection.immutable.List<T>, java.lang.Object>> transactions ()  { throw new RuntimeException(); }
  /** Extracts all patterns with valid suffix and minimum count. */
  public  scala.collection.Iterator<scala.Tuple2<scala.collection.immutable.List<T>, java.lang.Object>> extract (long minCount, scala.Function1<T, java.lang.Object> validateSuffix)  { throw new RuntimeException(); }
}
