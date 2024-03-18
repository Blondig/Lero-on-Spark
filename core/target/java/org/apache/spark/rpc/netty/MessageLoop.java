package org.apache.spark.rpc.netty;
/**
 * A message loop used by {@link Dispatcher} to deliver messages to endpoints.
 */
public abstract class MessageLoop implements org.apache.spark.internal.Logging {
  /** A poison inbox that indicates the message loop should stop processing messages. */
  static public  org.apache.spark.rpc.netty.Inbox PoisonPill ()  { throw new RuntimeException(); }
  public   MessageLoop (org.apache.spark.rpc.netty.Dispatcher dispatcher)  { throw new RuntimeException(); }
  protected  java.lang.Object receiveLoopRunnable ()  { throw new RuntimeException(); }
  protected abstract  java.util.concurrent.ExecutorService threadpool ()  ;
  public abstract  void post (java.lang.String endpointName, org.apache.spark.rpc.netty.InboxMessage message)  ;
  public abstract  void unregister (java.lang.String name)  ;
  public  void stop ()  { throw new RuntimeException(); }
  protected final  void setActive (org.apache.spark.rpc.netty.Inbox inbox)  { throw new RuntimeException(); }
}
