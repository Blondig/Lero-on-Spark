package org.apache.spark.sql.execution.benchmark;
/**
 * Benchmark to measure Avro data sources write performance.
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt: bin/spark-submit --class &lt;this class&gt;
 *        --jars &lt;spark core test jar&gt;,&lt;spark catalyst test jar&gt;,
 *              &lt;spark sql test jar&gt;,&lt;spark avro jar&gt;
 *        &lt;spark avro test jar&gt;
 *   2. build/sbt "sql/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "avro/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/AvroWriteBenchmark-results.txt".
 *  </code></pre>
 */
public  class AvroWriteBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase implements org.apache.spark.sql.execution.benchmark.DataSourceWriteBenchmark {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AvroWriteBenchmark$ MODULE$ = null;
  public  java.lang.String tempTable ()  { throw new RuntimeException(); }
  public  int numRows ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  public   AvroWriteBenchmark$ ()  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}
