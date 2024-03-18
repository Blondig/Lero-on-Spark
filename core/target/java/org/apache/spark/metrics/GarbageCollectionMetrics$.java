package org.apache.spark.metrics;
public  class GarbageCollectionMetrics$ implements org.apache.spark.metrics.ExecutorMetricType, org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GarbageCollectionMetrics$ MODULE$ = null;
  public   GarbageCollectionMetrics$ ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> names ()  { throw new RuntimeException(); }
    scala.collection.Seq<java.lang.String> YOUNG_GENERATION_BUILTIN_GARBAGE_COLLECTORS ()  { throw new RuntimeException(); }
    scala.collection.Seq<java.lang.String> OLD_GENERATION_BUILTIN_GARBAGE_COLLECTORS ()  { throw new RuntimeException(); }
    long[] getMetricValues (org.apache.spark.memory.MemoryManager memoryManager)  { throw new RuntimeException(); }
}
