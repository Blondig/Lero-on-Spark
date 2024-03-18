package org.apache.spark.rpc.netty;
/**
 * A message loop that is dedicated to a single RPC endpoint.
 */
public  class DedicatedMessageLoop extends org.apache.spark.rpc.netty.MessageLoop {
  public   DedicatedMessageLoop (java.lang.String name, org.apache.spark.rpc.IsolatedRpcEndpoint endpoint, org.apache.spark.rpc.netty.Dispatcher dispatcher)  { throw new RuntimeException(); }
  public  void post (java.lang.String endpointName, org.apache.spark.rpc.netty.InboxMessage message)  { throw new RuntimeException(); }
  protected  java.util.concurrent.ExecutorService threadpool ()  { throw new RuntimeException(); }
  public  void unregister (java.lang.String endpointName)  { throw new RuntimeException(); }
}
