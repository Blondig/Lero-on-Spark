package org.apache.spark.status.api.v1.streaming;
  class ApiStreamingRootResource implements org.apache.spark.status.api.v1.streaming.BaseStreamingAppResource {
  public   ApiStreamingRootResource ()  { throw new RuntimeException(); }
  protected  java.lang.String appId ()  { throw new RuntimeException(); }
  protected  java.lang.String attemptId ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.streaming.BatchInfo> batchesList (java.util.List<org.apache.spark.status.api.v1.streaming.BatchStatus> statusParams)  { throw new RuntimeException(); }
  protected  javax.servlet.http.HttpServletRequest httpRequest ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.streaming.BatchInfo oneBatch (long batchId)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.streaming.OutputOperationInfo oneOperation (long batchId, int opId)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.streaming.ReceiverInfo oneReceiver (int streamId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.streaming.OutputOperationInfo> operationsList (long batchId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.streaming.ReceiverInfo> receiversList ()  { throw new RuntimeException(); }
  protected  javax.servlet.ServletContext servletContext ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.streaming.StreamingStatistics streamingStatistics ()  { throw new RuntimeException(); }
}
