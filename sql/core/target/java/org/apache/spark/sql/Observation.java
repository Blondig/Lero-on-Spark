package org.apache.spark.sql;
/**
 * Helper class to simplify usage of <code>Dataset.observe(String, Column, Column*)</code>:
 * <p>
 * <pre><code>
 *   // Observe row count (rows) and highest id (maxid) in the Dataset while writing it
 *   val observation = Observation("my metrics")
 *   val observed_ds = ds.observe(observation, count(lit(1)).as("rows"), max($"id").as("maxid"))
 *   observed_ds.write.parquet("ds.parquet")
 *   val metrics = observation.get
 * </code></pre>
 * <p>
 * This collects the metrics while the first action is executed on the observed dataset. Subsequent
 * actions do not modify the metrics returned by {@link get}. Retrieval of the metric via {@link get}
 * blocks until the first action has finished and metrics become available.
 * <p>
 * This class does not support streaming datasets.
 * <p>
 * param:  name name of the metric
 * @since 3.3.0
 */
public  class Observation {
  /**
   * Observation constructor for creating an anonymous observation.
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.Observation apply ()  { throw new RuntimeException(); }
  /**
   * Observation constructor for creating a named observation.
   * @param name (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.Observation apply (java.lang.String name)  { throw new RuntimeException(); }
  public   Observation (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Create an Observation instance without providing a name. This generates a random name.
   */
  public   Observation ()  { throw new RuntimeException(); }
  /**
   * Attach this observation to the given {@link Dataset} to observe aggregation expressions.
   * <p>
   * @param ds dataset
   * @param expr first aggregation expression
   * @param exprs more aggregation expressions
   * @tparam T dataset type
   * @return observed dataset
   * @throws IllegalArgumentException If this is a streaming Dataset (ds.isStreaming == true)
   */
   <T extends java.lang.Object> org.apache.spark.sql.Dataset<T> on (org.apache.spark.sql.Dataset<T> ds, org.apache.spark.sql.Column expr, scala.collection.Seq<org.apache.spark.sql.Column> exprs)  { throw new RuntimeException(); }
  /**
   * (Scala-specific) Get the observed metrics. This waits for the observed dataset to finish
   * its first action. Only the result of the first action is available. Subsequent actions do not
   * modify the result.
   * <p>
   * @return the observed metrics as a <code>Map[String, Any]</code>
   * @throws InterruptedException interrupted while waiting
   */
  public  scala.collection.immutable.Map<java.lang.String, ?> get () throws java.lang.InterruptedException { throw new RuntimeException(); }
  /**
   * (Java-specific) Get the observed metrics. This waits for the observed dataset to finish
   * its first action. Only the result of the first action is available. Subsequent actions do not
   * modify the result.
   * <p>
   * @return the observed metrics as a <code>java.util.Map[String, Object]</code>
   * @throws InterruptedException interrupted while waiting
   */
  public  java.util.Map<java.lang.String, java.lang.Object> getAsJava () throws java.lang.InterruptedException { throw new RuntimeException(); }
    void onFinish (org.apache.spark.sql.execution.QueryExecution qe)  { throw new RuntimeException(); }
}
