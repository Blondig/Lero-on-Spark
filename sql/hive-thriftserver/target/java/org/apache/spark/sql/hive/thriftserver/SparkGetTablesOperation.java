package org.apache.spark.sql.hive.thriftserver;
/**
 * Spark's own GetTablesOperation
 * <p>
 * param:  sqlContext SQLContext to use
 * param:  parentSession a HiveSession from SessionManager
 * param:  catalogName catalog name. null if not applicable
 * param:  schemaName database name, null or a concrete database name
 * param:  tableName table name pattern
 * param:  tableTypes list of allowed table types, e.g. "TABLE", "VIEW"
 */
  class SparkGetTablesOperation extends org.apache.hive.service.cli.operation.GetTablesOperation implements org.apache.spark.sql.hive.thriftserver.SparkOperation, org.apache.spark.internal.Logging {
  // not preceding
  public   SparkGetTablesOperation (org.apache.spark.sql.SQLContext sqlContext, org.apache.hive.service.cli.session.HiveSession parentSession, java.lang.String catalogName, java.lang.String schemaName, java.lang.String tableName, java.util.List<java.lang.String> tableTypes)  { throw new RuntimeException(); }
  public  void runInternal ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  protected  java.lang.String statementId ()  { throw new RuntimeException(); }
}
