package org.apache.spark.graphx;
/**
 * <code>EdgeRDD[ED, VD]</code> extends <code>RDD[Edge[ED}</code> by storing the edges in columnar format on each
 * partition for performance. It may additionally store the vertex attributes associated with each
 * edge to provide the triplet view. Shipping of the vertex attributes is managed by
 * <code>impl.ReplicatedVertexView</code>.
 */
public abstract class EdgeRDD<ED extends java.lang.Object> extends org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<ED>> {
  /**
   * Creates an EdgeRDD from a set of edges.
   * <p>
   * @tparam ED the edge attribute type
   * @tparam VD the type of the vertex attributes that may be joined with the returned EdgeRDD
   * @param edges (undocumented)
   * @param evidence$4 (undocumented)
   * @param evidence$5 (undocumented)
   * @return (undocumented)
   */
  static public <ED extends java.lang.Object, VD extends java.lang.Object> org.apache.spark.graphx.impl.EdgeRDDImpl<ED, VD> fromEdges (org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<ED>> edges, scala.reflect.ClassTag<ED> evidence$4, scala.reflect.ClassTag<VD> evidence$5)  { throw new RuntimeException(); }
  /**
   * Creates an EdgeRDD from already-constructed edge partitions.
   * <p>
   * @tparam ED the edge attribute type
   * @tparam VD the type of the vertex attributes that may be joined with the returned EdgeRDD
   * @param edgePartitions (undocumented)
   * @param evidence$6 (undocumented)
   * @param evidence$7 (undocumented)
   * @return (undocumented)
   */
  static  <ED extends java.lang.Object, VD extends java.lang.Object> org.apache.spark.graphx.impl.EdgeRDDImpl<ED, VD> fromEdgePartitions (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.graphx.impl.EdgePartition<ED, VD>>> edgePartitions, scala.reflect.ClassTag<ED> evidence$6, scala.reflect.ClassTag<VD> evidence$7)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   EdgeRDD (org.apache.spark.SparkContext sc, scala.collection.Seq<org.apache.spark.Dependency<?>> deps)  { throw new RuntimeException(); }
   abstract  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.graphx.impl.EdgePartition<ED, java.lang.Object>>> partitionsRDD ()  ;
  protected  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.graphx.Edge<ED>> compute (org.apache.spark.Partition part, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  /**
   * Map the values in an edge partitioning preserving the structure but changing the values.
   * <p>
   * @tparam ED2 the new edge value type
   * @param f the function from an edge to a new edge value
   * @return a new EdgeRDD containing the new edge values
   * @param evidence$1 (undocumented)
   */
  public abstract <ED2 extends java.lang.Object> org.apache.spark.graphx.EdgeRDD<ED2> mapValues (scala.Function1<org.apache.spark.graphx.Edge<ED>, ED2> f, scala.reflect.ClassTag<ED2> evidence$1)  ;
  /**
   * Reverse all the edges in this RDD.
   * <p>
   * @return a new EdgeRDD containing all the edges reversed
   */
  public abstract  org.apache.spark.graphx.EdgeRDD<ED> reverse ()  ;
  /**
   * Inner joins this EdgeRDD with another EdgeRDD, assuming both are partitioned using the same
   * {@link PartitionStrategy}.
   * <p>
   * @param other the EdgeRDD to join with
   * @param f the join function applied to corresponding values of <code>this</code> and <code>other</code>
   * @return a new EdgeRDD containing only edges that appear in both <code>this</code> and <code>other</code>,
   *         with values supplied by <code>f</code>
   * @param evidence$2 (undocumented)
   * @param evidence$3 (undocumented)
   */
  public abstract <ED2 extends java.lang.Object, ED3 extends java.lang.Object> org.apache.spark.graphx.EdgeRDD<ED3> innerJoin (org.apache.spark.graphx.EdgeRDD<ED2> other, scala.Function4<java.lang.Object, java.lang.Object, ED, ED2, ED3> f, scala.reflect.ClassTag<ED2> evidence$2, scala.reflect.ClassTag<ED3> evidence$3)  ;
  /**
   * Changes the target storage level while preserving all other properties of the
   * EdgeRDD. Operations on the returned EdgeRDD will preserve this storage level.
   * <p>
   * This does not actually trigger a cache; to do this, call
   * {@link org.apache.spark.graphx.EdgeRDD#cache} on the returned EdgeRDD.
   * @param targetStorageLevel (undocumented)
   * @return (undocumented)
   */
   abstract  org.apache.spark.graphx.EdgeRDD<ED> withTargetStorageLevel (org.apache.spark.storage.StorageLevel targetStorageLevel)  ;
}
