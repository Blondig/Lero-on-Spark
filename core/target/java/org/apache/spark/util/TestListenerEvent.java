package org.apache.spark.util;
public  class TestListenerEvent implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String foo ()  { throw new RuntimeException(); }
  public  int bar ()  { throw new RuntimeException(); }
  // not preceding
  public   TestListenerEvent (java.lang.String foo, int bar)  { throw new RuntimeException(); }
}
