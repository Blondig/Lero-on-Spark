package org.apache.spark.ui.scope;
/** A node in an RDDOperationGraph. This represents an RDD. */
  class RDDOperationNode implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int id ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  boolean cached ()  { throw new RuntimeException(); }
  public  boolean barrier ()  { throw new RuntimeException(); }
  public  java.lang.String callsite ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value outputDeterministicLevel ()  { throw new RuntimeException(); }
  // not preceding
  public   RDDOperationNode (int id, java.lang.String name, boolean cached, boolean barrier, java.lang.String callsite, scala.Enumeration.Value outputDeterministicLevel)  { throw new RuntimeException(); }
}
