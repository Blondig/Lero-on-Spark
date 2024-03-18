package org.apache.spark.sql.execution.joins;
/**
 * An interface for those join physical operators that support codegen.
 */
public  interface JoinCodegenSupport extends org.apache.spark.sql.execution.CodegenSupport, org.apache.spark.sql.execution.joins.BaseJoinExec {
  /**
   * Generates the code for variables of one child side of join.
   * @param ctx (undocumented)
   * @param row (undocumented)
   * @param plan (undocumented)
   * @param setDefaultValue (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> genOneSideJoinVars (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String row, org.apache.spark.sql.execution.SparkPlan plan, boolean setDefaultValue)  ;
  /**
   * Generate the (non-equi) condition used to filter joined rows.
   * This is used in Inner, Left Semi, Left Anti and Full Outer joins.
   * <p>
   * @return Tuple of variable name for row of build side, generated code for condition,
   *         and generated code for variables of build side.
   * @param ctx (undocumented)
   * @param streamVars (undocumented)
   * @param streamPlan (undocumented)
   * @param buildPlan (undocumented)
   * @param buildRow (undocumented)
   */
  public  scala.Tuple3<java.lang.String, java.lang.String, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode>> getJoinCondition (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> streamVars, org.apache.spark.sql.execution.SparkPlan streamPlan, org.apache.spark.sql.execution.SparkPlan buildPlan, scala.Option<java.lang.String> buildRow)  ;
}
