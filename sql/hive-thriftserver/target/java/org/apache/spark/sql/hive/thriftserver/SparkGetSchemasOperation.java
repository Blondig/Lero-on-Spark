package org.apache.spark.sql.hive.thriftserver;
/**
 * Spark's own GetSchemasOperation
 * <p>
 * param:  sqlContext SQLContext to use
 * param:  parentSession a HiveSession from SessionManager
 * param:  catalogName catalog name. null if not applicable.
 * param:  schemaName database name, null or a concrete database name
 */
  class SparkGetSchemasOperation extends org.apache.hive.service.cli.operation.GetSchemasOperation implements org.apache.spark.sql.hive.thriftserver.SparkOperation, org.apache.spark.internal.Logging {
  // not preceding
  public   SparkGetSchemasOperation (org.apache.spark.sql.SQLContext sqlContext, org.apache.hive.service.cli.session.HiveSession parentSession, java.lang.String catalogName, java.lang.String schemaName)  { throw new RuntimeException(); }
  public  void runInternal ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  protected  java.lang.String statementId ()  { throw new RuntimeException(); }
}
