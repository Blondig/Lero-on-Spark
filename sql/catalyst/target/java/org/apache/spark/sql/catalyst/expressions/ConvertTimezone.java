package org.apache.spark.sql.catalyst.expressions;
public  class ConvertTimezone extends org.apache.spark.sql.catalyst.expressions.TernaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.expressions.NullIntolerant, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression sourceTz ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression targetTz ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression sourceTs ()  { throw new RuntimeException(); }
  // not preceding
  public   ConvertTimezone (org.apache.spark.sql.catalyst.expressions.Expression sourceTz, org.apache.spark.sql.catalyst.expressions.Expression targetTz, org.apache.spark.sql.catalyst.expressions.Expression sourceTs)  { throw new RuntimeException(); }
  public   ConvertTimezone (org.apache.spark.sql.catalyst.expressions.Expression targetTz, org.apache.spark.sql.catalyst.expressions.Expression sourceTs)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression first ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression second ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression third ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  Object nullSafeEval (Object srcTz, Object tgtTz, Object micros)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.ConvertTimezone withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression newFirst, org.apache.spark.sql.catalyst.expressions.Expression newSecond, org.apache.spark.sql.catalyst.expressions.Expression newThird)  { throw new RuntimeException(); }
}
