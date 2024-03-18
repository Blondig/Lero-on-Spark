package org.apache.spark.rpc;
/**
 * Common tests for an RpcEnv implementation.
 */
public abstract class RpcEnvSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterAll {
  public   RpcEnvSuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public abstract  org.apache.spark.rpc.RpcEnv createRpcEnv (org.apache.spark.SparkConf conf, java.lang.String name, int port, boolean clientMode)  ;
  public  org.apache.spark.rpc.RpcEnv env ()  { throw new RuntimeException(); }
}
