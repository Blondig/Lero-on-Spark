package org.apache.spark.rpc.netty;
/**
 * The message that is sent from the sender to the receiver.
 * <p>
 * param:  senderAddress the sender address. It's <code>null</code> if this message is from a client
 *                      <code>NettyRpcEnv</code>.
 * param:  receiver the receiver of this message.
 * param:  content the message content.
 */
  class RequestMessage {
  static public  org.apache.spark.rpc.netty.RequestMessage apply (org.apache.spark.rpc.netty.NettyRpcEnv nettyEnv, org.apache.spark.network.client.TransportClient client, java.nio.ByteBuffer bytes)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcAddress senderAddress ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.netty.NettyRpcEndpointRef receiver ()  { throw new RuntimeException(); }
  public  Object content ()  { throw new RuntimeException(); }
  // not preceding
  public   RequestMessage (org.apache.spark.rpc.RpcAddress senderAddress, org.apache.spark.rpc.netty.NettyRpcEndpointRef receiver, Object content)  { throw new RuntimeException(); }
  /** Manually serialize {@link RequestMessage} to minimize the size. */
  public  java.nio.ByteBuffer serialize (org.apache.spark.rpc.netty.NettyRpcEnv nettyEnv)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
