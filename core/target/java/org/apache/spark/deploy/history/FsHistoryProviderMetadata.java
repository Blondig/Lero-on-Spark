package org.apache.spark.deploy.history;
  class FsHistoryProviderMetadata implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long version ()  { throw new RuntimeException(); }
  public  long uiVersion ()  { throw new RuntimeException(); }
  public  java.lang.String logDir ()  { throw new RuntimeException(); }
  // not preceding
  public   FsHistoryProviderMetadata (long version, long uiVersion, java.lang.String logDir)  { throw new RuntimeException(); }
}
