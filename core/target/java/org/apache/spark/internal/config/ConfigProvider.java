package org.apache.spark.internal.config;
/**
 * A source of configuration values.
 */
public  interface ConfigProvider {
  public  scala.Option<java.lang.String> get (java.lang.String key)  ;
}
