package org.apache.spark.sql.catalyst.plans.physical;
public  class SinglePartitionShuffleSpec$ implements org.apache.spark.sql.catalyst.plans.physical.ShuffleSpec, scala.Product, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SinglePartitionShuffleSpec$ MODULE$ = null;
  public   SinglePartitionShuffleSpec$ ()  { throw new RuntimeException(); }
  public  boolean isCompatibleWith (org.apache.spark.sql.catalyst.plans.physical.ShuffleSpec other)  { throw new RuntimeException(); }
  public  boolean canCreatePartitioning ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning createPartitioning (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> clustering)  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
}
