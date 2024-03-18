package org.apache.spark.sql.hive.thriftserver;
/** A singleton object for the master program. The executors should not access this. */
public  class SparkSQLEnv$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkSQLEnv$ MODULE$ = null;
  public   SparkSQLEnv$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
  public  void init ()  { throw new RuntimeException(); }
  /** Cleans up and shuts down the Spark SQL environments. */
  public  void stop ()  { throw new RuntimeException(); }
}
