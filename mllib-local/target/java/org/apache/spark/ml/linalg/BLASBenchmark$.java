package org.apache.spark.ml.linalg;
/**
 * Serialization benchmark for BLAS.
 * To run this benchmark:
 * <pre><code>
 * 1. without sbt: bin/spark-submit --class &lt;this class&gt; &lt;spark mllib test jar&gt;
 * 2. build/sbt "mllib-local/test:runMain &lt;this class&gt;"
 * 3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "mllib/test:runMain &lt;this class&gt;"
 *    Results will be written to "benchmarks/BLASBenchmark-results.txt".
 * </code></pre>
 */
public  class BLASBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BLASBenchmark$ MODULE$ = null;
  public   BLASBenchmark$ ()  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}
