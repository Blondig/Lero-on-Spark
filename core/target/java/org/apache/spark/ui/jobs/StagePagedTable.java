package org.apache.spark.ui.jobs;
/** Page showing list of all ongoing and recently finished stages */
  class StagePagedTable implements org.apache.spark.ui.PagedTable<org.apache.spark.ui.jobs.StageTableRowData> {
  public   StagePagedTable (org.apache.spark.status.AppStatusStore store, scala.collection.Seq<org.apache.spark.status.api.v1.StageData> stages, java.lang.String tableHeaderId, java.lang.String stageTag, java.lang.String basePath, java.lang.String subPath, boolean isFairScheduler, boolean killEnabled, long currentTime, boolean isFailedStage, javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  public  org.apache.spark.ui.jobs.StageDataSource dataSource ()  { throw new RuntimeException(); }
  public  java.lang.String goButtonFormPath ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> headers ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<scala.xml.Node> missingStageRow (int stageId)  { throw new RuntimeException(); }
  public  java.lang.String pageLink (int page)  { throw new RuntimeException(); }
  public  java.lang.String pageNumberFormField ()  { throw new RuntimeException(); }
  public  java.lang.String pageSizeFormField ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> row (org.apache.spark.ui.jobs.StageTableRowData data)  { throw new RuntimeException(); }
  public  java.lang.String tableCssClass ()  { throw new RuntimeException(); }
  public  java.lang.String tableId ()  { throw new RuntimeException(); }
}
