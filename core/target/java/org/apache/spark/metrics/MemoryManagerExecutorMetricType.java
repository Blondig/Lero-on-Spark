package org.apache.spark.metrics;
 abstract class MemoryManagerExecutorMetricType implements org.apache.spark.metrics.SingleValueExecutorMetricType {
  public   MemoryManagerExecutorMetricType (scala.Function1<org.apache.spark.memory.MemoryManager, java.lang.Object> f)  { throw new RuntimeException(); }
    long getMetricValue (org.apache.spark.memory.MemoryManager memoryManager)  { throw new RuntimeException(); }
}
