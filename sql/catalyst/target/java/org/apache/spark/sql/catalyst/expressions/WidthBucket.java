package org.apache.spark.sql.catalyst.expressions;
public  class WidthBucket extends org.apache.spark.sql.catalyst.expressions.QuaternaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.expressions.NullIntolerant, scala.Product, scala.Serializable {
  static public  java.lang.Long computeBucketNumber (double value, double min, double max, long numBucket)  { throw new RuntimeException(); }
  /** This function is called by generated Java code, so it needs to be public. */
  static public  boolean isNull (double value, double min, double max, long numBucket)  { throw new RuntimeException(); }
  /** This function is called by generated Java code, so it needs to be public. */
  static public  java.lang.Long computeBucketNumberNotNull (double value, double min, double max, long numBucket)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression value ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression minValue ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression maxValue ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression numBucket ()  { throw new RuntimeException(); }
  // not preceding
  public   WidthBucket (org.apache.spark.sql.catalyst.expressions.Expression value, org.apache.spark.sql.catalyst.expressions.Expression minValue, org.apache.spark.sql.catalyst.expressions.Expression maxValue, org.apache.spark.sql.catalyst.expressions.Expression numBucket)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object input, Object min, Object max, Object numBucket)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression first ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression second ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression third ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression fourth ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.WidthBucket withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression first, org.apache.spark.sql.catalyst.expressions.Expression second, org.apache.spark.sql.catalyst.expressions.Expression third, org.apache.spark.sql.catalyst.expressions.Expression fourth)  { throw new RuntimeException(); }
}
