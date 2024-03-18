package org.apache.spark;
/**
 * SQL exception thrown from Spark with an error class.
 */
  class SparkSQLException extends java.sql.SQLException implements org.apache.spark.SparkThrowable {
  public   SparkSQLException (java.lang.String errorClass, java.lang.String[] messageParameters)  { throw new RuntimeException(); }
  public  java.lang.String getErrorClass ()  { throw new RuntimeException(); }
}
