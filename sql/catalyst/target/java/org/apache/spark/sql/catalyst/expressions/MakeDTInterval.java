package org.apache.spark.sql.catalyst.expressions;
public  class MakeDTInterval extends org.apache.spark.sql.catalyst.expressions.QuaternaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.expressions.NullIntolerant, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression days ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression hours ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression mins ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression secs ()  { throw new RuntimeException(); }
  // not preceding
  public   MakeDTInterval (org.apache.spark.sql.catalyst.expressions.Expression days, org.apache.spark.sql.catalyst.expressions.Expression hours, org.apache.spark.sql.catalyst.expressions.Expression mins, org.apache.spark.sql.catalyst.expressions.Expression secs)  { throw new RuntimeException(); }
  public   MakeDTInterval (org.apache.spark.sql.catalyst.expressions.Expression days, org.apache.spark.sql.catalyst.expressions.Expression hours, org.apache.spark.sql.catalyst.expressions.Expression mins)  { throw new RuntimeException(); }
  public   MakeDTInterval (org.apache.spark.sql.catalyst.expressions.Expression days, org.apache.spark.sql.catalyst.expressions.Expression hours)  { throw new RuntimeException(); }
  public   MakeDTInterval (org.apache.spark.sql.catalyst.expressions.Expression days)  { throw new RuntimeException(); }
  public   MakeDTInterval ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression first ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression second ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression third ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression fourth ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  Object nullSafeEval (Object day, Object hour, Object min, Object sec)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.MakeDTInterval withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression days, org.apache.spark.sql.catalyst.expressions.Expression hours, org.apache.spark.sql.catalyst.expressions.Expression mins, org.apache.spark.sql.catalyst.expressions.Expression secs)  { throw new RuntimeException(); }
}
