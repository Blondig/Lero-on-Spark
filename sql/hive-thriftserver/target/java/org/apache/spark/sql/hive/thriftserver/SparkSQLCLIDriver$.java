package org.apache.spark.sql.hive.thriftserver;
/**
 * This code doesn't support remote connections in Hive 1.2+, as the underlying CliDriver
 * has dropped its support.
 */
public  class SparkSQLCLIDriver$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkSQLCLIDriver$ MODULE$ = null;
  public   SparkSQLCLIDriver$ ()  { throw new RuntimeException(); }
  /**
   * Install an interrupt callback to cancel all Spark jobs. In Hive's CliDriver#processLine(),
   * a signal handler will invoke this registered callback if a Ctrl+C signal is detected while
   * a command is being processed by the current thread.
   */
  public  void installSignalHandler ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  public  boolean isRemoteMode (org.apache.hadoop.hive.cli.CliSessionState state)  { throw new RuntimeException(); }
}
