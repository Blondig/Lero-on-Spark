package org.apache.spark.deploy.yarn;
  class Client implements org.apache.spark.internal.Logging {
  static public  java.lang.String APP_JAR_NAME ()  { throw new RuntimeException(); }
  static public  java.lang.String SPARK_STAGING ()  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.permission.FsPermission STAGING_DIR_PERMISSION ()  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.permission.FsPermission APP_FILE_PERMISSION ()  { throw new RuntimeException(); }
  static public  java.lang.String ENV_DIST_CLASSPATH ()  { throw new RuntimeException(); }
  static public  java.lang.String LOCALIZED_CONF_DIR ()  { throw new RuntimeException(); }
  static public  java.lang.String LOCALIZED_HADOOP_CONF_DIR ()  { throw new RuntimeException(); }
  static public  java.lang.String LOCALIZED_CONF_ARCHIVE ()  { throw new RuntimeException(); }
  static public  java.lang.String SPARK_CONF_FILE ()  { throw new RuntimeException(); }
  static public  java.lang.String DIST_CACHE_CONF_FILE ()  { throw new RuntimeException(); }
  static public  java.lang.String LOCALIZED_PYTHON_DIR ()  { throw new RuntimeException(); }
  static public  java.lang.String LOCALIZED_LIB_DIR ()  { throw new RuntimeException(); }
  static public  java.lang.String SPARK_TESTING ()  { throw new RuntimeException(); }
  /**
   * Populate the classpath entry in the given environment map with any application
   * classpath specified through the Hadoop and Yarn configurations.
   * @param conf (undocumented)
   * @param env (undocumented)
   */
  static   void populateHadoopClasspath (org.apache.hadoop.conf.Configuration conf, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
  static   scala.collection.Seq<java.lang.String> getDefaultYarnApplicationClasspath ()  { throw new RuntimeException(); }
  static   scala.collection.Seq<java.lang.String> getDefaultMRApplicationClasspath ()  { throw new RuntimeException(); }
  /**
   * Populate the classpath entry in the given environment map.
   * <p>
   * User jars are generally not added to the JVM's system classpath; those are handled by the AM
   * and executor backend. When the deprecated <code>spark.yarn.user.classpath.first</code> is used, user jars
   * are included in the system classpath, though. The extra class path and other uploaded files are
   * always made available through the system class path.
   * <p>
   * @param args Client arguments (when starting the AM) or null (when starting executors).
   * @param conf (undocumented)
   * @param sparkConf (undocumented)
   * @param env (undocumented)
   * @param extraClassPath (undocumented)
   */
  static   void populateClasspath (org.apache.spark.deploy.yarn.ClientArguments args, org.apache.hadoop.conf.Configuration conf, org.apache.spark.SparkConf sparkConf, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env, scala.Option<java.lang.String> extraClassPath)  { throw new RuntimeException(); }
  /**
   * Returns a list of URIs representing the user classpath.
   * <p>
   * @param conf Spark configuration.
   * @return (undocumented)
   */
  static public  java.net.URI[] getUserClasspath (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Returns a list of local, absolute file URLs representing the user classpath. Note that this
   * must be executed on the same host which will access the URLs, as it will resolve relative
   * paths based on the current working directory, as well as environment variables.
   * See SPARK-35672 for discussion of why it is necessary to do environment variable substitution.
   * <p>
   * @param conf Spark configuration.
   * @param useClusterPath Whether to use the 'cluster' path when resolving paths with the
   *                       <code>local</code> scheme. This should be used when running on the cluster, but
   *                       not when running on the gateway (i.e. for the driver in <code>client</code> mode).
   * @return Array of local URLs ready to be passed to a {@link java.net.URLClassLoader}.
   */
  static public  java.net.URL[] getUserClasspathUrls (org.apache.spark.SparkConf conf, boolean useClusterPath)  { throw new RuntimeException(); }
  /**
   * Returns the path to be sent to the NM for a path that is valid on the gateway.
   * <p>
   * This method uses two configuration values:
   * <p>
   *  - spark.yarn.config.gatewayPath: a string that identifies a portion of the input path that may
   *    only be valid in the gateway node.
   *  - spark.yarn.config.replacementPath: a string with which to replace the gateway path. This may
   *    contain, for example, env variable references, which will be expanded by the NMs when
   *    starting containers.
   * <p>
   * If either config is not available, the input path is returned.
   * @param conf (undocumented)
   * @param path (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String getClusterPath (org.apache.spark.SparkConf conf, java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Return whether two URI represent file system are the same
   * @param srcUri (undocumented)
   * @param dstUri (undocumented)
   * @return (undocumented)
   */
  static   boolean compareUri (java.net.URI srcUri, java.net.URI dstUri)  { throw new RuntimeException(); }
  /**
   * Return whether the two file systems are the same.
   * @param srcFs (undocumented)
   * @param destFs (undocumented)
   * @return (undocumented)
   */
  static protected  boolean compareFs (org.apache.hadoop.fs.FileSystem srcFs, org.apache.hadoop.fs.FileSystem destFs)  { throw new RuntimeException(); }
  /**
   * Whether to consider jars provided by the user to have precedence over the Spark jars when
   * loading user classes.
   * @param conf (undocumented)
   * @param isDriver (undocumented)
   * @return (undocumented)
   */
  static public  boolean isUserClassPathFirst (org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  /**
   * Joins all the path components using Path.SEPARATOR.
   * @param components (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String buildPath (scala.collection.Seq<java.lang.String> components)  { throw new RuntimeException(); }
  static public  org.apache.spark.deploy.yarn.YarnAppReport createAppReport (org.apache.hadoop.yarn.api.records.ApplicationReport report)  { throw new RuntimeException(); }
  /**
   * Create a properly quoted and escaped library path string to be added as a prefix to the command
   * executed by YARN. This is different from normal quoting / escaping due to YARN executing the
   * command through "bash -c".
   * @param libpath (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String createLibraryPathPrefix (java.lang.String libpath, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static public  java.util.Properties confToProperties (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static public  void writePropertiesToArchive (java.util.Properties props, java.lang.String name, java.util.zip.ZipOutputStream out)  { throw new RuntimeException(); }
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
  public  org.apache.spark.deploy.yarn.ClientArguments args ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  // not preceding
  public   Client (org.apache.spark.deploy.yarn.ClientArguments args, org.apache.spark.SparkConf sparkConf, org.apache.spark.rpc.RpcEnv rpcEnv)  { throw new RuntimeException(); }
  protected  int executorOffHeapMemory ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.api.records.ApplicationId getApplicationId ()  { throw new RuntimeException(); }
  public  void reportLauncherState (org.apache.spark.launcher.SparkAppHandle.State state)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Submit an application running our ApplicationMaster to the ResourceManager.
   * <p>
   * The stable Yarn API provides a convenience method (YarnClient#createApplication) for
   * creating applications and setting up the application submission context. This was not
   * available in the alpha API.
   */
  public  void submitApplication ()  { throw new RuntimeException(); }
  /**
   * Set up the context for submitting our ApplicationMaster.
   * This uses the YarnClientApplication not available in the Yarn alpha API.
   * @param newApp (undocumented)
   * @param containerContext (undocumented)
   * @return (undocumented)
   */
  public  org.apache.hadoop.yarn.api.records.ApplicationSubmissionContext createApplicationSubmissionContext (org.apache.hadoop.yarn.client.api.YarnClientApplication newApp, org.apache.hadoop.yarn.api.records.ContainerLaunchContext containerContext)  { throw new RuntimeException(); }
  /** Get the application report from the ResourceManager for an application we have submitted. */
  public  org.apache.hadoop.yarn.api.records.ApplicationReport getApplicationReport ()  { throw new RuntimeException(); }
  /**
   * Copy the given file to a remote file system (e.g. HDFS) if needed.
   * The file is only copied if the source and destination file systems are different or the source
   * scheme is "file". This is used for preparing resources for launching the ApplicationMaster
   * container. Exposed for testing.
   * @param destDir (undocumented)
   * @param srcPath (undocumented)
   * @param replication (undocumented)
   * @param symlinkCache (undocumented)
   * @param force (undocumented)
   * @param destName (undocumented)
   * @return (undocumented)
   */
    org.apache.hadoop.fs.Path copyFileToRemote (org.apache.hadoop.fs.Path destDir, org.apache.hadoop.fs.Path srcPath, scala.Option<java.lang.Object> replication, scala.collection.mutable.Map<java.net.URI, org.apache.hadoop.fs.Path> symlinkCache, boolean force, scala.Option<java.lang.String> destName)  { throw new RuntimeException(); }
  /**
   * Upload any resources to the distributed cache if needed. If a resource is intended to be
   * consumed locally, set up the appropriate config for downstream code to handle it properly.
   * This is used for setting up a container launch context for our ApplicationMaster.
   * Exposed for testing.
   * @param destDir (undocumented)
   * @param pySparkArchives (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.hadoop.yarn.api.records.LocalResource> prepareLocalResources (org.apache.hadoop.fs.Path destDir, scala.collection.Seq<java.lang.String> pySparkArchives)  { throw new RuntimeException(); }
  /**
   * Report the state of an application until it has exited, either successfully or
   * due to some failure, then return a pair of the yarn application state (FINISHED, FAILED,
   * KILLED, or RUNNING) and the final application state (UNDEFINED, SUCCEEDED, FAILED,
   * or KILLED).
   * <p>
   * @param appId ID of the application to monitor.
   * @param returnOnRunning Whether to also return the application state when it is RUNNING.
   * @param logApplicationReport Whether to log details of the application report every iteration.
   * @param interval How often to poll the YARN RM for application status (in ms).
   * @return A pair of the yarn application state and the final application state.
   */
  public  org.apache.spark.deploy.yarn.YarnAppReport monitorApplication (boolean returnOnRunning, boolean logApplicationReport, long interval)  { throw new RuntimeException(); }
  /**
   * Submit an application to the ResourceManager.
   * If set spark.yarn.submit.waitAppCompletion to true, it will stay alive
   * reporting the application's status until the application has exited for any reason.
   * Otherwise, the client process will exit after submission.
   * If the application finishes with a failed, killed, or undefined status,
   * throw an appropriate SparkException.
   */
  public  void run ()  { throw new RuntimeException(); }
}
