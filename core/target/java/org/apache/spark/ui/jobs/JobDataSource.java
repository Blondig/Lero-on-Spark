package org.apache.spark.ui.jobs;
  class JobDataSource extends org.apache.spark.ui.PagedDataSource<org.apache.spark.ui.jobs.JobTableRowData> {
  public   JobDataSource (org.apache.spark.status.AppStatusStore store, scala.collection.Seq<org.apache.spark.status.api.v1.JobData> jobs, java.lang.String basePath, int pageSize, java.lang.String sortColumn, boolean desc)  { throw new RuntimeException(); }
  public  int dataSize ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ui.jobs.JobTableRowData> sliceData (int from, int to)  { throw new RuntimeException(); }
}
