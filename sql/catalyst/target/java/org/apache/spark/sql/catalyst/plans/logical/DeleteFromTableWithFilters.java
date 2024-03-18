package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the DELETE FROM command that can be executed using data source filters.
 * <p>
 * As opposed to {@link DeleteFromTable}, this node represents a DELETE operation where the condition
 * was converted into filters and the data source reported that it can handle all of them.
 */
public  class DeleteFromTableWithFilters extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.LeafCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan table ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.sources.Filter> condition ()  { throw new RuntimeException(); }
  // not preceding
  public   DeleteFromTableWithFilters (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan table, scala.collection.Seq<org.apache.spark.sql.sources.Filter> condition)  { throw new RuntimeException(); }
}
