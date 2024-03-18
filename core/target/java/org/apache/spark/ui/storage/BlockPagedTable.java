package org.apache.spark.ui.storage;
  class BlockPagedTable implements org.apache.spark.ui.PagedTable<org.apache.spark.ui.storage.BlockTableRowData> {
  public   BlockPagedTable (javax.servlet.http.HttpServletRequest request, java.lang.String rddTag, java.lang.String basePath, scala.collection.Seq<org.apache.spark.status.api.v1.RDDPartitionInfo> rddPartitions, scala.collection.Seq<org.apache.spark.status.api.v1.ExecutorSummary> executorSummaries)  { throw new RuntimeException(); }
  public  org.apache.spark.ui.storage.BlockDataSource dataSource ()  { throw new RuntimeException(); }
  public  java.lang.String goButtonFormPath ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> headers ()  { throw new RuntimeException(); }
  public  java.lang.String pageLink (int page)  { throw new RuntimeException(); }
  public  java.lang.String pageNumberFormField ()  { throw new RuntimeException(); }
  public  java.lang.String pageSizeFormField ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> row (org.apache.spark.ui.storage.BlockTableRowData block)  { throw new RuntimeException(); }
  public  java.lang.String tableCssClass ()  { throw new RuntimeException(); }
  public  java.lang.String tableId ()  { throw new RuntimeException(); }
}
