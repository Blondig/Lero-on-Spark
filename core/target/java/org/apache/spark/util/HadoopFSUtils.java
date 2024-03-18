package org.apache.spark.util;
/**
 * Utility functions to simplify and speed-up file listing.
 */
public  class HadoopFSUtils {
  /**
   * Lists a collection of paths recursively. Picks the listing strategy adaptively depending
   * on the number of paths to list.
   * <p>
   * This may only be called on the driver.
   * <p>
   * @param sc Spark context used to run parallel listing.
   * @param paths Input paths to list
   * @param hadoopConf Hadoop configuration
   * @param filter Path filter used to exclude leaf files from result
   * @param ignoreMissingFiles Ignore missing files that happen during recursive listing
   *                           (e.g., due to race conditions)
   * @param ignoreLocality Whether to fetch data locality info when listing leaf files. If false,
   *                       this will return <code>FileStatus</code> without <code>BlockLocation</code> info.
   * @param parallelismThreshold The threshold to enable parallelism. If the number of input paths
   *                             is smaller than this value, this will fallback to use
   *                             sequential listing.
   * @param parallelismMax The maximum parallelism for listing. If the number of input paths is
   *                       larger than this value, parallelism will be throttled to this value
   *                       to avoid generating too many tasks.
   * @return for each input path, the set of discovered files for the path
   */
  static public  scala.collection.Seq<scala.Tuple2<org.apache.hadoop.fs.Path, scala.collection.Seq<org.apache.hadoop.fs.FileStatus>>> parallelListLeafFiles (org.apache.spark.SparkContext sc, scala.collection.Seq<org.apache.hadoop.fs.Path> paths, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.hadoop.fs.PathFilter filter, boolean ignoreMissingFiles, boolean ignoreLocality, int parallelismThreshold, int parallelismMax)  { throw new RuntimeException(); }
  /** Checks if we should filter out this path name. */
  static public  boolean shouldFilterOutPathName (java.lang.String pathName)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
}
