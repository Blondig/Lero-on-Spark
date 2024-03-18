package org.apache.spark.rpc.netty;
  class Outbox {
  // not preceding
  public   Outbox (org.apache.spark.rpc.netty.NettyRpcEnv nettyEnv, org.apache.spark.rpc.RpcAddress address)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcAddress address ()  { throw new RuntimeException(); }
  /**
   * Send a message. If there is no active connection, cache it and launch a new connection. If
   * {@link Outbox} is stopped, the sender will be notified with a {@link SparkException}.
   * @param message (undocumented)
   */
  public  void send (org.apache.spark.rpc.netty.OutboxMessage message)  { throw new RuntimeException(); }
  /**
   * Stop {@link Outbox}. The remaining messages in the {@link Outbox} will be notified with a
   * {@link SparkException}.
   */
  public  void stop ()  { throw new RuntimeException(); }
}
