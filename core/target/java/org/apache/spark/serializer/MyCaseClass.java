package org.apache.spark.serializer;
public  class MyCaseClass implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int foo ()  { throw new RuntimeException(); }
  public  java.lang.String bar ()  { throw new RuntimeException(); }
  // not preceding
  public   MyCaseClass (int foo, java.lang.String bar)  { throw new RuntimeException(); }
}
