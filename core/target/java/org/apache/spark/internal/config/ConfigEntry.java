package org.apache.spark.internal.config;
/**
 * An entry contains all meta information for a configuration.
 * <p>
 * When applying variable substitution to config values, only references starting with "spark." are
 * considered in the default namespace. For known Spark configuration keys (i.e. those created using
 * <code>ConfigBuilder</code>), references will also consider the default value when it exists.
 * <p>
 * Variable expansion is also applied to the default values of config entries that have a default
 * value declared as a string.
 * <p>
 * param:  key the key for the configuration
 * param:  prependedKey the key for the configuration which will be prepended
 * param:  prependSeparator the separator which is used for prepending
 * param:  valueConverter how to convert a string to the value. It should throw an exception if the
 *                       string does not have the required format.
 * param:  stringConverter how to convert a value to a string that the user can use it as a valid
 *                        string value. It's usually <code>toString</code>. But sometimes, a custom converter
 *                        is necessary. E.g., if T is List[String], <code>a, b, c</code> is better than
 *                        <code>List(a, b, c)</code>.
 * param:  doc the documentation for the configuration
 * param:  isPublic if this configuration is public to the user. If it's <code>false</code>, this
 *                 configuration is only used internally and we should not expose it to users.
 * param:  version the spark version when the configuration was released.
 * @param <T>  the value type
 */
 abstract class ConfigEntry<T extends java.lang.Object> {
  static public  java.lang.String UNDEFINED ()  { throw new RuntimeException(); }
  static   java.util.concurrent.ConcurrentHashMap<java.lang.String, org.apache.spark.internal.config.ConfigEntry<?>> knownConfigs ()  { throw new RuntimeException(); }
  static public  void registerEntry (org.apache.spark.internal.config.ConfigEntry<?> entry)  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<?> findEntry (java.lang.String key)  { throw new RuntimeException(); }
  public  java.lang.String key ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> prependedKey ()  { throw new RuntimeException(); }
  public  java.lang.String prependSeparator ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<java.lang.String> alternatives ()  { throw new RuntimeException(); }
  public  scala.Function1<java.lang.String, T> valueConverter ()  { throw new RuntimeException(); }
  public  scala.Function1<T, java.lang.String> stringConverter ()  { throw new RuntimeException(); }
  public  java.lang.String doc ()  { throw new RuntimeException(); }
  public  boolean isPublic ()  { throw new RuntimeException(); }
  public  java.lang.String version ()  { throw new RuntimeException(); }
  // not preceding
  public   ConfigEntry (java.lang.String key, scala.Option<java.lang.String> prependedKey, java.lang.String prependSeparator, scala.collection.immutable.List<java.lang.String> alternatives, scala.Function1<java.lang.String, T> valueConverter, scala.Function1<T, java.lang.String> stringConverter, java.lang.String doc, boolean isPublic, java.lang.String version)  { throw new RuntimeException(); }
  public abstract  java.lang.String defaultValueString ()  ;
  protected  scala.Option<java.lang.String> readString (org.apache.spark.internal.config.ConfigReader reader)  { throw new RuntimeException(); }
  public abstract  T readFrom (org.apache.spark.internal.config.ConfigReader reader)  ;
  public  scala.Option<T> defaultValue ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
