package org.apache.spark;
public  class SparkConf$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkConf$ MODULE$ = null;
  public   SparkConf$ ()  { throw new RuntimeException(); }
  /**
   * Return whether the given config should be passed to an executor on start-up.
   * <p>
   * Certain authentication configs are required from the executor when it connects to
   * the scheduler, while the rest of the spark configs can be inherited from the driver later.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  boolean isExecutorStartupConf (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Return true if the given config matches either <code>spark.*.port</code> or <code>spark.port.*</code>.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  boolean isSparkPortConf (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Looks for available deprecated keys for the given config option, and return the first
   * value available.
   * @param key (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> getDeprecatedConfig (java.lang.String key, java.util.Map<java.lang.String, java.lang.String> conf)  { throw new RuntimeException(); }
  /**
   * Logs a warning message if the given config key is deprecated.
   * @param key (undocumented)
   */
  public  void logDeprecationWarning (java.lang.String key)  { throw new RuntimeException(); }
}
