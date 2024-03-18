package org.apache.spark.sql.catalyst.util;
/**
 * The builder to generate V2 expressions from catalyst expressions.
 */
public  class V2ExpressionBuilder {
  public   V2ExpressionBuilder (org.apache.spark.sql.catalyst.expressions.Expression e, boolean nestedPredicatePushdownEnabled, boolean isPredicate)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.PushableColumnBase pushableColumn ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.connector.expressions.Expression> build ()  { throw new RuntimeException(); }
}
