package org.apache.spark.deploy.master.ui;
/**
 * Web UI server for the standalone master.
 */
  class MasterWebUI extends org.apache.spark.ui.WebUI implements org.apache.spark.internal.Logging {
  public  org.apache.spark.deploy.master.Master master ()  { throw new RuntimeException(); }
  // not preceding
  public   MasterWebUI (org.apache.spark.deploy.master.Master master, int requestedPort)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef masterEndpointRef ()  { throw new RuntimeException(); }
  public  boolean killEnabled ()  { throw new RuntimeException(); }
  public  java.lang.String decommissionAllowMode ()  { throw new RuntimeException(); }
  /** Initialize all components of the server. */
  public  void initialize ()  { throw new RuntimeException(); }
  public  void addProxy ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> idToUiAddress (java.lang.String id)  { throw new RuntimeException(); }
}
