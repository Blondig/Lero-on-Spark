package org.apache.spark.benchmark;
/**
 * A base class for generate benchmark results to a file.
 * For JDK9+, JDK major version number is added to the file names to distinguish the results.
 */
public abstract class BenchmarkBase {
  public   BenchmarkBase ()  { throw new RuntimeException(); }
  /**
   * Any shutdown code to ensure a clean shutdown
   */
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  public  scala.Option<java.io.OutputStream> output ()  { throw new RuntimeException(); }
  public final  void runBenchmark (java.lang.String benchmarkName, scala.Function0<java.lang.Object> func)  { throw new RuntimeException(); }
  /**
   * Main process of the whole benchmark.
   * Implementations of this method are supposed to use the wrapper method <code>runBenchmark</code>
   * for each benchmark scenario.
   * @param mainArgs (undocumented)
   */
  public abstract  void runBenchmarkSuite (java.lang.String[] mainArgs)  ;
  public  java.lang.String suffix ()  { throw new RuntimeException(); }
}
