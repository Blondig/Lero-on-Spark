package org.apache.spark.rdd;
public  class HadoopRDD$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HadoopRDD$ MODULE$ = null;
  public   HadoopRDD$ ()  { throw new RuntimeException(); }
  /**
   * Configuration's constructor is not threadsafe (see SPARK-1097 and HADOOP-10456).
   * Therefore, we synchronize on this lock before calling new JobConf() or new Configuration().
   * @return (undocumented)
   */
  public  java.lang.Object CONFIGURATION_INSTANTIATION_LOCK ()  { throw new RuntimeException(); }
  /** Update the input bytes read metric each time this number of records has been read */
  public  int RECORDS_BETWEEN_BYTES_READ_METRIC_UPDATES ()  { throw new RuntimeException(); }
  /**
   * The three methods below are helpers for accessing the local map, a property of the SparkEnv of
   * the local process.
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  java.lang.Object getCachedMetadata (java.lang.String key)  { throw new RuntimeException(); }
  /** Add Hadoop configuration specific to a single partition and attempt. */
  public  void addLocalConfiguration (java.lang.String jobTrackerId, int jobId, int splitId, int attemptId, org.apache.hadoop.mapred.JobConf conf)  { throw new RuntimeException(); }
    scala.Option<scala.collection.Seq<java.lang.String>> convertSplitLocationInfo (org.apache.hadoop.mapred.SplitLocationInfo[] infos)  { throw new RuntimeException(); }
}
