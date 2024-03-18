package org.apache.spark.ui.jobs;
/** Page showing statistics and task list for a given stage */
  class StagePage extends org.apache.spark.ui.WebUIPage {
  public   StagePage (org.apache.spark.ui.jobs.StagesTab parent, org.apache.spark.status.AppStatusStore store)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> makeTimeline (scala.collection.Seq<org.apache.spark.status.api.v1.TaskData> tasks, long currentTime, int page, int pageSize, int totalPages, int stageId, int stageAttemptId, int totalTasks)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
}
