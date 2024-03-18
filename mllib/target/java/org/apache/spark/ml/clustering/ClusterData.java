package org.apache.spark.ml.clustering;
/** Helper class for storing model data */
public  class ClusterData implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int clusterIdx ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector clusterCenter ()  { throw new RuntimeException(); }
  // not preceding
  public   ClusterData (int clusterIdx, org.apache.spark.ml.linalg.Vector clusterCenter)  { throw new RuntimeException(); }
}
