package org.apache.spark.resource;
public  class ResourceUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ResourceUtils$ MODULE$ = null;
  public   ResourceUtils$ ()  { throw new RuntimeException(); }
  public  java.lang.String DISCOVERY_SCRIPT ()  { throw new RuntimeException(); }
  public  java.lang.String VENDOR ()  { throw new RuntimeException(); }
  public  java.lang.String AMOUNT ()  { throw new RuntimeException(); }
  public  org.apache.spark.resource.ResourceRequest parseResourceRequest (org.apache.spark.SparkConf sparkConf, org.apache.spark.resource.ResourceID resourceId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.resource.ResourceID> listResourceIds (org.apache.spark.SparkConf sparkConf, java.lang.String componentName)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.resource.ResourceRequest> parseAllResourceRequests (org.apache.spark.SparkConf sparkConf, java.lang.String componentName)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, java.lang.Object> calculateAmountAndPartsForFraction (double doubleAmount)  { throw new RuntimeException(); }
  public  void addTaskResourceRequests (org.apache.spark.SparkConf sparkConf, org.apache.spark.resource.TaskResourceRequests treqs)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.resource.ResourceRequirement> parseResourceRequirements (org.apache.spark.SparkConf sparkConf, java.lang.String componentName)  { throw new RuntimeException(); }
  public  boolean resourcesMeetRequirements (scala.collection.immutable.Map<java.lang.String, java.lang.Object> resourcesFree, scala.collection.Seq<org.apache.spark.resource.ResourceRequirement> resourceRequirements)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> scala.collection.Seq<T> withResourcesJson (java.lang.String resourcesFile, scala.Function1<java.lang.String, scala.collection.Seq<T>> extract)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.resource.ResourceAllocation> parseAllocatedFromJsonFile (java.lang.String resourcesFile)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.resource.ResourceAllocation> parseAllocated (scala.Option<java.lang.String> resourcesFileOpt, java.lang.String componentName)  { throw new RuntimeException(); }
  /**
   * Gets all allocated resource information for the input component from input resources file and
   * the application level Spark configs. It first looks to see if resource were explicitly
   * specified in the resources file (this would include specified address assignments and it only
   * specified in certain cluster managers) and then it looks at the Spark configs to get any
   * others not specified in the file. The resources not explicitly set in the file require a
   * discovery script for it to run to get the addresses of the resource.
   * It also verifies the resource allocation meets required amount for each resource.
   * @return a map from resource name to resource info
   * @param sparkConf (undocumented)
   * @param componentName (undocumented)
   * @param resourcesFileOpt (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> getOrDiscoverAllResources (org.apache.spark.SparkConf sparkConf, java.lang.String componentName, scala.Option<java.lang.String> resourcesFileOpt)  { throw new RuntimeException(); }
  /**
   * This function is similar to getOrDiscoverallResources, except for it uses the ResourceProfile
   * information instead of the application level configs.
   * <p>
   * It first looks to see if resource were explicitly specified in the resources file
   * (this would include specified address assignments and it only specified in certain
   * cluster managers) and then it looks at the ResourceProfile to get
   * any others not specified in the file. The resources not explicitly set in the file require a
   * discovery script for it to run to get the addresses of the resource.
   * It also verifies the resource allocation meets required amount for each resource.
   * <p>
   * @return a map from resource name to resource info
   * @param resourcesFileOpt (undocumented)
   * @param componentName (undocumented)
   * @param resourceProfile (undocumented)
   * @param sparkConf (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> getOrDiscoverAllResourcesForResourceProfile (scala.Option<java.lang.String> resourcesFileOpt, java.lang.String componentName, org.apache.spark.resource.ResourceProfile resourceProfile, org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
  public  void logResourceInfo (java.lang.String componentName, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
    org.apache.spark.resource.ResourceInformation discoverResource (org.apache.spark.SparkConf sparkConf, org.apache.spark.resource.ResourceRequest resourceRequest)  { throw new RuntimeException(); }
  public  boolean validateTaskCpusLargeEnough (org.apache.spark.SparkConf sparkConf, int execCores, int taskCpus)  { throw new RuntimeException(); }
  public  void warnOnWastedResources (org.apache.spark.resource.ResourceProfile rp, org.apache.spark.SparkConf sparkConf, scala.Option<java.lang.Object> execCores)  { throw new RuntimeException(); }
  public final  java.lang.String GPU ()  { throw new RuntimeException(); }
  public final  java.lang.String FPGA ()  { throw new RuntimeException(); }
  public final  java.lang.String RESOURCE_PREFIX ()  { throw new RuntimeException(); }
}
