package org.apache.spark.ui.jobs;
  class TaskDataSource extends org.apache.spark.ui.PagedDataSource<org.apache.spark.status.api.v1.TaskData> {
  public   TaskDataSource (org.apache.spark.status.api.v1.StageData stage, int pageSize, java.lang.String sortColumn, boolean desc, org.apache.spark.status.AppStatusStore store)  { throw new RuntimeException(); }
  public  int dataSize ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> executorLogs (java.lang.String id)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.TaskData> sliceData (int from, int to)  { throw new RuntimeException(); }
}
