package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Represents the relation of a CTE reference.
 * param:  cteId                The ID of the corresponding CTE definition.
 * param:  _resolved            Whether this reference is resolved.
 * param:  output               The output attributes of this CTE reference, which can be different
 *                             from the output of its corresponding CTE definition after attribute
 *                             de-duplication.
 * param:  statsOpt             The optional statistics inferred from the corresponding CTE
 *                             definition.
 */
public  class CTERelationRef extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.LeafNode, org.apache.spark.sql.catalyst.analysis.MultiInstanceRelation, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long cteId ()  { throw new RuntimeException(); }
  public  boolean _resolved ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.Statistics> statsOpt ()  { throw new RuntimeException(); }
  // not preceding
  public   CTERelationRef (long cteId, boolean _resolved, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, scala.Option<org.apache.spark.sql.catalyst.plans.logical.Statistics> statsOpt)  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newInstance ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.CTERelationRef withNewStats (scala.Option<org.apache.spark.sql.catalyst.plans.logical.Statistics> statsOpt)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics computeStats ()  { throw new RuntimeException(); }
}
