package org.apache.spark.sql.execution.aggregate;
/**
 * An interface for those aggregate physical operators that support codegen.
 */
public  interface AggregateCodegenSupport extends org.apache.spark.sql.execution.aggregate.BaseAggregateExec, org.apache.spark.sql.execution.BlockingOperatorWithCodegen, org.apache.spark.sql.execution.GeneratePredicateHelper {
  public  java.lang.String doConsume (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> input, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode row)  ;
  /**
   * The generated code for <code>doConsume</code> call when aggregate has grouping keys.
   * @param ctx (undocumented)
   * @param input (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String doConsumeWithKeys (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> input)  ;
  /**
   * The generated code for <code>doConsume</code> call when aggregate does not have grouping keys.
   * @param ctx (undocumented)
   * @param input (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String doConsumeWithoutKeys (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> input)  ;
  public  java.lang.String doProduce (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  ;
  /**
   * The generated code for <code>doProduce</code> call when aggregate has grouping keys.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String doProduceWithKeys (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  ;
  /**
   * The generated code for <code>doProduce</code> call when aggregate does not have grouping keys.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String doProduceWithoutKeys (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  ;
  /**
   * The generated code to evaluate aggregate functions.
   * @param ctx (undocumented)
   * @param input (undocumented)
   * @param inputAttrs (undocumented)
   * @param boundUpdateExprs (undocumented)
   * @param aggNames (undocumented)
   * @param aggCodeBlocks (undocumented)
   * @param subExprs (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String generateEvalCodeForAggFuncs (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> input, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputAttrs, scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> boundUpdateExprs, scala.collection.Seq<java.lang.String> aggNames, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.Block> aggCodeBlocks, org.apache.spark.sql.catalyst.expressions.codegen.SubExprCodes subExprs)  ;
  public  scala.collection.Seq<org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow>> inputRDDs ()  ;
  /**
   * All the modes of aggregate expressions.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateMode> modes ()  ;
  /**
   * Whether this operator needs to build hash table.
   * @return (undocumented)
   */
  public  boolean needHashTable ()  ;
  /**
   * Splits aggregate code into small functions because the most of JVM implementations
   * can not compile too long functions. Returns None if we are not able to split the given code.
   * <p>
   * Note: The difference from <code>CodeGenerator.splitExpressions</code> is that we define an individual
   * function for each aggregation function (e.g., SUM and AVG). For example, in a query
   * <code>SELECT SUM(a), AVG(a) FROM VALUES(1) t(a)</code>, we define two functions
   * for <code>SUM(a)</code> and <code>AVG(a)</code>.
   * @param ctx (undocumented)
   * @param aggNames (undocumented)
   * @param aggBufferUpdatingExprs (undocumented)
   * @param aggCodeBlocks (undocumented)
   * @param subExprs (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<scala.collection.Seq<java.lang.String>> splitAggregateExpressions (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<java.lang.String> aggNames, scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> aggBufferUpdatingExprs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.Block> aggCodeBlocks, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExpressionEquals, org.apache.spark.sql.catalyst.expressions.codegen.SubExprEliminationState> subExprs)  ;
  public  boolean supportCodegen ()  ;
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet usedInputs ()  ;
}
