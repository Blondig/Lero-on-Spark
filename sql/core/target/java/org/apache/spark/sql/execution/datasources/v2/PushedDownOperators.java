package org.apache.spark.sql.execution.datasources.v2;
/**
 * Pushed down operators
 */
public  class PushedDownOperators implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.connector.expressions.aggregate.Aggregation> aggregation ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.datasources.v2.TableSampleInfo> sample ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> limit ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.connector.expressions.SortOrder> sortValues ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.connector.expressions.filter.Predicate> pushedPredicates ()  { throw new RuntimeException(); }
  // not preceding
  public   PushedDownOperators (scala.Option<org.apache.spark.sql.connector.expressions.aggregate.Aggregation> aggregation, scala.Option<org.apache.spark.sql.execution.datasources.v2.TableSampleInfo> sample, scala.Option<java.lang.Object> limit, scala.collection.Seq<org.apache.spark.sql.connector.expressions.SortOrder> sortValues, scala.collection.Seq<org.apache.spark.sql.connector.expressions.filter.Predicate> pushedPredicates)  { throw new RuntimeException(); }
}
