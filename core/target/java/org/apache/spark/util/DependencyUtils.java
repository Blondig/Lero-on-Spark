package org.apache.spark.util;
public  class DependencyUtils {
  static public  org.apache.spark.util.IvyProperties getIvyProperties ()  { throw new RuntimeException(); }
  /**
   * Download Ivy URI's dependency jars.
   * <p>
   * @param uri Ivy URI need to be downloaded. The URI format should be:
   *              <code>ivy://group:module:version[?query]</code>
   *            Ivy URI query part format should be:
   *              <code>parameter=value&amp;parameter=value...</code>
   *            Note that currently Ivy URI query part support two parameters:
   *             1. transitive: whether to download dependent jars related to your Ivy URI.
   *                transitive=false or <code>transitive=true</code>, if not set, the default value is true.
   *             2. exclude: exclusion list when download Ivy URI jar and dependency jars.
   *                The <code>exclude</code> parameter content is a ',' separated <code>group:module</code> pair string :
   *                <code>exclude=group:module,group:module...</code>
   * @return List of jars downloaded.
   */
  static public  scala.collection.Seq<java.lang.String> resolveMavenDependencies (java.net.URI uri)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.lang.String> resolveMavenDependencies (boolean packagesTransitive, java.lang.String packagesExclusions, java.lang.String packages, java.lang.String repositories, java.lang.String ivyRepoPath, scala.Option<java.lang.String> ivySettingsPath)  { throw new RuntimeException(); }
  static public  java.lang.String resolveAndDownloadJars (java.lang.String jars, java.lang.String userJar, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  static public  void addJarsToClassPath (java.lang.String jars, org.apache.spark.util.MutableURLClassLoader loader)  { throw new RuntimeException(); }
  /**
   * Download a list of remote files to temp local files. If the file is local, the original file
   * will be returned.
   * <p>
   * @param fileList A comma separated file list.
   * @param targetDir A temporary directory for which downloaded files.
   * @param sparkConf Spark configuration.
   * @param hadoopConf Hadoop configuration.
   * @return A comma separated local files list.
   */
  static public  java.lang.String downloadFileList (java.lang.String fileList, java.io.File targetDir, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /**
   * Download a file from the remote to a local temporary directory. If the input path points to
   * a local path, returns it with no operation.
   * <p>
   * @param path A file path from where the files will be downloaded.
   * @param targetDir A temporary directory for which downloaded files.
   * @param sparkConf Spark configuration.
   * @param hadoopConf Hadoop configuration.
   * @return Path to the local file.
   */
  static public  java.lang.String downloadFile (java.lang.String path, java.io.File targetDir, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  static public  java.lang.String resolveGlobPaths (java.lang.String paths, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  static public  void addJarToClasspath (java.lang.String localJar, org.apache.spark.util.MutableURLClassLoader loader)  { throw new RuntimeException(); }
  /**
   * Merge a sequence of comma-separated file lists, some of which may be null to indicate
   * no files, into a single comma-separated string.
   * @param lists (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String mergeFileLists (scala.collection.Seq<java.lang.String> lists)  { throw new RuntimeException(); }
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
