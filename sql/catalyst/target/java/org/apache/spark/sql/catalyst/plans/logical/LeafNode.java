package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A logical plan node with no children.
 */
public  interface LeafNode extends org.apache.spark.sql.catalyst.trees.LeafLike<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /** Leaf nodes that can survive analysis must define their own statistics. */
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics computeStats ()  ;
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  ;
}
