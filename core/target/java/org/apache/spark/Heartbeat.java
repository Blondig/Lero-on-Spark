package org.apache.spark;
/**
 * A heartbeat from executors to the driver. This is a shared message used by several internal
 * components to convey liveness or execution information for in-progress tasks. It will also
 * expire the hosts that have not heartbeated for more than spark.network.timeout.
 * spark.executor.heartbeatInterval should be significantly less than spark.network.timeout.
 */
  class Heartbeat implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>>>[] accumUpdates ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.executor.ExecutorMetrics> executorUpdates ()  { throw new RuntimeException(); }
  // not preceding
  public   Heartbeat (java.lang.String executorId, scala.Tuple2<java.lang.Object, scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>>>[] accumUpdates, org.apache.spark.storage.BlockManagerId blockManagerId, scala.collection.mutable.Map<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.executor.ExecutorMetrics> executorUpdates)  { throw new RuntimeException(); }
}
