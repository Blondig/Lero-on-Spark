package org.apache.spark.ui.scope;
/**
 * A cluster that groups nodes together in an RDDOperationGraph.
 * <p>
 * This represents any grouping of RDDs, including operation scopes (e.g. textFile, flatMap),
 * stages, jobs, or any higher level construct. A cluster may be nested inside of other clusters.
 */
  class RDDOperationCluster {
  // not preceding
  public   RDDOperationCluster (java.lang.String id, boolean barrier, java.lang.String _name)  { throw new RuntimeException(); }
  public  void attachChildCluster (org.apache.spark.ui.scope.RDDOperationCluster childCluster)  { throw new RuntimeException(); }
  public  void attachChildNode (org.apache.spark.ui.scope.RDDOperationNode childNode)  { throw new RuntimeException(); }
  public  boolean barrier ()  { throw new RuntimeException(); }
  public  boolean canEqual (Object other)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ui.scope.RDDOperationCluster> childClusters ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ui.scope.RDDOperationNode> childNodes ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ui.scope.RDDOperationCluster> getBarrierClusters ()  { throw new RuntimeException(); }
  /** Return all the nodes which are cached. */
  public  scala.collection.Seq<org.apache.spark.ui.scope.RDDOperationNode> getCachedNodes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ui.scope.RDDOperationNode> getIndeterminateNodes ()  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  java.lang.String id ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  void setName (java.lang.String n)  { throw new RuntimeException(); }
}
