package org.apache.spark.rdd;
/**
 * Benchmark for CoalescedRDD.
 * Measures rdd.coalesce performance under various combinations of
 * coalesced partitions and preferred hosts
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt; &lt;spark core test jar&gt;
 *   2. build/sbt "core/test:runMain &lt;this class&gt;"
 *   3. generate result:
 *      SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "core/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/CoalescedRDD-results.txt".
 * </code></pre>
 * */
public  class CoalescedRDDBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CoalescedRDDBenchmark$ MODULE$ = null;
  public   CoalescedRDDBenchmark$ ()  { throw new RuntimeException(); }
  public  int seed ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
}
