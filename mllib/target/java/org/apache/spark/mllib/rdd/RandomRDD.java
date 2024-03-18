package org.apache.spark.mllib.rdd;
  class RandomRDD<T extends java.lang.Object> extends org.apache.spark.rdd.RDD<T> {
  static public <T extends java.lang.Object> scala.collection.Iterator<T> getPointIterator (org.apache.spark.mllib.rdd.RandomRDDPartition<T> partition, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<org.apache.spark.mllib.linalg.Vector> getVectorIterator (org.apache.spark.mllib.rdd.RandomRDDPartition<java.lang.Object> partition, int vectorSize)  { throw new RuntimeException(); }
  // not preceding
  public   RandomRDD (org.apache.spark.SparkContext sc, long size, int numPartitions, org.apache.spark.mllib.random.RandomDataGenerator<T> rng, long seed, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<T> compute (org.apache.spark.Partition splitIn, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
}
