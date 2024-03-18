package org.apache.spark.deploy.worker.ui;
/**
 * Web UI server for the standalone worker.
 */
  class WorkerWebUI extends org.apache.spark.ui.WebUI implements org.apache.spark.internal.Logging {
  static public  java.lang.String STATIC_RESOURCE_BASE ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.worker.Worker worker ()  { throw new RuntimeException(); }
  public  java.io.File workDir ()  { throw new RuntimeException(); }
  // not preceding
  public   WorkerWebUI (org.apache.spark.deploy.worker.Worker worker, java.io.File workDir, int requestedPort)  { throw new RuntimeException(); }
    org.apache.spark.rpc.RpcTimeout timeout ()  { throw new RuntimeException(); }
  /** Initialize all components of the server. */
  public  void initialize ()  { throw new RuntimeException(); }
}
