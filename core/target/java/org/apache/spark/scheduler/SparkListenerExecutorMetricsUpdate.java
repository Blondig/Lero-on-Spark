package org.apache.spark.scheduler;
/**
 * Periodic updates from executors.
 * param:  execId executor id
 * param:  accumUpdates sequence of (taskId, stageId, stageAttemptId, accumUpdates)
 * param:  executorUpdates executor level per-stage metrics updates
 * <p>
 * @since 3.1.0
 */
public  class SparkListenerExecutorMetricsUpdate implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String execId ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple4<java.lang.Object, java.lang.Object, java.lang.Object, scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo>>> accumUpdates ()  { throw new RuntimeException(); }
  public  scala.collection.Map<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.executor.ExecutorMetrics> executorUpdates ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerExecutorMetricsUpdate (java.lang.String execId, scala.collection.Seq<scala.Tuple4<java.lang.Object, java.lang.Object, java.lang.Object, scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo>>> accumUpdates, scala.collection.Map<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.executor.ExecutorMetrics> executorUpdates)  { throw new RuntimeException(); }
}
