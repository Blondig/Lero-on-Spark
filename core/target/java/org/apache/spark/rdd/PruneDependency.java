package org.apache.spark.rdd;
/**
 * Represents a dependency between the PartitionPruningRDD and its parent. In this
 * case, the child RDD contains a subset of partitions of the parents'.
 */
  class PruneDependency<T extends java.lang.Object> extends org.apache.spark.NarrowDependency<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PruneDependency (org.apache.spark.rdd.RDD<T> rdd, scala.Function1<java.lang.Object, java.lang.Object> partitionFilterFunc)  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<java.lang.Object> getParents (int partitionId)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] partitions ()  { throw new RuntimeException(); }
}
