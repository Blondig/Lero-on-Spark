package org.apache.spark.util.random;
/**
 * Benchmarks for pseudo random generators
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt; &lt;spark core test jar&gt;
 *   2. build/sbt "core/test:runMain &lt;this class&gt;"
 *   3. generate result:
 *      SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "core/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/XORShiftRandomBenchmark-results.txt".
 * </code></pre>
 */
public  class XORShiftRandomBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final XORShiftRandomBenchmark$ MODULE$ = null;
  public   XORShiftRandomBenchmark$ ()  { throw new RuntimeException(); }
  public  long seed ()  { throw new RuntimeException(); }
  public  java.util.Random javaRand ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.random.XORShiftRandom xorRand ()  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}
