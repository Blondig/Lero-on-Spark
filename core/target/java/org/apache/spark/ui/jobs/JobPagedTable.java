package org.apache.spark.ui.jobs;
  class JobPagedTable implements org.apache.spark.ui.PagedTable<org.apache.spark.ui.jobs.JobTableRowData> {
  public   JobPagedTable (javax.servlet.http.HttpServletRequest request, org.apache.spark.status.AppStatusStore store, scala.collection.Seq<org.apache.spark.status.api.v1.JobData> data, java.lang.String tableHeaderId, java.lang.String jobTag, java.lang.String basePath, java.lang.String subPath, boolean killEnabled, java.lang.String jobIdTitle)  { throw new RuntimeException(); }
  public  org.apache.spark.ui.jobs.JobDataSource dataSource ()  { throw new RuntimeException(); }
  public  java.lang.String goButtonFormPath ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> headers ()  { throw new RuntimeException(); }
  public  java.lang.String pageLink (int page)  { throw new RuntimeException(); }
  public  java.lang.String pageNumberFormField ()  { throw new RuntimeException(); }
  public  java.lang.String pageSizeFormField ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> row (org.apache.spark.ui.jobs.JobTableRowData jobTableRow)  { throw new RuntimeException(); }
  public  java.lang.String tableCssClass ()  { throw new RuntimeException(); }
  public  java.lang.String tableId ()  { throw new RuntimeException(); }
}
