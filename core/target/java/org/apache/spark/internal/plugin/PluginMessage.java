package org.apache.spark.internal.plugin;
public  class PluginMessage implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String pluginName ()  { throw new RuntimeException(); }
  public  java.lang.Object message ()  { throw new RuntimeException(); }
  // not preceding
  public   PluginMessage (java.lang.String pluginName, java.lang.Object message)  { throw new RuntimeException(); }
}
