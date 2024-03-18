package org.apache.spark.deploy.yarn;
public  class CacheEntry implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.net.URI uri ()  { throw new RuntimeException(); }
  public  long size ()  { throw new RuntimeException(); }
  public  long modTime ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.api.records.LocalResourceVisibility visibility ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.api.records.LocalResourceType resType ()  { throw new RuntimeException(); }
  // not preceding
  public   CacheEntry (java.net.URI uri, long size, long modTime, org.apache.hadoop.yarn.api.records.LocalResourceVisibility visibility, org.apache.hadoop.yarn.api.records.LocalResourceType resType)  { throw new RuntimeException(); }
}
