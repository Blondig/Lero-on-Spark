package org.apache.spark.sql.catalyst.expressions;
/**
 * An add-on of {@link RuntimeReplaceable}. It makes <code>replacement</code> the child of the expression, to
 * inherit the analysis rules for it, such as type coercion. The implementation should put
 * <code>replacement</code> in the case class constructor, and define a normal constructor that accepts only
 * the original parameters. For an example, see {@link TryAdd}. To make sure the explain plan and
 * expression SQL works correctly, the implementation should also implement the <code>parameters</code> method.
 */
public  interface InheritAnalysisRules extends org.apache.spark.sql.catalyst.trees.UnaryLike<org.apache.spark.sql.catalyst.expressions.Expression> {
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  ;
  public  scala.collection.Iterator<java.lang.Object> flatArguments ()  ;
  public  java.lang.String makeSQLString (scala.collection.Seq<java.lang.String> childrenSQL)  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> parameters ()  ;
  public  java.lang.String sql ()  ;
}
