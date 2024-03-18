package org.apache.spark;
/**
 * Array index out of bounds exception thrown from Spark with an error class.
 */
  class SparkArrayIndexOutOfBoundsException extends java.lang.ArrayIndexOutOfBoundsException implements org.apache.spark.SparkThrowable {
  public   SparkArrayIndexOutOfBoundsException (java.lang.String errorClass, java.lang.String[] messageParameters)  { throw new RuntimeException(); }
  public  java.lang.String getErrorClass ()  { throw new RuntimeException(); }
}
