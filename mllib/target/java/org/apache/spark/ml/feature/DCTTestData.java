package org.apache.spark.ml.feature;
public  class DCTTestData implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector vec ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector wantedVec ()  { throw new RuntimeException(); }
  // not preceding
  public   DCTTestData (org.apache.spark.ml.linalg.Vector vec, org.apache.spark.ml.linalg.Vector wantedVec)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector getVec ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector getWantedVec ()  { throw new RuntimeException(); }
}
