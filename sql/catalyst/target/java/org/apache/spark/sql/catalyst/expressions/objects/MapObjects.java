package org.apache.spark.sql.catalyst.expressions.objects;
public  class MapObjects extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.NonSQLExpression, org.apache.spark.sql.catalyst.trees.TernaryLike<org.apache.spark.sql.catalyst.expressions.Expression>, scala.Product, scala.Serializable {
  /**
   * Construct an instance of MapObjects case class.
   * <p>
   * @param function The function applied on the collection elements.
   * @param inputData An expression that when evaluated returns a collection object.
   * @param elementType The data type of elements in the collection.
   * @param elementNullable When false, indicating elements in the collection are always
   *                        non-null value.
   * @param customCollectionCls Class of the resulting collection (returning ObjectType)
   *                            or None (returning ArrayType)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.expressions.objects.MapObjects apply (scala.Function1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> function, org.apache.spark.sql.catalyst.expressions.Expression inputData, org.apache.spark.sql.types.DataType elementType, boolean elementNullable, scala.Option<java.lang.Class<?>> customCollectionCls)  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.objects.LambdaVariable loopVar ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression lambdaFunction ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression inputData ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Class<?>> customCollectionCls ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression first ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression second ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression third ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression newFirst, org.apache.spark.sql.catalyst.expressions.Expression newSecond, org.apache.spark.sql.catalyst.expressions.Expression newThird)  { throw new RuntimeException(); }
}
