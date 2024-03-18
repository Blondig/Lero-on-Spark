package org.apache.spark.sql.catalyst.analysis;
public  class AsOfVersion implements org.apache.spark.sql.catalyst.analysis.TimeTravelSpec, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String version ()  { throw new RuntimeException(); }
  // not preceding
  public   AsOfVersion (java.lang.String version)  { throw new RuntimeException(); }
}
