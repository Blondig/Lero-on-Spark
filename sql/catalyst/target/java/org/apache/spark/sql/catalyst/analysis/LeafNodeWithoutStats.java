package org.apache.spark.sql.catalyst.analysis;
/**
 * A resolved leaf node whose statistics has no meaning.
 */
public  interface LeafNodeWithoutStats extends org.apache.spark.sql.catalyst.plans.logical.LeafNode {
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics stats ()  ;
}
