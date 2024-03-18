package org.apache.spark.sql.hive.thriftserver;
  class SparkExecuteStatementOperation extends org.apache.hive.service.cli.operation.ExecuteStatementOperation implements org.apache.spark.sql.hive.thriftserver.SparkOperation, org.apache.spark.internal.Logging {
  static public  org.apache.hive.service.cli.TableSchema getTableSchema (org.apache.spark.sql.types.StructType structType)  { throw new RuntimeException(); }
  protected  java.lang.String statementId ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkExecuteStatementOperation (org.apache.spark.sql.SQLContext sqlContext, org.apache.hive.service.cli.session.HiveSession parentSession, java.lang.String statement, java.util.Map<java.lang.String, java.lang.String> confOverlay, boolean runInBackground, long queryTimeout)  { throw new RuntimeException(); }
  public  void addNonNullColumnValue (org.apache.spark.sql.Row from, scala.collection.mutable.ArrayBuffer<java.lang.Object> to, int ordinal, org.apache.spark.sql.execution.HiveResult.TimeFormatters timeFormatters)  { throw new RuntimeException(); }
  public  org.apache.hive.service.cli.RowSet getNextRowSet (org.apache.hive.service.cli.FetchOrientation order, long maxRowsL)  { throw new RuntimeException(); }
  public  org.apache.hive.service.cli.TableSchema getResultSetSchema ()  { throw new RuntimeException(); }
  public  void runInternal ()  { throw new RuntimeException(); }
  public  void timeoutCancel ()  { throw new RuntimeException(); }
  public  void cancel ()  { throw new RuntimeException(); }
  protected  void cleanup ()  { throw new RuntimeException(); }
}
