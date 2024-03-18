package org.apache.spark;
/**
 * Dummy cluster manager to simulate responses to executor allocation requests.
 */
public  class FakeClusterManager implements org.apache.spark.rpc.RpcEndpoint {
  // not preceding
  public   FakeClusterManager (org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> getExecutorIdsToKill ()  { throw new RuntimeException(); }
  public  int getTargetNumExecutors ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
}
