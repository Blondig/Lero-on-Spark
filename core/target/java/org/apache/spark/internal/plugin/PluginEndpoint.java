package org.apache.spark.internal.plugin;
public  class PluginEndpoint implements org.apache.spark.rpc.IsolatedRpcEndpoint, org.apache.spark.internal.Logging {
  // not preceding
  public   PluginEndpoint (scala.collection.immutable.Map<java.lang.String, org.apache.spark.api.plugin.DriverPlugin> plugins, org.apache.spark.rpc.RpcEnv rpcEnv)  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
}
