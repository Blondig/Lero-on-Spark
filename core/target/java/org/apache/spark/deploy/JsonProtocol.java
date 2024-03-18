package org.apache.spark.deploy;
public  class JsonProtocol {
  /**
   * Export the {@link WorkerInfo} to a Json object. A {@link WorkerInfo} consists of the information of a
   * worker.
   * <p>
   * @return a Json object containing the following fields:
   *         <code>id</code> a string identifier of the worker
   *         <code>host</code> the host that the worker is running on
   *         <code>port</code> the port that the worker is bound to
   *         <code>webuiaddress</code> the address used in web UI
   *         <code>cores</code> total cores of the worker
   *         <code>coresused</code> allocated cores of the worker
   *         <code>coresfree</code> free cores of the worker
   *         <code>memory</code> total memory of the worker
   *         <code>memoryused</code> allocated memory of the worker
   *         <code>memoryfree</code> free memory of the worker
   *         <code>resources</code> total resources of the worker
   *         <code>resourcesused</code> allocated resources of the worker
   *         <code>resourcesfree</code> free resources of the worker
   *         <code>state</code> state of the worker, see {@link WorkerState}
   *         <code>lastheartbeat</code> time in milliseconds that the latest heart beat message from the
   *         worker is received
   * @param obj (undocumented)
   */
  static public  org.json4s.JsonAST.JObject writeWorkerInfo (org.apache.spark.deploy.master.WorkerInfo obj)  { throw new RuntimeException(); }
  /**
   * Export the {@link ApplicationInfo} to a Json object. An {@link ApplicationInfo} consists of the
   * information of an application.
   * <p>
   * @return a Json object containing the following fields:
   *         <code>id</code> a string identifier of the application
   *         <code>starttime</code> time in milliseconds that the application starts
   *         <code>name</code> the description of the application
   *         <code>cores</code> total cores granted to the application
   *         <code>user</code> name of the user who submitted the application
   *         <code>memoryperexecutor</code> minimal memory in MB required to each executor
   *         <code>resourcesperexecutor</code> minimal resources required to each executor
   *         <code>submitdate</code> time in Date that the application is submitted
   *         <code>state</code> state of the application, see {@link ApplicationState}
   *         <code>duration</code> time in milliseconds that the application has been running
   * For compatibility also returns the deprecated <code>memoryperslave</code> &amp; <code>resourcesperslave</code> fields.
   * @param obj (undocumented)
   */
  static public  org.json4s.JsonAST.JObject writeApplicationInfo (org.apache.spark.deploy.master.ApplicationInfo obj)  { throw new RuntimeException(); }
  /**
   * Export the {@link ApplicationDescription} to a Json object. An {@link ApplicationDescription} consists
   * of the description of an application.
   * <p>
   * @return a Json object containing the following fields:
   *         <code>name</code> the description of the application
   *         <code>cores</code> max cores that can be allocated to the application, 0 means unlimited
   *         <code>memoryperexecutor</code> minimal memory in MB required to each executor
   *         <code>resourcesperexecutor</code> minimal resources required to each executor
   *         <code>user</code> name of the user who submitted the application
   *         <code>command</code> the command string used to submit the application
   * For compatibility also returns the deprecated <code>memoryperslave</code> &amp; <code>resourcesperslave</code> fields.
   * @param obj (undocumented)
   */
  static public  org.json4s.JsonAST.JObject writeApplicationDescription (org.apache.spark.deploy.ApplicationDescription obj)  { throw new RuntimeException(); }
  /**
   * Export the {@link ExecutorRunner} to a Json object. An {@link ExecutorRunner} consists of the
   * information of an executor.
   * <p>
   * @return a Json object containing the following fields:
   *         <code>id</code> an integer identifier of the executor
   *         <code>memory</code> memory in MB allocated to the executor
   *         <code>resources</code> resources allocated to the executor
   *         <code>appid</code> a string identifier of the application that the executor is working on
   *         <code>appdesc</code> a Json object of the {@link ApplicationDescription} of the application that the
   *         executor is working on
   * @param obj (undocumented)
   */
  static public  org.json4s.JsonAST.JObject writeExecutorRunner (org.apache.spark.deploy.worker.ExecutorRunner obj)  { throw new RuntimeException(); }
  /**
   * Export the {@link DriverInfo} to a Json object. A {@link DriverInfo} consists of the information of a
   * driver.
   * <p>
   * @return a Json object containing the following fields:
   *         <code>id</code> a string identifier of the driver
   *         <code>starttime</code> time in milliseconds that the driver starts
   *         <code>state</code> state of the driver, see {@link DriverState}
   *         <code>cores</code> cores allocated to the driver
   *         <code>memory</code> memory in MB allocated to the driver
   *         <code>resources</code> resources allocated to the driver
   *         <code>submitdate</code> time in Date that the driver is created
   *         <code>worker</code> identifier of the worker that the driver is running on
   *         <code>mainclass</code> main class of the command string that started the driver
   * @param obj (undocumented)
   */
  static public  org.json4s.JsonAST.JObject writeDriverInfo (org.apache.spark.deploy.master.DriverInfo obj)  { throw new RuntimeException(); }
  /**
   * Export the {@link MasterStateResponse} to a Json object. A {@link MasterStateResponse} consists the
   * information of a master node.
   * <p>
   * @return a Json object containing the following fields:
   *         <code>url</code> the url of the master node
   *         <code>workers</code> a list of Json objects of {@link WorkerInfo} of the workers allocated to the
   *         master
   *         <code>aliveworkers</code> size of alive workers allocated to the master
   *         <code>cores</code> total cores available of the master
   *         <code>coresused</code> cores used by the master
   *         <code>memory</code> total memory available of the master
   *         <code>memoryused</code> memory used by the master
   *         <code>resources</code> total resources available of the master
   *         <code>resourcesused</code> resources used by the master
   *         <code>activeapps</code> a list of Json objects of {@link ApplicationInfo} of the active applications
   *         running on the master
   *         <code>completedapps</code> a list of Json objects of {@link ApplicationInfo} of the applications
   *         completed in the master
   *         <code>activedrivers</code> a list of Json objects of {@link DriverInfo} of the active drivers of the
   *         master
   *         <code>completeddrivers</code> a list of Json objects of {@link DriverInfo} of the completed drivers
   *         of the master
   *         <code>status</code> status of the master,
   *         see {@link org.apache.spark.deploy.master.RecoveryState.MasterState}
   * @param obj (undocumented)
   */
  static public  org.json4s.JsonAST.JObject writeMasterState (org.apache.spark.deploy.DeployMessages.MasterStateResponse obj)  { throw new RuntimeException(); }
  /**
   * Export the {@link WorkerStateResponse} to a Json object. A {@link WorkerStateResponse} consists the
   * information of a worker node.
   * <p>
   * @return a Json object containing the following fields:
   *         <code>id</code> a string identifier of the worker node
   *         <code>masterurl</code> url of the master node of the worker
   *         <code>masterwebuiurl</code> the address used in web UI of the master node of the worker
   *         <code>cores</code> total cores of the worker
   *         <code>coreused</code> used cores of the worker
   *         <code>memory</code> total memory of the worker
   *         <code>memoryused</code> used memory of the worker
   *         <code>resources</code> total resources of the worker
   *         <code>resourcesused</code> used resources of the worker
   *         <code>executors</code> a list of Json objects of {@link ExecutorRunner} of the executors running on
   *         the worker
   *         <code>finishedexecutors</code> a list of Json objects of {@link ExecutorRunner} of the finished
   *         executors of the worker
   * @param obj (undocumented)
   */
  static public  org.json4s.JsonAST.JObject writeWorkerState (org.apache.spark.deploy.DeployMessages.WorkerStateResponse obj)  { throw new RuntimeException(); }
}
