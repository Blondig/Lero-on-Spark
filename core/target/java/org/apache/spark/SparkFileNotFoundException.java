package org.apache.spark;
/**
 * File not found exception thrown from Spark with an error class.
 */
  class SparkFileNotFoundException extends java.io.FileNotFoundException implements org.apache.spark.SparkThrowable {
  public   SparkFileNotFoundException (java.lang.String errorClass, java.lang.String[] messageParameters)  { throw new RuntimeException(); }
  public  java.lang.String getErrorClass ()  { throw new RuntimeException(); }
}
