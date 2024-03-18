package org.apache.spark.sql.catalyst.expressions;
/**
 * An internal scalar function that returns the membership check result (either true or false)
 * for values of <code>valueExpression</code> in the Bloom filter represented by <code>bloomFilterExpression</code>.
 * Not that since the function is "might contain", always returning true regardless is not
 * wrong.
 * Note that this expression requires that <code>bloomFilterExpression</code> is either a constant value or
 * an uncorrelated scalar subquery. This is sufficient for the Bloom filter join rewrite.
 * <p>
 * param:  bloomFilterExpression the Binary data of Bloom filter.
 * param:  valueExpression the Long value to be tested for the membership of <code>bloomFilterExpression</code>.
 */
public  class BloomFilterMightContain extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression bloomFilterExpression ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression valueExpression ()  { throw new RuntimeException(); }
  // not preceding
  public   BloomFilterMightContain (org.apache.spark.sql.catalyst.expressions.Expression bloomFilterExpression, org.apache.spark.sql.catalyst.expressions.Expression valueExpression)  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.BloomFilterMightContain withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression newBloomFilterExpression, org.apache.spark.sql.catalyst.expressions.Expression newValueExpression)  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public final  org.apache.spark.util.sketch.BloomFilter deserialize (byte[] bytes)  { throw new RuntimeException(); }
}
