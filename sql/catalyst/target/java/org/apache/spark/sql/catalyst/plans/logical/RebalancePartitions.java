package org.apache.spark.sql.catalyst.plans.logical;
/**
 * This operator is used to rebalance the output partitions of the given <code>child</code>, so that every
 * partition is of a reasonable size (not too small and not too big). It also try its best to
 * partition the child output by <code>partitionExpressions</code>. If there are skews, Spark will split the
 * skewed partitions, to make these partitions not too big. This operator is useful when you need
 * to write the result of <code>child</code> to a table, to avoid too small/big files.
 * <p>
 * Note that, this operator only makes sense when AQE is enabled.
 */
public  class RebalancePartitions extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.ExpressionSet validConstraints ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionExpressions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> initialNumPartitionOpt ()  { throw new RuntimeException(); }
  // not preceding
  public   RebalancePartitions (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionExpressions, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, scala.Option<java.lang.Object> initialNumPartitionOpt)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxRows ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning partitioning ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.RebalancePartitions withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
