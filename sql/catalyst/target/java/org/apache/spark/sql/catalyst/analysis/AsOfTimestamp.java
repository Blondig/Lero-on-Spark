package org.apache.spark.sql.catalyst.analysis;
public  class AsOfTimestamp implements org.apache.spark.sql.catalyst.analysis.TimeTravelSpec, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long timestamp ()  { throw new RuntimeException(); }
  // not preceding
  public   AsOfTimestamp (long timestamp)  { throw new RuntimeException(); }
}
