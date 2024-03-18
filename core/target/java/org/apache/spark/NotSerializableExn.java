package org.apache.spark;
public  class NotSerializableExn extends java.lang.Throwable {
  // not preceding
  public   NotSerializableExn (org.apache.spark.NotSerializableClass notSer)  { throw new RuntimeException(); }
  public  org.apache.spark.NotSerializableClass notSer ()  { throw new RuntimeException(); }
}
