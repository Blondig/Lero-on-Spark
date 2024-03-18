package org.apache.spark.serializer;
/**
 * Benchmark for Kryo Unsafe vs safe Serialization.
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt; &lt;spark core test jar&gt;
 *   2. build/sbt "core/test:runMain &lt;this class&gt;"
 *   3. generate result:
 *      SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "core/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/KryoBenchmark-results.txt".
 * </code></pre>
 */
public  class KryoBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KryoBenchmark$ MODULE$ = null;
  public   KryoBenchmark$ ()  { throw new RuntimeException(); }
  public  int N ()  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.SerializerInstance createSerializer (boolean useUnsafe)  { throw new RuntimeException(); }
}
