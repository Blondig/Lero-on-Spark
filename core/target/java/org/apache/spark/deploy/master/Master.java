package org.apache.spark.deploy.master;
  class Master implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging, org.apache.spark.deploy.master.LeaderElectable {
  static public  java.lang.String SYSTEM_NAME ()  { throw new RuntimeException(); }
  static public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] argStrings)  { throw new RuntimeException(); }
  /**
   * Start the Master and return a three tuple of:
   *   (1) The Master RpcEnv
   *   (2) The web UI bound port
   *   (3) The REST server bound port, if any
   * @param host (undocumented)
   * @param port (undocumented)
   * @param webUiPort (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  scala.Tuple3<org.apache.spark.rpc.RpcEnv, java.lang.Object, scala.Option<java.lang.Object>> startRpcEnvAndEndpoint (java.lang.String host, int port, int webUiPort, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
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
  public  org.apache.spark.SecurityManager securityMgr ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   Master (org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.rpc.RpcAddress address, int webUiPort, org.apache.spark.SecurityManager securityMgr, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<org.apache.spark.deploy.master.WorkerInfo> workers ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.deploy.master.ApplicationInfo> idToApp ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<org.apache.spark.deploy.master.ApplicationInfo> apps ()  { throw new RuntimeException(); }
  public  boolean reverseProxy ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  public  void electedLeader ()  { throw new RuntimeException(); }
  public  void revokedLeadership ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  public  void onDisconnected (org.apache.spark.rpc.RpcAddress address)  { throw new RuntimeException(); }
  public  void removeApplication (org.apache.spark.deploy.master.ApplicationInfo app, scala.Enumeration.Value state)  { throw new RuntimeException(); }
}
