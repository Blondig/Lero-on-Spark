package org.apache.spark.rpc.netty;
/**
 * A message dispatcher, responsible for routing RPC messages to the appropriate endpoint(s).
 * <p>
 * param:  numUsableCores Number of CPU cores allocated to the process, for sizing the thread pool.
 *                       If 0, will consider the available CPUs on the host.
 */
  class Dispatcher implements org.apache.spark.internal.Logging {
  public   Dispatcher (org.apache.spark.rpc.netty.NettyRpcEnv nettyEnv, int numUsableCores)  { throw new RuntimeException(); }
  public  void awaitTermination ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef getRpcEndpointRef (org.apache.spark.rpc.RpcEndpoint endpoint)  { throw new RuntimeException(); }
  /** Posts a message sent by a local endpoint. */
  public  void postLocalMessage (org.apache.spark.rpc.netty.RequestMessage message, scala.concurrent.Promise<java.lang.Object> p)  { throw new RuntimeException(); }
  /** Posts a one-way message. */
  public  void postOneWayMessage (org.apache.spark.rpc.netty.RequestMessage message)  { throw new RuntimeException(); }
  /** Posts a message sent by a remote endpoint. */
  public  void postRemoteMessage (org.apache.spark.rpc.netty.RequestMessage message, org.apache.spark.network.client.RpcResponseCallback callback)  { throw new RuntimeException(); }
  /**
   * Send a message to all registered {@link RpcEndpoint}s in this process.
   * <p>
   * This can be used to make network events known to all end points (e.g. "a new node connected").
   * @param message (undocumented)
   */
  public  void postToAll (org.apache.spark.rpc.netty.InboxMessage message)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.netty.NettyRpcEndpointRef registerRpcEndpoint (java.lang.String name, org.apache.spark.rpc.RpcEndpoint endpoint)  { throw new RuntimeException(); }
  public  void removeRpcEndpointRef (org.apache.spark.rpc.RpcEndpoint endpoint)  { throw new RuntimeException(); }
  public  void stop (org.apache.spark.rpc.RpcEndpointRef rpcEndpointRef)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Return if the endpoint exists
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  boolean verify (java.lang.String name)  { throw new RuntimeException(); }
}
