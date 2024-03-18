package org.apache.spark.rpc.netty;
/**
 * An inbox that stores messages for an {@link RpcEndpoint} and posts messages to it thread-safely.
 */
  class Inbox implements org.apache.spark.internal.Logging {
  // not preceding
  public   Inbox (java.lang.String endpointName, org.apache.spark.rpc.RpcEndpoint endpoint)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpoint endpoint ()  { throw new RuntimeException(); }
  public  java.lang.String endpointName ()  { throw new RuntimeException(); }
  public  int getNumActiveThreads ()  { throw new RuntimeException(); }
  public  boolean isEmpty ()  { throw new RuntimeException(); }
  protected  java.util.LinkedList<org.apache.spark.rpc.netty.InboxMessage> messages ()  { throw new RuntimeException(); }
  /**
   * Called when we are dropping a message. Test cases override this to test message dropping.
   * Exposed for testing.
   * @param message (undocumented)
   */
  protected  void onDrop (org.apache.spark.rpc.netty.InboxMessage message)  { throw new RuntimeException(); }
  public  void post (org.apache.spark.rpc.netty.InboxMessage message)  { throw new RuntimeException(); }
  /**
   * Process stored messages.
   * @param dispatcher (undocumented)
   */
  public  void process (org.apache.spark.rpc.netty.Dispatcher dispatcher)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
