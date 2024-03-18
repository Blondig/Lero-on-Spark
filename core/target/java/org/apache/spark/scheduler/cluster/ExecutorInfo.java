package org.apache.spark.scheduler.cluster;
/**
 * :: DeveloperApi ::
 * Stores information about an executor to pass from the scheduler to SparkListeners.
 */
public  class ExecutorInfo {
  // not preceding
  public   ExecutorInfo (java.lang.String executorHost, int totalCores, scala.collection.immutable.Map<java.lang.String, java.lang.String> logUrlMap, scala.collection.immutable.Map<java.lang.String, java.lang.String> attributes, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resourcesInfo, int resourceProfileId)  { throw new RuntimeException(); }
  public   ExecutorInfo (java.lang.String executorHost, int totalCores, scala.collection.immutable.Map<java.lang.String, java.lang.String> logUrlMap)  { throw new RuntimeException(); }
  public   ExecutorInfo (java.lang.String executorHost, int totalCores, scala.collection.immutable.Map<java.lang.String, java.lang.String> logUrlMap, scala.collection.immutable.Map<java.lang.String, java.lang.String> attributes)  { throw new RuntimeException(); }
  public   ExecutorInfo (java.lang.String executorHost, int totalCores, scala.collection.immutable.Map<java.lang.String, java.lang.String> logUrlMap, scala.collection.immutable.Map<java.lang.String, java.lang.String> attributes, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resourcesInfo)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> attributes ()  { throw new RuntimeException(); }
  public  boolean canEqual (Object other)  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  java.lang.String executorHost ()  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> logUrlMap ()  { throw new RuntimeException(); }
  public  int resourceProfileId ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resourcesInfo ()  { throw new RuntimeException(); }
  public  int totalCores ()  { throw new RuntimeException(); }
}
