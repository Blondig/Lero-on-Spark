package org.apache.spark;
/**
 * SQL feature not supported exception thrown from Spark with an error class.
 */
  class SparkSQLFeatureNotSupportedException extends java.sql.SQLFeatureNotSupportedException implements org.apache.spark.SparkThrowable {
  public   SparkSQLFeatureNotSupportedException (java.lang.String errorClass, java.lang.String[] messageParameters)  { throw new RuntimeException(); }
  public  java.lang.String getErrorClass ()  { throw new RuntimeException(); }
}
