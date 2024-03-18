package org.apache.spark.sql.execution.datasources.v2;
/**
 * Get the expression of DS V2 to represent catalyst predicate that can be pushed down.
 */
public  class PushablePredicate implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  boolean nestedPredicatePushdownEnabled ()  { throw new RuntimeException(); }
  // not preceding
  public   PushablePredicate (boolean nestedPredicatePushdownEnabled)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.connector.expressions.filter.Predicate> unapply (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
}
