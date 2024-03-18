package org.apache.spark.sql.catalyst.analysis;
/**
 * A catalog for looking up table functions.
 */
public  interface TableFunctionRegistry extends org.apache.spark.sql.catalyst.analysis.FunctionRegistryBase<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /** Create a copy of this registry with identical functions as this registry. */
  public  org.apache.spark.sql.catalyst.analysis.TableFunctionRegistry clone ()  ;
}
