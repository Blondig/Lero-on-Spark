package org.apache.spark.deploy;
/**
 * Provides an indirection layer for passing arguments as system properties or flags to
 * the user's driver program or to downstream launcher tools.
 */
public  class OptionAssigner implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String value ()  { throw new RuntimeException(); }
  public  int clusterManager ()  { throw new RuntimeException(); }
  public  int deployMode ()  { throw new RuntimeException(); }
  public  java.lang.String clOption ()  { throw new RuntimeException(); }
  public  java.lang.String confKey ()  { throw new RuntimeException(); }
  public  scala.Option<scala.Function2<java.lang.String, java.lang.String, java.lang.String>> mergeFn ()  { throw new RuntimeException(); }
  // not preceding
  public   OptionAssigner (java.lang.String value, int clusterManager, int deployMode, java.lang.String clOption, java.lang.String confKey, scala.Option<scala.Function2<java.lang.String, java.lang.String, java.lang.String>> mergeFn)  { throw new RuntimeException(); }
}
