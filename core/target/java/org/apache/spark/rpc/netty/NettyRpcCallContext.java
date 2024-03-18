package org.apache.spark.rpc.netty;
 abstract class NettyRpcCallContext implements org.apache.spark.rpc.RpcCallContext, org.apache.spark.internal.Logging {
  // not preceding
  public   NettyRpcCallContext (org.apache.spark.rpc.RpcAddress senderAddress)  { throw new RuntimeException(); }
  public  void reply (Object response)  { throw new RuntimeException(); }
  protected abstract  void send (Object message)  ;
  public  void sendFailure (java.lang.Throwable e)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcAddress senderAddress ()  { throw new RuntimeException(); }
}
