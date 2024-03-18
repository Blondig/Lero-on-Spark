package org.apache.spark.executor;
/**
 * Spark executor, backed by a threadpool to run tasks.
 * <p>
 * This can be used with Mesos, YARN, kubernetes and the standalone scheduler.
 * An internal RPC interface is used for communication with the driver,
 * except in the case of Mesos fine-grained mode.
 */
  class Executor implements org.apache.spark.internal.Logging {
  public  class TaskRunner implements java.lang.Runnable {
    // not preceding
    public   TaskRunner (org.apache.spark.executor.ExecutorBackend execBackend, org.apache.spark.scheduler.TaskDescription taskDescription, scala.Option<org.apache.spark.internal.plugin.PluginContainer> plugins)  { throw new RuntimeException(); }
    public  long getThreadId ()  { throw new RuntimeException(); }
    public  boolean isFinished ()  { throw new RuntimeException(); }
    public  void kill (boolean interruptThread, java.lang.String reason)  { throw new RuntimeException(); }
    public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> mdcProperties ()  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
    /** How much the JVM process has spent in GC when the task starts to run. */
    public  long startGCTime ()  { throw new RuntimeException(); }
    /**
     * The task to run. This will be set in run() by deserializing the task binary coming
     * from the driver. Once it is set, it will never be changed.
     * @return (undocumented)
     */
    public  org.apache.spark.scheduler.Task<java.lang.Object> task ()  { throw new RuntimeException(); }
    public  long taskId ()  { throw new RuntimeException(); }
    public  java.lang.String taskName ()  { throw new RuntimeException(); }
    public  java.lang.String threadName ()  { throw new RuntimeException(); }
  }
  static public  java.lang.ThreadLocal<java.util.Properties> taskDeserializationProps ()  { throw new RuntimeException(); }
  static public  org.apache.spark.executor.ExecutorSource executorSourceLocalModeOnly ()  { throw new RuntimeException(); }
  /**
   * Whether a <code>Throwable</code> thrown from a task is a fatal error. We will use this to decide whether
   * to kill the executor.
   * <p>
   * @param depthToCheck The max depth of the exception chain we should search for a fatal error. 0
   *                     means not checking any fatal error (in other words, return false), 1 means
   *                     checking only the exception but not the cause, and so on. This is to avoid
   *                     <code>StackOverflowError</code> when hitting a cycle in the exception chain.
   * @param t (undocumented)
   * @return (undocumented)
   */
  static public  boolean isFatalError (java.lang.Throwable t, int depthToCheck)  { throw new RuntimeException(); }
  public   Executor (java.lang.String executorId, java.lang.String executorHostname, org.apache.spark.SparkEnv env, scala.collection.Seq<java.net.URL> userClassPath, boolean isLocal, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
  public  java.lang.Object stopHookReference ()  { throw new RuntimeException(); }
    org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
    java.util.concurrent.ThreadPoolExecutor threadPool ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.executor.ExecutorMetricsSource> executorMetricsSource ()  { throw new RuntimeException(); }
    java.util.concurrent.ConcurrentHashMap<java.lang.Object, org.apache.spark.executor.Executor.TaskRunner> runningTasks ()  { throw new RuntimeException(); }
    java.util.concurrent.ConcurrentHashMap<java.lang.Object, scala.Tuple3<java.lang.Object, java.lang.String, java.lang.Object>> killMarks ()  { throw new RuntimeException(); }
    org.apache.spark.executor.ExecutorMetricsPoller metricsPoller ()  { throw new RuntimeException(); }
    int numRunningTasks ()  { throw new RuntimeException(); }
  /**
   * Mark an executor for decommissioning and avoid launching new tasks.
   */
    void decommission ()  { throw new RuntimeException(); }
    org.apache.spark.executor.Executor.TaskRunner createTaskRunner (org.apache.spark.executor.ExecutorBackend context, org.apache.spark.scheduler.TaskDescription taskDescription)  { throw new RuntimeException(); }
  public  void launchTask (org.apache.spark.executor.ExecutorBackend context, org.apache.spark.scheduler.TaskDescription taskDescription)  { throw new RuntimeException(); }
  public  void killTask (long taskId, boolean interruptThread, java.lang.String reason)  { throw new RuntimeException(); }
  /**
   * Function to kill the running tasks in an executor.
   * This can be called by executor back-ends to kill the
   * tasks instead of taking the JVM down.
   * @param interruptThread whether to interrupt the task thread
   * @param reason (undocumented)
   */
  public  void killAllTasks (boolean interruptThread, java.lang.String reason)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
