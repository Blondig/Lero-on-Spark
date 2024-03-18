package org.apache.spark;
/**
 * Arithmetic exception thrown from Spark with an error class.
 */
  class SparkArithmeticException extends java.lang.ArithmeticException implements org.apache.spark.SparkThrowable {
  public   SparkArithmeticException (java.lang.String errorClass, java.lang.String[] messageParameters, java.lang.String queryContext)  { throw new RuntimeException(); }
  public  java.lang.String getErrorClass ()  { throw new RuntimeException(); }
}
