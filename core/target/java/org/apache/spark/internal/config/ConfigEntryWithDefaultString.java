package org.apache.spark.internal.config;
public  class ConfigEntryWithDefaultString<T extends java.lang.Object> extends org.apache.spark.internal.config.ConfigEntry<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ConfigEntryWithDefaultString (java.lang.String key, scala.Option<java.lang.String> prependedKey, java.lang.String prependSeparator, scala.collection.immutable.List<java.lang.String> alternatives, java.lang.String _defaultValue, scala.Function1<java.lang.String, T> valueConverter, scala.Function1<T, java.lang.String> stringConverter, java.lang.String doc, boolean isPublic, java.lang.String version)  { throw new RuntimeException(); }
  public  scala.Option<T> defaultValue ()  { throw new RuntimeException(); }
  public  java.lang.String defaultValueString ()  { throw new RuntimeException(); }
  public  T readFrom (org.apache.spark.internal.config.ConfigReader reader)  { throw new RuntimeException(); }
}
