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
public  class AvroReadBenchmark {
  static protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  static protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  static public  void withTempTable (scala.collection.Seq<java.lang.String> tableNames, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  void numericScanBenchmark (int values, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  void intStringScanBenchmark (int values)  { throw new RuntimeException(); }
  static public  void partitionTableScanBenchmark (int values)  { throw new RuntimeException(); }
  static public  void repeatedStringScanBenchmark (int values)  { throw new RuntimeException(); }
  static public  void stringWithNullsScanBenchmark (int values, double fractionOfNulls)  { throw new RuntimeException(); }
  static public  void columnsBenchmark (int values, int width)  { throw new RuntimeException(); }
  static public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
  static public  scala.Option<java.io.OutputStream> output ()  { throw new RuntimeException(); }
  static public  void output_$eq (scala.Option<java.io.OutputStream> x$1)  { throw new RuntimeException(); }
  static public final  void runBenchmark (java.lang.String benchmarkName, scala.Function0<java.lang.Object> func)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  java.lang.String suffix ()  { throw new RuntimeException(); }
  static protected  void withSQLConf (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> pairs, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static protected  void withTempPath (scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> void testSpecialDatetimeValues (scala.Function1<java.time.ZoneId, T> test)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.SparkSession getSparkSession ()  { throw new RuntimeException(); }
  static public final  void codegenBenchmark (java.lang.String name, long cardinality, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.benchmark.SqlBasedBenchmark.DatasetToBenchmark DatasetToBenchmark (org.apache.spark.sql.Dataset<?> ds)  { throw new RuntimeException(); }
  static protected  void prepareDataInfo (org.apache.spark.benchmark.Benchmark benchmark)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.StructType writeWideRow (java.lang.String path, int rowsNum, int numCols)  { throw new RuntimeException(); }
  static public  void afterAll ()  { throw new RuntimeException(); }
  static protected abstract  void org$apache$spark$sql$execution$benchmark$SqlBasedBenchmark$_setter_$spark_$eq (org.apache.spark.sql.SparkSession x$1)  ;
}
