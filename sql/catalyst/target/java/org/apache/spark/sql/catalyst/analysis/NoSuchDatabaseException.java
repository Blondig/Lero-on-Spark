package org.apache.spark.sql.catalyst.analysis;
/**
 * Thrown by a catalog when an item cannot be found. The analyzer will rethrow the exception
 * as an {@link org.apache.spark.sql.AnalysisException} with the correct position information.
 */
public  class NoSuchDatabaseException extends org.apache.spark.sql.AnalysisException implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String db ()  { throw new RuntimeException(); }
  // not preceding
  public   NoSuchDatabaseException (java.lang.String db)  { throw new RuntimeException(); }
}
