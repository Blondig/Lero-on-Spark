package org.apache.spark.resource;
public  class ResourceProfile$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ResourceProfile$ MODULE$ = null;
  public   ResourceProfile$ ()  { throw new RuntimeException(); }
  /**
   * built-in task resource: cpus
   * @return (undocumented)
   */
  public  java.lang.String CPUS ()  { throw new RuntimeException(); }
  /**
   * built-in executor resource: cores
   * @return (undocumented)
   */
  public  java.lang.String CORES ()  { throw new RuntimeException(); }
  /**
   * built-in executor resource: cores
   * @return (undocumented)
   */
  public  java.lang.String MEMORY ()  { throw new RuntimeException(); }
  /**
   * built-in executor resource: offHeap
   * @return (undocumented)
   */
  public  java.lang.String OFFHEAP_MEM ()  { throw new RuntimeException(); }
  /**
   * built-in executor resource: memoryOverhead
   * @return (undocumented)
   */
  public  java.lang.String OVERHEAD_MEM ()  { throw new RuntimeException(); }
  /**
   * built-in executor resource: pyspark.memory
   * @return (undocumented)
   */
  public  java.lang.String PYSPARK_MEM ()  { throw new RuntimeException(); }
  /**
   * Return all supported Spark built-in executor resources, custom resources like GPUs/FPGAs
   * are excluded.
   * @return (undocumented)
   */
  public  java.lang.String[] allSupportedExecutorResources ()  { throw new RuntimeException(); }
  public  int UNKNOWN_RESOURCE_PROFILE_ID ()  { throw new RuntimeException(); }
  public  int DEFAULT_RESOURCE_PROFILE_ID ()  { throw new RuntimeException(); }
    long MEMORY_OVERHEAD_MIN_MIB ()  { throw new RuntimeException(); }
    int getNextProfileId ()  { throw new RuntimeException(); }
    org.apache.spark.resource.ResourceProfile getOrCreateDefaultProfile (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    org.apache.spark.resource.ResourceProfile.DefaultProfileExecutorResources getDefaultProfileExecutorResources (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    void reInitDefaultProfile (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    void clearDefaultProfile ()  { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.TaskResourceRequest> getCustomTaskResources (org.apache.spark.resource.ResourceProfile rp)  { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> getCustomExecutorResources (org.apache.spark.resource.ResourceProfile rp)  { throw new RuntimeException(); }
    int getTaskCpusOrDefaultForProfile (org.apache.spark.resource.ResourceProfile rp, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Get offHeap memory size from {@link ExecutorResourceRequest}
   * return 0 if MEMORY_OFFHEAP_ENABLED is false.
   * @param sparkConf (undocumented)
   * @param execRequest (undocumented)
   * @return (undocumented)
   */
    long executorOffHeapMemorySizeAsMb (org.apache.spark.SparkConf sparkConf, org.apache.spark.resource.ExecutorResourceRequest execRequest)  { throw new RuntimeException(); }
    long calculateOverHeadMemory (scala.Option<java.lang.Object> overHeadMemFromConf, long executorMemoryMiB, double overheadFactor)  { throw new RuntimeException(); }
  /**
   * Gets the full list of resources to allow a cluster manager to request the appropriate
   * container. If the resource profile is not the default one we either get the resources
   * specified in the profile or fall back to the default profile resource size for everything
   * except for custom resources.
   * @param rpId (undocumented)
   * @param execResources (undocumented)
   * @param overheadFactor (undocumented)
   * @param conf (undocumented)
   * @param isPythonApp (undocumented)
   * @param resourceMappings (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.resource.ResourceProfile.ExecutorResourcesOrDefaults getResourcesForClusterManager (int rpId, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> execResources, double overheadFactor, org.apache.spark.SparkConf conf, boolean isPythonApp, scala.collection.immutable.Map<java.lang.String, java.lang.String> resourceMappings)  { throw new RuntimeException(); }
    java.lang.String PYSPARK_MEMORY_LOCAL_PROPERTY ()  { throw new RuntimeException(); }
    java.lang.String EXECUTOR_CORES_LOCAL_PROPERTY ()  { throw new RuntimeException(); }
}
