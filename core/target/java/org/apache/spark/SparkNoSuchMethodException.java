package org.apache.spark;
/**
 * No such method exception thrown from Spark with an error class.
 */
  class SparkNoSuchMethodException extends java.lang.NoSuchMethodException implements org.apache.spark.SparkThrowable {
  public   SparkNoSuchMethodException (java.lang.String errorClass, java.lang.String[] messageParameters)  { throw new RuntimeException(); }
  public  java.lang.String getErrorClass ()  { throw new RuntimeException(); }
}
