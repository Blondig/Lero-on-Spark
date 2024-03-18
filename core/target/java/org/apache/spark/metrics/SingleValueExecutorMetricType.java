package org.apache.spark.metrics;
public  interface SingleValueExecutorMetricType extends org.apache.spark.metrics.ExecutorMetricType {
    long getMetricValue (org.apache.spark.memory.MemoryManager memoryManager)  ;
    long[] getMetricValues (org.apache.spark.memory.MemoryManager memoryManager)  ;
    scala.collection.Seq<java.lang.String> names ()  ;
}
