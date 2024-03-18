package org.apache.spark.serializer;
public  class Foo implements java.io.Serializable {
  // not preceding
  public   Foo (int a, java.lang.String b, char c, byte d, int[] e, java.lang.Object[] f, org.apache.spark.serializer.Foo g)  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.Foo g ()  { throw new RuntimeException(); }
}
