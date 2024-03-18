package org.apache.spark.graphx.impl;
public  class RoutingTablePartition$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RoutingTablePartition$ MODULE$ = null;
  public   RoutingTablePartition$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.impl.RoutingTablePartition empty ()  { throw new RuntimeException(); }
  /** Generate a `RoutingTableMessage` for each vertex referenced in `edgePartition`. */
  public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, java.lang.Object>> edgePartitionToMsgs (int pid, org.apache.spark.graphx.impl.EdgePartition<?, ?> edgePartition)  { throw new RuntimeException(); }
  /** Build a `RoutingTablePartition` from `RoutingTableMessage`s. */
  public  org.apache.spark.graphx.impl.RoutingTablePartition fromMsgs (int numEdgePartitions, scala.collection.Iterator<scala.Tuple2<java.lang.Object, java.lang.Object>> iter)  { throw new RuntimeException(); }
}
