package org.apache.spark.sql.hive.thriftserver;
/**
 * Spark's own GetTableTypesOperation
 * <p>
 * param:  sqlContext SQLContext to use
 * param:  parentSession a HiveSession from SessionManager
 */
  class SparkGetTableTypesOperation extends org.apache.hive.service.cli.operation.GetTableTypesOperation implements org.apache.spark.sql.hive.thriftserver.SparkOperation, org.apache.spark.internal.Logging {
  // not preceding
  public   SparkGetTableTypesOperation (org.apache.spark.sql.SQLContext sqlContext, org.apache.hive.service.cli.session.HiveSession parentSession)  { throw new RuntimeException(); }
  public  void runInternal ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  protected  java.lang.String statementId ()  { throw new RuntimeException(); }
}
