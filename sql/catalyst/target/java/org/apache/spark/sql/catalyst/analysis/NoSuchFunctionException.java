package org.apache.spark.sql.catalyst.analysis;
public  class NoSuchFunctionException extends org.apache.spark.sql.AnalysisException implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String message ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Throwable> cause ()  { throw new RuntimeException(); }
  // not preceding
  public   NoSuchFunctionException (java.lang.String message, scala.Option<java.lang.Throwable> cause)  { throw new RuntimeException(); }
  public   NoSuchFunctionException (java.lang.String db, java.lang.String func, scala.Option<java.lang.Throwable> cause)  { throw new RuntimeException(); }
  public   NoSuchFunctionException (org.apache.spark.sql.connector.catalog.Identifier identifier)  { throw new RuntimeException(); }
}
