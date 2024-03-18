package org.apache.spark.sql.catalyst.plans.logical;
/** Factory for constructing new `Range` nodes. */
public  class Range$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Range$ MODULE$ = null;
  public   Range$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.Range apply (long start, long end, long step, int numSlices)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> getOutputAttrs ()  { throw new RuntimeException(); }
  public  long toLong (org.apache.spark.sql.catalyst.expressions.Expression expression)  { throw new RuntimeException(); }
  public  int toInt (org.apache.spark.sql.catalyst.expressions.Expression expression)  { throw new RuntimeException(); }
}
