package org.apache.spark.deploy.history;
  class HistoryAppStatusStore extends org.apache.spark.status.AppStatusStore implements org.apache.spark.internal.Logging {
  public   HistoryAppStatusStore (org.apache.spark.SparkConf conf, org.apache.spark.util.kvstore.KVStore store)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.ExecutorSummary> executorList (boolean activeOnly)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.ExecutorSummary executorSummary (java.lang.String executorId)  { throw new RuntimeException(); }
}
