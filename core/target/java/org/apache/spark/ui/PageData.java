package org.apache.spark.ui;
/**
 * The data returned by <code>PagedDataSource.pageData</code>, including the page number, the number of total
 * pages and the data in this page.
 */
  class PageData<T extends java.lang.Object> implements scala.Product, scala.Serializable {
  public  int totalPage ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<T> data ()  { throw new RuntimeException(); }
  // not preceding
  public   PageData (int totalPage, scala.collection.Seq<T> data)  { throw new RuntimeException(); }
}
