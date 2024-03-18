package org.apache.spark.sql.hive;
  class HiveSessionCatalog extends org.apache.spark.sql.catalyst.catalog.SessionCatalog {
  // not preceding
  public   HiveSessionCatalog (scala.Function0<org.apache.spark.sql.catalyst.catalog.ExternalCatalog> externalCatalogBuilder, scala.Function0<org.apache.spark.sql.catalyst.catalog.GlobalTempViewManager> globalTempViewManagerBuilder, org.apache.spark.sql.hive.HiveMetastoreCatalog metastoreCatalog, org.apache.spark.sql.catalyst.analysis.FunctionRegistry functionRegistry, org.apache.spark.sql.catalyst.analysis.TableFunctionRegistry tableFunctionRegistry, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.sql.catalyst.parser.ParserInterface parser, org.apache.spark.sql.catalyst.catalog.FunctionResourceLoader functionResourceLoader, org.apache.spark.sql.catalyst.catalog.FunctionExpressionBuilder functionExpressionBuilder)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.HiveMetastoreCatalog metastoreCatalog ()  { throw new RuntimeException(); }
}
