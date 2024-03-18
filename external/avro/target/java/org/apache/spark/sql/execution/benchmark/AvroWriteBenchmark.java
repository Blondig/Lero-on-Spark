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
public  class AvroWriteBenchmark {
  static public  java.lang.String tempTable ()  { throw new RuntimeException(); }
  static public  int numRows ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  static protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
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
  static public  void withTempTable (scala.collection.Seq<java.lang.String> tableNames, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  void withTable (scala.collection.Seq<java.lang.String> tableNames, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  void writeNumeric (java.lang.String table, java.lang.String format, org.apache.spark.benchmark.Benchmark benchmark, java.lang.String dataType)  { throw new RuntimeException(); }
  static public  void writeIntString (java.lang.String table, java.lang.String format, org.apache.spark.benchmark.Benchmark benchmark)  { throw new RuntimeException(); }
  static public  void writePartition (java.lang.String table, java.lang.String format, org.apache.spark.benchmark.Benchmark benchmark)  { throw new RuntimeException(); }
  static public  void writeBucket (java.lang.String table, java.lang.String format, org.apache.spark.benchmark.Benchmark benchmark)  { throw new RuntimeException(); }
  static public  void runDataSourceBenchmark (java.lang.String format, scala.Option<java.lang.String> extraInfo)  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> runDataSourceBenchmark$default$2 ()  { throw new RuntimeException(); }
  static protected abstract  void org$apache$spark$sql$execution$benchmark$DataSourceWriteBenchmark$_setter_$tempTable_$eq (java.lang.String x$1)  ;
  static protected abstract  void org$apache$spark$sql$execution$benchmark$DataSourceWriteBenchmark$_setter_$numRows_$eq (int x$1)  ;
}
