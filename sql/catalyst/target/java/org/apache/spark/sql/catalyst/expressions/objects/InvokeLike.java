package org.apache.spark.sql.catalyst.expressions.objects;
/**
 * Common base class for {@link StaticInvoke}, {@link Invoke}, and {@link NewInstance}.
 */
public  interface InvokeLike extends org.apache.spark.sql.catalyst.expressions.NonSQLExpression, org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> arguments ()  ;
  public  java.lang.Object[] evaluatedArgs ()  ;
  public  java.lang.reflect.Method findMethod (java.lang.Class<?> cls, java.lang.String functionName, scala.collection.Seq<java.lang.Class<?>> argClasses)  ;
  public  boolean foldable ()  ;
  /**
   * Evaluate each argument with a given row, invoke a method with a given object and arguments,
   * and cast a return value if the return type can be mapped to a Java Boxed type
   * <p>
   * @param obj the object for the method to be called. If null, perform s static method call
   * @param method the method object to be called
   * @param input the row used for evaluating arguments
   * @return the return object of a method call
   */
  public  Object invoke (Object obj, java.lang.reflect.Method method, org.apache.spark.sql.catalyst.InternalRow input)  ;
  public  boolean needNullCheck ()  ;
  public  boolean[] needNullCheckForIndex ()  ;
  /**
   * Prepares codes for arguments.
   * <p>
   * - generate codes for argument.
   * - use ctx.splitExpressions() to not exceed 64kb JVM limit while preparing arguments.
   * - avoid some of nullability checking which are not needed because the expression is not
   *   nullable.
   * - when needNullCheck == true, short circuit if we found one of arguments is null because
   *   preparing rest of arguments can be skipped in the case.
   * <p>
   * @param ctx a {@link CodegenContext}
   * @return (code to prepare arguments, argument string, result of argument null check)
   */
  public  scala.Tuple3<java.lang.String, java.lang.String, org.apache.spark.sql.catalyst.expressions.codegen.ExprValue> prepareArguments (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  ;
  public  boolean propagateNull ()  ;
}
