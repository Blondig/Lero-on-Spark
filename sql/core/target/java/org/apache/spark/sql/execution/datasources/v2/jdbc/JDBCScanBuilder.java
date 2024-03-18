package org.apache.spark.sql.execution.datasources.v2.jdbc;
public  class JDBCScanBuilder implements org.apache.spark.sql.connector.read.ScanBuilder, org.apache.spark.sql.connector.read.SupportsPushDownV2Filters, org.apache.spark.sql.connector.read.SupportsPushDownRequiredColumns, org.apache.spark.sql.connector.read.SupportsPushDownAggregates, org.apache.spark.sql.connector.read.SupportsPushDownLimit, org.apache.spark.sql.connector.read.SupportsPushDownTableSample, org.apache.spark.sql.connector.read.SupportsPushDownTopN, org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession session ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions jdbcOptions ()  { throw new RuntimeException(); }
  // not preceding
  public   JDBCScanBuilder (org.apache.spark.sql.SparkSession session, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions jdbcOptions)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.expressions.filter.Predicate[] pushPredicates (org.apache.spark.sql.connector.expressions.filter.Predicate[] predicates)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.expressions.filter.Predicate[] pushedPredicates ()  { throw new RuntimeException(); }
  public  boolean supportCompletePushDown (org.apache.spark.sql.connector.expressions.aggregate.Aggregation aggregation)  { throw new RuntimeException(); }
  public  boolean pushAggregation (org.apache.spark.sql.connector.expressions.aggregate.Aggregation aggregation)  { throw new RuntimeException(); }
  public  boolean pushTableSample (double lowerBound, double upperBound, boolean withReplacement, long seed)  { throw new RuntimeException(); }
  public  boolean pushLimit (int limit)  { throw new RuntimeException(); }
  public  boolean pushTopN (org.apache.spark.sql.connector.expressions.SortOrder[] orders, int limit)  { throw new RuntimeException(); }
  public  boolean isPartiallyPushed ()  { throw new RuntimeException(); }
  public  void pruneColumns (org.apache.spark.sql.types.StructType requiredSchema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.Scan build ()  { throw new RuntimeException(); }
}
