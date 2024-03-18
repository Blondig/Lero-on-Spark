package org.apache.spark.graphx.util;
public  class PeriodicGraphCheckpointerSuite$ implements org.scalatest.Assertions, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PeriodicGraphCheckpointerSuite$ MODULE$ = null;
  public final  org.scalatest.compatible.Assertion succeed ()  { throw new RuntimeException(); }
  public   PeriodicGraphCheckpointerSuite$ ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.graphx.Edge<java.lang.Object>> edges ()  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> createGraph (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  public  void checkPersistence (scala.collection.Seq<org.apache.spark.graphx.util.PeriodicGraphCheckpointerSuite.GraphToCheck> graphs, int iteration)  { throw new RuntimeException(); }
  /**
   * Check storage level of graph.
   * @param gIndex  Index of graph in order inserted into checkpointer (from 1).
   * @param iteration  Total number of graphs inserted into checkpointer.
   * @param graph (undocumented)
   */
  public  void checkPersistence (org.apache.spark.graphx.Graph<?, ?> graph, int gIndex, int iteration)  { throw new RuntimeException(); }
  public  void checkCheckpoint (scala.collection.Seq<org.apache.spark.graphx.util.PeriodicGraphCheckpointerSuite.GraphToCheck> graphs, int iteration, int checkpointInterval)  { throw new RuntimeException(); }
  public  void confirmCheckpointRemoved (org.apache.spark.graphx.Graph<?, ?> graph)  { throw new RuntimeException(); }
  /**
   * Check checkpointed status of graph.
   * @param gIndex  Index of graph in order inserted into checkpointer (from 1).
   * @param iteration  Total number of graphs inserted into checkpointer.
   * @param graph (undocumented)
   * @param checkpointInterval (undocumented)
   */
  public  void checkCheckpoint (org.apache.spark.graphx.Graph<?, ?> graph, int gIndex, int iteration, int checkpointInterval)  { throw new RuntimeException(); }
}
