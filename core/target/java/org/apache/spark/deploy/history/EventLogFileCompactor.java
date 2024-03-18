package org.apache.spark.deploy.history;
/**
 * This class compacts the old event log files into one compact file, via two phases reading:
 * <p>
 * 1) Initialize available {@link EventFilterBuilder} instances, and replay the old event log files with
 * builders, so that these builders can gather the information to create {@link EventFilter} instances.
 * 2) Initialize {@link EventFilter} instances from {@link EventFilterBuilder} instances, and replay the
 * old event log files with filters. Rewrite the events to the compact file which the filters decide
 * to accept.
 * <p>
 * This class will calculate the score based on statistic from {@link EventFilter} instances, which
 * represents approximate rate of filtered-out events. Score is being calculated via applying
 * heuristic; task events tend to take most size in event log.
 */
public  class EventLogFileCompactor implements org.apache.spark.internal.Logging {
  public   EventLogFileCompactor (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.hadoop.fs.FileSystem fs, int maxFilesToRetain, double compactionThresholdScore)  { throw new RuntimeException(); }
  /**
   * Compacts the old event log files into one compact file, and clean old event log files being
   * compacted away.
   * <p>
   * This method assumes caller will provide the sorted list of files which are sorted by
   * the index of event log file, with at most one compact file placed first if it exists.
   * <p>
   * When compacting the files, the range of compaction for given file list is determined as:
   * (first ~ the file where there're <code>maxFilesToRetain</code> files on the right side)
   * <p>
   * This method skips compaction for some circumstances described below:
   * - not enough files on the range of compaction
   * - score is lower than the threshold of compaction (meaning compaction won't help much)
   * <p>
   * If this method returns the compaction result as SUCCESS, caller needs to re-read the list
   * of event log files, as new compact file is available as well as old event log files are
   * removed.
   * @param eventLogFiles (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.deploy.history.CompactionResult compact (scala.collection.Seq<org.apache.hadoop.fs.FileStatus> eventLogFiles)  { throw new RuntimeException(); }
  /**
   * This method rewrites the event log files into one compact file: the compact file will only
   * contain the events which pass the filters. Events will be dropped only when all filters
   * decide to reject the event or don't mind about the event. Otherwise, the original line for
   * the event is written to the compact file as it is.
   * @param filters (undocumented)
   * @param eventLogFiles (undocumented)
   * @return (undocumented)
   */
    java.lang.String rewrite (scala.collection.Seq<org.apache.spark.deploy.history.EventFilter> filters, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> eventLogFiles)  { throw new RuntimeException(); }
}
