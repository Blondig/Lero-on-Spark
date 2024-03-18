package org.apache.spark.rdd;
/**
 * An RDD that has no partitions and no elements.
 */
  class EmptyRDD<T extends java.lang.Object> extends org.apache.spark.rdd.RDD<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   EmptyRDD (org.apache.spark.SparkContext sc, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<T> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
}
