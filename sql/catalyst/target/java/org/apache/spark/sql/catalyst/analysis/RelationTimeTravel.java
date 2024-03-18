package org.apache.spark.sql.catalyst.analysis;
/**
 * A logical node used to time travel the child relation to the given <code>timestamp</code> or <code>version</code>.
 * The <code>child</code> must support time travel, e.g. a v2 source, and cannot be a view, subquery or stream.
 * The timestamp expression cannot refer to any columns and cannot contain subqueries.
 */
public  class RelationTimeTravel extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.LeafNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan relation ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> timestamp ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> version ()  { throw new RuntimeException(); }
  // not preceding
  public   RelationTimeTravel (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan relation, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> timestamp, scala.Option<java.lang.String> version)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
}
