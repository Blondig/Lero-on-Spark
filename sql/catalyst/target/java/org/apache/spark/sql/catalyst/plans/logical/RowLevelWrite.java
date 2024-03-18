package org.apache.spark.sql.catalyst.plans.logical;
public  interface RowLevelWrite extends org.apache.spark.sql.catalyst.plans.logical.V2WriteCommand, org.apache.spark.sql.catalyst.plans.logical.SupportsSubquery {
  public  org.apache.spark.sql.catalyst.expressions.Expression condition ()  ;
  public  org.apache.spark.sql.connector.write.RowLevelOperation operation ()  ;
  public  org.apache.spark.sql.catalyst.analysis.NamedRelation originalTable ()  ;
}
