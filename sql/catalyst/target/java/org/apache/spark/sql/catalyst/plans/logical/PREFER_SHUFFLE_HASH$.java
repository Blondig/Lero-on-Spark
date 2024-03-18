package org.apache.spark.sql.catalyst.plans.logical;
/**
 * An internal hint to encourage shuffle hash join, used by adaptive query execution.
 */
public  class PREFER_SHUFFLE_HASH$ extends org.apache.spark.sql.catalyst.plans.logical.JoinStrategyHint implements scala.Product, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PREFER_SHUFFLE_HASH$ MODULE$ = null;
  public   PREFER_SHUFFLE_HASH$ ()  { throw new RuntimeException(); }
  public  java.lang.String displayName ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> hintAliases ()  { throw new RuntimeException(); }
}
