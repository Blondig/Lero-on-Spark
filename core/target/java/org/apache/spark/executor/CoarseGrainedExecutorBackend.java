package org.apache.spark.executor;
  class CoarseGrainedExecutorBackend implements org.apache.spark.rpc.IsolatedRpcEndpoint, org.apache.spark.executor.ExecutorBackend, org.apache.spark.internal.Logging {
  static public  class RegisteredExecutor$ implements scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RegisteredExecutor$ MODULE$ = null;
    public   RegisteredExecutor$ ()  { throw new RuntimeException(); }
  }
  static public  class Arguments implements scala.Product, scala.Serializable {
    public  java.lang.String driverUrl ()  { throw new RuntimeException(); }
    public  java.lang.String executorId ()  { throw new RuntimeException(); }
    public  java.lang.String bindAddress ()  { throw new RuntimeException(); }
    public  java.lang.String hostname ()  { throw new RuntimeException(); }
    public  int cores ()  { throw new RuntimeException(); }
    public  java.lang.String appId ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> workerUrl ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> resourcesFileOpt ()  { throw new RuntimeException(); }
    public  int resourceProfileId ()  { throw new RuntimeException(); }
    // not preceding
    public   Arguments (java.lang.String driverUrl, java.lang.String executorId, java.lang.String bindAddress, java.lang.String hostname, int cores, java.lang.String appId, scala.Option<java.lang.String> workerUrl, scala.Option<java.lang.String> resourcesFileOpt, int resourceProfileId)  { throw new RuntimeException(); }
  }
  static public  class Arguments$ extends scala.runtime.AbstractFunction9<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, scala.Option<java.lang.String>, scala.Option<java.lang.String>, java.lang.Object, org.apache.spark.executor.CoarseGrainedExecutorBackend.Arguments> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Arguments$ MODULE$ = null;
    public   Arguments$ ()  { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void run (org.apache.spark.executor.CoarseGrainedExecutorBackend.Arguments arguments, scala.Function4<org.apache.spark.rpc.RpcEnv, org.apache.spark.executor.CoarseGrainedExecutorBackend.Arguments, org.apache.spark.SparkEnv, org.apache.spark.resource.ResourceProfile, org.apache.spark.executor.CoarseGrainedExecutorBackend> backendCreateFn)  { throw new RuntimeException(); }
  static public  org.apache.spark.executor.CoarseGrainedExecutorBackend.Arguments parseArguments (java.lang.String[] args, java.lang.String classNameForEntry)  { throw new RuntimeException(); }
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
  // not preceding
  public   CoarseGrainedExecutorBackend (org.apache.spark.rpc.RpcEnv rpcEnv, java.lang.String driverUrl, java.lang.String executorId, java.lang.String bindAddress, java.lang.String hostname, int cores, org.apache.spark.SparkEnv env, scala.Option<java.lang.String> resourcesFileOpt, org.apache.spark.resource.ResourceProfile resourceProfile)  { throw new RuntimeException(); }
    java.util.concurrent.atomic.AtomicBoolean stopping ()  { throw new RuntimeException(); }
  public  org.apache.spark.executor.Executor executor ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rpc.RpcEndpointRef> driver ()  { throw new RuntimeException(); }
  /**
   * Map each taskId to the information about the resource allocated to it, Please refer to
   * {@link ResourceInformation} for specifics.
   * Exposed for testing only.
   * @return (undocumented)
   */
    scala.collection.mutable.HashMap<java.lang.Object, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation>> taskResources ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> parseOrFindResources (scala.Option<java.lang.String> resourcesFileOpt)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.net.URL> getUserClassPath ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> extractLogUrls ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> extractAttributes ()  { throw new RuntimeException(); }
  public  void notifyDriverAboutPushCompletion (int shuffleId, int shuffleMergeId, int mapIndex)  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  public  void statusUpdate (long taskId, scala.Enumeration.Value state, java.nio.ByteBuffer data)  { throw new RuntimeException(); }
  /**
   * This function can be overloaded by other child classes to handle
   * executor exits differently. For e.g. when an executor goes down,
   * back-end may not want to take the parent process down.
   * @param code (undocumented)
   * @param reason (undocumented)
   * @param throwable (undocumented)
   * @param notifyDriver (undocumented)
   */
  protected  void exitExecutor (int code, java.lang.String reason, java.lang.Throwable throwable, boolean notifyDriver)  { throw new RuntimeException(); }
}
