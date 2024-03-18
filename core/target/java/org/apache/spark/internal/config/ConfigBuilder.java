package org.apache.spark.internal.config;
/**
 * Basic builder for Spark configurations. Provides methods for creating type-specific builders.
 * <p>
 * @see TypedConfigBuilder
 */
  class ConfigBuilder implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String key ()  { throw new RuntimeException(); }
  // not preceding
  public   ConfigBuilder (java.lang.String key)  { throw new RuntimeException(); }
    scala.Option<java.lang.String> _prependedKey ()  { throw new RuntimeException(); }
    java.lang.String _prependSeparator ()  { throw new RuntimeException(); }
    boolean _public ()  { throw new RuntimeException(); }
    java.lang.String _doc ()  { throw new RuntimeException(); }
    java.lang.String _version ()  { throw new RuntimeException(); }
    scala.Option<scala.Function1<org.apache.spark.internal.config.ConfigEntry<?>, scala.runtime.BoxedUnit>> _onCreate ()  { throw new RuntimeException(); }
    scala.collection.immutable.List<java.lang.String> _alternatives ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigBuilder internal ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigBuilder doc (java.lang.String s)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigBuilder version (java.lang.String v)  { throw new RuntimeException(); }
  /**
   * Registers a callback for when the config entry is finally instantiated. Currently used by
   * SQLConf to keep track of SQL configuration entries.
   * @param callback (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.internal.config.ConfigBuilder onCreate (scala.Function1<org.apache.spark.internal.config.ConfigEntry<?>, scala.runtime.BoxedUnit> callback)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigBuilder withPrepended (java.lang.String key, java.lang.String separator)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigBuilder withAlternative (java.lang.String key)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.TypedConfigBuilder<java.lang.Object> intConf ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.TypedConfigBuilder<java.lang.Object> longConf ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.TypedConfigBuilder<java.lang.Object> doubleConf ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.TypedConfigBuilder<java.lang.Object> booleanConf ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.TypedConfigBuilder<java.lang.String> stringConf ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.TypedConfigBuilder<java.lang.Object> timeConf (java.util.concurrent.TimeUnit unit)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.TypedConfigBuilder<java.lang.Object> bytesConf (org.apache.spark.network.util.ByteUnit unit)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.internal.config.ConfigEntry<T> fallbackConf (org.apache.spark.internal.config.ConfigEntry<T> fallback)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.TypedConfigBuilder<scala.util.matching.Regex> regexConf ()  { throw new RuntimeException(); }
}
