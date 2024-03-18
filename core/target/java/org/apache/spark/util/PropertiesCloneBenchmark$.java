package org.apache.spark.util;
/**
 * Benchmark for SerializationUtils.clone vs Utils.cloneProperties.
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt; &lt;spark core test jar&gt;
 *   2. build/sbt "core/test:runMain &lt;this class&gt;"
 *   3. generate result:
 *      SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "core/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/PropertiesCloneBenchmark-results.txt".
 * </code></pre>
 */
public  class PropertiesCloneBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PropertiesCloneBenchmark$ MODULE$ = null;
  public   PropertiesCloneBenchmark$ ()  { throw new RuntimeException(); }
  /**
   * Benchmark various cases of cloning properties objects
   * @param mainArgs (undocumented)
   */
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
  public  java.util.Properties makeRandomProps (int numProperties, int keySize, int valueSize)  { throw new RuntimeException(); }
}
