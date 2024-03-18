package org.apache.spark.sql.catalyst.plans.logical;
public  interface V2PartitionCommand extends org.apache.spark.sql.catalyst.plans.logical.UnaryCommand {
  public  boolean allowPartialPartitionSpec ()  ;
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  ;
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan table ()  ;
}
