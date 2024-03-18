package org.apache.spark.deploy.yarn;
/**
 * This helper class uses some of Hadoop 3 methods from the YARN API,
 * so we need to use reflection to avoid compile error when building against Hadoop 2.x
 */
public  class ResourceRequestHelper {
  static   scala.collection.immutable.Map<java.lang.String, java.lang.String> getYarnResourcesAndAmounts (org.apache.spark.SparkConf sparkConf, java.lang.String componentName)  { throw new RuntimeException(); }
  static   scala.collection.immutable.Map<java.lang.String, java.lang.String> getResourceNameMapping (org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
  /**
   * Convert Spark resources into YARN resources.
   * The only resources we know how to map from spark configs to yarn configs are
   * gpus and fpgas, everything else the user has to specify them in both the
   * spark.yarn.*.resource and the spark.*.resource configs.
   * @param confPrefix (undocumented)
   * @param sparkConf (undocumented)
   * @return (undocumented)
   */
  static   scala.collection.immutable.Map<java.lang.String, java.lang.String> getYarnResourcesFromSparkResources (java.lang.String confPrefix, org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
  /**
   * Validates sparkConf and throws a SparkException if any of standard resources (memory or cores)
   * is defined with the property spark.yarn.x.resource.y
   * Need to reject all combinations of AM / Driver / Executor and memory / CPU cores resources, as
   * Spark has its own names for them (memory, cores),
   * but YARN have its names too: (memory, memory-mb, mb) and (cores, vcores, cpu-vcores).
   * We need to disable every possible way YARN could receive the resource definitions above.
   * @param sparkConf (undocumented)
   */
  static public  void validateResources (org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
  /**
   * Sets resource amount with the corresponding unit to the passed resource object.
   * @param resources resource values to set
   * @param resource resource object to update
   */
  static public  void setResourceRequests (scala.collection.immutable.Map<java.lang.String, java.lang.String> resources, org.apache.hadoop.yarn.api.records.Resource resource)  { throw new RuntimeException(); }
  static public  boolean isYarnCustomResourcesNonEmpty (org.apache.hadoop.yarn.api.records.Resource resource)  { throw new RuntimeException(); }
  /**
   * Checks whether Hadoop 2.x or 3 is used as a dependency.
   * In case of Hadoop 3 and later, the ResourceInformation class
   * should be available on the classpath.
   * @return (undocumented)
   */
  static public  boolean isYarnResourceTypesAvailable ()  { throw new RuntimeException(); }
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
}
