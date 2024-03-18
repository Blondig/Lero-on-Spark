package org.apache.spark;
  class GetMapAndMergeOutputMessage implements org.apache.spark.MapOutputTrackerMasterMessage, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int shuffleId ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcCallContext context ()  { throw new RuntimeException(); }
  // not preceding
  public   GetMapAndMergeOutputMessage (int shuffleId, org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
}
