package org.apache.spark.sql.catalyst.expressions;
/**
 * An expression that is evaluated to the first non-null input.
 * <p>
 * <pre><code>
 *   coalesce(1, 2) =&gt; 1
 *   coalesce(null, 1, 2) =&gt; 1
 *   coalesce(null, null, 2) =&gt; 2
 *   coalesce(null, null, null) =&gt; null
 * </code></pre>
 */
public  class Coalesce extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.ComplexTypeMergingExpression, org.apache.spark.sql.catalyst.expressions.ConditionalExpression, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> inputTypesForMerging ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  // not preceding
  public   Coalesce (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children)  { throw new RuntimeException(); }
  /** Coalesce is nullable if all of its children are nullable, or if it has no children. */
  public  boolean nullable ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  /**
   * We should only return the first child, because others may not get accessed.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> alwaysEvaluatedInputs ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> branchGroups ()  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Coalesce withNewChildrenInternal (scala.collection.IndexedSeq<org.apache.spark.sql.catalyst.expressions.Expression> newChildren)  { throw new RuntimeException(); }
}
