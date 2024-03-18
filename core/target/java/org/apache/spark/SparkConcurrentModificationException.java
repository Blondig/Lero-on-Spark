package org.apache.spark;
/**
 * Concurrent modification exception thrown from Spark with an error class.
 */
  class SparkConcurrentModificationException extends java.util.ConcurrentModificationException implements org.apache.spark.SparkThrowable {
  public   SparkConcurrentModificationException (java.lang.String errorClass, java.lang.String[] messageParameters, java.lang.Throwable cause)  { throw new RuntimeException(); }
  public  java.lang.String getErrorClass ()  { throw new RuntimeException(); }
}
