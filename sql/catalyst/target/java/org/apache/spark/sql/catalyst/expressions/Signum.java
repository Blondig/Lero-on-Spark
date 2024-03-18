package org.apache.spark.sql.catalyst.expressions;
public  class Signum extends org.apache.spark.sql.catalyst.expressions.UnaryMathExpression implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  // not preceding
  public   Signum (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object input)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Signum withNewChildInternal (org.apache.spark.sql.catalyst.expressions.Expression newChild)  { throw new RuntimeException(); }
}
