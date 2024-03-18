package org.apache.spark.sql.catalyst.trees;
public  interface QuaternaryLike<T extends org.apache.spark.sql.catalyst.trees.TreeNode<T>> {
  public  scala.collection.Seq<T> children ()  ;
  public  T first ()  ;
  public  T fourth ()  ;
  public  T mapChildren (scala.Function1<T, T> f)  ;
  public  T second ()  ;
  public  T third ()  ;
  public  T withNewChildrenInternal (scala.collection.IndexedSeq<T> newChildren)  ;
  public  T withNewChildrenInternal (T newFirst, T newSecond, T newThird, T newFourth)  ;
}
