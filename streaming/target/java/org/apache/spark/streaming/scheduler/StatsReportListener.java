package org.apache.spark.streaming.scheduler;
/**
 * :: DeveloperApi ::
 * A simple StreamingListener that logs summary statistics across Spark Streaming batches
 * param:  numBatchInfos Number of last batches to consider for generating statistics (default: 10)
 */
public  class StatsReportListener implements org.apache.spark.streaming.scheduler.StreamingListener {
  public   StatsReportListener (int numBatchInfos)  { throw new RuntimeException(); }
  public  scala.collection.mutable.Queue<org.apache.spark.streaming.scheduler.BatchInfo> batchInfos ()  { throw new RuntimeException(); }
  public  void onBatchCompleted (org.apache.spark.streaming.scheduler.StreamingListenerBatchCompleted batchStarted)  { throw new RuntimeException(); }
  public  void printStats ()  { throw new RuntimeException(); }
  public  void showMillisDistribution (java.lang.String heading, scala.Function1<org.apache.spark.streaming.scheduler.BatchInfo, scala.Option<java.lang.Object>> getMetric)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.util.Distribution> extractDistribution (scala.Function1<org.apache.spark.streaming.scheduler.BatchInfo, scala.Option<java.lang.Object>> getMetric)  { throw new RuntimeException(); }
}
