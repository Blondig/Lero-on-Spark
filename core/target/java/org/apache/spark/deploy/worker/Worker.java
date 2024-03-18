package org.apache.spark.deploy.worker;
  class Worker implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging {
  static public  java.lang.String SYSTEM_NAME ()  { throw new RuntimeException(); }
  static public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] argStrings)  { throw new RuntimeException(); }
  static public  org.apache.spark.rpc.RpcEnv startRpcEnvAndEndpoint (java.lang.String host, int port, int webUiPort, int cores, int memory, java.lang.String[] masterUrls, java.lang.String workDir, scala.Option<java.lang.Object> workerNumber, org.apache.spark.SparkConf conf, scala.Option<java.lang.String> resourceFileOpt)  { throw new RuntimeException(); }
  static public  boolean isUseLocalNodeSSLConfig (org.apache.spark.deploy.Command cmd)  { throw new RuntimeException(); }
  static public  org.apache.spark.deploy.Command maybeUpdateSSLSettings (org.apache.spark.deploy.Command cmd, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
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
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityMgr ()  { throw new RuntimeException(); }
  // not preceding
  public   Worker (org.apache.spark.rpc.RpcEnv rpcEnv, int webUiPort, int cores, int memory, org.apache.spark.rpc.RpcAddress[] masterRpcAddresses, java.lang.String endpointName, java.lang.String workDirPath, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityMgr, scala.Option<java.lang.String> resourceFileOpt, java.util.function.Supplier<org.apache.spark.deploy.ExternalShuffleService> externalShuffleServiceSupplier)  { throw new RuntimeException(); }
    java.lang.String activeMasterWebUiUrl ()  { throw new RuntimeException(); }
    java.lang.String workerId ()  { throw new RuntimeException(); }
  public  java.io.File workDir ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.LinkedHashMap<java.lang.String, org.apache.spark.deploy.worker.ExecutorRunner> finishedExecutors ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.deploy.worker.DriverRunner> drivers ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.deploy.worker.ExecutorRunner> executors ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.LinkedHashMap<java.lang.String, org.apache.spark.deploy.worker.DriverRunner> finishedDrivers ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, scala.collection.Seq<java.lang.String>> appDirectories ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<java.lang.String> finishedApps ()  { throw new RuntimeException(); }
  public  int retainedExecutors ()  { throw new RuntimeException(); }
  public  int retainedDrivers ()  { throw new RuntimeException(); }
  public  boolean reverseProxy ()  { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources ()  { throw new RuntimeException(); }
  public  int coresUsed ()  { throw new RuntimeException(); }
  public  int memoryUsed ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.deploy.StandaloneResourceUtils.MutableResourceInfo> resourcesUsed ()  { throw new RuntimeException(); }
  public  int coresFree ()  { throw new RuntimeException(); }
  public  int memoryFree ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
    void decommissionSelf ()  { throw new RuntimeException(); }
    void handleDriverStateChanged (org.apache.spark.deploy.DeployMessages.DriverStateChanged driverStateChanged)  { throw new RuntimeException(); }
    void handleExecutorStateChanged (org.apache.spark.deploy.DeployMessages.ExecutorStateChanged executorStateChanged)  { throw new RuntimeException(); }
}
