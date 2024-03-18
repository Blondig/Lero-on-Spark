package org.apache.spark.internal.io;
/**
 * A helper object that provide common utils used during saving an RDD using a Hadoop OutputFormat
 * (both from the old mapred API and the new mapreduce API)
 */
public  class SparkHadoopWriterUtils {
  /**
   * Create a job ID.
   * <p>
   * @param time (current) time
   * @param id job number
   * @return a job ID
   */
  static public  org.apache.hadoop.mapred.JobID createJobID (java.util.Date time, int id)  { throw new RuntimeException(); }
  /**
   * Generate an ID for a job tracker.
   * @param time (current) time
   * @return a string for a job ID
   */
  static public  java.lang.String createJobTrackerID (java.util.Date time)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.Path createPathFromString (java.lang.String path, org.apache.hadoop.mapred.JobConf conf)  { throw new RuntimeException(); }
  static public  boolean isOutputSpecValidationEnabled (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static public  scala.Tuple2<org.apache.spark.executor.OutputMetrics, scala.Function0<java.lang.Object>> initHadoopOutputMetrics (org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  static public  void maybeUpdateOutputMetrics (org.apache.spark.executor.OutputMetrics outputMetrics, scala.Function0<java.lang.Object> callback, long recordsWritten)  { throw new RuntimeException(); }
  /**
   * Allows for the <code>spark.hadoop.validateOutputSpecs</code> checks to be disabled on a case-by-case
   * basis; see SPARK-4835 for more details.
   * @return (undocumented)
   */
  static public  scala.util.DynamicVariable<java.lang.Object> disableOutputSpecValidation ()  { throw new RuntimeException(); }
}
