package org.apache.spark.deploy.rest;
/**
 * A mock standalone Master that responds with dummy messages.
 * In all responses, the success parameter is always true.
 */
public  class DummyMaster implements org.apache.spark.rpc.RpcEndpoint {
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  // not preceding
  public   DummyMaster (org.apache.spark.rpc.RpcEnv rpcEnv, java.lang.String submitId, java.lang.String submitMessage, java.lang.String killMessage, scala.Enumeration.Value state, scala.Option<java.lang.Exception> exception)  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
}
