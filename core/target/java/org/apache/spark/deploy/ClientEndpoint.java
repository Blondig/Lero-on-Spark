package org.apache.spark.deploy;
/**
 * Proxy that relays messages to the driver.
 * <p>
 * We currently don't support retry if submission fails. In HA mode, client will submit request to
 * all masters and see which one could handle it.
 */
public  class ClientEndpoint implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging {
  // not preceding
  public   ClientEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.deploy.ClientArguments driverArgs, scala.collection.Seq<org.apache.spark.rpc.RpcEndpointRef> masterEndpoints, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  public  void onError (java.lang.Throwable cause)  { throw new RuntimeException(); }
  public  void onNetworkError (java.lang.Throwable cause, org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  /**
   * Processes and reports the driver status then exit the JVM if the
   * waitAppCompletion is set to false, else reports the driver status
   * if debug logs are enabled.
   * @param found (undocumented)
   * @param state (undocumented)
   * @param workerId (undocumented)
   * @param workerHostPort (undocumented)
   * @param exception (undocumented)
   */
  public  void reportDriverStatus (boolean found, scala.Option<scala.Enumeration.Value> state, scala.Option<java.lang.String> workerId, scala.Option<java.lang.String> workerHostPort, scala.Option<java.lang.Exception> exception)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
}
