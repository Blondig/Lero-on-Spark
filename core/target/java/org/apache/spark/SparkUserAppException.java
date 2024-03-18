package org.apache.spark;
/**
 * Exception thrown when the main user code is run as a child process (e.g. pyspark) and we want
 * the parent SparkSubmit process to exit with the same exit code.
 */
  class SparkUserAppException extends org.apache.spark.SparkException implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int exitCode ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkUserAppException (int exitCode)  { throw new RuntimeException(); }
}
