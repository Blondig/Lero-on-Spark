package org.apache.spark.ui.scope;
/**
 * A directed edge connecting two nodes in an RDDOperationGraph.
 * This represents an RDD dependency.
 */
  class RDDOperationEdge implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int fromId ()  { throw new RuntimeException(); }
  public  int toId ()  { throw new RuntimeException(); }
  // not preceding
  public   RDDOperationEdge (int fromId, int toId)  { throw new RuntimeException(); }
}
