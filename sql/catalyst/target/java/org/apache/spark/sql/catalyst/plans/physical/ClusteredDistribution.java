package org.apache.spark.sql.catalyst.plans.physical;
/**
 * Represents data where tuples that share the same values for the <code>clustering</code>
 * {@link Expression Expressions} will be co-located in the same partition.
 * <p>
 * param:  requireAllClusterKeys When true, <code>Partitioning</code> which satisfies this distribution,
 *                              must match all <code>clustering</code> expressions in the same ordering.
 */
public  class ClusteredDistribution implements org.apache.spark.sql.catalyst.plans.physical.Distribution, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> clustering ()  { throw new RuntimeException(); }
  public  boolean requireAllClusterKeys ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> requiredNumPartitions ()  { throw new RuntimeException(); }
  // not preceding
  public   ClusteredDistribution (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> clustering, boolean requireAllClusterKeys, scala.Option<java.lang.Object> requiredNumPartitions)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning createPartitioning (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Checks if <code>expressions</code> match all <code>clustering</code> expressions in the same ordering.
   * <p>
   * <code>Partitioning</code> should call this to check its expressions when <code>requireAllClusterKeys</code>
   * is set to true.
   * @param expressions (undocumented)
   * @return (undocumented)
   */
  public  boolean areAllClusterKeysMatched (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions)  { throw new RuntimeException(); }
}
