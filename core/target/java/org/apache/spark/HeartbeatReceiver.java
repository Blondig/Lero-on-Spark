package org.apache.spark;
/**
 * Lives in the driver to receive heartbeats from executors..
 */
  class HeartbeatReceiver extends org.apache.spark.scheduler.SparkListener implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging {
  static public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
  public   HeartbeatReceiver (org.apache.spark.SparkContext sc, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  public   HeartbeatReceiver (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
    org.apache.spark.scheduler.TaskScheduler scheduler ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  /**
   * Send ExecutorRegistered to the event loop to add a new executor. Only for test.
   * <p>
   * @return if HeartbeatReceiver is stopped, return None. Otherwise, return a Some(Future) that
   *         indicate if this operation is successful.
   * @param executorId (undocumented)
   */
  public  scala.Option<scala.concurrent.Future<java.lang.Object>> addExecutor (java.lang.String executorId)  { throw new RuntimeException(); }
  /**
   * If the heartbeat receiver is not stopped, notify it of executor registrations.
   * @param executorAdded (undocumented)
   */
  public  void onExecutorAdded (org.apache.spark.scheduler.SparkListenerExecutorAdded executorAdded)  { throw new RuntimeException(); }
  /**
   * Send ExecutorRemoved to the event loop to remove an executor. Only for test.
   * <p>
   * @return if HeartbeatReceiver is stopped, return None. Otherwise, return a Some(Future) that
   *         indicate if this operation is successful.
   * @param executorId (undocumented)
   */
  public  scala.Option<scala.concurrent.Future<java.lang.Object>> removeExecutor (java.lang.String executorId)  { throw new RuntimeException(); }
  /**
   * If the heartbeat receiver is not stopped, notify it of executor removals so it doesn't
   * log superfluous errors.
   * <p>
   * Note that we must do this after the executor is actually removed to guard against the
   * following race condition: if we remove an executor's metadata from our data structure
   * prematurely, we may get an in-flight heartbeat from the executor before the executor is
   * actually removed, in which case we will still mark the executor as a dead host later
   * and expire it with loud error messages.
   * @param executorRemoved (undocumented)
   */
  public  void onExecutorRemoved (org.apache.spark.scheduler.SparkListenerExecutorRemoved executorRemoved)  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
}
