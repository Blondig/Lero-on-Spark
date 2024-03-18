package org.apache.spark.sql.hive.thriftserver;
/**
 * The main entry point for the Spark SQL port of HiveServer2.  Starts up a <code>SparkSQLContext</code> and a
 * <code>HiveThriftServer2</code> thrift server.
 */
public  class HiveThriftServer2$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HiveThriftServer2$ MODULE$ = null;
  public   HiveThriftServer2$ ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.hive.thriftserver.ui.ThriftServerTab> uiTab ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.thriftserver.ui.HiveThriftServer2Listener listener ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.thriftserver.ui.HiveThriftServer2EventManager eventManager ()  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Starts a new thrift server with the given context.
   * @param sqlContext (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.hive.thriftserver.HiveThriftServer2 startWithContext (org.apache.spark.sql.SQLContext sqlContext)  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
