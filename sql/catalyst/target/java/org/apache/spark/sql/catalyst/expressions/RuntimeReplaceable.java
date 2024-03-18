package org.apache.spark.sql.catalyst.expressions;
/**
 * An expression that gets replaced at runtime (currently by the optimizer) into a different
 * expression for evaluation. This is mainly used to provide compatibility with other databases.
 * For example, we use this to support "nvl" by replacing it with "coalesce".
 */
public  interface RuntimeReplaceable {
  public  org.apache.spark.sql.types.DataType dataType ()  ;
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  ;
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  ;
  public  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  ;
  public  boolean nullable ()  ;
  public  org.apache.spark.sql.catalyst.expressions.Expression preCanonicalized ()  ;
  public  org.apache.spark.sql.catalyst.expressions.Expression replacement ()  ;
}
