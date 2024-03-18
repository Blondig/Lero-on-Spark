package org.apache.spark.deploy.master;
  class WorkerInfo implements scala.Serializable {
  // not preceding
  public   WorkerInfo (java.lang.String id, java.lang.String host, int port, int cores, int memory, org.apache.spark.rpc.RpcEndpointRef endpoint, java.lang.String webUiAddress, scala.collection.immutable.Map<java.lang.String, org.apache.spark.deploy.master.WorkerResourceInfo> resources)  { throw new RuntimeException(); }
  /**
   * acquire specified amount resources for driver/executor from the worker
   * @param resourceReqs the resources requirement from driver/executor
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> acquireResources (scala.collection.Seq<org.apache.spark.resource.ResourceRequirement> resourceReqs)  { throw new RuntimeException(); }
  public  void addDriver (org.apache.spark.deploy.master.DriverInfo driver)  { throw new RuntimeException(); }
  public  void addExecutor (org.apache.spark.deploy.master.ExecutorDesc exec)  { throw new RuntimeException(); }
  public  int cores ()  { throw new RuntimeException(); }
  public  int coresFree ()  { throw new RuntimeException(); }
  public  int coresUsed ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.deploy.master.DriverInfo> drivers ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef endpoint ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.deploy.master.ExecutorDesc> executors ()  { throw new RuntimeException(); }
  public  boolean hasExecutor (org.apache.spark.deploy.master.ApplicationInfo app)  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  java.lang.String hostPort ()  { throw new RuntimeException(); }
  public  java.lang.String id ()  { throw new RuntimeException(); }
  public  boolean isAlive ()  { throw new RuntimeException(); }
  public  long lastHeartbeat ()  { throw new RuntimeException(); }
  public  int memory ()  { throw new RuntimeException(); }
  public  int memoryFree ()  { throw new RuntimeException(); }
  public  int memoryUsed ()  { throw new RuntimeException(); }
  public  int port ()  { throw new RuntimeException(); }
  /**
   * used during master recovery
   * @param expected (undocumented)
   */
  public  void recoverResources (scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> expected)  { throw new RuntimeException(); }
  public  void removeDriver (org.apache.spark.deploy.master.DriverInfo driver)  { throw new RuntimeException(); }
  public  void removeExecutor (org.apache.spark.deploy.master.ExecutorDesc exec)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.deploy.master.WorkerResourceInfo> resources ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> resourcesAmountFree ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resourcesInfo ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resourcesInfoFree ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resourcesInfoUsed ()  { throw new RuntimeException(); }
  public  void setState (scala.Enumeration.Value state)  { throw new RuntimeException(); }
  public  scala.Enumeration.Value state ()  { throw new RuntimeException(); }
  public  java.lang.String webUiAddress ()  { throw new RuntimeException(); }
}
