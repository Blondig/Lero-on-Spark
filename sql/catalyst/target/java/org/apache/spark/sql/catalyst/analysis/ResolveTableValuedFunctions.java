package org.apache.spark.sql.catalyst.analysis;
/**
 * Rule that resolves table-valued function references.
 */
public  class ResolveTableValuedFunctions extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog ()  { throw new RuntimeException(); }
  // not preceding
  public   ResolveTableValuedFunctions (org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
