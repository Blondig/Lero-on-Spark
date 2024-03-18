package org.apache.spark.status.api.v1;
  class AbstractApplicationResource implements org.apache.spark.status.api.v1.BaseAppResource {
  public   AbstractApplicationResource ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.ExecutorSummary> allExecutorList ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.ProcessSummary> allProcessList ()  { throw new RuntimeException(); }
  protected  java.lang.String appId ()  { throw new RuntimeException(); }
  /**
   * This method needs to be last, otherwise it clashes with the paths for the above methods
   * and causes JAX-RS to not find things.
   * @return (undocumented)
   */
  public  java.lang.Class<org.apache.spark.status.api.v1.OneApplicationAttemptResource> applicationAttempt ()  { throw new RuntimeException(); }
  protected  java.lang.String attemptId ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.ApplicationEnvironmentInfo environmentInfo ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.ExecutorSummary> executorList ()  { throw new RuntimeException(); }
  public  javax.ws.rs.core.Response getEventLogs ()  { throw new RuntimeException(); }
  protected  javax.servlet.http.HttpServletRequest httpRequest ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.JobData> jobsList (java.util.List<org.apache.spark.JobExecutionStatus> statuses)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.JobData oneJob (int jobId)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.RDDStorageInfo rddData (int rddId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.RDDStorageInfo> rddList ()  { throw new RuntimeException(); }
  protected  javax.servlet.ServletContext servletContext ()  { throw new RuntimeException(); }
  public  java.lang.Class<org.apache.spark.status.api.v1.StagesResource> stages ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.ThreadStackTrace[] threadDump (java.lang.String execId)  { throw new RuntimeException(); }
}
