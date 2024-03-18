package org.apache.spark.sql.hive.thriftserver;
/**
 * Spark's own SparkGetColumnsOperation
 * <p>
 * param:  sqlContext SQLContext to use
 * param:  parentSession a HiveSession from SessionManager
 * param:  catalogName catalog name. NULL if not applicable.
 * param:  schemaName database name, NULL or a concrete database name
 * param:  tableName table name
 * param:  columnName column name
 */
  class SparkGetColumnsOperation extends org.apache.hive.service.cli.operation.GetColumnsOperation implements org.apache.spark.sql.hive.thriftserver.SparkOperation, org.apache.spark.internal.Logging {
  // not preceding
  public   SparkGetColumnsOperation (org.apache.spark.sql.SQLContext sqlContext, org.apache.hive.service.cli.session.HiveSession parentSession, java.lang.String catalogName, java.lang.String schemaName, java.lang.String tableName, java.lang.String columnName)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog ()  { throw new RuntimeException(); }
  public  void runInternal ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  protected  java.lang.String statementId ()  { throw new RuntimeException(); }
}
