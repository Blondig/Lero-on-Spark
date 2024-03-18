package org.apache.spark;
/**
 * Companion object used by instances of {@link SparkThrowable} to access error class information and
 * construct error messages.
 */
public  class SparkThrowableHelper$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkThrowableHelper$ MODULE$ = null;
  public   SparkThrowableHelper$ ()  { throw new RuntimeException(); }
  public  java.net.URL errorClassesUrl ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.SortedMap<java.lang.String, org.apache.spark.ErrorInfo> errorClassToInfoMap ()  { throw new RuntimeException(); }
  public  java.lang.String getMessage (java.lang.String errorClass, java.lang.String[] messageParameters, java.lang.String queryContext)  { throw new RuntimeException(); }
  public  java.lang.String getSqlState (java.lang.String errorClass)  { throw new RuntimeException(); }
  public  boolean isInternalError (java.lang.String errorClass)  { throw new RuntimeException(); }
}
