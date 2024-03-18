package org.apache.spark;
/**
 * Hadoop file already exists exception thrown from Spark with an error class.
 */
  class SparkFileAlreadyExistsException extends org.apache.hadoop.fs.FileAlreadyExistsException implements org.apache.spark.SparkThrowable {
  public   SparkFileAlreadyExistsException (java.lang.String errorClass, java.lang.String[] messageParameters)  { throw new RuntimeException(); }
  public  java.lang.String getErrorClass ()  { throw new RuntimeException(); }
}
