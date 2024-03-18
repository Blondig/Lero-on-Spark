package org.apache.spark.sql.catalyst.analysis;
/**
 * A helper class used to detect duplicate relations fast in <code>DeduplicateRelations</code>
 */
public  class ReferenceEqualPlanWrapper implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan ()  { throw new RuntimeException(); }
  // not preceding
  public   ReferenceEqualPlanWrapper (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object obj)  { throw new RuntimeException(); }
}
