package org.apache.spark.sql.hive.thriftserver;
/**
 * Object for grouping error messages from (most) exceptions thrown during
 * hive execution with thrift server.
 */
public  class HiveThriftServerErrors$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HiveThriftServerErrors$ MODULE$ = null;
  public   HiveThriftServerErrors$ ()  { throw new RuntimeException(); }
  public  java.lang.Throwable taskExecutionRejectedError (java.util.concurrent.RejectedExecutionException rejected)  { throw new RuntimeException(); }
  public  java.lang.Throwable runningQueryError (java.lang.Throwable e)  { throw new RuntimeException(); }
  public  java.lang.Throwable hiveOperatingError (org.apache.hive.service.cli.OperationType operationType, java.lang.Throwable e)  { throw new RuntimeException(); }
  public  java.lang.Throwable failedToOpenNewSessionError (java.lang.Throwable e)  { throw new RuntimeException(); }
  public  java.lang.Throwable cannotLoginToKerberosError (java.lang.Throwable e)  { throw new RuntimeException(); }
  public  java.lang.Throwable cannotLoginToSpnegoError (java.lang.String principal, java.lang.String keyTabFile, java.io.IOException e)  { throw new RuntimeException(); }
  public  java.lang.Throwable failedToStartServiceError (java.lang.String serviceName, java.lang.Throwable e)  { throw new RuntimeException(); }
}
