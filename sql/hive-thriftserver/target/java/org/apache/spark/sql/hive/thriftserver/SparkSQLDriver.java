package org.apache.spark.sql.hive.thriftserver;
  class SparkSQLDriver extends org.apache.hadoop.hive.ql.Driver implements org.apache.spark.internal.Logging {
  public  org.apache.spark.sql.SQLContext context ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkSQLDriver (org.apache.spark.sql.SQLContext context)  { throw new RuntimeException(); }
    org.apache.hadoop.hive.metastore.api.Schema tableSchema ()  { throw new RuntimeException(); }
    scala.collection.Seq<java.lang.String> hiveResponse ()  { throw new RuntimeException(); }
  public  void init ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.hive.ql.processors.CommandProcessorResponse run (java.lang.String command)  { throw new RuntimeException(); }
  public  int close ()  { throw new RuntimeException(); }
  public  boolean getResults (java.util.List<?> res)  { throw new RuntimeException(); }
  public  org.apache.hadoop.hive.metastore.api.Schema getSchema ()  { throw new RuntimeException(); }
  public  void destroy ()  { throw new RuntimeException(); }
}
