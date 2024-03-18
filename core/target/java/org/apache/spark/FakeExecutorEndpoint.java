package org.apache.spark;
/**
 * Dummy RPC endpoint to simulate executors.
 */
public  class FakeExecutorEndpoint implements org.apache.spark.rpc.RpcEndpoint {
  // not preceding
  public   FakeExecutorEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv)  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
}
