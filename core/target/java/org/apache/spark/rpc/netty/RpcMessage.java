package org.apache.spark.rpc.netty;
  class RpcMessage implements org.apache.spark.rpc.netty.InboxMessage, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcAddress senderAddress ()  { throw new RuntimeException(); }
  public  Object content ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.netty.NettyRpcCallContext context ()  { throw new RuntimeException(); }
  // not preceding
  public   RpcMessage (org.apache.spark.rpc.RpcAddress senderAddress, Object content, org.apache.spark.rpc.netty.NettyRpcCallContext context)  { throw new RuntimeException(); }
}
