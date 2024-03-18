package org.apache.spark;
public  class SparkEnv$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkEnv$ MODULE$ = null;
  public   SparkEnv$ ()  { throw new RuntimeException(); }
    java.lang.String driverSystemName ()  { throw new RuntimeException(); }
    java.lang.String executorSystemName ()  { throw new RuntimeException(); }
  public  void set (org.apache.spark.SparkEnv e)  { throw new RuntimeException(); }
  /**
   * Returns the SparkEnv.
   * @return (undocumented)
   */
  public  org.apache.spark.SparkEnv get ()  { throw new RuntimeException(); }
  /**
   * Create a SparkEnv for the driver.
   * @param conf (undocumented)
   * @param isLocal (undocumented)
   * @param listenerBus (undocumented)
   * @param numCores (undocumented)
   * @param mockOutputCommitCoordinator (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.SparkEnv createDriverEnv (org.apache.spark.SparkConf conf, boolean isLocal, org.apache.spark.scheduler.LiveListenerBus listenerBus, int numCores, scala.Option<org.apache.spark.scheduler.OutputCommitCoordinator> mockOutputCommitCoordinator)  { throw new RuntimeException(); }
  /**
   * Create a SparkEnv for an executor.
   * In coarse-grained mode, the executor provides an RpcEnv that is already instantiated.
   * @param conf (undocumented)
   * @param executorId (undocumented)
   * @param bindAddress (undocumented)
   * @param hostname (undocumented)
   * @param numCores (undocumented)
   * @param ioEncryptionKey (undocumented)
   * @param isLocal (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.SparkEnv createExecutorEnv (org.apache.spark.SparkConf conf, java.lang.String executorId, java.lang.String bindAddress, java.lang.String hostname, int numCores, scala.Option<byte[]> ioEncryptionKey, boolean isLocal)  { throw new RuntimeException(); }
    org.apache.spark.SparkEnv createExecutorEnv (org.apache.spark.SparkConf conf, java.lang.String executorId, java.lang.String hostname, int numCores, scala.Option<byte[]> ioEncryptionKey, boolean isLocal)  { throw new RuntimeException(); }
  /**
   * Return a map representation of jvm information, Spark properties, system properties, and
   * class paths. Map keys define the category, and map values represent the corresponding
   * attributes as a sequence of KV pairs. This is used mainly for SparkListenerEnvironmentUpdate.
   * @param conf (undocumented)
   * @param hadoopConf (undocumented)
   * @param schedulingMode (undocumented)
   * @param addedJars (undocumented)
   * @param addedFiles (undocumented)
   * @param addedArchives (undocumented)
   * @return (undocumented)
   */
    scala.collection.immutable.Map<java.lang.String, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>>> environmentDetails (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf, java.lang.String schedulingMode, scala.collection.Seq<java.lang.String> addedJars, scala.collection.Seq<java.lang.String> addedFiles, scala.collection.Seq<java.lang.String> addedArchives)  { throw new RuntimeException(); }
}
