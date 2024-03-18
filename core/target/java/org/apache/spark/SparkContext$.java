package org.apache.spark;
/**
 * The SparkContext object contains a number of implicit conversions and parameters for use with
 * various Spark features.
 */
public  class SparkContext$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkContext$ MODULE$ = null;
  public   SparkContext$ ()  { throw new RuntimeException(); }
  /**
   * This function may be used to get or instantiate a SparkContext and register it as a
   * singleton object. Because we can only have one active SparkContext per JVM,
   * this is useful when applications may wish to share a SparkContext.
   * <p>
   * @param config <code>SparkConfig</code> that will be used for initialisation of the <code>SparkContext</code>
   * @return current <code>SparkContext</code> (or a new one if it wasn't created before the function call)
   */
  public  org.apache.spark.SparkContext getOrCreate (org.apache.spark.SparkConf config)  { throw new RuntimeException(); }
  /**
   * This function may be used to get or instantiate a SparkContext and register it as a
   * singleton object. Because we can only have one active SparkContext per JVM,
   * this is useful when applications may wish to share a SparkContext.
   * <p>
   * This method allows not passing a SparkConf (useful if just retrieving).
   * <p>
   * @return current <code>SparkContext</code> (or a new one if wasn't created before the function call)
   */
  public  org.apache.spark.SparkContext getOrCreate ()  { throw new RuntimeException(); }
  /** Return the current active {@link SparkContext} if any. */
    scala.Option<org.apache.spark.SparkContext> getActive ()  { throw new RuntimeException(); }
  /**
   * Called at the beginning of the SparkContext constructor to ensure that no SparkContext is
   * running. Throws an exception if a running context is detected and logs a warning if another
   * thread is constructing a SparkContext. This warning is necessary because the current locking
   * scheme prevents us from reliably distinguishing between cases where another context is being
   * constructed and cases where another constructor threw an exception.
   * @param sc (undocumented)
   */
    void markPartiallyConstructed (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /**
   * Called at the end of the SparkContext constructor to ensure that no other SparkContext has
   * raced with this constructor and started.
   * @param sc (undocumented)
   */
    void setActiveContext (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /**
   * Clears the active SparkContext metadata. This is called by <code>SparkContext#stop()</code>. It's
   * also called in unit tests to prevent a flood of warnings from test suites that don't / can't
   * properly clean up their SparkContexts.
   */
    void clearActiveContext ()  { throw new RuntimeException(); }
    java.lang.String SPARK_JOB_DESCRIPTION ()  { throw new RuntimeException(); }
    java.lang.String SPARK_JOB_GROUP_ID ()  { throw new RuntimeException(); }
    java.lang.String SPARK_JOB_INTERRUPT_ON_CANCEL ()  { throw new RuntimeException(); }
    java.lang.String SPARK_SCHEDULER_POOL ()  { throw new RuntimeException(); }
    java.lang.String RDD_SCOPE_KEY ()  { throw new RuntimeException(); }
    java.lang.String RDD_SCOPE_NO_OVERRIDE_KEY ()  { throw new RuntimeException(); }
  /**
   * Executor id for the driver.  In earlier versions of Spark, this was <code><driver></code>, but this was
   * changed to <code>driver</code> because the angle brackets caused escaping issues in URLs and XML (see
   * SPARK-6716 for more details).
   * @return (undocumented)
   */
    java.lang.String DRIVER_IDENTIFIER ()  { throw new RuntimeException(); }
  /**
   * Find the JAR from which a given class was loaded, to make it easy for users to pass
   * their JARs to SparkContext.
   * <p>
   * @param cls class that should be inside of the jar
   * @return jar that contains the Class, <code>None</code> if not found
   */
  public  scala.Option<java.lang.String> jarOfClass (java.lang.Class<?> cls)  { throw new RuntimeException(); }
  /**
   * Find the JAR that contains the class of a particular object, to make it easy for users
   * to pass their JARs to SparkContext. In most cases you can call jarOfObject(this) in
   * your driver program.
   * <p>
   * @param obj reference to an instance which class should be inside of the jar
   * @return jar that contains the class of the instance, <code>None</code> if not found
   */
  public  scala.Option<java.lang.String> jarOfObject (java.lang.Object obj)  { throw new RuntimeException(); }
  /**
   * Creates a modified version of a SparkConf with the parameters that can be passed separately
   * to SparkContext, to make it easier to write SparkContext's constructors. This ignores
   * parameters that are passed as the default value of null, instead of throwing an exception
   * like SparkConf would.
   * @param conf (undocumented)
   * @param master (undocumented)
   * @param appName (undocumented)
   * @param sparkHome (undocumented)
   * @param jars (undocumented)
   * @param environment (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.SparkConf updatedConf (org.apache.spark.SparkConf conf, java.lang.String master, java.lang.String appName, java.lang.String sparkHome, scala.collection.Seq<java.lang.String> jars, scala.collection.Map<java.lang.String, java.lang.String> environment)  { throw new RuntimeException(); }
  /**
   * The number of cores available to the driver to use for tasks such as I/O with Netty
   * @param master (undocumented)
   * @return (undocumented)
   */
    int numDriverCores (java.lang.String master)  { throw new RuntimeException(); }
  /**
   * The number of cores available to the driver to use for tasks such as I/O with Netty
   * @param master (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
    int numDriverCores (java.lang.String master, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
}
