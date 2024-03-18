package org.apache.spark;
public  class CleanRDD implements org.apache.spark.CleanupTask, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int rddId ()  { throw new RuntimeException(); }
  // not preceding
  public   CleanRDD (int rddId)  { throw new RuntimeException(); }
}
