package org.apache.spark.ui;
  class SeqPagedDataSource<T extends java.lang.Object> extends org.apache.spark.ui.PagedDataSource<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   SeqPagedDataSource (scala.collection.Seq<T> seq, int pageSize)  { throw new RuntimeException(); }
  protected  int dataSize ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<T> sliceData (int from, int to)  { throw new RuntimeException(); }
}
