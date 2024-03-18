package org.apache.spark.deploy;
public  class SparkHadoopUtil$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkHadoopUtil$ MODULE$ = null;
  public   SparkHadoopUtil$ ()  { throw new RuntimeException(); }
  public  java.lang.String SPARK_YARN_CREDS_TEMP_EXTENSION ()  { throw new RuntimeException(); }
  public  java.lang.String SPARK_YARN_CREDS_COUNTER_DELIM ()  { throw new RuntimeException(); }
  /**
   * Number of records to update input metrics when reading from HadoopRDDs.
   * <p>
   * Each update is potentially expensive because we need to use reflection to access the
   * Hadoop FileSystem API of interest (only available in 2.5), so we should do this sparingly.
   * @return (undocumented)
   */
    int UPDATE_INPUT_METRICS_INTERVAL_RECORDS ()  { throw new RuntimeException(); }
  /**
   * Name of the file containing the gateway's Hadoop configuration, to be overlayed on top of the
   * cluster's Hadoop config. It is up to the Spark code launching the application to create
   * this file if it's desired. If the file doesn't exist, it will just be ignored.
   * @return (undocumented)
   */
    java.lang.String SPARK_HADOOP_CONF_FILE ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.SparkHadoopUtil get ()  { throw new RuntimeException(); }
  /**
   * Returns a Configuration object with Spark configuration applied on top. Unlike
   * the instance method, this will always return a Configuration instance, and not a
   * cluster manager-specific type.
   * The configuration will load all default values set in core-default.xml,
   * and if found on the classpath, those of core-site.xml.
   * This is done before the spark overrides are applied.
   * @param conf (undocumented)
   * @return (undocumented)
   */
    org.apache.hadoop.conf.Configuration newConfiguration (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
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
  public  org.apache.hadoop.fs.FSDataOutputStream createFile (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path path, boolean allowEC)  { throw new RuntimeException(); }
}
