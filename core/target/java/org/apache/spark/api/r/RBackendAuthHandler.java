package org.apache.spark.api.r;
/**
 * Authentication handler for connections from the R process.
 */
public  class RBackendAuthHandler extends io.netty.channel.SimpleChannelInboundHandler<byte[]> implements org.apache.spark.internal.Logging {
  public   RBackendAuthHandler (java.lang.String secret)  { throw new RuntimeException(); }
  public  void channelRead0 (io.netty.channel.ChannelHandlerContext ctx, byte[] msg)  { throw new RuntimeException(); }
}
