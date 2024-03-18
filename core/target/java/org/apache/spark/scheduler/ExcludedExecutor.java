package org.apache.spark.scheduler;
public final class ExcludedExecutor implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String node ()  { throw new RuntimeException(); }
  public  long expiryTime ()  { throw new RuntimeException(); }
  // not preceding
  public   ExcludedExecutor (java.lang.String node, long expiryTime)  { throw new RuntimeException(); }
}
