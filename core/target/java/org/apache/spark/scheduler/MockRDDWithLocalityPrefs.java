package org.apache.spark.scheduler;
public  class MockRDDWithLocalityPrefs extends org.apache.spark.scheduler.MockRDD {
  // not preceding
  public   MockRDDWithLocalityPrefs (org.apache.spark.SparkContext sc, int numPartitions, scala.collection.Seq<org.apache.spark.ShuffleDependency<java.lang.Object, java.lang.Object, scala.runtime.Nothing$>> shuffleDeps, java.lang.String preferredLoc)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
  public  java.lang.String preferredLoc ()  { throw new RuntimeException(); }
}
