package org.apache.spark.sql.catalyst.plans.logical;
public  class Range extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.LeafNode, org.apache.spark.sql.catalyst.analysis.MultiInstanceRelation, scala.Product, scala.Serializable {
  // not preceding
  static public  org.apache.spark.sql.catalyst.plans.logical.Range apply (long start, long end, long step, int numSlices)  { throw new RuntimeException(); }
  // not preceding
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> getOutputAttrs ()  { throw new RuntimeException(); }
  static public  long toLong (org.apache.spark.sql.catalyst.expressions.Expression expression)  { throw new RuntimeException(); }
  static public  int toInt (org.apache.spark.sql.catalyst.expressions.Expression expression)  { throw new RuntimeException(); }
  public  long start ()  { throw new RuntimeException(); }
  public  long end ()  { throw new RuntimeException(); }
  public  long step ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> numSlices ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  boolean isStreaming ()  { throw new RuntimeException(); }
  public   Range (long start, long end, long step, scala.Option<java.lang.Object> numSlices, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, boolean isStreaming)  { throw new RuntimeException(); }
  public   Range (org.apache.spark.sql.catalyst.expressions.Expression start, org.apache.spark.sql.catalyst.expressions.Expression end, org.apache.spark.sql.catalyst.expressions.Expression step, org.apache.spark.sql.catalyst.expressions.Expression numSlices)  { throw new RuntimeException(); }
  public   Range (org.apache.spark.sql.catalyst.expressions.Expression start, org.apache.spark.sql.catalyst.expressions.Expression end, org.apache.spark.sql.catalyst.expressions.Expression step)  { throw new RuntimeException(); }
  public   Range (org.apache.spark.sql.catalyst.expressions.Expression start, org.apache.spark.sql.catalyst.expressions.Expression end)  { throw new RuntimeException(); }
  public   Range (org.apache.spark.sql.catalyst.expressions.Expression end)  { throw new RuntimeException(); }
  public  scala.math.BigInt numElements ()  { throw new RuntimeException(); }
  public  java.lang.String toSQL ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Range newInstance ()  { throw new RuntimeException(); }
  public  java.lang.String simpleString (int maxFields)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxRows ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxRowsPerPartition ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics computeStats ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> outputOrdering ()  { throw new RuntimeException(); }
}
