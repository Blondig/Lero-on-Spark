package org.apache.spark.sql.execution.datasources.v2.jdbc;
public  class JDBCScan implements org.apache.spark.sql.connector.read.V1Scan, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.jdbc.JDBCRelation relation ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType prunedSchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.expressions.filter.Predicate[] pushedPredicates ()  { throw new RuntimeException(); }
  public  java.lang.String[] pushedAggregateColumn ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String[]> groupByColumns ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.datasources.v2.TableSampleInfo> tableSample ()  { throw new RuntimeException(); }
  public  int pushedLimit ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.expressions.SortOrder[] sortOrders ()  { throw new RuntimeException(); }
  // not preceding
  public   JDBCScan (org.apache.spark.sql.execution.datasources.jdbc.JDBCRelation relation, org.apache.spark.sql.types.StructType prunedSchema, org.apache.spark.sql.connector.expressions.filter.Predicate[] pushedPredicates, java.lang.String[] pushedAggregateColumn, scala.Option<java.lang.String[]> groupByColumns, scala.Option<org.apache.spark.sql.execution.datasources.v2.TableSampleInfo> tableSample, int pushedLimit, org.apache.spark.sql.connector.expressions.SortOrder[] sortOrders)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType readSchema ()  { throw new RuntimeException(); }
  public <T extends org.apache.spark.sql.sources.BaseRelation> T toV1TableScan (org.apache.spark.sql.SQLContext context)  { throw new RuntimeException(); }
  public  java.lang.String description ()  { throw new RuntimeException(); }
}
