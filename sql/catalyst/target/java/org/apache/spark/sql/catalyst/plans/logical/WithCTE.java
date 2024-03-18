package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The resolved version of {@link UnresolvedWith} with CTE referrences linked to CTE definitions
 * through unique IDs instead of relation aliases.
 * <p>
 * param:  plan    The query plan.
 * param:  cteDefs The CTE definitions.
 */
public  class WithCTE extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.CTERelationDef> cteDefs ()  { throw new RuntimeException(); }
  // not preceding
  public   WithCTE (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.CTERelationDef> cteDefs)  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withNewChildrenInternal (scala.collection.IndexedSeq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> newChildren)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.WithCTE withNewPlan (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newPlan)  { throw new RuntimeException(); }
}
