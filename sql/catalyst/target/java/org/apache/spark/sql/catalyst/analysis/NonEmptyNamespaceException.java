package org.apache.spark.sql.catalyst.analysis;
/**
 * Thrown by a catalog when an item already exists. The analyzer will rethrow the exception
 * as an {@link org.apache.spark.sql.AnalysisException} with the correct position information.
 */
public  class NonEmptyNamespaceException extends org.apache.spark.sql.AnalysisException implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String message ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Throwable> cause ()  { throw new RuntimeException(); }
  // not preceding
  public   NonEmptyNamespaceException (java.lang.String message, scala.Option<java.lang.Throwable> cause)  { throw new RuntimeException(); }
  public   NonEmptyNamespaceException (java.lang.String[] namespace)  { throw new RuntimeException(); }
}
