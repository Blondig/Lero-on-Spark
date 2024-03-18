package org.apache.spark.sql.execution.benchmark;
/**
 * Benchmark to measure Avro read performance.
 * <pre><code>
 *   To run this benchmark:
 *   1. without sbt: bin/spark-submit --class &lt;this class&gt;
 *        --jars &lt;catalyst test jar&gt;,&lt;core test jar&gt;,&lt;sql test jar&gt;,&lt;spark-avro jar&gt; &lt;avro test jar&gt;
 *   2. build/sbt "avro/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "avro/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/AvroReadBenchmark-results.txt".
 * </code></pre>
 */
public  class AvroReadBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase implements org.apache.spark.sql.execution.benchmark.SqlBasedBenchmark {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AvroReadBenchmark$ MODULE$ = null;
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  public   AvroReadBenchmark$ ()  { throw new RuntimeException(); }
  public  void withTempTable (scala.collection.Seq<java.lang.String> tableNames, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  public  void numericScanBenchmark (int values, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  public  void intStringScanBenchmark (int values)  { throw new RuntimeException(); }
  public  void partitionTableScanBenchmark (int values)  { throw new RuntimeException(); }
  public  void repeatedStringScanBenchmark (int values)  { throw new RuntimeException(); }
  public  void stringWithNullsScanBenchmark (int values, double fractionOfNulls)  { throw new RuntimeException(); }
  public  void columnsBenchmark (int values, int width)  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}
