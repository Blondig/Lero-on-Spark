package org.apache.spark.sql.catalyst.trees;
public  interface UnaryLike<T extends org.apache.spark.sql.catalyst.trees.TreeNode<T>> {
  public  T child ()  ;
  public  scala.collection.Seq<T> children ()  ;
  public  T mapChildren (scala.Function1<T, T> f)  ;
  public  T withNewChildInternal (T newChild)  ;
  public  T withNewChildrenInternal (scala.collection.IndexedSeq<T> newChildren)  ;
}
