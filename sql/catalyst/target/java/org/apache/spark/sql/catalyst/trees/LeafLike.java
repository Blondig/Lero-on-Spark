package org.apache.spark.sql.catalyst.trees;
public  interface LeafLike<T extends org.apache.spark.sql.catalyst.trees.TreeNode<T>> {
  public  scala.collection.Seq<T> children ()  ;
  public  T mapChildren (scala.Function1<T, T> f)  ;
  public  T withNewChildrenInternal (scala.collection.IndexedSeq<T> newChildren)  ;
}
