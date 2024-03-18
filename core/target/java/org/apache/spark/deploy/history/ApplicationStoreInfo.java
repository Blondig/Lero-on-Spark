package org.apache.spark.deploy.history;
public  class ApplicationStoreInfo implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String path ()  { throw new RuntimeException(); }
  public  long lastAccess ()  { throw new RuntimeException(); }
  public  java.lang.String appId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> attemptId ()  { throw new RuntimeException(); }
  public  long size ()  { throw new RuntimeException(); }
  // not preceding
  public   ApplicationStoreInfo (java.lang.String path, long lastAccess, java.lang.String appId, scala.Option<java.lang.String> attemptId, long size)  { throw new RuntimeException(); }
}
