package org.apache.spark;
/**
 * Configuration for a Spark application. Used to set various Spark parameters as key-value pairs.
 * <p>
 * Most of the time, you would create a SparkConf object with <code>new SparkConf()</code>, which will load
 * values from any <code>spark.*</code> Java system properties set in your application as well. In this case,
 * parameters you set directly on the <code>SparkConf</code> object take priority over system properties.
 * <p>
 * For unit tests, you can also call <code>new SparkConf(false)</code> to skip loading external settings and
 * get the same configuration no matter what the system properties are.
 * <p>
 * All setter methods in this class support chaining. For example, you can write
 * <code>new SparkConf().setMaster("local").setAppName("My app")</code>.
 * <p>
 * param:  loadDefaults whether to also load values from Java system properties
 * <p>
 * @note Once a SparkConf object is passed to Spark, it is cloned and can no longer be modified
 * by the user. Spark does not support modifying the configuration at runtime.
 */
public  class SparkConf implements scala.Cloneable, org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Return whether the given config should be passed to an executor on start-up.
   * <p>
   * Certain authentication configs are required from the executor when it connects to
   * the scheduler, while the rest of the spark configs can be inherited from the driver later.
   * @param name (undocumented)
   * @return (undocumented)
   */
  static public  boolean isExecutorStartupConf (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Return true if the given config matches either <code>spark.*.port</code> or <code>spark.port.*</code>.
   * @param name (undocumented)
   * @return (undocumented)
   */
  static public  boolean isSparkPortConf (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Looks for available deprecated keys for the given config option, and return the first
   * value available.
   * @param key (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<java.lang.String> getDeprecatedConfig (java.lang.String key, java.util.Map<java.lang.String, java.lang.String> conf)  { throw new RuntimeException(); }
  /**
   * Logs a warning message if the given config key is deprecated.
   * @param key (undocumented)
   */
  static public  void logDeprecationWarning (java.lang.String key)  { throw new RuntimeException(); }
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
  public   SparkConf (boolean loadDefaults)  { throw new RuntimeException(); }
  /** Create a SparkConf that loads defaults from system properties and the classpath */
  public   SparkConf ()  { throw new RuntimeException(); }
    org.apache.spark.SparkConf loadFromSystemProperties (boolean silent)  { throw new RuntimeException(); }
  /** Set a configuration variable. */
  public  org.apache.spark.SparkConf set (java.lang.String key, java.lang.String value)  { throw new RuntimeException(); }
    org.apache.spark.SparkConf set (java.lang.String key, java.lang.String value, boolean silent)  { throw new RuntimeException(); }
   <T extends java.lang.Object> org.apache.spark.SparkConf set (org.apache.spark.internal.config.ConfigEntry<T> entry, T value)  { throw new RuntimeException(); }
   <T extends java.lang.Object> org.apache.spark.SparkConf set (org.apache.spark.internal.config.OptionalConfigEntry<T> entry, T value)  { throw new RuntimeException(); }
  /**
   * The master URL to connect to, such as "local" to run locally with one thread, "local[4]" to
   * run locally with 4 cores, or "spark://master:7077" to run on a Spark standalone cluster.
   * @param master (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.SparkConf setMaster (java.lang.String master)  { throw new RuntimeException(); }
  /** Set a name for your application. Shown in the Spark web UI. */
  public  org.apache.spark.SparkConf setAppName (java.lang.String name)  { throw new RuntimeException(); }
  /** Set JAR files to distribute to the cluster. */
  public  org.apache.spark.SparkConf setJars (scala.collection.Seq<java.lang.String> jars)  { throw new RuntimeException(); }
  /** Set JAR files to distribute to the cluster. (Java-friendly version.) */
  public  org.apache.spark.SparkConf setJars (java.lang.String[] jars)  { throw new RuntimeException(); }
  /**
   * Set an environment variable to be used when launching executors for this application.
   * These variables are stored as properties of the form spark.executorEnv.VAR_NAME
   * (for example spark.executorEnv.PATH) but this method makes them easier to set.
   * @param variable (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.SparkConf setExecutorEnv (java.lang.String variable, java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Set multiple environment variables to be used when launching executors.
   * These variables are stored as properties of the form spark.executorEnv.VAR_NAME
   * (for example spark.executorEnv.PATH) but this method makes them easier to set.
   * @param variables (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.SparkConf setExecutorEnv (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> variables)  { throw new RuntimeException(); }
  /**
   * Set multiple environment variables to be used when launching executors.
   * (Java-friendly version.)
   * @param variables (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.SparkConf setExecutorEnv (scala.Tuple2<java.lang.String, java.lang.String>[] variables)  { throw new RuntimeException(); }
  /**
   * Set the location where Spark is installed on worker nodes.
   * @param home (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.SparkConf setSparkHome (java.lang.String home)  { throw new RuntimeException(); }
  /** Set multiple parameters together */
  public  org.apache.spark.SparkConf setAll (scala.collection.Iterable<scala.Tuple2<java.lang.String, java.lang.String>> settings)  { throw new RuntimeException(); }
  /** Set a parameter if it isn't already configured */
  public  org.apache.spark.SparkConf setIfMissing (java.lang.String key, java.lang.String value)  { throw new RuntimeException(); }
   <T extends java.lang.Object> org.apache.spark.SparkConf setIfMissing (org.apache.spark.internal.config.ConfigEntry<T> entry, T value)  { throw new RuntimeException(); }
   <T extends java.lang.Object> org.apache.spark.SparkConf setIfMissing (org.apache.spark.internal.config.OptionalConfigEntry<T> entry, T value)  { throw new RuntimeException(); }
  /**
   * Use Kryo serialization and register the given set of classes with Kryo.
   * If called multiple times, this will append the classes from all calls together.
   * @param classes (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.SparkConf registerKryoClasses (java.lang.Class<?>[] classes)  { throw new RuntimeException(); }
  /**
   * Use Kryo serialization and register the given set of Avro schemas so that the generic
   * record serializer can decrease network IO
   * @param schemas (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.SparkConf registerAvroSchemas (scala.collection.Seq<org.apache.avro.Schema> schemas)  { throw new RuntimeException(); }
  /** Gets all the avro schemas in the configuration used in the generic Avro record serializer */
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.String> getAvroSchema ()  { throw new RuntimeException(); }
  /** Remove a parameter from the configuration */
  public  org.apache.spark.SparkConf remove (java.lang.String key)  { throw new RuntimeException(); }
    org.apache.spark.SparkConf remove (org.apache.spark.internal.config.ConfigEntry<?> entry)  { throw new RuntimeException(); }
  /** Get a parameter; throws a NoSuchElementException if it's not set */
  public  java.lang.String get (java.lang.String key)  { throw new RuntimeException(); }
  /** Get a parameter, falling back to a default if not set */
  public  java.lang.String get (java.lang.String key, java.lang.String defaultValue)  { throw new RuntimeException(); }
  /**
   * Retrieves the value of a pre-defined configuration entry.
   * <p>
   * - This is an internal Spark API.
   * - The return type if defined by the configuration entry.
   * - This will throw an exception is the config is not optional and the value is not set.
   * @param entry (undocumented)
   * @return (undocumented)
   */
   <T extends java.lang.Object> T get (org.apache.spark.internal.config.ConfigEntry<T> entry)  { throw new RuntimeException(); }
  /**
   * Get a time parameter as seconds; throws a NoSuchElementException if it's not set. If no
   * suffix is provided then seconds are assumed.
   * @throws java.util.NoSuchElementException If the time parameter is not set
   * @throws NumberFormatException If the value cannot be interpreted as seconds
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  long getTimeAsSeconds (java.lang.String key)  { throw new RuntimeException(); }
  /**
   * Get a time parameter as seconds, falling back to a default if not set. If no
   * suffix is provided then seconds are assumed.
   * @throws NumberFormatException If the value cannot be interpreted as seconds
   * @param key (undocumented)
   * @param defaultValue (undocumented)
   * @return (undocumented)
   */
  public  long getTimeAsSeconds (java.lang.String key, java.lang.String defaultValue)  { throw new RuntimeException(); }
  /**
   * Get a time parameter as milliseconds; throws a NoSuchElementException if it's not set. If no
   * suffix is provided then milliseconds are assumed.
   * @throws java.util.NoSuchElementException If the time parameter is not set
   * @throws NumberFormatException If the value cannot be interpreted as milliseconds
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  long getTimeAsMs (java.lang.String key)  { throw new RuntimeException(); }
  /**
   * Get a time parameter as milliseconds, falling back to a default if not set. If no
   * suffix is provided then milliseconds are assumed.
   * @throws NumberFormatException If the value cannot be interpreted as milliseconds
   * @param key (undocumented)
   * @param defaultValue (undocumented)
   * @return (undocumented)
   */
  public  long getTimeAsMs (java.lang.String key, java.lang.String defaultValue)  { throw new RuntimeException(); }
  /**
   * Get a size parameter as bytes; throws a NoSuchElementException if it's not set. If no
   * suffix is provided then bytes are assumed.
   * @throws java.util.NoSuchElementException If the size parameter is not set
   * @throws NumberFormatException If the value cannot be interpreted as bytes
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  long getSizeAsBytes (java.lang.String key)  { throw new RuntimeException(); }
  /**
   * Get a size parameter as bytes, falling back to a default if not set. If no
   * suffix is provided then bytes are assumed.
   * @throws NumberFormatException If the value cannot be interpreted as bytes
   * @param key (undocumented)
   * @param defaultValue (undocumented)
   * @return (undocumented)
   */
  public  long getSizeAsBytes (java.lang.String key, java.lang.String defaultValue)  { throw new RuntimeException(); }
  /**
   * Get a size parameter as bytes, falling back to a default if not set.
   * @throws NumberFormatException If the value cannot be interpreted as bytes
   * @param key (undocumented)
   * @param defaultValue (undocumented)
   * @return (undocumented)
   */
  public  long getSizeAsBytes (java.lang.String key, long defaultValue)  { throw new RuntimeException(); }
  /**
   * Get a size parameter as Kibibytes; throws a NoSuchElementException if it's not set. If no
   * suffix is provided then Kibibytes are assumed.
   * @throws java.util.NoSuchElementException If the size parameter is not set
   * @throws NumberFormatException If the value cannot be interpreted as Kibibytes
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  long getSizeAsKb (java.lang.String key)  { throw new RuntimeException(); }
  /**
   * Get a size parameter as Kibibytes, falling back to a default if not set. If no
   * suffix is provided then Kibibytes are assumed.
   * @throws NumberFormatException If the value cannot be interpreted as Kibibytes
   * @param key (undocumented)
   * @param defaultValue (undocumented)
   * @return (undocumented)
   */
  public  long getSizeAsKb (java.lang.String key, java.lang.String defaultValue)  { throw new RuntimeException(); }
  /**
   * Get a size parameter as Mebibytes; throws a NoSuchElementException if it's not set. If no
   * suffix is provided then Mebibytes are assumed.
   * @throws java.util.NoSuchElementException If the size parameter is not set
   * @throws NumberFormatException If the value cannot be interpreted as Mebibytes
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  long getSizeAsMb (java.lang.String key)  { throw new RuntimeException(); }
  /**
   * Get a size parameter as Mebibytes, falling back to a default if not set. If no
   * suffix is provided then Mebibytes are assumed.
   * @throws NumberFormatException If the value cannot be interpreted as Mebibytes
   * @param key (undocumented)
   * @param defaultValue (undocumented)
   * @return (undocumented)
   */
  public  long getSizeAsMb (java.lang.String key, java.lang.String defaultValue)  { throw new RuntimeException(); }
  /**
   * Get a size parameter as Gibibytes; throws a NoSuchElementException if it's not set. If no
   * suffix is provided then Gibibytes are assumed.
   * @throws java.util.NoSuchElementException If the size parameter is not set
   * @throws NumberFormatException If the value cannot be interpreted as Gibibytes
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  long getSizeAsGb (java.lang.String key)  { throw new RuntimeException(); }
  /**
   * Get a size parameter as Gibibytes, falling back to a default if not set. If no
   * suffix is provided then Gibibytes are assumed.
   * @throws NumberFormatException If the value cannot be interpreted as Gibibytes
   * @param key (undocumented)
   * @param defaultValue (undocumented)
   * @return (undocumented)
   */
  public  long getSizeAsGb (java.lang.String key, java.lang.String defaultValue)  { throw new RuntimeException(); }
  /** Get a parameter as an Option */
  public  scala.Option<java.lang.String> getOption (java.lang.String key)  { throw new RuntimeException(); }
  /** Get an optional value, applying variable substitution. */
    scala.Option<java.lang.String> getWithSubstitution (java.lang.String key)  { throw new RuntimeException(); }
  /** Get all parameters as a list of pairs */
  public  scala.Tuple2<java.lang.String, java.lang.String>[] getAll ()  { throw new RuntimeException(); }
  /**
   * Get all parameters that start with <code>prefix</code>
   * @param prefix (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple2<java.lang.String, java.lang.String>[] getAllWithPrefix (java.lang.String prefix)  { throw new RuntimeException(); }
  /**
   * Get a parameter as an integer, falling back to a default if not set
   * @throws NumberFormatException If the value cannot be interpreted as an integer
   * @param key (undocumented)
   * @param defaultValue (undocumented)
   * @return (undocumented)
   */
  public  int getInt (java.lang.String key, int defaultValue)  { throw new RuntimeException(); }
  /**
   * Get a parameter as a long, falling back to a default if not set
   * @throws NumberFormatException If the value cannot be interpreted as a long
   * @param key (undocumented)
   * @param defaultValue (undocumented)
   * @return (undocumented)
   */
  public  long getLong (java.lang.String key, long defaultValue)  { throw new RuntimeException(); }
  /**
   * Get a parameter as a double, falling back to a default if not ste
   * @throws NumberFormatException If the value cannot be interpreted as a double
   * @param key (undocumented)
   * @param defaultValue (undocumented)
   * @return (undocumented)
   */
  public  double getDouble (java.lang.String key, double defaultValue)  { throw new RuntimeException(); }
  /**
   * Get a parameter as a boolean, falling back to a default if not set
   * @throws IllegalArgumentException If the value cannot be interpreted as a boolean
   * @param key (undocumented)
   * @param defaultValue (undocumented)
   * @return (undocumented)
   */
  public  boolean getBoolean (java.lang.String key, boolean defaultValue)  { throw new RuntimeException(); }
  /** Get all executor environment variables set on this SparkConf */
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> getExecutorEnv ()  { throw new RuntimeException(); }
  /**
   * Returns the Spark application id, valid in the Driver after TaskScheduler registration and
   * from the start in the Executor.
   * @return (undocumented)
   */
  public  java.lang.String getAppId ()  { throw new RuntimeException(); }
  /** Does the configuration contain a given parameter? */
  public  boolean contains (java.lang.String key)  { throw new RuntimeException(); }
    boolean contains (org.apache.spark.internal.config.ConfigEntry<?> entry)  { throw new RuntimeException(); }
  /** Copy this object */
  public  org.apache.spark.SparkConf clone ()  { throw new RuntimeException(); }
  /**
   * By using this instead of System.getenv(), environment variables can be mocked
   * in unit tests.
   * @param name (undocumented)
   * @return (undocumented)
   */
    java.lang.String getenv (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Checks for illegal or deprecated config settings. Throws an exception for the former. Not
   * idempotent - may mutate this conf object to convert deprecated settings to supported ones.
   */
    void validateSettings ()  { throw new RuntimeException(); }
  /**
   * Return a string listing all keys and values, one per line. This is useful to print the
   * configuration out for debugging.
   * @return (undocumented)
   */
  public  java.lang.String toDebugString ()  { throw new RuntimeException(); }
}
