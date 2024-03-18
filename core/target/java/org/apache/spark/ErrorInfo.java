package org.apache.spark;
/**
 * Information associated with an error class.
 * <p>
 * param:  sqlState SQLSTATE associated with this class.
 * param:  message C-style message format compatible with printf.
 *                The error message is constructed by concatenating the lines with newlines.
 */
  class ErrorInfo implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> message ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> sqlState ()  { throw new RuntimeException(); }
  // not preceding
  public   ErrorInfo (scala.collection.Seq<java.lang.String> message, scala.Option<java.lang.String> sqlState)  { throw new RuntimeException(); }
  public  java.lang.String messageFormat ()  { throw new RuntimeException(); }
}
