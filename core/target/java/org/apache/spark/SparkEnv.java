package org.apache.spark;
/**
 * :: DeveloperApi ::
 * Holds all the runtime environment objects for a running Spark instance (either master or worker),
 * including the serializer, RpcEnv, block manager, map output tracker, etc. Currently
 * Spark code finds the SparkEnv through a global variable, so all the threads can access the same
 * SparkEnv. It can be accessed by SparkEnv.get (e.g. after creating a SparkContext).
 */
public  class SparkEnv implements org.apache.spark.internal.Logging {
  static   java.lang.String driverSystemName ()  { throw new RuntimeException(); }
  static   java.lang.String executorSystemName ()  { throw new RuntimeException(); }
  static public  void set (org.apache.spark.SparkEnv e)  { throw new RuntimeException(); }
  /**
   * Returns the SparkEnv.
   * @return (undocumented)
   */
  static public  org.apache.spark.SparkEnv get ()  { throw new RuntimeException(); }
  /**
   * Create a SparkEnv for the driver.
   * @param conf (undocumented)
   * @param isLocal (undocumented)
   * @param listenerBus (undocumented)
   * @param numCores (undocumented)
   * @param mockOutputCommitCoordinator (undocumented)
   * @return (undocumented)
   */
  static   org.apache.spark.SparkEnv createDriverEnv (org.apache.spark.SparkConf conf, boolean isLocal, org.apache.spark.scheduler.LiveListenerBus listenerBus, int numCores, scala.Option<org.apache.spark.scheduler.OutputCommitCoordinator> mockOutputCommitCoordinator)  { throw new RuntimeException(); }
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
  static   org.apache.spark.SparkEnv createExecutorEnv (org.apache.spark.SparkConf conf, java.lang.String executorId, java.lang.String bindAddress, java.lang.String hostname, int numCores, scala.Option<byte[]> ioEncryptionKey, boolean isLocal)  { throw new RuntimeException(); }
  static   org.apache.spark.SparkEnv createExecutorEnv (org.apache.spark.SparkConf conf, java.lang.String executorId, java.lang.String hostname, int numCores, scala.Option<byte[]> ioEncryptionKey, boolean isLocal)  { throw new RuntimeException(); }
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
  static   scala.collection.immutable.Map<java.lang.String, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>>> environmentDetails (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf, java.lang.String schedulingMode, scala.collection.Seq<java.lang.String> addedJars, scala.collection.Seq<java.lang.String> addedFiles, scala.collection.Seq<java.lang.String> addedArchives)  { throw new RuntimeException(); }
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
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
    org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.Serializer serializer ()  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.Serializer closureSerializer ()  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.SerializerManager serializerManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.MapOutputTracker mapOutputTracker ()  { throw new RuntimeException(); }
  public  org.apache.spark.shuffle.ShuffleManager shuffleManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.broadcast.BroadcastManager broadcastManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManager blockManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.metrics.MetricsSystem metricsSystem ()  { throw new RuntimeException(); }
  public  org.apache.spark.memory.MemoryManager memoryManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.OutputCommitCoordinator outputCommitCoordinator ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkEnv (java.lang.String executorId, org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.serializer.Serializer serializer, org.apache.spark.serializer.Serializer closureSerializer, org.apache.spark.serializer.SerializerManager serializerManager, org.apache.spark.MapOutputTracker mapOutputTracker, org.apache.spark.shuffle.ShuffleManager shuffleManager, org.apache.spark.broadcast.BroadcastManager broadcastManager, org.apache.spark.storage.BlockManager blockManager, org.apache.spark.SecurityManager securityManager, org.apache.spark.metrics.MetricsSystem metricsSystem, org.apache.spark.memory.MemoryManager memoryManager, org.apache.spark.scheduler.OutputCommitCoordinator outputCommitCoordinator, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    boolean isStopped ()  { throw new RuntimeException(); }
    java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> hadoopJobMetadata ()  { throw new RuntimeException(); }
    scala.Option<java.lang.String> driverTmpDir ()  { throw new RuntimeException(); }
    scala.Option<org.apache.spark.executor.ExecutorBackend> executorBackend ()  { throw new RuntimeException(); }
    void stop ()  { throw new RuntimeException(); }
    scala.Tuple2<java.net.Socket, scala.Option<java.lang.Object>> createPythonWorker (java.lang.String pythonExec, scala.collection.immutable.Map<java.lang.String, java.lang.String> envVars)  { throw new RuntimeException(); }
    void destroyPythonWorker (java.lang.String pythonExec, scala.collection.immutable.Map<java.lang.String, java.lang.String> envVars, java.net.Socket worker)  { throw new RuntimeException(); }
    void releasePythonWorker (java.lang.String pythonExec, scala.collection.immutable.Map<java.lang.String, java.lang.String> envVars, java.net.Socket worker)  { throw new RuntimeException(); }
}
