package org.apache.spark;
/**
 * No such element exception thrown from Spark with an error class.
 */
  class SparkNoSuchElementException extends java.util.NoSuchElementException implements org.apache.spark.SparkThrowable {
  public   SparkNoSuchElementException (java.lang.String errorClass, java.lang.String[] messageParameters, java.lang.String queryContext)  { throw new RuntimeException(); }
  public  java.lang.String getErrorClass ()  { throw new RuntimeException(); }
}
