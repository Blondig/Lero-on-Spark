package org.apache.spark;
/**
 * IO exception thrown from Spark with an error class.
 */
  class SparkIOException extends java.io.IOException implements org.apache.spark.SparkThrowable {
  public   SparkIOException (java.lang.String errorClass, java.lang.String[] messageParameters)  { throw new RuntimeException(); }
  public  java.lang.String getErrorClass ()  { throw new RuntimeException(); }
}
