package org.apache.spark.sql.catalyst.analysis;
public  interface FunctionRegistry extends org.apache.spark.sql.catalyst.analysis.FunctionRegistryBase<org.apache.spark.sql.catalyst.expressions.Expression> {
  /** Create a copy of this registry with identical functions as this registry. */
  public  org.apache.spark.sql.catalyst.analysis.FunctionRegistry clone ()  ;
}
