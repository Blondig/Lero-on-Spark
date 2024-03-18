package org.apache.spark;
/**
 * Security exception thrown from Spark with an error class.
 */
  class SparkSecurityException extends java.lang.SecurityException implements org.apache.spark.SparkThrowable {
  public   SparkSecurityException (java.lang.String errorClass, java.lang.String[] messageParameters)  { throw new RuntimeException(); }
  public  java.lang.String getErrorClass ()  { throw new RuntimeException(); }
}
