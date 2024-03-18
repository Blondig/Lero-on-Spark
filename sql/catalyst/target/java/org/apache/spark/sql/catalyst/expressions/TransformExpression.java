package org.apache.spark.sql.catalyst.expressions;
/**
 * Represents a partition transform expression, for instance, <code>bucket</code>, <code>days</code>, <code>years</code>, etc.
 * <p>
 * param:  function the transform function itself. Spark will use it to decide whether two
 *                 partition transform expressions are compatible.
 * param:  numBucketsOpt the number of buckets if the transform is <code>bucket</code>. Unset otherwise.
 */
public  class TransformExpression extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.functions.BoundFunction function ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> numBucketsOpt ()  { throw new RuntimeException(); }
  // not preceding
  public   TransformExpression (org.apache.spark.sql.connector.catalog.functions.BoundFunction function, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children, scala.Option<java.lang.Object> numBucketsOpt)  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  /**
   * Whether this {@link TransformExpression} has the same semantics as <code>other</code>.
   * For instance, <code>bucket(32, c)</code> is equal to <code>bucket(32, d)</code>, but not to <code>bucket(16, d)</code> or
   * <code>year(c)</code>.
   * <p>
   * This will be used, for instance, by Spark to determine whether storage-partitioned join can
   * be triggered, by comparing partition transforms from both sides of the join and checking
   * whether they are compatible.
   * <p>
   * @param other the transform expression to compare to
   * @return true if this and <code>other</code> has the same semantics w.r.t to transform, false otherwise.
   */
  public  boolean isSameFunction (org.apache.spark.sql.catalyst.expressions.TransformExpression other)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression withNewChildrenInternal (scala.collection.IndexedSeq<org.apache.spark.sql.catalyst.expressions.Expression> newChildren)  { throw new RuntimeException(); }
}
