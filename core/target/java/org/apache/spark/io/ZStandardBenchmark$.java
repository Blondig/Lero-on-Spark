package org.apache.spark.io;
/**
 * Benchmark for ZStandard codec performance.
 * <pre><code>
 *   To run this benchmark:
 *   1. without sbt: bin/spark-submit --class &lt;this class&gt; &lt;spark core test jar&gt;
 *   2. build/sbt "core/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "core/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/ZStandardBenchmark-results.txt".
 * </code></pre>
 */
public  class ZStandardBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ZStandardBenchmark$ MODULE$ = null;
  public   ZStandardBenchmark$ ()  { throw new RuntimeException(); }
  public  int N ()  { throw new RuntimeException(); }
  public  int numInteger ()  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}
