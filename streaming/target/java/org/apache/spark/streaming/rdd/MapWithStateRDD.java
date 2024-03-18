package org.apache.spark.streaming.rdd;
/**
 * RDD storing the keyed states of <code>mapWithState</code> operation and corresponding mapped data.
 * Each partition of this RDD has a single record of type {@link MapWithStateRDDRecord}. This contains a
 * <code>StateMap</code> (containing the keyed-states) and the sequence of records returned by the mapping
 * function of  <code>mapWithState</code>.
 * param:  prevStateRDD The previous MapWithStateRDD on whose StateMap data <code>this</code> RDD
 *                    will be created
 * param:  partitionedDataRDD The partitioned data RDD which is used update the previous StateMaps
 *                           in the <code>prevStateRDD</code> to create <code>this</code> RDD
 * param:  mappingFunction  The function that will be used to update state and return new data
 * param:  batchTime        The time of the batch to which this RDD belongs to. Use to update
 * param:  timeoutThresholdTime The time to indicate which keys are timeout
 */
  class MapWithStateRDD<K extends java.lang.Object, V extends java.lang.Object, S extends java.lang.Object, E extends java.lang.Object> extends org.apache.spark.rdd.RDD<org.apache.spark.streaming.rdd.MapWithStateRDDRecord<K, S, E>> {
  static public <K extends java.lang.Object, V extends java.lang.Object, S extends java.lang.Object, E extends java.lang.Object> org.apache.spark.streaming.rdd.MapWithStateRDD<K, V, S, E> createFromPairRDD (org.apache.spark.rdd.RDD<scala.Tuple2<K, S>> pairRDD, org.apache.spark.Partitioner partitioner, org.apache.spark.streaming.Time updateTime, scala.reflect.ClassTag<K> evidence$9, scala.reflect.ClassTag<V> evidence$10, scala.reflect.ClassTag<S> evidence$11, scala.reflect.ClassTag<E> evidence$12)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object, V extends java.lang.Object, S extends java.lang.Object, E extends java.lang.Object> org.apache.spark.streaming.rdd.MapWithStateRDD<K, V, S, E> createFromRDD (org.apache.spark.rdd.RDD<scala.Tuple3<K, S, java.lang.Object>> rdd, org.apache.spark.Partitioner partitioner, org.apache.spark.streaming.Time updateTime, scala.reflect.ClassTag<K> evidence$13, scala.reflect.ClassTag<V> evidence$14, scala.reflect.ClassTag<S> evidence$15, scala.reflect.ClassTag<E> evidence$16)  { throw new RuntimeException(); }
  // not preceding
  public   MapWithStateRDD (org.apache.spark.rdd.RDD<org.apache.spark.streaming.rdd.MapWithStateRDDRecord<K, S, E>> prevStateRDD, org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> partitionedDataRDD, scala.Function4<org.apache.spark.streaming.Time, K, scala.Option<V>, org.apache.spark.streaming.State<S>, scala.Option<E>> mappingFunction, org.apache.spark.streaming.Time batchTime, scala.Option<java.lang.Object> timeoutThresholdTime, scala.reflect.ClassTag<K> evidence$5, scala.reflect.ClassTag<V> evidence$6, scala.reflect.ClassTag<S> evidence$7, scala.reflect.ClassTag<E> evidence$8)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.Partitioner> partitioner ()  { throw new RuntimeException(); }
  public  void checkpoint ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.streaming.rdd.MapWithStateRDDRecord<K, S, E>> compute (org.apache.spark.Partition partition, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  protected  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  void clearDependencies ()  { throw new RuntimeException(); }
  public  void setFullScan ()  { throw new RuntimeException(); }
}
