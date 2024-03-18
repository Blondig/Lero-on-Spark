package org.apache.spark.rdd;
  class ParallelCollectionRDD<T extends java.lang.Object> extends org.apache.spark.rdd.RDD<T> {
  /**
   * Slice a collection into numSlices sub-collections. One extra thing we do here is to treat Range
   * collections specially, encoding the slices as other Ranges to minimize memory cost. This makes
   * it efficient to run Spark over RDDs representing large sets of numbers. And if the collection
   * is an inclusive Range, we use inclusive range for the last slice.
   * @param seq (undocumented)
   * @param numSlices (undocumented)
   * @param evidence$3 (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> scala.collection.Seq<scala.collection.Seq<T>> slice (scala.collection.Seq<T> seq, int numSlices, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  // not preceding
  public   ParallelCollectionRDD (org.apache.spark.SparkContext sc, scala.collection.Seq<T> data, int numSlices, scala.collection.Map<java.lang.Object, scala.collection.Seq<java.lang.String>> locationPrefs, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<T> compute (org.apache.spark.Partition s, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition s)  { throw new RuntimeException(); }
}
