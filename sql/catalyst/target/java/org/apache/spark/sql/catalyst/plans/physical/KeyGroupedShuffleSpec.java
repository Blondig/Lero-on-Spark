package org.apache.spark.sql.catalyst.plans.physical;
public  class KeyGroupedShuffleSpec implements org.apache.spark.sql.catalyst.plans.physical.ShuffleSpec, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.KeyGroupedPartitioning partitioning ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.ClusteredDistribution distribution ()  { throw new RuntimeException(); }
  // not preceding
  public   KeyGroupedShuffleSpec (org.apache.spark.sql.catalyst.plans.physical.KeyGroupedPartitioning partitioning, org.apache.spark.sql.catalyst.plans.physical.ClusteredDistribution distribution)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<scala.collection.mutable.BitSet> keyPositions ()  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  public  boolean isCompatibleWith (org.apache.spark.sql.catalyst.plans.physical.ShuffleSpec other)  { throw new RuntimeException(); }
  public  boolean canCreatePartitioning ()  { throw new RuntimeException(); }
}
