package org.apache.spark;
/**
 * Class not found exception thrown from Spark with an error class.
 */
  class SparkClassNotFoundException extends java.lang.ClassNotFoundException implements org.apache.spark.SparkThrowable {
  public   SparkClassNotFoundException (java.lang.String errorClass, java.lang.String[] messageParameters, java.lang.Throwable cause)  { throw new RuntimeException(); }
  public  java.lang.String getErrorClass ()  { throw new RuntimeException(); }
}
