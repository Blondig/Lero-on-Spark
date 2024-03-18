package org.apache.spark;
/**
 * Benchmark for MapStatuses serialization &amp; deserialization performance.
 * <pre><code>
 *   To run this benchmark:
 *   1. without sbt: bin/spark-submit --class &lt;this class&gt; &lt;spark core test jar&gt;
 *   2. build/sbt "core/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "core/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/MapStatusesSerDeserBenchmark-results.txt".
 * </code></pre>
 */
public  class MapStatusesSerDeserBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MapStatusesSerDeserBenchmark$ MODULE$ = null;
  public   MapStatusesSerDeserBenchmark$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  org.apache.spark.MapOutputTrackerMaster tracker ()  { throw new RuntimeException(); }
  public  void serDeserBenchmark (int numMaps, int blockSize, boolean enableBroadcast)  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
  public  void createSparkContext ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
}
