package org.apache.spark.deploy.master;
public  class MockWorker implements org.apache.spark.rpc.RpcEndpoint {
  // not preceding
  static public  java.util.concurrent.atomic.AtomicInteger counter ()  { throw new RuntimeException(); }
  public   MockWorker (org.apache.spark.rpc.RpcEndpointRef master, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  int seq ()  { throw new RuntimeException(); }
  public  java.lang.String id ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, java.lang.String> apps ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, java.lang.String> driverIdToAppId ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef newDriver (java.lang.String driverId)  { throw new RuntimeException(); }
  public  boolean decommissioned ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.ApplicationDescription appDesc ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<java.lang.String> drivers ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Set<java.lang.String>>> driverResources ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Set<java.lang.String>>> execResources ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
}
