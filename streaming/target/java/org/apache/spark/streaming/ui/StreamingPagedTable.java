package org.apache.spark.streaming.ui;
  class StreamingPagedTable implements org.apache.spark.ui.PagedTable<org.apache.spark.streaming.ui.BatchUIData> {
  public   StreamingPagedTable (javax.servlet.http.HttpServletRequest request, java.lang.String tableTag, scala.collection.Seq<org.apache.spark.streaming.ui.BatchUIData> batches, java.lang.String basePath, java.lang.String subPath, long batchInterval)  { throw new RuntimeException(); }
  public  org.apache.spark.ui.PagedDataSource<org.apache.spark.streaming.ui.BatchUIData> dataSource ()  { throw new RuntimeException(); }
  public  java.lang.String goButtonFormPath ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> headers ()  { throw new RuntimeException(); }
  public  java.lang.String pageLink (int page)  { throw new RuntimeException(); }
  public  java.lang.String pageNumberFormField ()  { throw new RuntimeException(); }
  public  java.lang.String pageSizeFormField ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> row (org.apache.spark.streaming.ui.BatchUIData batch)  { throw new RuntimeException(); }
  public  java.lang.String tableCssClass ()  { throw new RuntimeException(); }
  public  java.lang.String tableId ()  { throw new RuntimeException(); }
}
