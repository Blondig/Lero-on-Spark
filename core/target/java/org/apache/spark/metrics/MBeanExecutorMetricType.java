package org.apache.spark.metrics;
 abstract class MBeanExecutorMetricType implements org.apache.spark.metrics.SingleValueExecutorMetricType {
  public   MBeanExecutorMetricType (java.lang.String mBeanName)  { throw new RuntimeException(); }
    long getMetricValue (org.apache.spark.memory.MemoryManager memoryManager)  { throw new RuntimeException(); }
}
