package org.apache.spark;
/**
 * Number format exception thrown from Spark with an error class.
 */
  class SparkNumberFormatException extends java.lang.NumberFormatException implements org.apache.spark.SparkThrowable {
  public   SparkNumberFormatException (java.lang.String errorClass, java.lang.String[] messageParameters, java.lang.String queryContext)  { throw new RuntimeException(); }
  public  java.lang.String getErrorClass ()  { throw new RuntimeException(); }
}
