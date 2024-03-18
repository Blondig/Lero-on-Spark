package org.apache.spark.sql.catalyst.expressions.objects;
/**
 * Invokes a static function, returning the result.  By default, any of the arguments being null
 * will result in returning null instead of calling the function.
 * <p>
 * param:  staticObject The target of the static call.  This can either be the object itself
 *                     (methods defined on scala objects), or the class object
 *                     (static methods defined in java).
 * param:  dataType The expected return type of the function call
 * param:  functionName The name of the method to call.
 * param:  arguments An optional list of expressions to pass as arguments to the function.
 * param:  inputTypes A list of data types specifying the input types for the method to be invoked.
 *                   If enabled, it must have the same length as {@link arguments}. In case an input
 *                   type differs from the actual argument type, Spark will try to perform
 *                   type coercion and insert cast whenever necessary before invoking the method.
 *                   The above is disabled if this is empty.
 * param:  propagateNull When true, and any of the arguments is null, null will be returned instead
 *                      of calling the function. Also note: when this is false but any of the
 *                      arguments is of primitive type and is null, null also will be returned
 *                      without invoking the function.
 * param:  returnNullable When false, indicating the invoked method will always return
 *                       non-null value.
 * param:  isDeterministic Whether the method invocation is deterministic or not. If false, Spark
 *                        will not apply certain optimizations such as constant folding.
 */
public  class StaticInvoke extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.objects.InvokeLike, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  boolean needNullCheck ()  { throw new RuntimeException(); }
  protected  boolean[] needNullCheckForIndex ()  { throw new RuntimeException(); }
  protected  java.lang.Object[] evaluatedArgs ()  { throw new RuntimeException(); }
  public  java.lang.Class<?> staticObject ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  java.lang.String functionName ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> arguments ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  boolean propagateNull ()  { throw new RuntimeException(); }
  public  boolean returnNullable ()  { throw new RuntimeException(); }
  public  boolean isDeterministic ()  { throw new RuntimeException(); }
  // not preceding
  public   StaticInvoke (java.lang.Class<?> staticObject, org.apache.spark.sql.types.DataType dataType, java.lang.String functionName, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> arguments, scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes, boolean propagateNull, boolean returnNullable, boolean isDeterministic)  { throw new RuntimeException(); }
  public  java.lang.String objectName ()  { throw new RuntimeException(); }
  public  java.lang.Class<?> cls ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean deterministic ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.Class<?>> argClasses ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.reflect.Method method ()  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression withNewChildrenInternal (scala.collection.IndexedSeq<org.apache.spark.sql.catalyst.expressions.Expression> newChildren)  { throw new RuntimeException(); }
}
