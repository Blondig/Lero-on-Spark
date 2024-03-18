package org.apache.spark.executor;
public  class FetchFailureThrowingRDD extends org.apache.spark.rdd.RDD<java.lang.Object> {
  public   FetchFailureThrowingRDD (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.Object> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  protected  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
}
