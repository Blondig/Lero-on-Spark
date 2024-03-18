package org.apache.spark.deploy.rest;
/**
 * A mock standalone Master that keeps track of drivers that have been submitted.
 * <p>
 * If a driver is submitted, its state is immediately set to RUNNING.
 * If an existing driver is killed, its state is immediately set to KILLED.
 * If an existing driver's status is requested, its state is returned in the response.
 * Submits are always successful while kills and status requests are successful only
 * if the driver was submitted in the past.
 */
public  class SmarterMaster implements org.apache.spark.rpc.ThreadSafeRpcEndpoint {
  // not preceding
  public   SmarterMaster (org.apache.spark.rpc.RpcEnv rpcEnv)  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
}
