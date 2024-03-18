package org.apache.spark.sql.execution.joins;
/**
 * Holds common logic for join operators by shuffling two child relations
 * using the join keys.
 */
public  interface ShuffledJoin extends org.apache.spark.sql.execution.joins.JoinCodegenSupport {
  public  boolean isSkewJoin ()  ;
  public  java.lang.String nodeName ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  ;
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.Distribution> requiredChildDistribution ()  ;
  public  scala.collection.Iterator<java.lang.Object> stringArgs ()  ;
}