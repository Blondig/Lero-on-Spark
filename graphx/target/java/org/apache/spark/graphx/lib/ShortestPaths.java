package org.apache.spark.graphx.lib;
/**
 * Computes shortest paths to the given set of landmark vertices, returning a graph where each
 * vertex attribute is a map containing the shortest-path distance to each reachable landmark.
 */
public  class ShortestPaths {
  /**
   * Computes shortest paths to the given set of landmark vertices.
   * <p>
   * @tparam ED the edge attribute type (not used in the computation)
   * <p>
   * @param graph the graph for which to compute the shortest paths
   * @param landmarks the list of landmark vertex ids. Shortest paths will be computed to each
   * landmark.
   * <p>
   * @return a graph where each vertex attribute is a map containing the shortest-path distance to
   * each reachable landmark vertex.
   * @param evidence$1 (undocumented)
   */
  static public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<scala.collection.Map<java.lang.Object, java.lang.Object>, ED> run (org.apache.spark.graphx.Graph<VD, ED> graph, scala.collection.Seq<java.lang.Object> landmarks, scala.reflect.ClassTag<ED> evidence$1)  { throw new RuntimeException(); }
}
