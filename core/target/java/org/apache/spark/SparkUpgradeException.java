package org.apache.spark;
/**
 * Exception thrown when Spark returns different result after upgrading to a new version.
 */
  class SparkUpgradeException extends java.lang.RuntimeException implements org.apache.spark.SparkThrowable {
  public   SparkUpgradeException (java.lang.String errorClass, java.lang.String[] messageParameters, java.lang.Throwable cause)  { throw new RuntimeException(); }
  public   SparkUpgradeException (java.lang.String version, java.lang.String message, java.lang.Throwable cause)  { throw new RuntimeException(); }
  public  java.lang.String getErrorClass ()  { throw new RuntimeException(); }
}
