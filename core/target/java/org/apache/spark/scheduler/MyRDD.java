package org.apache.spark.scheduler;
/**
 * An RDD for passing to DAGScheduler. These RDDs will use the dependencies and
 * preferredLocations (if any) that are passed to them. They are deliberately not executable
 * so we can test that DAGScheduler does not try to execute RDDs locally.
 * <p>
 * Optionally, one can pass in a list of locations to use as preferred locations for each task,
 * and a MapOutputTrackerMaster to enable reduce task locality. We pass the tracker separately
 * because, in this test suite, it won't be the same as sc.env.mapOutputTracker.
 */
public  class MyRDD extends org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> implements scala.Serializable {
  public   MyRDD (org.apache.spark.SparkContext sc, int numPartitions, scala.collection.immutable.List<org.apache.spark.Dependency<?>> dependencies, scala.collection.Seq<scala.collection.Seq<java.lang.String>> locations, org.apache.spark.MapOutputTrackerMaster tracker, boolean indeterminate)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, java.lang.Object>> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  protected  scala.Enumeration.Value getOutputDeterministicLevel ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition partition)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
