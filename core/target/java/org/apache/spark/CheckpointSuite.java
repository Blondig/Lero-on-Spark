package org.apache.spark;
/**
 * Test suite for end-to-end checkpointing functionality.
 * This tests both reliable checkpoints and local checkpoints.
 */
public  class CheckpointSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.RDDCheckpointTester, org.apache.spark.LocalSparkContext {
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.collection.Iterable<V>[]>> cogroup (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> first, org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> second, org.apache.spark.Partitioner part, scala.reflect.ClassTag<K> evidence$3, scala.reflect.ClassTag<V> evidence$4)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  protected  org.apache.spark.HashPartitioner partitioner ()  { throw new RuntimeException(); }
  public   CheckpointSuite ()  { throw new RuntimeException(); }
  public  void beforeEach ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
}
