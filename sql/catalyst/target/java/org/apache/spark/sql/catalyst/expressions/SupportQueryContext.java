package org.apache.spark.sql.catalyst.expressions;
/**
 * An expression with SQL query context. The context string can be serialized from the Driver
 * to executors. It will also be kept after rule transforms.
 */
public  interface SupportQueryContext extends scala.Serializable {
  public  void copyTagsFrom (org.apache.spark.sql.catalyst.expressions.Expression other)  ;
  public  java.lang.String initQueryContext ()  ;
  public  java.lang.String queryContext ()  ;
}
