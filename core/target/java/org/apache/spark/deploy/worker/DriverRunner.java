package org.apache.spark.deploy.worker;
/**
 * Manages the execution of one driver, including automatically restarting the driver on failure.
 * This is currently only used in standalone cluster deploy mode.
 */
  class DriverRunner implements org.apache.spark.internal.Logging {
  public  java.lang.String driverId ()  { throw new RuntimeException(); }
  public  java.io.File workDir ()  { throw new RuntimeException(); }
  public  java.io.File sparkHome ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.DriverDescription driverDesc ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef worker ()  { throw new RuntimeException(); }
  public  java.lang.String workerUrl ()  { throw new RuntimeException(); }
  public  java.lang.String workerWebUiUrl ()  { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityManager ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources ()  { throw new RuntimeException(); }
  // not preceding
  public   DriverRunner (org.apache.spark.SparkConf conf, java.lang.String driverId, java.io.File workDir, java.io.File sparkHome, org.apache.spark.deploy.DriverDescription driverDesc, org.apache.spark.rpc.RpcEndpointRef worker, java.lang.String workerUrl, java.lang.String workerWebUiUrl, org.apache.spark.SecurityManager securityManager, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
    scala.Option<scala.Enumeration.Value> finalState ()  { throw new RuntimeException(); }
    scala.Option<java.lang.Exception> finalException ()  { throw new RuntimeException(); }
  public  void setClock (org.apache.spark.util.Clock _clock)  { throw new RuntimeException(); }
  public  void setSleeper (org.apache.spark.deploy.worker.Sleeper _sleeper)  { throw new RuntimeException(); }
  /** Starts a thread to run and manage the driver. */
    void start ()  { throw new RuntimeException(); }
  /** Terminate this driver (or prevent it from ever starting if not yet started) */
    void kill ()  { throw new RuntimeException(); }
    int prepareAndRunDriver ()  { throw new RuntimeException(); }
    int runCommandWithRetry (org.apache.spark.deploy.worker.ProcessBuilderLike command, scala.Function1<java.lang.Process, scala.runtime.BoxedUnit> initialize, boolean supervise)  { throw new RuntimeException(); }
}
