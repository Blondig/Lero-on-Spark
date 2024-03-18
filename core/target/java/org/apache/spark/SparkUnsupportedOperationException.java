package org.apache.spark;
/**
 * Unsupported operation exception thrown from Spark with an error class.
 */
  class SparkUnsupportedOperationException extends java.lang.UnsupportedOperationException implements org.apache.spark.SparkThrowable {
  public   SparkUnsupportedOperationException (java.lang.String errorClass, java.lang.String[] messageParameters)  { throw new RuntimeException(); }
  public  java.lang.String getErrorClass ()  { throw new RuntimeException(); }
}
