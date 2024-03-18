package org.apache.spark.sql.execution.datasources;
/**
 * Simple {@link WriteJobStatsTracker} implementation that's serializable, capable of
 * instantiating {@link BasicWriteTaskStatsTracker} on executors and processing the
 * {@link BasicWriteTaskStats} they produce by aggregating the metrics and posting them
 * as DriverMetricUpdates.
 */
public  class BasicWriteJobStatsTracker implements org.apache.spark.sql.execution.datasources.WriteJobStatsTracker {
  static public  java.lang.String TASK_COMMIT_TIME ()  { throw new RuntimeException(); }
  static public  java.lang.String JOB_COMMIT_TIME ()  { throw new RuntimeException(); }
  /** XAttr key of the data length header added in HADOOP-17414. */
  static public  java.lang.String FILE_LENGTH_XATTR ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> driverSideMetrics ()  { throw new RuntimeException(); }
  // not preceding
  public   BasicWriteJobStatsTracker (org.apache.spark.util.SerializableConfiguration serializableHadoopConf, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> driverSideMetrics, org.apache.spark.sql.execution.metric.SQLMetric taskCommitTimeMetric)  { throw new RuntimeException(); }
  public   BasicWriteJobStatsTracker (org.apache.spark.util.SerializableConfiguration serializableHadoopConf, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.WriteTaskStatsTracker newTaskInstance ()  { throw new RuntimeException(); }
  public  void processStats (scala.collection.Seq<org.apache.spark.sql.execution.datasources.WriteTaskStats> stats, long jobCommitTime)  { throw new RuntimeException(); }
}
