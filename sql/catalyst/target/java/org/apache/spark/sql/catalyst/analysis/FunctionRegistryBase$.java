package org.apache.spark.sql.catalyst.analysis;
public  class FunctionRegistryBase$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FunctionRegistryBase$ MODULE$ = null;
  public   FunctionRegistryBase$ ()  { throw new RuntimeException(); }
  /**
   * Return an expression info and a function builder for the function as defined by
   * T using the given name.
   * @param name (undocumented)
   * @param since (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Tuple2<org.apache.spark.sql.catalyst.expressions.ExpressionInfo, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, T>> build (java.lang.String name, scala.Option<java.lang.String> since, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * Creates an {@link ExpressionInfo} for the function as defined by T using the given name.
   * @param name (undocumented)
   * @param since (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.sql.catalyst.expressions.ExpressionInfo expressionInfo (java.lang.String name, scala.Option<java.lang.String> since, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
}
