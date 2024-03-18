package org.apache.spark.sql.catalyst.trees;
public  interface BinaryLike<T extends org.apache.spark.sql.catalyst.trees.TreeNode<T>> {
  public  scala.collection.Seq<T> children ()  ;
  public  T left ()  ;
  public  T mapChildren (scala.Function1<T, T> f)  ;
  public  T right ()  ;
  public  T withNewChildrenInternal (scala.collection.IndexedSeq<T> newChildren)  ;
  public  T withNewChildrenInternal (T newLeft, T newRight)  ;
}
