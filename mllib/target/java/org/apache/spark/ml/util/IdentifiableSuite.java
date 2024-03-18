package org.apache.spark.ml.util;
public  class IdentifiableSuite extends org.apache.spark.SparkFunSuite {
  static public  class Test implements org.apache.spark.ml.util.Identifiable {
    // not preceding
    public   Test (java.lang.String uid)  { throw new RuntimeException(); }
    public   Test ()  { throw new RuntimeException(); }
    public  java.lang.String uid ()  { throw new RuntimeException(); }
  }
  public   IdentifiableSuite ()  { throw new RuntimeException(); }
}
