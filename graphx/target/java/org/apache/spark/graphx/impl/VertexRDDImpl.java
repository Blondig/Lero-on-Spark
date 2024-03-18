package org.apache.spark.graphx.impl;
public  class VertexRDDImpl<VD extends java.lang.Object> extends org.apache.spark.graphx.VertexRDD<VD> {
  public  org.apache.spark.rdd.RDD<org.apache.spark.graphx.impl.ShippableVertexPartition<VD>> partitionsRDD ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageLevel targetStorageLevel ()  { throw new RuntimeException(); }
  protected  scala.reflect.ClassTag<VD> vdTag ()  { throw new RuntimeException(); }
  // not preceding
     VertexRDDImpl (org.apache.spark.rdd.RDD<org.apache.spark.graphx.impl.ShippableVertexPartition<VD>> partitionsRDD, org.apache.spark.storage.StorageLevel targetStorageLevel, scala.reflect.ClassTag<VD> vdTag)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.VertexRDD<VD> reindex ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.Partitioner> partitioner ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition s)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.impl.VertexRDDImpl<VD> setName (java.lang.String _name)  { throw new RuntimeException(); }
  /**
   * Persists the vertex partitions at the specified storage level, ignoring any existing target
   * storage level.
   * @param newLevel (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.impl.VertexRDDImpl<VD> persist (org.apache.spark.storage.StorageLevel newLevel)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.impl.VertexRDDImpl<VD> unpersist (boolean blocking)  { throw new RuntimeException(); }
  /**
   * Persists the vertex partitions at <code>targetStorageLevel</code>, which defaults to MEMORY_ONLY.
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.impl.VertexRDDImpl<VD> cache ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageLevel getStorageLevel ()  { throw new RuntimeException(); }
  public  void checkpoint ()  { throw new RuntimeException(); }
  public  boolean isCheckpointed ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> getCheckpointFile ()  { throw new RuntimeException(); }
  /** The number of vertices in the RDD. */
  public  long count ()  { throw new RuntimeException(); }
   <VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> mapVertexPartitions (scala.Function1<org.apache.spark.graphx.impl.ShippableVertexPartition<VD>, org.apache.spark.graphx.impl.ShippableVertexPartition<VD2>> f, scala.reflect.ClassTag<VD2> evidence$1)  { throw new RuntimeException(); }
  public <VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> mapValues (scala.Function1<VD, VD2> f, scala.reflect.ClassTag<VD2> evidence$2)  { throw new RuntimeException(); }
  public <VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> mapValues (scala.Function2<java.lang.Object, VD, VD2> f, scala.reflect.ClassTag<VD2> evidence$3)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.VertexRDD<VD> minus (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> other)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.VertexRDD<VD> minus (org.apache.spark.graphx.VertexRDD<VD> other)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.VertexRDD<VD> diff (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> other)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.VertexRDD<VD> diff (org.apache.spark.graphx.VertexRDD<VD> other)  { throw new RuntimeException(); }
  public <VD2 extends java.lang.Object, VD3 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD3> leftZipJoin (org.apache.spark.graphx.VertexRDD<VD2> other, scala.Function3<java.lang.Object, VD, scala.Option<VD2>, VD3> f, scala.reflect.ClassTag<VD2> evidence$4, scala.reflect.ClassTag<VD3> evidence$5)  { throw new RuntimeException(); }
  public <VD2 extends java.lang.Object, VD3 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD3> leftJoin (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD2>> other, scala.Function3<java.lang.Object, VD, scala.Option<VD2>, VD3> f, scala.reflect.ClassTag<VD2> evidence$6, scala.reflect.ClassTag<VD3> evidence$7)  { throw new RuntimeException(); }
  public <U extends java.lang.Object, VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> innerZipJoin (org.apache.spark.graphx.VertexRDD<U> other, scala.Function3<java.lang.Object, VD, U, VD2> f, scala.reflect.ClassTag<U> evidence$8, scala.reflect.ClassTag<VD2> evidence$9)  { throw new RuntimeException(); }
  public <U extends java.lang.Object, VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> innerJoin (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, U>> other, scala.Function3<java.lang.Object, VD, U, VD2> f, scala.reflect.ClassTag<U> evidence$10, scala.reflect.ClassTag<VD2> evidence$11)  { throw new RuntimeException(); }
  public <VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> aggregateUsingIndex (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD2>> messages, scala.Function2<VD2, VD2, VD2> reduceFunc, scala.reflect.ClassTag<VD2> evidence$12)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.VertexRDD<VD> reverseRoutingTables ()  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.VertexRDD<VD> withEdges (org.apache.spark.graphx.EdgeRDD<?> edges)  { throw new RuntimeException(); }
   <VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> withPartitionsRDD (org.apache.spark.rdd.RDD<org.apache.spark.graphx.impl.ShippableVertexPartition<VD2>> partitionsRDD, scala.reflect.ClassTag<VD2> evidence$13)  { throw new RuntimeException(); }
    org.apache.spark.graphx.VertexRDD<VD> withTargetStorageLevel (org.apache.spark.storage.StorageLevel targetStorageLevel)  { throw new RuntimeException(); }
    org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.graphx.impl.VertexAttributeBlock<VD>>> shipVertexAttributes (boolean shipSrc, boolean shipDst)  { throw new RuntimeException(); }
    org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, long[]>> shipVertexIds ()  { throw new RuntimeException(); }
}
