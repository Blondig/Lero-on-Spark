package org.apache.spark.rpc.netty;
/**
 * A message loop that serves multiple RPC endpoints, using a shared thread pool.
 */
public  class SharedMessageLoop extends org.apache.spark.rpc.netty.MessageLoop {
  public   SharedMessageLoop (org.apache.spark.SparkConf conf, org.apache.spark.rpc.netty.Dispatcher dispatcher, int numUsableCores)  { throw new RuntimeException(); }
  public  void post (java.lang.String endpointName, org.apache.spark.rpc.netty.InboxMessage message)  { throw new RuntimeException(); }
  public  void register (java.lang.String name, org.apache.spark.rpc.RpcEndpoint endpoint)  { throw new RuntimeException(); }
  /** Thread pool used for dispatching messages. */
  protected  java.util.concurrent.ThreadPoolExecutor threadpool ()  { throw new RuntimeException(); }
  public  void unregister (java.lang.String name)  { throw new RuntimeException(); }
}
