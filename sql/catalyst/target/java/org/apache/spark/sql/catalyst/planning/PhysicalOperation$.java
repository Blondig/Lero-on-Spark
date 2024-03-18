package org.apache.spark.sql.catalyst.planning;
/**
 * A pattern that matches any number of project or filter operations on top of another relational
 * operator.  All filter operators are collected and their conditions are broken up and returned
 * together with the top project operator.
 * {@link org.apache.spark.sql.catalyst.expressions.Alias Aliases} are in-lined/substituted if
 * necessary.
 */
public  class PhysicalOperation$ implements org.apache.spark.sql.catalyst.planning.OperationHelper, org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PhysicalOperation$ MODULE$ = null;
  public   PhysicalOperation$ ()  { throw new RuntimeException(); }
  protected  boolean legacyMode ()  { throw new RuntimeException(); }
}
