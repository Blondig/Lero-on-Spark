package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The base trait for commands that need to alter a v2 table with {@link TableChange}s.
 */
public  interface AlterTableCommand extends org.apache.spark.sql.catalyst.plans.logical.UnaryCommand {
  public  scala.collection.Seq<org.apache.spark.sql.connector.catalog.TableChange> changes ()  ;
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  ;
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan table ()  ;
}
