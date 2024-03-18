package org.apache.spark.mllib.linalg;
/**
 * Serialization benchmark for VectorUDT.
 * To run this benchmark:
 * <pre><code>
 * 1. without sbt:
 *    bin/spark-submit --class &lt;this class&gt;
 *      --jars &lt;spark core test jar&gt; &lt;spark mllib test jar&gt;
 * 2. build/sbt "mllib/test:runMain &lt;this class&gt;"
 * 3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "mllib/test:runMain &lt;this class&gt;"
 *    Results will be written to "benchmarks/UDTSerializationBenchmark-results.txt".
 * </code></pre>
 */
public  class UDTSerializationBenchmark {
  static public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
  static public  scala.Option<java.io.OutputStream> output ()  { throw new RuntimeException(); }
  static public  void output_$eq (scala.Option<java.io.OutputStream> x$1)  { throw new RuntimeException(); }
  static public final  void runBenchmark (java.lang.String benchmarkName, scala.Function0<java.lang.Object> func)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  java.lang.String suffix ()  { throw new RuntimeException(); }
  static public  void afterAll ()  { throw new RuntimeException(); }
}
