package org.apache.spark.scheduler;
/**
 * An interface to build Schedulable tree
 * buildPools: build the tree nodes(pools)
 * addTaskSetManager: build the leaf nodes(TaskSetManagers)
 */
public  interface SchedulableBuilder {
  public  void addTaskSetManager (org.apache.spark.scheduler.Schedulable manager, java.util.Properties properties)  ;
  public  void buildPools ()  ;
  public  org.apache.spark.scheduler.Pool rootPool ()  ;
}
