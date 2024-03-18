package org.apache.spark;
/**
 * Illegal argument exception thrown from Spark with an error class.
 */
  class SparkIllegalArgumentException extends java.lang.IllegalArgumentException implements org.apache.spark.SparkThrowable {
  public   SparkIllegalArgumentException (java.lang.String errorClass, java.lang.String[] messageParameters)  { throw new RuntimeException(); }
  public  java.lang.String getErrorClass ()  { throw new RuntimeException(); }
}
