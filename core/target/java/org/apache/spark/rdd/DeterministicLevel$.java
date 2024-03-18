package org.apache.spark.rdd;
/**
 * The deterministic level of RDD's output (i.e. what <code>RDD#compute</code> returns). This explains how
 * the output will diff when Spark reruns the tasks for the RDD. There are 3 deterministic levels:
 * 1. DETERMINATE: The RDD output is always the same data set in the same order after a rerun.
 * 2. UNORDERED: The RDD output is always the same data set but the order can be different
 *               after a rerun.
 * 3. INDETERMINATE. The RDD output can be different after a rerun.
 * <p>
 * Note that, the output of an RDD usually relies on the parent RDDs. When the parent RDD's output
 * is INDETERMINATE, it's very likely the RDD's output is also INDETERMINATE.
 */
public  class DeterministicLevel$ extends scala.Enumeration {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DeterministicLevel$ MODULE$ = null;
  public   DeterministicLevel$ ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value DETERMINATE ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value UNORDERED ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value INDETERMINATE ()  { throw new RuntimeException(); }
}
