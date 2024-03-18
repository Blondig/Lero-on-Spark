package org.apache.spark.sql.execution.datasources;
/**
 * Bucketing specification for all the write tasks.
 * <p>
 * param:  bucketIdExpression Expression to calculate bucket id based on bucket column(s).
 * param:  bucketFileNamePrefix Prefix of output file name based on bucket id.
 */
public  class WriterBucketSpec implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression bucketIdExpression ()  { throw new RuntimeException(); }
  public  scala.Function1<java.lang.Object, java.lang.String> bucketFileNamePrefix ()  { throw new RuntimeException(); }
  // not preceding
  public   WriterBucketSpec (org.apache.spark.sql.catalyst.expressions.Expression bucketIdExpression, scala.Function1<java.lang.Object, java.lang.String> bucketFileNamePrefix)  { throw new RuntimeException(); }
}
