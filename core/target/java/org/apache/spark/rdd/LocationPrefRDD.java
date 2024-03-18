package org.apache.spark.rdd;
/** Alters the preferred locations of the parent RDD using provided function. */
public  class LocationPrefRDD<T extends java.lang.Object> extends org.apache.spark.rdd.RDD<T> {
  // not preceding
  public   LocationPrefRDD (org.apache.spark.rdd.RDD<T> prev, scala.Function1<org.apache.spark.Partition, scala.collection.Seq<java.lang.String>> locationPicker, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<T> compute (org.apache.spark.Partition partition, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  protected  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition partition)  { throw new RuntimeException(); }
  public  scala.Function1<org.apache.spark.Partition, scala.collection.Seq<java.lang.String>> locationPicker ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<T> prev ()  { throw new RuntimeException(); }
}
