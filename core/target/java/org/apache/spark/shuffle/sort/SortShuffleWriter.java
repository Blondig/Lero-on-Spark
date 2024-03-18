package org.apache.spark.shuffle.sort;
  class SortShuffleWriter<K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> extends org.apache.spark.shuffle.ShuffleWriter<K, V> implements org.apache.spark.internal.Logging {
  static public  boolean shouldBypassMergeSort (org.apache.spark.SparkConf conf, org.apache.spark.ShuffleDependency<?, ?, ?> dep)  { throw new RuntimeException(); }
  public   SortShuffleWriter (org.apache.spark.shuffle.BaseShuffleHandle<K, V, C> handle, long mapId, org.apache.spark.TaskContext context, org.apache.spark.shuffle.api.ShuffleExecutorComponents shuffleExecutorComponents)  { throw new RuntimeException(); }
  /** Write a bunch of records to this task's output */
  public  void write (scala.collection.Iterator<scala.Product2<K, V>> records)  { throw new RuntimeException(); }
  /** Close this writer, passing along whether the map completed */
  public  scala.Option<org.apache.spark.scheduler.MapStatus> stop (boolean success)  { throw new RuntimeException(); }
  public  long[] getPartitionLengths ()  { throw new RuntimeException(); }
}
