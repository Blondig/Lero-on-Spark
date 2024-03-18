package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A logical plan node that can generate metadata columns
 */
public  interface ExposesMetadataColumns {
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withMetadataColumns ()  ;
}
