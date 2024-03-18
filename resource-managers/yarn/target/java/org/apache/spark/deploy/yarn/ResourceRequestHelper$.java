package org.apache.spark.deploy.yarn;
/**
 * This helper class uses some of Hadoop 3 methods from the YARN API,
 * so we need to use reflection to avoid compile error when building against Hadoop 2.x
 */
public  class ResourceRequestHelper$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ResourceRequestHelper$ MODULE$ = null;
  public   ResourceRequestHelper$ ()  { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.String, java.lang.String> getYarnResourcesAndAmounts (org.apache.spark.SparkConf sparkConf, java.lang.String componentName)  { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.String, java.lang.String> getResourceNameMapping (org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
  /**
   * Convert Spark resources into YARN resources.
   * The only resources we know how to map from spark configs to yarn configs are
   * gpus and fpgas, everything else the user has to specify them in both the
   * spark.yarn.*.resource and the spark.*.resource configs.
   * @param confPrefix (undocumented)
   * @param sparkConf (undocumented)
   * @return (undocumented)
   */
    scala.collection.immutable.Map<java.lang.String, java.lang.String> getYarnResourcesFromSparkResources (java.lang.String confPrefix, org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
  /**
   * Validates sparkConf and throws a SparkException if any of standard resources (memory or cores)
   * is defined with the property spark.yarn.x.resource.y
   * Need to reject all combinations of AM / Driver / Executor and memory / CPU cores resources, as
   * Spark has its own names for them (memory, cores),
   * but YARN have its names too: (memory, memory-mb, mb) and (cores, vcores, cpu-vcores).
   * We need to disable every possible way YARN could receive the resource definitions above.
   * @param sparkConf (undocumented)
   */
  public  void validateResources (org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
  /**
   * Sets resource amount with the corresponding unit to the passed resource object.
   * @param resources resource values to set
   * @param resource resource object to update
   */
  public  void setResourceRequests (scala.collection.immutable.Map<java.lang.String, java.lang.String> resources, org.apache.hadoop.yarn.api.records.Resource resource)  { throw new RuntimeException(); }
  public  boolean isYarnCustomResourcesNonEmpty (org.apache.hadoop.yarn.api.records.Resource resource)  { throw new RuntimeException(); }
  /**
   * Checks whether Hadoop 2.x or 3 is used as a dependency.
   * In case of Hadoop 3 and later, the ResourceInformation class
   * should be available on the classpath.
   * @return (undocumented)
   */
  public  boolean isYarnResourceTypesAvailable ()  { throw new RuntimeException(); }
}
