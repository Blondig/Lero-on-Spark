package org.apache.spark.sql.execution.datasources.v2;
public  class TableSampleInfo implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  double lowerBound ()  { throw new RuntimeException(); }
  public  double upperBound ()  { throw new RuntimeException(); }
  public  boolean withReplacement ()  { throw new RuntimeException(); }
  public  long seed ()  { throw new RuntimeException(); }
  // not preceding
  public   TableSampleInfo (double lowerBound, double upperBound, boolean withReplacement, long seed)  { throw new RuntimeException(); }
}
