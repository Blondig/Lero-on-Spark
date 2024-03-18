package org.apache.spark.deploy.worker;
/**
 * Endpoint which connects to a worker process and terminates the JVM if the
 * connection is severed.
 * Provides fate sharing between a worker and its associated child processes.
 */
  class WorkerWatcher implements org.apache.spark.rpc.RpcEndpoint, org.apache.spark.internal.Logging {
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  // not preceding
  public   WorkerWatcher (org.apache.spark.rpc.RpcEnv rpcEnv, java.lang.String workerUrl, boolean isTesting, java.util.concurrent.atomic.AtomicBoolean isChildProcessStopping)  { throw new RuntimeException(); }
    boolean isShutDown ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  public  void onConnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  public  void onNetworkError (java.lang.Throwable cause, org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
}
