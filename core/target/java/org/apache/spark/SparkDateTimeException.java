package org.apache.spark;
/**
 * Datetime exception thrown from Spark with an error class.
 */
  class SparkDateTimeException extends java.time.DateTimeException implements org.apache.spark.SparkThrowable {
  public   SparkDateTimeException (java.lang.String errorClass, java.lang.String[] messageParameters, java.lang.String queryContext)  { throw new RuntimeException(); }
  public  java.lang.String getErrorClass ()  { throw new RuntimeException(); }
}
