package org.apache.spark.executor;
public  class FetchFailureHidingRDD extends org.apache.spark.rdd.RDD<java.lang.Object> {
  // not preceding
  public   FetchFailureHidingRDD (org.apache.spark.SparkContext sc, org.apache.spark.executor.FetchFailureThrowingRDD input, boolean throwOOM, boolean interrupt)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.Object> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  protected  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  org.apache.spark.executor.FetchFailureThrowingRDD input ()  { throw new RuntimeException(); }
}
