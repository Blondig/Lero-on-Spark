package org.apache.spark.deploy.worker;
/**
 * Manages the execution of one executor process.
 * This is currently only used in standalone mode.
 */
  class ExecutorRunner implements org.apache.spark.internal.Logging {
  public  java.lang.String appId ()  { throw new RuntimeException(); }
  public  int execId ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.ApplicationDescription appDesc ()  { throw new RuntimeException(); }
  public  int cores ()  { throw new RuntimeException(); }
  public  int memory ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef worker ()  { throw new RuntimeException(); }
  public  java.lang.String workerId ()  { throw new RuntimeException(); }
  public  java.lang.String webUiScheme ()  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  int webUiPort ()  { throw new RuntimeException(); }
  public  java.lang.String publicAddress ()  { throw new RuntimeException(); }
  public  java.io.File sparkHome ()  { throw new RuntimeException(); }
  public  java.io.File executorDir ()  { throw new RuntimeException(); }
  public  java.lang.String workerUrl ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> appLocalDirs ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value state ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorRunner (java.lang.String appId, int execId, org.apache.spark.deploy.ApplicationDescription appDesc, int cores, int memory, org.apache.spark.rpc.RpcEndpointRef worker, java.lang.String workerId, java.lang.String webUiScheme, java.lang.String host, int webUiPort, java.lang.String publicAddress, java.io.File sparkHome, java.io.File executorDir, java.lang.String workerUrl, org.apache.spark.SparkConf conf, scala.collection.Seq<java.lang.String> appLocalDirs, scala.Enumeration.Value state, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
    void start ()  { throw new RuntimeException(); }
  /** Stop this executor runner, including killing the process it launched */
    void kill ()  { throw new RuntimeException(); }
  /** Replace variables such as {{EXECUTOR_ID}} and {{CORES}} in a command argument passed to us */
    java.lang.String substituteVariables (java.lang.String argument)  { throw new RuntimeException(); }
}
