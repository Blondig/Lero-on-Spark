package org.apache.spark.serializer;
/**
 * Benchmark for KryoPool vs old "pool of 1".
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt; &lt;spark core test jar&gt;
 *   2. build/sbt "core/test:runMain &lt;this class&gt;"
 *   3. generate result:
 *      SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "core/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/KryoSerializerBenchmark-results.txt".
 * </code></pre>
 */
public  class KryoSerializerBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KryoSerializerBenchmark$ MODULE$ = null;
  public   KryoSerializerBenchmark$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  int N ()  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext createSparkContext (boolean usePool)  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
}
