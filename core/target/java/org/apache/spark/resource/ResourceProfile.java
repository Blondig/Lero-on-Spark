package org.apache.spark.resource;
/**
 * Resource profile to associate with an RDD. A ResourceProfile allows the user to
 * specify executor and task requirements for an RDD that will get applied during a
 * stage. This allows the user to change the resource requirements between stages.
 * This is meant to be immutable so user can't change it after building. Users
 * should use {@link ResourceProfileBuilder} to build it.
 * <p>
 * param:  executorResources Resource requests for executors. Mapped from the resource
 *                          name (e.g., cores, memory, CPU) to its specific request.
 * param:  taskResources Resource requests for tasks. Mapped from the resource
 *                      name (e.g., cores, memory, CPU) to its specific request.
 */
public  class ResourceProfile implements scala.Serializable, org.apache.spark.internal.Logging {
  static   class ExecutorResourcesOrDefaults implements scala.Product, scala.Serializable {
    public  int cores ()  { throw new RuntimeException(); }
    public  long executorMemoryMiB ()  { throw new RuntimeException(); }
    public  long memoryOffHeapMiB ()  { throw new RuntimeException(); }
    public  long pysparkMemoryMiB ()  { throw new RuntimeException(); }
    public  long memoryOverheadMiB ()  { throw new RuntimeException(); }
    public  long totalMemMiB ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> customResources ()  { throw new RuntimeException(); }
    // not preceding
    public   ExecutorResourcesOrDefaults (int cores, long executorMemoryMiB, long memoryOffHeapMiB, long pysparkMemoryMiB, long memoryOverheadMiB, long totalMemMiB, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> customResources)  { throw new RuntimeException(); }
  }
  static public  class ExecutorResourcesOrDefaults$ extends scala.runtime.AbstractFunction7<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest>, org.apache.spark.resource.ResourceProfile.ExecutorResourcesOrDefaults> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ExecutorResourcesOrDefaults$ MODULE$ = null;
    public   ExecutorResourcesOrDefaults$ ()  { throw new RuntimeException(); }
  }
  static   class DefaultProfileExecutorResources implements scala.Product, scala.Serializable {
    public  int cores ()  { throw new RuntimeException(); }
    public  long executorMemoryMiB ()  { throw new RuntimeException(); }
    public  long memoryOffHeapMiB ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> pysparkMemoryMiB ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> memoryOverheadMiB ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> customResources ()  { throw new RuntimeException(); }
    // not preceding
    public   DefaultProfileExecutorResources (int cores, long executorMemoryMiB, long memoryOffHeapMiB, scala.Option<java.lang.Object> pysparkMemoryMiB, scala.Option<java.lang.Object> memoryOverheadMiB, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> customResources)  { throw new RuntimeException(); }
  }
  static public  class DefaultProfileExecutorResources$ extends scala.runtime.AbstractFunction6<java.lang.Object, java.lang.Object, java.lang.Object, scala.Option<java.lang.Object>, scala.Option<java.lang.Object>, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest>, org.apache.spark.resource.ResourceProfile.DefaultProfileExecutorResources> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DefaultProfileExecutorResources$ MODULE$ = null;
    public   DefaultProfileExecutorResources$ ()  { throw new RuntimeException(); }
  }
  /**
   * built-in task resource: cpus
   * @return (undocumented)
   */
  static public  java.lang.String CPUS ()  { throw new RuntimeException(); }
  /**
   * built-in executor resource: cores
   * @return (undocumented)
   */
  static public  java.lang.String CORES ()  { throw new RuntimeException(); }
  /**
   * built-in executor resource: cores
   * @return (undocumented)
   */
  static public  java.lang.String MEMORY ()  { throw new RuntimeException(); }
  /**
   * built-in executor resource: offHeap
   * @return (undocumented)
   */
  static public  java.lang.String OFFHEAP_MEM ()  { throw new RuntimeException(); }
  /**
   * built-in executor resource: memoryOverhead
   * @return (undocumented)
   */
  static public  java.lang.String OVERHEAD_MEM ()  { throw new RuntimeException(); }
  /**
   * built-in executor resource: pyspark.memory
   * @return (undocumented)
   */
  static public  java.lang.String PYSPARK_MEM ()  { throw new RuntimeException(); }
  /**
   * Return all supported Spark built-in executor resources, custom resources like GPUs/FPGAs
   * are excluded.
   * @return (undocumented)
   */
  static public  java.lang.String[] allSupportedExecutorResources ()  { throw new RuntimeException(); }
  static public  int UNKNOWN_RESOURCE_PROFILE_ID ()  { throw new RuntimeException(); }
  static public  int DEFAULT_RESOURCE_PROFILE_ID ()  { throw new RuntimeException(); }
  static   long MEMORY_OVERHEAD_MIN_MIB ()  { throw new RuntimeException(); }
  static   int getNextProfileId ()  { throw new RuntimeException(); }
  static   org.apache.spark.resource.ResourceProfile getOrCreateDefaultProfile (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static   org.apache.spark.resource.ResourceProfile.DefaultProfileExecutorResources getDefaultProfileExecutorResources (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static   void reInitDefaultProfile (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static   void clearDefaultProfile ()  { throw new RuntimeException(); }
  static   scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.TaskResourceRequest> getCustomTaskResources (org.apache.spark.resource.ResourceProfile rp)  { throw new RuntimeException(); }
  static   scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> getCustomExecutorResources (org.apache.spark.resource.ResourceProfile rp)  { throw new RuntimeException(); }
  static   int getTaskCpusOrDefaultForProfile (org.apache.spark.resource.ResourceProfile rp, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Get offHeap memory size from {@link ExecutorResourceRequest}
   * return 0 if MEMORY_OFFHEAP_ENABLED is false.
   * @param sparkConf (undocumented)
   * @param execRequest (undocumented)
   * @return (undocumented)
   */
  static   long executorOffHeapMemorySizeAsMb (org.apache.spark.SparkConf sparkConf, org.apache.spark.resource.ExecutorResourceRequest execRequest)  { throw new RuntimeException(); }
  static   long calculateOverHeadMemory (scala.Option<java.lang.Object> overHeadMemFromConf, long executorMemoryMiB, double overheadFactor)  { throw new RuntimeException(); }
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
  static   org.apache.spark.resource.ResourceProfile.ExecutorResourcesOrDefaults getResourcesForClusterManager (int rpId, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> execResources, double overheadFactor, org.apache.spark.SparkConf conf, boolean isPythonApp, scala.collection.immutable.Map<java.lang.String, java.lang.String> resourceMappings)  { throw new RuntimeException(); }
  static   java.lang.String PYSPARK_MEMORY_LOCAL_PROPERTY ()  { throw new RuntimeException(); }
  static   java.lang.String EXECUTOR_CORES_LOCAL_PROPERTY ()  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> executorResources ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.TaskResourceRequest> taskResources ()  { throw new RuntimeException(); }
  // not preceding
  public   ResourceProfile (scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> executorResources, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.TaskResourceRequest> taskResources)  { throw new RuntimeException(); }
  /**
   * A unique id of this ResourceProfile
   * @return (undocumented)
   */
  public  int id ()  { throw new RuntimeException(); }
  /**
   * (Java-specific) gets a Java Map of resources to TaskResourceRequest
   * @return (undocumented)
   */
  public  java.util.Map<java.lang.String, org.apache.spark.resource.TaskResourceRequest> taskResourcesJMap ()  { throw new RuntimeException(); }
  /**
   * (Java-specific) gets a Java Map of resources to ExecutorResourceRequest
   * @return (undocumented)
   */
  public  java.util.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> executorResourcesJMap ()  { throw new RuntimeException(); }
    scala.Option<java.lang.Object> getExecutorCores ()  { throw new RuntimeException(); }
    scala.Option<java.lang.Object> getTaskCpus ()  { throw new RuntimeException(); }
    scala.Option<java.lang.Object> getPySparkMemory ()  { throw new RuntimeException(); }
    int getSchedulerTaskResourceAmount (java.lang.String resource)  { throw new RuntimeException(); }
    int getNumSlotsPerAddress (java.lang.String resource, org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
    int maxTasksPerExecutor (org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
    boolean isCoresLimitKnown ()  { throw new RuntimeException(); }
    java.lang.String limitingResource (org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
    void setResourceProfileId (int id)  { throw new RuntimeException(); }
    void setToDefaultProfile ()  { throw new RuntimeException(); }
  public  boolean equals (Object obj)  { throw new RuntimeException(); }
    boolean resourcesEqual (org.apache.spark.resource.ResourceProfile rp)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
