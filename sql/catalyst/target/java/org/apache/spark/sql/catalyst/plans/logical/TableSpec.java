package org.apache.spark.sql.catalyst.plans.logical;
public  class TableSpec implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> properties ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> provider ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> options ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> location ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> comment ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.SerdeInfo> serde ()  { throw new RuntimeException(); }
  public  boolean external ()  { throw new RuntimeException(); }
  // not preceding
  public   TableSpec (scala.collection.immutable.Map<java.lang.String, java.lang.String> properties, scala.Option<java.lang.String> provider, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, scala.Option<java.lang.String> location, scala.Option<java.lang.String> comment, scala.Option<org.apache.spark.sql.catalyst.plans.logical.SerdeInfo> serde, boolean external)  { throw new RuntimeException(); }
}
