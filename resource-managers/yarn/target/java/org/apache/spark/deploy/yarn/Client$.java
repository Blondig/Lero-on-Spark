package org.apache.spark.deploy.yarn;
public  class Client$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Client$ MODULE$ = null;
  public   Client$ ()  { throw new RuntimeException(); }
  public  java.lang.String APP_JAR_NAME ()  { throw new RuntimeException(); }
  public  java.lang.String SPARK_STAGING ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.permission.FsPermission STAGING_DIR_PERMISSION ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.permission.FsPermission APP_FILE_PERMISSION ()  { throw new RuntimeException(); }
  public  java.lang.String ENV_DIST_CLASSPATH ()  { throw new RuntimeException(); }
  public  java.lang.String LOCALIZED_CONF_DIR ()  { throw new RuntimeException(); }
  public  java.lang.String LOCALIZED_HADOOP_CONF_DIR ()  { throw new RuntimeException(); }
  public  java.lang.String LOCALIZED_CONF_ARCHIVE ()  { throw new RuntimeException(); }
  public  java.lang.String SPARK_CONF_FILE ()  { throw new RuntimeException(); }
  public  java.lang.String DIST_CACHE_CONF_FILE ()  { throw new RuntimeException(); }
  public  java.lang.String LOCALIZED_PYTHON_DIR ()  { throw new RuntimeException(); }
  public  java.lang.String LOCALIZED_LIB_DIR ()  { throw new RuntimeException(); }
  public  java.lang.String SPARK_TESTING ()  { throw new RuntimeException(); }
  /**
   * Populate the classpath entry in the given environment map with any application
   * classpath specified through the Hadoop and Yarn configurations.
   * @param conf (undocumented)
   * @param env (undocumented)
   */
    void populateHadoopClasspath (org.apache.hadoop.conf.Configuration conf, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
    scala.collection.Seq<java.lang.String> getDefaultYarnApplicationClasspath ()  { throw new RuntimeException(); }
    scala.collection.Seq<java.lang.String> getDefaultMRApplicationClasspath ()  { throw new RuntimeException(); }
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
    void populateClasspath (org.apache.spark.deploy.yarn.ClientArguments args, org.apache.hadoop.conf.Configuration conf, org.apache.spark.SparkConf sparkConf, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env, scala.Option<java.lang.String> extraClassPath)  { throw new RuntimeException(); }
  /**
   * Returns a list of URIs representing the user classpath.
   * <p>
   * @param conf Spark configuration.
   * @return (undocumented)
   */
  public  java.net.URI[] getUserClasspath (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
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
  public  java.net.URL[] getUserClasspathUrls (org.apache.spark.SparkConf conf, boolean useClusterPath)  { throw new RuntimeException(); }
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
  public  java.lang.String getClusterPath (org.apache.spark.SparkConf conf, java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Return whether two URI represent file system are the same
   * @param srcUri (undocumented)
   * @param dstUri (undocumented)
   * @return (undocumented)
   */
    boolean compareUri (java.net.URI srcUri, java.net.URI dstUri)  { throw new RuntimeException(); }
  /**
   * Return whether the two file systems are the same.
   * @param srcFs (undocumented)
   * @param destFs (undocumented)
   * @return (undocumented)
   */
  protected  boolean compareFs (org.apache.hadoop.fs.FileSystem srcFs, org.apache.hadoop.fs.FileSystem destFs)  { throw new RuntimeException(); }
  /**
   * Whether to consider jars provided by the user to have precedence over the Spark jars when
   * loading user classes.
   * @param conf (undocumented)
   * @param isDriver (undocumented)
   * @return (undocumented)
   */
  public  boolean isUserClassPathFirst (org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  /**
   * Joins all the path components using Path.SEPARATOR.
   * @param components (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String buildPath (scala.collection.Seq<java.lang.String> components)  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.yarn.YarnAppReport createAppReport (org.apache.hadoop.yarn.api.records.ApplicationReport report)  { throw new RuntimeException(); }
  /**
   * Create a properly quoted and escaped library path string to be added as a prefix to the command
   * executed by YARN. This is different from normal quoting / escaping due to YARN executing the
   * command through "bash -c".
   * @param libpath (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String createLibraryPathPrefix (java.lang.String libpath, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  java.util.Properties confToProperties (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  void writePropertiesToArchive (java.util.Properties props, java.lang.String name, java.util.zip.ZipOutputStream out)  { throw new RuntimeException(); }
}
