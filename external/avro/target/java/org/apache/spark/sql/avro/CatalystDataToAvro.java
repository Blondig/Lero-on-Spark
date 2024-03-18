package org.apache.spark.sql.avro;
  class CatalystDataToAvro extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> jsonFormatSchema ()  { throw new RuntimeException(); }
  // not preceding
  public   CatalystDataToAvro (org.apache.spark.sql.catalyst.expressions.Expression child, scala.Option<java.lang.String> jsonFormatSchema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  Object nullSafeEval (Object input)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.avro.CatalystDataToAvro withNewChildInternal (org.apache.spark.sql.catalyst.expressions.Expression newChild)  { throw new RuntimeException(); }
}
