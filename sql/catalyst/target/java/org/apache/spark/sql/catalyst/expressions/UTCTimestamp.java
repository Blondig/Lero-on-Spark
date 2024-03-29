package org.apache.spark.sql.catalyst.expressions;
public  interface UTCTimestamp extends org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.expressions.NullIntolerant {
  public  org.apache.spark.sql.types.DataType dataType ()  ;
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  ;
  public  scala.Function2<java.lang.Object, java.lang.String, java.lang.Object> func ()  ;
  public  java.lang.String funcName ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  ;
  public  Object nullSafeEval (Object time, Object timezone)  ;
}
