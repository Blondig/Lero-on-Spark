package org.apache.spark.sql.hive.thriftserver.server;
/**
 * Executes queries using Spark SQL, and maintains a list of handles to active queries.
 */
  class SparkSQLOperationManager extends org.apache.hive.service.cli.operation.OperationManager implements org.apache.spark.internal.Logging {
  public   SparkSQLOperationManager ()  { throw new RuntimeException(); }
  public  java.util.Map<org.apache.hive.service.cli.OperationHandle, org.apache.hive.service.cli.operation.Operation> handleToOperation ()  { throw new RuntimeException(); }
  public  org.apache.hive.service.cli.operation.ExecuteStatementOperation newExecuteStatementOperation (org.apache.hive.service.cli.session.HiveSession parentSession, java.lang.String statement, java.util.Map<java.lang.String, java.lang.String> confOverlay, boolean async, long queryTimeout)  { throw new RuntimeException(); }
  public  org.apache.hive.service.cli.operation.GetCatalogsOperation newGetCatalogsOperation (org.apache.hive.service.cli.session.HiveSession parentSession)  { throw new RuntimeException(); }
  public  org.apache.hive.service.cli.operation.GetColumnsOperation newGetColumnsOperation (org.apache.hive.service.cli.session.HiveSession parentSession, java.lang.String catalogName, java.lang.String schemaName, java.lang.String tableName, java.lang.String columnName)  { throw new RuntimeException(); }
  public  org.apache.hive.service.cli.operation.GetFunctionsOperation newGetFunctionsOperation (org.apache.hive.service.cli.session.HiveSession parentSession, java.lang.String catalogName, java.lang.String schemaName, java.lang.String functionName)  { throw new RuntimeException(); }
  public  org.apache.hive.service.cli.operation.GetSchemasOperation newGetSchemasOperation (org.apache.hive.service.cli.session.HiveSession parentSession, java.lang.String catalogName, java.lang.String schemaName)  { throw new RuntimeException(); }
  public  org.apache.hive.service.cli.operation.GetTableTypesOperation newGetTableTypesOperation (org.apache.hive.service.cli.session.HiveSession parentSession)  { throw new RuntimeException(); }
  public  org.apache.hive.service.cli.operation.MetadataOperation newGetTablesOperation (org.apache.hive.service.cli.session.HiveSession parentSession, java.lang.String catalogName, java.lang.String schemaName, java.lang.String tableName, java.util.List<java.lang.String> tableTypes)  { throw new RuntimeException(); }
  public  org.apache.hive.service.cli.operation.GetTypeInfoOperation newGetTypeInfoOperation (org.apache.hive.service.cli.session.HiveSession parentSession)  { throw new RuntimeException(); }
  public  java.util.concurrent.ConcurrentHashMap<org.apache.hive.service.cli.SessionHandle, org.apache.spark.sql.SQLContext> sessionToContexts ()  { throw new RuntimeException(); }
}
