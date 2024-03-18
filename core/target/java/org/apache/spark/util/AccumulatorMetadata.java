package org.apache.spark.util;
  class AccumulatorMetadata implements scala.Serializable, scala.Product {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long id ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> name ()  { throw new RuntimeException(); }
  public  boolean countFailedValues ()  { throw new RuntimeException(); }
  // not preceding
  public   AccumulatorMetadata (long id, scala.Option<java.lang.String> name, boolean countFailedValues)  { throw new RuntimeException(); }
}
