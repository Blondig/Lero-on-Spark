package org.apache.spark.deploy;
/**
 * Contains util methods to interact with Hadoop from Spark.
 */
  class SparkHadoopUtil implements org.apache.spark.internal.Logging {
  static public  java.lang.String SPARK_YARN_CREDS_TEMP_EXTENSION ()  { throw new RuntimeException(); }
  static public  java.lang.String SPARK_YARN_CREDS_COUNTER_DELIM ()  { throw new RuntimeException(); }
  /**
   * Number of records to update input metrics when reading from HadoopRDDs.
   * <p>
   * Each update is potentially expensive because we need to use reflection to access the
   * Hadoop FileSystem API of interest (only available in 2.5), so we should do this sparingly.
   * @return (undocumented)
   */
  static   int UPDATE_INPUT_METRICS_INTERVAL_RECORDS ()  { throw new RuntimeException(); }
  /**
   * Name of the file containing the gateway's Hadoop configuration, to be overlayed on top of the
   * cluster's Hadoop config. It is up to the Spark code launching the application to create
   * this file if it's desired. If the file doesn't exist, it will just be ignored.
   * @return (undocumented)
   */
  static   java.lang.String SPARK_HADOOP_CONF_FILE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.deploy.SparkHadoopUtil get ()  { throw new RuntimeException(); }
  /**
   * Create a file on the given file system, optionally making sure erasure coding is disabled.
   * <p>
   * Disabling EC can be helpful as HDFS EC doesn't support hflush(), hsync(), or append().
   * https://hadoop.apache.org/docs/r3.0.0/hadoop-project-dist/hadoop-hdfs/HDFSErasureCoding.html#Limitations
   * @param fs (undocumented)
   * @param path (undocumented)
   * @param allowEC (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.hadoop.fs.FSDataOutputStream createFile (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path path, boolean allowEC)  { throw new RuntimeException(); }
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
  public   SparkHadoopUtil ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration conf ()  { throw new RuntimeException(); }
  /**
   * Runs the given function with a Hadoop UserGroupInformation as a thread local variable
   * (distributed to child threads), used for authenticating HDFS and YARN calls.
   * <p>
   * IMPORTANT NOTE: If this function is going to be called repeated in the same process
   * you need to look https://issues.apache.org/jira/browse/HDFS-3545 and possibly
   * do a FileSystem.closeAllForUGI in order to avoid leaking Filesystems
   * @param func (undocumented)
   */
  public  void runAsSparkUser (scala.Function0<scala.runtime.BoxedUnit> func)  { throw new RuntimeException(); }
  public  org.apache.hadoop.security.UserGroupInformation createSparkUser ()  { throw new RuntimeException(); }
  public  void transferCredentials (org.apache.hadoop.security.UserGroupInformation source, org.apache.hadoop.security.UserGroupInformation dest)  { throw new RuntimeException(); }
  /**
   * Appends S3-specific, spark.hadoop.*, and spark.buffer.size configurations to a Hadoop
   * configuration.
   * @param conf (undocumented)
   * @param hadoopConf (undocumented)
   */
  public  void appendS3AndSparkHadoopHiveConfigurations (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /**
   * Appends spark.hadoop.* configurations from a {@link SparkConf} to a Hadoop
   * configuration without the spark.hadoop. prefix.
   * @param conf (undocumented)
   * @param hadoopConf (undocumented)
   */
  public  void appendSparkHadoopConfigs (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /**
   * Appends spark.hadoop.* configurations from a Map to another without the spark.hadoop. prefix.
   * @param srcMap (undocumented)
   * @param destMap (undocumented)
   */
  public  void appendSparkHadoopConfigs (scala.collection.immutable.Map<java.lang.String, java.lang.String> srcMap, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> destMap)  { throw new RuntimeException(); }
  public  void appendSparkHiveConfigs (scala.collection.immutable.Map<java.lang.String, java.lang.String> srcMap, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> destMap)  { throw new RuntimeException(); }
  /**
   * Return an appropriate (subclass) of Configuration. Creating config can initialize some Hadoop
   * subsystems.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  org.apache.hadoop.conf.Configuration newConfiguration (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Add any user credentials to the job conf which are necessary for running on a secure Hadoop
   * cluster.
   * @param conf (undocumented)
   */
  public  void addCredentials (org.apache.hadoop.mapred.JobConf conf)  { throw new RuntimeException(); }
  public  void addCurrentUserCredentials (org.apache.hadoop.security.Credentials creds)  { throw new RuntimeException(); }
  public  void loginUserFromKeytab (java.lang.String principalName, java.lang.String keytabFilename)  { throw new RuntimeException(); }
  /**
   * Add or overwrite current user's credentials with serialized delegation tokens,
   * also confirms correct hadoop configuration is set.
   * @param tokens (undocumented)
   * @param sparkConf (undocumented)
   */
    void addDelegationTokens (byte[] tokens, org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
  /**
   * Returns a function that can be called to find Hadoop FileSystem bytes read. If
   * getFSBytesReadOnThreadCallback is called from thread r at time t, the returned callback will
   * return the bytes read on r since t.
   * @return (undocumented)
   */
    scala.Function0<java.lang.Object> getFSBytesReadOnThreadCallback ()  { throw new RuntimeException(); }
  /**
   * Returns a function that can be called to find Hadoop FileSystem bytes written. If
   * getFSBytesWrittenOnThreadCallback is called from thread r at time t, the returned callback will
   * return the bytes written on r since t.
   * <p>
   * @return None if the required method can't be found.
   */
    scala.Function0<java.lang.Object> getFSBytesWrittenOnThreadCallback ()  { throw new RuntimeException(); }
  /**
   * Get {@link FileStatus} objects for all leaf children (files) under the given base path. If the
   * given path points to a file, return a single-element collection containing {@link FileStatus} of
   * that file.
   * @param fs (undocumented)
   * @param basePath (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> listLeafStatuses (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path basePath)  { throw new RuntimeException(); }
  /**
   * Get {@link FileStatus} objects for all leaf children (files) under the given base path. If the
   * given path points to a file, return a single-element collection containing {@link FileStatus} of
   * that file.
   * @param fs (undocumented)
   * @param baseStatus (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> listLeafStatuses (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.FileStatus baseStatus)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> listLeafDirStatuses (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path basePath)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> listLeafDirStatuses (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.FileStatus baseStatus)  { throw new RuntimeException(); }
  public  boolean isGlobPath (org.apache.hadoop.fs.Path pattern)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.Path> globPath (org.apache.hadoop.fs.Path pattern)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.Path> globPath (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path pattern)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.Path> globPathIfNecessary (org.apache.hadoop.fs.Path pattern)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.Path> globPathIfNecessary (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path pattern)  { throw new RuntimeException(); }
  /**
   * Lists all the files in a directory with the specified prefix, and does not end with the
   * given suffix. The returned {{FileStatus}} instances are sorted by the modification times of
   * the respective files.
   * @param remoteFs (undocumented)
   * @param dir (undocumented)
   * @param prefix (undocumented)
   * @param exclusionSuffix (undocumented)
   * @return (undocumented)
   */
  public  org.apache.hadoop.fs.FileStatus[] listFilesSorted (org.apache.hadoop.fs.FileSystem remoteFs, org.apache.hadoop.fs.Path dir, java.lang.String prefix, java.lang.String exclusionSuffix)  { throw new RuntimeException(); }
    int getSuffixForCredentialsPath (org.apache.hadoop.fs.Path credentialsPath)  { throw new RuntimeException(); }
  /**
   * Substitute variables by looking them up in Hadoop configs. Only variables that match the
   * ${hadoopconf- .. } pattern are substituted.
   * @param text (undocumented)
   * @param hadoopConf (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String substituteHadoopVariables (java.lang.String text, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /**
   * Dump the credentials' tokens to string values.
   * <p>
   * @param credentials credentials
   * @return an iterator over the string values. If no credentials are passed in: an empty list
   */
    scala.collection.Iterable<java.lang.String> dumpTokens (org.apache.hadoop.security.Credentials credentials)  { throw new RuntimeException(); }
  /**
   * Convert a token to a string for logging.
   * If its an abstract delegation token, attempt to unmarshall it and then
   * print more details, including timestamps in human-readable form.
   * <p>
   * @param token token to convert to a string
   * @return a printable string value.
   */
    java.lang.String tokenToString (org.apache.hadoop.security.token.Token<? extends org.apache.hadoop.security.token.TokenIdentifier> token)  { throw new RuntimeException(); }
  public  byte[] serialize (org.apache.hadoop.security.Credentials creds)  { throw new RuntimeException(); }
  public  org.apache.hadoop.security.Credentials deserialize (byte[] tokenBytes)  { throw new RuntimeException(); }
  public  boolean isProxyUser (org.apache.hadoop.security.UserGroupInformation ugi)  { throw new RuntimeException(); }
}
