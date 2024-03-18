package org.apache.spark.graphx.impl;
public  class EdgeRDDImpl<ED extends java.lang.Object, VD extends java.lang.Object> extends org.apache.spark.graphx.EdgeRDD<ED> {
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.graphx.impl.EdgePartition<ED, VD>>> partitionsRDD ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageLevel targetStorageLevel ()  { throw new RuntimeException(); }
  // not preceding
     EdgeRDDImpl (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.graphx.impl.EdgePartition<ED, VD>>> partitionsRDD, org.apache.spark.storage.StorageLevel targetStorageLevel, scala.reflect.ClassTag<ED> evidence$1, scala.reflect.ClassTag<VD> evidence$2)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.impl.EdgeRDDImpl<ED, VD> setName (java.lang.String _name)  { throw new RuntimeException(); }
  /**
   * If <code>partitionsRDD</code> already has a partitioner, use it. Otherwise assume that the
   * <code>PartitionID</code>s in <code>partitionsRDD</code> correspond to the actual partitions and create a new
   * partitioner that allows co-partitioning with <code>partitionsRDD</code>.
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.Partitioner> partitioner ()  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.Edge<ED>[] collect ()  { throw new RuntimeException(); }
  /**
   * Persists the edge partitions at the specified storage level, ignoring any existing target
   * storage level.
   * @param newLevel (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.impl.EdgeRDDImpl<ED, VD> persist (org.apache.spark.storage.StorageLevel newLevel)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.impl.EdgeRDDImpl<ED, VD> unpersist (boolean blocking)  { throw new RuntimeException(); }
  /**
   * Persists the edge partitions using <code>targetStorageLevel</code>, which defaults to MEMORY_ONLY.
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.impl.EdgeRDDImpl<ED, VD> cache ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageLevel getStorageLevel ()  { throw new RuntimeException(); }
  public  void checkpoint ()  { throw new RuntimeException(); }
  public  boolean isCheckpointed ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> getCheckpointFile ()  { throw new RuntimeException(); }
  /** The number of edges in the RDD. */
  public  long count ()  { throw new RuntimeException(); }
  public <ED2 extends java.lang.Object> org.apache.spark.graphx.impl.EdgeRDDImpl<ED2, VD> mapValues (scala.Function1<org.apache.spark.graphx.Edge<ED>, ED2> f, scala.reflect.ClassTag<ED2> evidence$3)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.impl.EdgeRDDImpl<ED, VD> reverse ()  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.impl.EdgeRDDImpl<ED, VD> filter (scala.Function1<org.apache.spark.graphx.EdgeTriplet<VD, ED>, java.lang.Object> epred, scala.Function2<java.lang.Object, VD, java.lang.Object> vpred)  { throw new RuntimeException(); }
  public <ED2 extends java.lang.Object, ED3 extends java.lang.Object> org.apache.spark.graphx.impl.EdgeRDDImpl<ED3, VD> innerJoin (org.apache.spark.graphx.EdgeRDD<ED2> other, scala.Function4<java.lang.Object, java.lang.Object, ED, ED2, ED3> f, scala.reflect.ClassTag<ED2> evidence$4, scala.reflect.ClassTag<ED3> evidence$5)  { throw new RuntimeException(); }
  public <ED2 extends java.lang.Object, VD2 extends java.lang.Object> org.apache.spark.graphx.impl.EdgeRDDImpl<ED2, VD2> mapEdgePartitions (scala.Function2<java.lang.Object, org.apache.spark.graphx.impl.EdgePartition<ED, VD>, org.apache.spark.graphx.impl.EdgePartition<ED2, VD2>> f, scala.reflect.ClassTag<ED2> evidence$6, scala.reflect.ClassTag<VD2> evidence$7)  { throw new RuntimeException(); }
   <ED2 extends java.lang.Object, VD2 extends java.lang.Object> org.apache.spark.graphx.impl.EdgeRDDImpl<ED2, VD2> withPartitionsRDD (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.graphx.impl.EdgePartition<ED2, VD2>>> partitionsRDD, scala.reflect.ClassTag<ED2> evidence$8, scala.reflect.ClassTag<VD2> evidence$9)  { throw new RuntimeException(); }
    org.apache.spark.graphx.impl.EdgeRDDImpl<ED, VD> withTargetStorageLevel (org.apache.spark.storage.StorageLevel targetStorageLevel)  { throw new RuntimeException(); }
}
