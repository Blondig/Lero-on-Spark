package org.apache.spark.sql.catalyst.plans.physical;
/**
 * Represents the requirement of distribution on the stateful operator in Structured Streaming.
 * <p>
 * Each partition in stateful operator initializes state store(s), which are independent with state
 * store(s) in other partitions. Since it is not possible to repartition the data in state store,
 * Spark should make sure the physical partitioning of the stateful operator is unchanged across
 * Spark versions. Violation of this requirement may bring silent correctness issue.
 * <p>
 * Since this distribution relies on {@link HashPartitioning} on the physical partitioning of the
 * stateful operator, only {@link HashPartitioning} (and HashPartitioning in
 * {@link PartitioningCollection}) can satisfy this distribution.
 * When <code>_requiredNumPartitions</code> is 1, {@link SinglePartition} is essentially same as
 * {@link HashPartitioning}, so it can satisfy this distribution as well.
 * <p>
 * NOTE: This is applied only to stream-stream join as of now. For other stateful operators, we
 * have been using ClusteredDistribution, which could construct the physical partitioning of the
 * state in different way (ClusteredDistribution requires relaxed condition and multiple
 * partitionings can satisfy the requirement.) We need to construct the way to fix this with
 * minimizing possibility to break the existing checkpoints.
 * <p>
 * TODO(SPARK-38204): address the issue explained in above note.
 */
public  class StatefulOpClusteredDistribution implements org.apache.spark.sql.catalyst.plans.physical.Distribution, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions ()  { throw new RuntimeException(); }
  public  int _requiredNumPartitions ()  { throw new RuntimeException(); }
  // not preceding
  public   StatefulOpClusteredDistribution (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, int _requiredNumPartitions)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> requiredNumPartitions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning createPartitioning (int numPartitions)  { throw new RuntimeException(); }
}
