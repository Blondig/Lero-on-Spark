package org.apache.spark.mllib.rdd;
  class RandomVectorRDD extends org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> {
  // not preceding
  public   RandomVectorRDD (org.apache.spark.SparkContext sc, long size, int vectorSize, int numPartitions, org.apache.spark.mllib.random.RandomDataGenerator<java.lang.Object> rng, long seed)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.mllib.linalg.Vector> compute (org.apache.spark.Partition splitIn, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  protected  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
}
