package org.apache.spark.benchmark;
/**
 * Run all benchmarks. To run this benchmark, you should build Spark with either Maven or SBT.
 * After that, you can run as below:
 * <p>
 * <pre><code>
 *   1. with spark-submit
 *      bin/spark-submit --class &lt;this class&gt;
 *        --jars &lt;all spark test jars&gt;,&lt;spark external package jars&gt;
 *        &lt;spark core test jar&gt; &lt;glob pattern for class&gt; &lt;extra arguments&gt;
 *   2. generate result:
 *      SPARK_GENERATE_BENCHMARK_FILES=1 bin/spark-submit --class &lt;this class&gt;
 *        --jars &lt;all spark test jars&gt;,&lt;spark external package jars&gt;
 *        &lt;spark core test jar&gt; &lt;glob pattern for class&gt; &lt;extra arguments&gt;
 *      Results will be written to all corresponding files under "benchmarks/".
 *      Notice that it detects the sub-project's directories from jar's paths so the provided jars
 *      should be properly placed under target (Maven build) or target/scala-* (SBT) when you
 *      generate the files.
 * </code></pre>
 * <p>
 * You can use a command as below to find all the test jars.
 * Make sure to do not select duplicated jars created by different versions of builds or tools.
 * <pre><code>
 *   find . -name '*-SNAPSHOT-tests.jar' | paste -sd ',' -
 * </code></pre>
 * <p>
 * The example below runs all benchmarks and generates the results:
 * <pre><code>
 *   SPARK_GENERATE_BENCHMARK_FILES=1 bin/spark-submit --class \
 *     org.apache.spark.benchmark.Benchmarks --jars \
 *     "`find . -name '*-SNAPSHOT-tests.jar' -o -name '*avro*-SNAPSHOT.jar' | paste -sd ',' -`" \
 *     "`find . -name 'spark-core*-SNAPSHOT-tests.jar'`" \
 *     "*"
 * </code></pre>
 * <p>
 * The example below runs all benchmarks under "org.apache.spark.sql.execution.datasources"
 * <pre><code>
 *   bin/spark-submit --class \
 *     org.apache.spark.benchmark.Benchmarks --jars \
 *     "`find . -name '*-SNAPSHOT-tests.jar' -o -name '*avro*-SNAPSHOT.jar' | paste -sd ',' -`" \
 *     "`find . -name 'spark-core*-SNAPSHOT-tests.jar'`" \
 *     "org.apache.spark.sql.execution.datasources.*"
 * </code></pre>
 */
public  class Benchmarks {
  static public  scala.Option<java.lang.String> currentProjectRoot ()  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
