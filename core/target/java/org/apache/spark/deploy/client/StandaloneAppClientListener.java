package org.apache.spark.deploy.client;
/**
 * Callbacks invoked by deploy client when various events happen. There are currently five events:
 * connecting to the cluster, disconnecting, being given an executor, having an executor removed
 * (either due to failure or due to revocation), and having a worker removed.
 * <p>
 * Users of this API should *not* block inside the callback methods.
 */
public  interface StandaloneAppClientListener {
  public  void connected (java.lang.String appId)  ;
  /** An application death is an unrecoverable failure condition. */
  public  void dead (java.lang.String reason)  ;
  /** Disconnection may be a temporary state, as we fail over to a new Master. */
  public  void disconnected ()  ;
  public  void executorAdded (java.lang.String fullId, java.lang.String workerId, java.lang.String hostPort, int cores, int memory)  ;
  public  void executorDecommissioned (java.lang.String fullId, org.apache.spark.scheduler.ExecutorDecommissionInfo decommissionInfo)  ;
  public  void executorRemoved (java.lang.String fullId, java.lang.String message, scala.Option<java.lang.Object> exitStatus, scala.Option<java.lang.String> workerHost)  ;
  public  void workerRemoved (java.lang.String workerId, java.lang.String host, java.lang.String message)  ;
}
