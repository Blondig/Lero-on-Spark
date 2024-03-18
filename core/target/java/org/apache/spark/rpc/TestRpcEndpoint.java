package org.apache.spark.rpc;
public  class TestRpcEndpoint implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.scalactic.TripleEquals {
  public   TestRpcEndpoint ()  { throw new RuntimeException(); }
  public  int numReceiveMessages ()  { throw new RuntimeException(); }
  public  void onConnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  /**
   * Invoked when some network error happens in the connection between the current node and
   * <code>remoteAddress</code>.
   * @param cause (undocumented)
   * @param remoteAddress (undocumented)
   */
  public  void onNetworkError (java.lang.Throwable cause, org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  public  void verifyOnConnectedMessages (scala.collection.Seq<org.apache.spark.rpc.RpcAddress> expected)  { throw new RuntimeException(); }
  public  void verifyOnDisconnectedMessages (scala.collection.Seq<org.apache.spark.rpc.RpcAddress> expected)  { throw new RuntimeException(); }
  public  void verifyOnNetworkErrorMessages (scala.collection.Seq<scala.Tuple2<java.lang.Throwable, org.apache.spark.rpc.RpcAddress>> expected)  { throw new RuntimeException(); }
  public  void verifyReceiveAndReplyMessages (scala.collection.Seq<java.lang.Object> expected)  { throw new RuntimeException(); }
  public  void verifyReceiveMessages (scala.collection.Seq<java.lang.Object> expected)  { throw new RuntimeException(); }
  public  void verifySingleOnConnectedMessage (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  public  void verifySingleOnDisconnectedMessage (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  public  void verifySingleOnNetworkErrorMessage (java.lang.Throwable cause, org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  public  void verifySingleReceiveAndReplyMessage (Object message)  { throw new RuntimeException(); }
  public  void verifySingleReceiveMessage (Object message)  { throw new RuntimeException(); }
  public  void verifyStarted ()  { throw new RuntimeException(); }
  public  void verifyStopped ()  { throw new RuntimeException(); }
}
