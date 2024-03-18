package org.apache.spark.sql.hive.thriftserver.ui;
/**
 * Spark Web UI tab that shows statistics of jobs running in the thrift server.
 * This assumes the given SparkContext has enabled its SparkUI.
 */
  class ThriftServerTab extends org.apache.spark.ui.SparkUITab implements org.apache.spark.internal.Logging {
  static public  org.apache.spark.ui.SparkUI getSparkUI (org.apache.spark.SparkContext sparkContext)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.thriftserver.ui.HiveThriftServer2AppStatusStore store ()  { throw new RuntimeException(); }
  // not preceding
  public   ThriftServerTab (org.apache.spark.sql.hive.thriftserver.ui.HiveThriftServer2AppStatusStore store, org.apache.spark.ui.SparkUI sparkUI)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  org.apache.spark.ui.SparkUI parent ()  { throw new RuntimeException(); }
  public  java.util.Date startTime ()  { throw new RuntimeException(); }
  public  void detach ()  { throw new RuntimeException(); }
}
