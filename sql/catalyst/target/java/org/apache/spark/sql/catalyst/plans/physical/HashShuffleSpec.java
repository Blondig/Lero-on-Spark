package org.apache.spark.sql.catalyst.plans.physical;
public  class HashShuffleSpec implements org.apache.spark.sql.catalyst.plans.physical.ShuffleSpec, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.HashPartitioning partitioning ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.ClusteredDistribution distribution ()  { throw new RuntimeException(); }
  // not preceding
  public   HashShuffleSpec (org.apache.spark.sql.catalyst.plans.physical.HashPartitioning partitioning, org.apache.spark.sql.catalyst.plans.physical.ClusteredDistribution distribution)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<scala.collection.mutable.BitSet> hashKeyPositions ()  { throw new RuntimeException(); }
  public  boolean isCompatibleWith (org.apache.spark.sql.catalyst.plans.physical.ShuffleSpec other)  { throw new RuntimeException(); }
  public  boolean canCreatePartitioning ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning createPartitioning (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> clustering)  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
}
